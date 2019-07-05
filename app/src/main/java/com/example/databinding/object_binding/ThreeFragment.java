package com.example.databinding.object_binding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.R;
import com.example.databinding.databinding.FragmentThreeBinding;
import com.example.databinding.util.Student;

public class ThreeFragment extends Fragment {

    private FragmentThreeBinding binding3;

    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding3 = DataBindingUtil.inflate(inflater, R.layout.fragment_three, container, false);
        return binding3.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding3.setFragStudent(new Student(null, 18));
    }
}
