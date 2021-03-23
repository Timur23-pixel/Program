package ru.tpu.Hierarchy;

public class Draw extends AdditionDecorator {
    Dishes dishes;
    public Draw (Dishes dishes) {
        this.dishes = dishes;
    }
    @Override
    public String getDescription(){
      return dishes.description + " with Draw ";
    }

    @Override
    public double cost() {
        return 10 + dishes.cost();
    }
}
