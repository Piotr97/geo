package com.geo;

public class Points {
    private double x;
    private double y;
    private String text;


    public Points(double x, double y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public Points() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                ", text='" + text + '\'' +
                '}';
    }
}

