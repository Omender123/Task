package com.example.navigationcomponent.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationcomponent.Api.ApiManager;
import com.example.navigationcomponent.Api.ApiService;
import com.example.navigationcomponent.DataAdapter;
import com.example.navigationcomponent.Model.DataModel;
import com.example.navigationcomponent.R;
import com.example.navigationcomponent.RoomDataBase.AppDatabase;
import com.example.navigationcomponent.RoomDataBase.AppExecutors;
import com.example.navigationcomponent.RoomDataBase.SaveData;
import com.example.navigationcomponent.databinding.FragmentHomeBinding;
import com.kaopiz.kprogresshud.KProgressHUD;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    private View view;
    KProgressHUD progressDialog;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        view = binding.getRoot();


        getData();

        return view;
    }

    public void getData() {

        progressDialog = KProgressHUD.create(getContext())
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel("Please wait.....")
                .setCancellable(false)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show();

        showpDialog();

        Call<DataModel> call = ApiManager.getRetrofit(getContext()).create(ApiService.class).getData(
                "40.7484,-73.9857",
                "NPKYZ3WZ1VYMNAZ2FLX1WLECAWSMUVOQZOIDBN53F3LVZBPQ"
                , "20180616"
        );


        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                hidepDialog();
                if (response.isSuccessful()) {
                    RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
                    binding.recyclerView.setLayoutManager(mLayoutManager1);
                    binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
                    binding.recyclerView.setHasFixedSize(true);
                    binding.recyclerView.setAdapter(new DataAdapter(getContext(), response.body()));


                } else {
                    Toast.makeText(getContext(), "" + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {
                hidepDialog();
                Toast.makeText(getContext(), "" + t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void showpDialog() {
        if (!progressDialog.isShowing())
            progressDialog.show();
    }

    private void hidepDialog() {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }


}
