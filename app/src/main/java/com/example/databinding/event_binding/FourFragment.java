package com.example.databinding.event_binding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.R;
import com.example.databinding.databinding.FragmentFourBinding;

public class FourFragment extends Fragment {

    private FragmentFourBinding binding4;

    public FourFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding4 = DataBindingUtil.inflate(inflater, R.layout.fragment_four, container, false);
        return binding4.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
