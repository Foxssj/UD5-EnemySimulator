package com.minegame.mob;

public abstract class Mob {

    private int health;

    public Mob(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void movement();
}
