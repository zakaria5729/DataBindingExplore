package com.example.databinding.event_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMain4Binding;
import com.example.databinding.util.EventHandler;
import com.example.databinding.util.Student;
import com.example.databinding.util.Helper;

public class Main4Activity extends AppCompatActivity {

    private ActivityMain4Binding binding4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding4 = DataBindingUtil.setContentView(this, R.layout.activity_main4);
    }

    @Override
    protected void onStart() {
        super.onStart();

        binding4.setObjStudent(new Student("Zakaria", 23));
        binding4.setMyHandler(new EventHandler());

        Helper.replaceFragment(getSupportFragmentManager(), new FourFragment(), R.id.fragment_container4);

    }
}
