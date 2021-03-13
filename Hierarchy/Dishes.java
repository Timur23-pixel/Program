package ru.tpu.Hierarchy;

import java.util.ArrayList;

public class Dishes {

    private String type;
    private String material;
    private String color;
    private double size;

    public void Dishes(String type, String material, String color, double size) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.setSize(size);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size <= 0) {
            System.out.println("Число задано неверно");
        } else {
            this.size = size;
        }

    }

    public String toString() {
        return "Тип посуды - " + type + ". Материал - " + material + ". Цвет - " + color + ". Размер - " + getSize();
    }
    public Object Description() {
        System.out.println(toString() + "");
        return null;
    }


}



