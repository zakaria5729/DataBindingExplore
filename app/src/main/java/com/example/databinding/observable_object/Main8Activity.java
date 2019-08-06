package com.example.databinding.observable_object;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMain8Binding;
import com.example.databinding.util.Teacher;

public class Main8Activity extends AppCompatActivity {

    private ActivityMain8Binding binding8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding8 = DataBindingUtil.setContentView(this, R.layout.activity_main8);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Teacher teacher = new Teacher("Zakaria", 23);
        binding8.setTeacher(teacher);
    }
}
