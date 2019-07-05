package com.example.databinding.event_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.R;
import com.example.databinding.data_binding.TwoFragment;
import com.example.databinding.databinding.ActivityMain2Binding;
import com.example.databinding.databinding.ActivityMain4Binding;
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

        binding4.setHandler(new EventHandler());

        Helper.replaceFragment(getSupportFragmentManager(), new TwoFragment(), R.id.fragment_container4);

    }

    public class EventHandler {
        public void handleClick(View view) {
            Toast.makeText(view.getContext(), "clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
