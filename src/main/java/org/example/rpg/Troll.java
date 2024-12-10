package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return this.getDamage() + bleed() + poison();
    }

    @Override
    public double bleed() {
        return this.getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return this.getDamage()*0.3;
    }


}
