package com.klezovich.designpatterns.creational.abstractfactory.furniture.factories;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.Chair;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.MetalChair;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.WoodenChair;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa.MetalSofa;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa.Sofa;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa.WoodSofa;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table.MetalTable;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table.Table;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table.WoodenTable;

public class MetalFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair makeChair() {
        return new MetalChair();
    }

    @Override
    public Sofa makeSofa() {
        return new MetalSofa();
    }

    @Override
    public Table makeTable() {
        return new MetalTable();
    }
}
