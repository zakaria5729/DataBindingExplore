package com.example.databinding.util;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Helper {
    public static void replaceFragment(FragmentManager fragmentManager, Fragment fragment, int fragment_container) {
        fragmentManager.beginTransaction().replace(fragment_container, fragment).commit();
    }
}
