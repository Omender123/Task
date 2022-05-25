package com.example.navigationcomponent;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationcomponent.Model.DataModel;
import com.example.navigationcomponent.RoomDataBase.AppDatabase;
import com.example.navigationcomponent.RoomDataBase.AppExecutors;
import com.example.navigationcomponent.RoomDataBase.SaveData;
import com.example.navigationcomponent.databinding.CustomDataLayoutBinding;
import com.example.navigationcomponent.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
    Context context;
    DataModel dataModel;
    boolean check = false;
    private AppDatabase mDb;
    ArrayList<Boolean> list = new ArrayList<>();

    public DataAdapter(Context context, DataModel dataModel) {
        this.context = context;
        this.dataModel = dataModel;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        CustomDataLayoutBinding binding = CustomDataLayoutBinding.inflate(inflater, parent, false);


        return new DataViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {


        holder.binding.txtId.setText(dataModel.getResponse().getVenues().get(position).getId());
        holder.binding.txtName.setText(dataModel.getResponse().getVenues().get(position).getName());
        holder.binding.imgSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check) {
                    check = false;
                    AppExecutors.getInstance().diskIO().execute(new Runnable() {
                        @Override
                        public void run() {
                            SaveData saveData = new SaveData(dataModel.getResponse().getVenues().get(position).getId()
                                    , dataModel.getResponse().getVenues().get(position).getName(),
                                    false);
                            mDb.personDao().delete(saveData);
                        }
                    });
                    holder.binding.imgSelect.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_baseline_star_border_24));

                } else {

                    check = true;
                    holder.binding.imgSelect.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_baseline_fill_star_24));
                    AppExecutors.getInstance().diskIO().execute(new Runnable() {
                        @Override
                        public void run() {
                            SaveData saveData = new SaveData(dataModel.getResponse().getVenues().get(position).getId()
                                    , dataModel.getResponse().getVenues().get(position).getName(),
                                    false);
                            mDb.personDao().insertData(saveData);
                        }
                    });
                }

            }
        });

        //   Log.d("datratatat",mDb.personDao().loadAllData().toString());

    }

    @Override
    public int getItemCount() {
        return dataModel.getResponse().getVenues().size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {

        CustomDataLayoutBinding binding;

        public DataViewHolder(@NonNull CustomDataLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            mDb = AppDatabase.getInstance(context);
        }
    }


}
