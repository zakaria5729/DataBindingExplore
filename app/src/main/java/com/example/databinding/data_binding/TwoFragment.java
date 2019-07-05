package com.example.databinding.data_binding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding.R;
import com.example.databinding.databinding.FragmentTwoBinding;

public class TwoFragment extends Fragment {

    private FragmentTwoBinding binding2;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding2 = DataBindingUtil.inflate(inflater, R.layout.fragment_two, container, false);
        return binding2.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding2.setTextOneFrag2("frag 1");
        binding2.setTextTwoFrag2("frag 2");
        binding2.setTextThreeFrag2("frag 3");
    }
}
