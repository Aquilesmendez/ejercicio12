package com.example.ejercicio12;

public class Dish {
    private String name;
    private int imageResId;

    public Dish(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}

