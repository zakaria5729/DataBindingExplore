package com.example.databinding.util;

import android.view.View;
import android.widget.Toast;

public class EventHandler {
    public void handleClick(View view, String name, int age) {
        Toast.makeText(view.getContext(), name+" "+age, Toast.LENGTH_SHORT).show();
    }
}
