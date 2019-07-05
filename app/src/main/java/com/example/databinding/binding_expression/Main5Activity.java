package com.example.databinding.binding_expression;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMain5Binding;
import com.example.databinding.util.EventHandler;
import com.example.databinding.util.Student;
import com.example.databinding.util.Helper;

public class Main5Activity extends AppCompatActivity {

    private ActivityMain5Binding binding5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding5 = DataBindingUtil.setContentView(this, R.layout.activity_main5);
    }

    @Override
    protected void onStart() {
        super.onStart();

        binding5.setObjStudent(new Student("Zakaria", 23));
        binding5.setMyHandler(new EventHandler());

        Helper.replaceFragment(getSupportFragmentManager(), new FiveFragment(), R.id.fragment_container5);

    }
}
