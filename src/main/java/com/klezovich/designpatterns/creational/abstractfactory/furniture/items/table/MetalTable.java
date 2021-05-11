package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.FurnitureType;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Material;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.Chair;


public class MetalTable extends Table {

    private Material material = Material.METAL;

    @Override
    public Material getMaterial() {
        return material;
    }
}
