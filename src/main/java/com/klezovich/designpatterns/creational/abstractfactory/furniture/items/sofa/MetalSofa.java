package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Material;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.Chair;


public class MetalSofa extends Sofa {

    private Material material = Material.METAL;

    @Override
    public Material getMaterial() {
        return material;
    }
}
