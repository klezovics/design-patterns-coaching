package com.klezovich.designpatterns.creational.prototype.unit.horde;

import com.klezovich.designpatterns.creational.prototype.unit.Unit;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Orc extends Unit {

    private int physicalResistance;

    protected Orc(String name, int damage, int physicalResistance) {
        super(name, damage);
        this.physicalResistance = physicalResistance;
    }

    public Orc(Orc orc) {
        super(orc);
        this.physicalResistance = orc.physicalResistance;
    }

    public Unit clone() {
        return new Orc(this);
    }
}
