package com.klezovich.designpatterns.creational.prototype.unit.horde;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummonerTest {

    @Test
    void testCanSummonMightyArmyWithPrototypePattern() {
        var summoner = new Summoner();

        var unit1 = summoner.summon("weak_orc");
        System.out.println(unit1);

        var unit2 = summoner.summon("weak_orc");
        System.out.println(unit2);
        assertFalse( unit1 == unit2);
        assertTrue(unit1.equals(unit2));

        var unit3 = summoner.summon("tauren");
        System.out.println(unit3);

        var unit4 = summoner.clone(unit3);
        System.out.println(unit4);

        assertFalse(unit3 == unit4);
        assertTrue(unit4.equals(unit3));
    }
}