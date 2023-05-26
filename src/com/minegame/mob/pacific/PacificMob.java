package com.minegame.mob.pacific;

import com.minegame.damage.Damage;
import com.minegame.mob.Mob;

public abstract class PacificMob extends Mob implements Damage {

    public PacificMob(int health) {
        super(health);
    }

    @Override
    public void takeAttack(int attack) {
        int currentHealth = getHealth() - attack;
        setHealth(currentHealth);
        System.out.println("The entity recieved " + attack +
                " damage, tit has " + currentHealth + " hearts left.");
    }
}
