package com.klezovich.designpatterns.creational.abstractfactory.furniture.factories;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair.Chair;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa.Sofa;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table.Table;

public interface FurnitureFactory {

    Chair makeChair();
    Sofa makeSofa();
    Table makeTable();
}
