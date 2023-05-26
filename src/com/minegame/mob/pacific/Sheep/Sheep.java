package com.minegame.mob.pacific.Sheep;

import com.minegame.mob.pacific.PacificMob;

public class Sheep extends PacificMob {
    public Sheep(int health) {
        super(health = 5);
    }

    @Override
    public void movement() {
        System.out.println("The sheep walks trough the field");
    }
}
