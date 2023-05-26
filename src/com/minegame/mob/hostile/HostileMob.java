package com.minegame.mob.hostile;

import com.minegame.damage.combat.Combat;
import com.minegame.mob.Mob;

public abstract class HostileMob extends Mob implements Combat {

    private int force;

    public HostileMob(int health, int force) {
        super(health);
        this.force = force;
    }

    @Override
    public int attack() {
        return force;
    }

    @Override
    public void takeAttack(int attack) {
        int currentHealth = getHealth() - attack;
        if (currentHealth > attack) {
            setHealth(currentHealth);
        } else {
            setHealth(0);
        }

        System.out.println("The enemy recieved " + attack +
                " damage, the enemy has " + currentHealth + " hearts left.");
    }


}
