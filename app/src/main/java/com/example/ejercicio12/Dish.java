package com.example.ejercicio12;

public class Dish {
    private String name;
    private int imageResId;
    private String address;

    private int price;

    public Dish(String name, int imageResId, String address, int price) {
        this.name = name;
        this.imageResId = imageResId;
        this.address = address;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getAddress() {
        return address;
    }
    public int getPrice() {
        return price;
    }
}
