package com.example.databinding.find_view_by_id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.util.Helper;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Helper.replaceFragment(getSupportFragmentManager(), new OneFragment(), R.id.fragment_container);

        binding.textView.setText("text 1");
        binding.textView2.setText("text 2");
        binding.textView3.setText("text 3");
    }
}

