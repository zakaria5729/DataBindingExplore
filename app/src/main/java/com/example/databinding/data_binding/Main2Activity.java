package com.example.databinding.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMain2Binding;
import com.example.databinding.util.Helper;

public class Main2Activity extends AppCompatActivity {

    private ActivityMain2Binding binding2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding2 = DataBindingUtil.setContentView(this, R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Helper.replaceFragment(getSupportFragmentManager(), new TwoFragment(), R.id.fragment_container2);

        binding2.setTextOne("binding1");
        binding2.setTextTwo("binding2");
        binding2.setTextThree("binding3");
    }
}
