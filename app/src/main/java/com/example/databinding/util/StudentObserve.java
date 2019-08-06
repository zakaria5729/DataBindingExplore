package com.example.databinding.util;

import androidx.databinding.ObservableField;

public class StudentObserve {
    private ObservableField<String> name = new ObservableField<>();
    private int age;
    private String imageUrl;

    public StudentObserve(String name, int age) {
        this.name.set(name);
        this.age = age;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}