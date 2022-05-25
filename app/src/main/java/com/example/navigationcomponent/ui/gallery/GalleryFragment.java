package com.example.navigationcomponent.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.navigationcomponent.R;
import com.example.navigationcomponent.RoomDataBase.AppDatabase;
import com.example.navigationcomponent.RoomDataBase.AppExecutors;
import com.example.navigationcomponent.RoomDataBase.SaveData;
import com.example.navigationcomponent.databinding.FragmentGalleryBinding;

import java.util.List;

public class GalleryFragment extends Fragment implements SaveAdapter.onDeleteClicked {
    FragmentGalleryBinding binding;
    View view;
    private SaveAdapter mAdapter;
    private AppDatabase mDb;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_gallery, container, false);
        view = binding.getRoot();
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize the adapter and attach it to the RecyclerView
        mAdapter = new SaveAdapter(getContext(),this);
        binding.recyclerView.setAdapter(mAdapter);
        mDb = AppDatabase.getInstance(getContext());

        return view;
    }

    @Override
    public void onDeleteDataClicked(int position) {
        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                List<SaveData> tasks = mAdapter.getTasks();
                mDb.personDao().delete(tasks.get(position));
                retrieveTasks();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        retrieveTasks();
    }

    private void retrieveTasks() {
        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                final List<SaveData> persons = mDb.personDao().loadAllData();
               getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        mAdapter.setTasks(persons);
                    }
                });
            }
        });


    }
}
