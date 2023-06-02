package com.example.ejercicio12;

public class Dish {
    private String name;
    private int imageResId;
    private String address;
    private String price;
    private String menu;

    public Dish(String name, int imageResId, String address, String menu, String price) {
        this.name = name;
        this.imageResId = imageResId;
        this.address = address;
        this.menu = menu;
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
    public String getPrice() {
        return price;
    }
    public String getMenu() {
        return menu;
    }
}
