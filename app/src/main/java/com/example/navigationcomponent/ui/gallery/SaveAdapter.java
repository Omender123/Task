package com.example.navigationcomponent.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationcomponent.R;
import com.example.navigationcomponent.RoomDataBase.SaveData;
import com.example.navigationcomponent.databinding.CustomDataLayoutBinding;

import java.util.List;

public class SaveAdapter extends RecyclerView.Adapter<SaveAdapter.DataViewHolder> {
    private Context context;
    private List<SaveData> mPersonList;
    onDeleteClicked clicked;


    public SaveAdapter(Context context,onDeleteClicked clicked) {
        this.context = context;
        this.clicked = clicked;
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
        holder.binding.txtId.setText(mPersonList.get(position).getDataId());
        holder.binding.txtName.setText(mPersonList.get(position).getName());
        holder.binding.imgSelect.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_baseline_fill_star_24));


        holder.binding.imgSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked.onDeleteDataClicked(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        if (mPersonList == null) {
            return 0;
        }
        return mPersonList.size();

    }

    public void setTasks(List<SaveData> personList) {
        mPersonList = personList;
        notifyDataSetChanged();
    }

    public List<SaveData> getTasks() {

        return mPersonList;
    }
    public class DataViewHolder extends RecyclerView.ViewHolder {

        CustomDataLayoutBinding binding;

        public DataViewHolder(@NonNull CustomDataLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;


        }
    }

    public interface onDeleteClicked{
        void onDeleteDataClicked(int position);
    }
}
