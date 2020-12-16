package com.annakhuseinova.rxjava.model;

public class Shape {

    private String shape;
    private String color;

    public Shape(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }
}
