package com.klezovich.designpatterns.creational.builder.house;

import org.junit.jupiter.api.Test;

import static com.klezovich.designpatterns.creational.builder.house.Material.*;
import static java.util.stream.Collectors.toSet;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HouseTest {

    @Test
    void testCanUseWoodenHouseBuilder() {
        var simpleWoodenHouse = House.getWoodenHouseBuilder()
                .numWindows(2)
                .buildDefaultRoof()
                .buildDefaultWalls()
                .build();

        assertNotNull(simpleWoodenHouse);
        assertEquals(2, simpleWoodenHouse.getNumWindows());

        var walls = simpleWoodenHouse.getWalls();
        assertEquals(4, walls.size());

        var wallMaterials = walls.stream().map(Wall::getMaterial).collect(toSet());
        assertThat(wallMaterials, everyItem(is(WOOD)));

        assertEquals(WOOD, simpleWoodenHouse.getRoof().getMaterial());
    }

    @Test
    void testCanUseStoneHouseBuilder() {
        var stoneHouse = House.getStoneHouseBuilder()
                .numWindows(2)
                .buildDefaultRoof()
                .buildDefaultWalls()
                .build();

        assertNotNull(stoneHouse);
        assertEquals(2, stoneHouse.getNumWindows());

        var walls = stoneHouse.getWalls();
        assertEquals(4, walls.size());

        var wallMaterials = walls.stream().map(Wall::getMaterial).collect(toSet());
        assertThat(wallMaterials, everyItem(is(STONE)));

        assertEquals(STONE, stoneHouse.getRoof().getMaterial());
    }

    @Test
    void testCanUseDirectorWithBuilder() {
        var builder = House.getStoneHouseBuilder();
        var palaceBuildingDirector = House.getPalaceBuildingDirector(builder);

        var palace = palaceBuildingDirector.make();

        assertNotNull(palace);
        assertEquals(10, palace.getNumWindows());

        var walls = palace.getWalls();
        assertEquals(4, walls.size());

        var wallMaterials = walls.stream().map(Wall::getMaterial).collect(toSet());
        assertThat(wallMaterials, everyItem(is(STONE)));

        assertEquals(GOLD, palace.getRoof().getMaterial());
    }
}