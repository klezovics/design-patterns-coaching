package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Material;


public class MetalChair extends Chair {

    private Material material = Material.METAL;

    @Override
    public Material getMaterial() {
        return material;
    }
}
