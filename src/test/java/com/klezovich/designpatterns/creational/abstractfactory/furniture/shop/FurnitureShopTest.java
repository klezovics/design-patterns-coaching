package com.klezovich.designpatterns.creational.abstractfactory.furniture.shop;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.factories.MetalFurnitureFactory;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.factories.WoodenFurnitureFactory;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Furniture;
import org.junit.jupiter.api.Test;

import static com.klezovich.designpatterns.creational.abstractfactory.furniture.items.FurnitureType.*;
import static com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Material.METAL;
import static com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Material.WOOD;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.everyItem;
import static org.junit.jupiter.api.Assertions.*;

class FurnitureShopTest {

    @Test
    void testWoodenFurnitureShop() {

        var woodenShop = new FurnitureShop(new WoodenFurnitureFactory());
        var furnitureSet = woodenShop.getLivingRoomFurnitureSet();

        assertEquals(3, furnitureSet.size());

        var furnitureMaterials = furnitureSet.stream().map(Furniture::getMaterial).collect(toSet());
        assertThat(furnitureMaterials, everyItem(is(WOOD)));

        var furnitureTypes = furnitureSet.stream().map(Furniture::getType).collect(toList());
        assertEquals(3, furnitureTypes.size());
        assertThat(furnitureTypes, containsInAnyOrder(CHAIR,TABLE,SOFA));
    }

    @Test
    void testMetalFurnitureShop() {

        var metalShop = new FurnitureShop(new MetalFurnitureFactory());
        var furnitureSet = metalShop.getLivingRoomFurnitureSet();

        assertEquals(3, furnitureSet.size());

        var furnitureMaterials = furnitureSet.stream().map(Furniture::getMaterial).collect(toSet());
        assertThat(furnitureMaterials, everyItem(is(METAL)));

        var furnitureTypes = furnitureSet.stream().map(Furniture::getType).collect(toList());
        assertEquals(3, furnitureTypes.size());
        assertThat(furnitureTypes, containsInAnyOrder(CHAIR,TABLE,SOFA));
    }
}