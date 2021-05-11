package com.klezovich.designpatterns.creational.builder.house;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static com.klezovich.designpatterns.creational.builder.house.Material.GOLD;

@Getter
public class House {

    private int numWindows;
    private List<Wall> walls;
    private Roof roof;


    interface HouseBuilder {

        void reset();
        HouseBuilder numWindows(int numWindows);
        HouseBuilder buildWalls(List<Wall> walls);
        HouseBuilder buildDefaultWalls();
        HouseBuilder buildRoof(Roof roof);
        HouseBuilder buildDefaultRoof();
        House build();
    }

    static HouseBuilder getWoodenHouseBuilder() {
        return new WoodenHouseBuilder();
    }

    static HouseBuilder getStoneHouseBuilder() {
        return new StoneHouseBuilder();
    }

    static PalaceBuildingDirector getPalaceBuildingDirector(HouseBuilder builder) {
        return new PalaceBuildingDirector(builder);
    }

    static class PalaceBuildingDirector {
        private final HouseBuilder builder;

        public PalaceBuildingDirector(HouseBuilder builder) {
            this.builder = builder;
        }

        public House make() {
            return builder
                    .buildDefaultWalls()
                    .numWindows(10)
                    .buildRoof( new Roof(GOLD))
                    .build();
        }
    }

    static class WoodenHouseBuilder implements HouseBuilder {

        private House house = new House();

        @Override
        public void reset() {
            house = new House();
        }

        @Override
        public HouseBuilder numWindows(int numWindows) {
            house.numWindows = numWindows;
            return this;
        }

        @Override
        public HouseBuilder buildWalls(List<Wall> walls) {
            house.walls = walls;
            return this;
        }

        @Override
        public HouseBuilder buildDefaultWalls() {
            var walls = new ArrayList<Wall>();
            for(int ii=1; ii<=4; ii++) {
                walls.add(new Wall(Material.WOOD));
            }
            house.walls = walls;
            return this;
        }

        @Override
        public HouseBuilder buildRoof(Roof roof) {
            house.roof = roof;
            return this;
        }

        @Override
        public HouseBuilder buildDefaultRoof() {
            house.roof = new Roof(Material.WOOD);
            return this;
        }

        @Override
        public House build() {
            return house;
        }
    }

    static class StoneHouseBuilder implements HouseBuilder {

        private House house = new House();

        @Override
        public void reset() {
            house = new House();
        }

        @Override
        public HouseBuilder numWindows(int numWindows) {
            house.numWindows = numWindows;
            return this;
        }

        @Override
        public HouseBuilder buildWalls(List<Wall> walls) {
            house.walls = walls;
            return this;
        }

        @Override
        public HouseBuilder buildDefaultWalls() {
            var walls = new ArrayList<Wall>();
            for(int ii=1; ii<=4; ii++) {
                walls.add(new Wall(Material.STONE));
            }
            house.walls = walls;
            return this;
        }

        @Override
        public HouseBuilder buildRoof(Roof roof) {
            house.roof = roof;
            return this;
        }

        @Override
        public HouseBuilder buildDefaultRoof() {
            house.roof = new Roof(Material.STONE);
            return this;
        }

        @Override
        public House build() {
            return house;
        }
    }
}
