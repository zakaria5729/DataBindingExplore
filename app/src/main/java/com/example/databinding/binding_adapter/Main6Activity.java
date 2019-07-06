package com.example.databinding.binding_adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMain6Binding;
import com.example.databinding.util.Helper;
import com.example.databinding.util.Student;

public class Main6Activity extends AppCompatActivity {

    ActivityMain6Binding binding6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding6 = DataBindingUtil.setContentView(this, R.layout.activity_main6);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Student student = new Student("Zakaria", 23);
        student.setImageUrl("https://scontent.fdac5-1.fna.fbcdn.net/v/t1.0-9/56679497_2325018654410704_7394587804170190848_n.jpg?_nc_cat=109&_nc_oc=AQnrKAaKOJrC0jJfwG9iylcVHrWuIoYsxh3Qb2iXGLn4mA8EK9wIdciujC_7W2Pb7Y0&_nc_ht=scontent.fdac5-1.fna&oh=4a1f6b98866c6f54a3bc921a6583b406&oe=5DB8FA9F");

        binding6.setObjStudent(student);

        Helper.replaceFragment(getSupportFragmentManager(), new SixFragment(), R.id.fragment_container6);
    }

    @BindingAdapter("myImageUrl")
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .fitCenter()
                .into(imageView);
    }
}
