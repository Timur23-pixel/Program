package ru.tpu.Hierarchy;

public class Gold extends AdditionDecorator {
    Dishes dishes;
    public Gold(Dishes dishes) {
        this.dishes = dishes;
    }

    @Override
    public double cost() {
        return 60000 + dishes.cost();
    }
    @Override
    public String getDescription() {
        return dishes.description + " With gold material";
    }
}
