package com.klezovich.designpatterns.creational.prototype.unit.horde;

import com.klezovich.designpatterns.creational.prototype.unit.Unit;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Tauren extends Unit {

    private int magicResistance;

    protected Tauren(String name, int damage, int magicResistance) {
        super(name, damage);
        this.magicResistance = magicResistance;
    }

    public Tauren(Tauren tauren) {
        super(tauren);
        this.magicResistance = tauren.magicResistance;
    }

    public Unit clone() {
        return new Tauren(this);
    }
}
