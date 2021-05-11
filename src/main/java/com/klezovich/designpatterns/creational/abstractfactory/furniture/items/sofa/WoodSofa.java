package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Material;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.Chair;


public class WoodSofa extends Sofa {

    private Material material = Material.WOOD;

    @Override
    public Material getMaterial() {
        return material;
    }
}
