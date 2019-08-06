package com.example.databinding.observable_field;

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
import com.example.databinding.databinding.FragmentSevenBinding;
import com.example.databinding.util.Student;
import com.example.databinding.util.StudentObserve;

public class SevenFragment extends Fragment {

    private FragmentSevenBinding binding7;

    public SevenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding7 = DataBindingUtil.inflate(inflater, R.layout.fragment_seven, container, false);
        return binding7.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        StudentObserve student = new StudentObserve("Abdullah", 13);
        binding7.setAStudent(student);
    }
}
