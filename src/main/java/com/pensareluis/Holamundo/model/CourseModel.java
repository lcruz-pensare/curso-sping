package com.pensareluis.Holamundo.model;

public class CourseModel {
    private String name;
    private String description;
    private int hours;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hour) {
        this.hours = hour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CourseModel(String name, String description, int hour, int price) {
        this.name = name;
        this.description = description;
        this.hours = hours;
        this.price = price;
    }

    public CourseModel() {
    }
}
