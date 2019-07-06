package com.example.databinding.observable_field;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMain7Binding;
import com.example.databinding.util.Helper;
import com.example.databinding.util.Student;

public class Main7Activity extends AppCompatActivity {

    private ActivityMain7Binding binding7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding7 = DataBindingUtil.setContentView(this, R.layout.activity_main7);
    }

    @Override
    protected void onStart() {
        super.onStart();

        final Student student = new Student("Hasib", 5);
        binding7.setAStudent(student);

        Helper.replaceFragment(getSupportFragmentManager(), new SevenFragment(), R.id.fragment_container7);

        binding7.editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                student.setName(editable.toString());
            }
        });

        binding7.editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                student.setName(editable.toString());
            }
        });

    }
}
