package com.klezovich.designpatterns.creational.prototype.unit.horde;

import com.klezovich.designpatterns.creational.prototype.unit.Unit;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class Summoner {

    private SummonBook summonBook = new SummonBook();


    public Unit summon(String unitName) {
        return summonBook.summon(unitName);
    }

    public Unit clone(Unit u) {
        return u.clone();
    }

    @Data
    static class SummonBook {

        private Map<String, Unit> nameToUnit = new HashMap<>();

        public SummonBook() {
            nameToUnit.put("weak_orc", new Orc("weak_orc",1,2));
            nameToUnit.put("strong_orc", new Orc("weak_orc",10,20));
            nameToUnit.put("tauren", new Tauren("ordinary_tauren",20,20));
        }

        public Unit summon(String unitName) {
            return nameToUnit.get(unitName).clone();
        }
    }
}
