package org.amir.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter

public class Combo {
    private static int nextId = 1;
    private static final int MAX_DISH_NUM = 1;
    private static int MAX_BEVERAGE_NUM = 1;


    private String id;
    private String name;
    private double Price;
    private Dish[] dishes;
    private Beverage[] beverages;

    public Combo (String name) {
        this.id = String.format("C%03d", nextId++);
        this.name = name;
        this.dishes = new Dish[2];
        this.beverages = new Beverage[2];
    }
    public void calcPrice () {
        double price = 0;

        for (Beverage beverage : beverages) {
            if (beverage != null) {
                price += beverage.getPrice();
            }
        }

        for (Dish dish : dishes) {
            if (dish != null) {
                price += dish.getPrice();
            }
        }
        double dicountRatio = 0.8;
        this.price = price * dicountRatio
    }

    public void addDish (Dish dish) {
        if (dishes [0] == null) {
            dishes[0] = dish;
        } else if (dishes[1] == null ) {
            dishes [1] = dish;
        } else {
            System.out.printf("There are %d dishes already, Add combo failed", MAX_DISH_NUM);
        }
    }

    public void addBeverage (Beverage beverage) {
        if (beverages[0] == null) {
            beverages[0] = beverage;
        } else if (beverages[0] == null ) {
            beverages [0] = null;
        } else {
            System.out.printf("There are %d beverages already, Add beverage failed", MAX_BEVERAGE_NUM);
        }
    }

}

