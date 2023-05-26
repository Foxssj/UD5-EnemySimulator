package com.minegame.character;

import com.minegame.damage.combat.Combat;

public class Player implements Combat {
    private int health;
    private int defense;
    private int force;

    private final int DEFAULT_HEALT = 12;

    public Player(int defense, int force) {
        this.defense = defense;
        this.force = force;
        this.health = DEFAULT_HEALT;
    }

    @Override
    public void takeAttack(int attack) {
        int damage = defense - attack;
        if (health > attack) {
            if (damage >= 0) {
                this.health = this.health - damage;
            } else {
                this.health = this.health + damage;
            }
        } else {
            health = 0;
        }

        System.out.println("You have recieved " + attack + " damage, you have " + health + " hearts left.");
    }

    @Override
    public int attack() {
        return force;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
