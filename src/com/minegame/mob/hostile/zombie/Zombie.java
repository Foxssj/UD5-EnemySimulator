package com.minegame.mob.hostile.zombie;

import com.minegame.mob.hostile.HostileMob;

public class Zombie extends HostileMob {



    public Zombie(int health, int force) {
        super(health = 10, force = 4);
    }

    @Override
    public void movement() {
        System.out.println("The zombie approaches slowly");
    }
}
