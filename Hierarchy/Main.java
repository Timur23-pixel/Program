package ru.tpu.Hierarchy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Dishes[] myDishes = new Dishes[10];

        Random random = new Random();
        for(int i = 0; i <= 9; i++) {
            int j = random.nextInt(3) +1;
            switch (j) {
                case (1):
                    myDishes[i] = new Plate("Plate", "Ceramic", "Red", 1.2, "Deep");
                    break;
                case (2):
                    myDishes[i] = new Pans("Pans", "Metallic", "Gray", 5.6, 3.5);
                    break;
                case (3):
                    myDishes[i] = new Glass("Beer","Glass", "UnColor",8,true);
            }
        }
        for(int i = 0; i <= 9; i++) {
            System.out.println(myDishes[i].Description());
        }

        Dishes dishes = new Plate("Plate", "Ceramic", "Red", 1.2, "Deep");
        dishes = new Draw(dishes);
        System.out.println(dishes.getDescription() + " $" + dishes.cost());

        Dishes dishes1 = new Plate("Plate", "Ceramic", "Red", 1.2, "Deep");
        dishes1 = new Draw(dishes1);
        dishes1 = new Gold(dishes1);

        System.out.println(dishes1.getDescription() + " $" + dishes1.cost());
    }
}