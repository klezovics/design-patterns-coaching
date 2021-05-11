package com.klezovich.designpatterns.creational.abstractfactory.furniture.factories;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.Chair;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.WoodenChair;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa.Sofa;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa.WoodSofa;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table.Table;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table.WoodenTable;

public class WoodenFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair makeChair() {
        return new WoodenChair();
    }

    @Override
    public Sofa makeSofa() {
        return new WoodSofa();
    }

    @Override
    public Table makeTable() {
        return new WoodenTable();
    }
}
