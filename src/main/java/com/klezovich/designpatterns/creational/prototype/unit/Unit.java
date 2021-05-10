package com.klezovich.designpatterns.creational.prototype.unit;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public abstract class Unit {

    private final String name;
    private final int damage;

    protected Unit(Unit unit) {
        this.name = unit.name;
        this.damage = unit.damage;
    }

    protected Unit(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    void attack() {
        System.out.println(name + " attack for [" + damage + "] damage");
    }

    public abstract Unit clone();
}
