package com.example.databinding.find_view_by_id;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.R;
import com.example.databinding.databinding.FragmentOneBinding;

public class OneFragment extends Fragment {

    private FragmentOneBinding binding;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_one, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.textViewFrag2.setText("frag 2");
        binding.textViewFrag3.setText("frag 3");
        binding.textViewFrag4.setText("frag 4");
    }
}
