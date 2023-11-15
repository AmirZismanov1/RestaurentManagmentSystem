package org.amir.dto;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode

public class RestaurentManagmentSystem {
    private static final int MAX_COMBO_NUM = 20;
    private Combo [] combos;
    private int comboNum = 0;

    public RestaurentManagmentSystem () {
        this.combos = new Combo[MAX_COMBO_NUM];
    }

    public void addCombo (Combo combo){
        if (comboNum < MAX_COMBO_NUM) {
            // add the combo
            combos[comboNum] = combo;
        } else {
            // reach the cap
            System.out.printf("There are %d combos already, Add combo failed", MAX_COMBO_NUM);
        }
    }
}
