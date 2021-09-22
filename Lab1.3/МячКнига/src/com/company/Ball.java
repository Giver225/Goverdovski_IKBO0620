package com.company;

public class Ball {
    private int radius;
    private int mass;
    private String color;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws Exception {
        if (radius <= 0) throw new Exception("Мяча без радиуса не существует");
        this.radius = radius;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) throws Exception {
        if (mass <= 0) throw new Exception("Мяча без массы не существует");
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Ball{\n" +
                "radius=" + radius +
                ",\nmass=" + mass +
                ",\ncolor='" + color + '\'' +
                "\n}";
    }
}
