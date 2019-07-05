package com.example.databinding.object_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMain3Binding;
import com.example.databinding.util.Helper;

public class Main3Activity extends AppCompatActivity {

    private ActivityMain3Binding binding3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding3 = DataBindingUtil.setContentView(this, R.layout.activity_main3);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Helper.replaceFragment(getSupportFragmentManager(), new ThreeFragment(), R.id.fragment_container3);

        binding3.setObjStudent(new Student("Zakaria", 23));
    }
}
