package com.example.databinding.binding_expression;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.R;
import com.example.databinding.databinding.FragmentFiveBinding;
import com.example.databinding.util.EventHandler;
import com.example.databinding.util.Student;

public class FiveFragment extends Fragment {

    private FragmentFiveBinding binding5;

    public FiveFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding5 = DataBindingUtil.inflate(inflater, R.layout.fragment_five, container, false);
        return binding5.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding5.setFragStudent(new Student(null, 0));
        binding5.setFragHandler(new EventHandler());
    }
}
