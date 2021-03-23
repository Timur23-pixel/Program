package ru.tpu.Hierarchy;

public class Pans extends Dishes {
    private double thickness;
    Pans (String type, String material, String color, double size, double thickness) {
        super.Dishes(type, material, color, size);
        this.setThickness(thickness);
        description = "Pan";
    }

    public double getThickness() {
        return thickness;
    }
    public void setThickness(double thickness) {
        if(thickness > 0) {
            this.thickness = thickness;
        }
        else {
            System.out.println("Толщина отрицательная");
        }
    }

    @Override
    public double cost() {
        return 20.1;
    }

    @Override
    public Object Description() {
        System.out.println(toString() + ". Толщина стенок - " + thickness);
        return null;
    }

}
