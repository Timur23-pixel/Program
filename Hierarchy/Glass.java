package ru.tpu.Hierarchy;

public class Glass extends Dishes {
    private boolean handle;

    Glass (String type, String material, String color, double size,boolean handle) {
        super.Dishes(type,material,color,size);
        this.handle = handle;
        description = "Glass";
    }
    public boolean getHandle() {
        return handle;
    }
    public void setHandle(boolean handle) {
        this.handle = handle;
    }

    @Override
    public Object Description() {
        System.out.println(toString() + "С ручкой - " + handle);
        return null;
    }
    public double cost() {
        return 10.1;
    }
}
