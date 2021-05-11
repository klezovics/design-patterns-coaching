package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Material;


public class WoodenChair extends Chair {

    private Material material = Material.WOOD;

    @Override
    public Material getMaterial() {
        return material;
    }
}
