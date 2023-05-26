package com.minegame.mob.hostile.enderman;

import com.minegame.mob.hostile.HostileMob;

public class Enderman extends HostileMob {
    public Enderman(int health, int force) {
        super(health = 14, force = 6);
    }

    @Override
    public void movement() {
        System.out.println("The endermen teleports behind you.");
    }
}
