package com.example.databinding.binding_adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.databinding.R;
import com.example.databinding.databinding.FragmentSixBinding;
import com.example.databinding.util.Student;

public class SixFragment extends Fragment {

    private FragmentSixBinding binding6;

    public SixFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding6 = DataBindingUtil.inflate(inflater, R.layout.fragment_six, container, false);
        return binding6.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Student student = new Student("Zakaria", 23);
        student.setImageUrl("https://avatars3.githubusercontent.com/u/26526539?s=460&v=4");

        binding6.setFragStudent(student);
    }

    @BindingAdapter("fragImageUrl")
    public static void loadImageFrag(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .fitCenter()
                .into(imageView);
    }
}
