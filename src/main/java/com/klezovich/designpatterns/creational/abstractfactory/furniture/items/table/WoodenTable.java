package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Material;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.Chair;


public class WoodenTable extends Table {

    private Material material = Material.WOOD;

    @Override
    public Material getMaterial() {
        return material;
    }
}
