package com.klezovich.designpatterns.creational.abstractfactory.furniture.shop;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.factories.FurnitureFactory;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Furniture;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {

    private final FurnitureFactory factory;

    public FurnitureShop(FurnitureFactory factory) {
        this.factory = factory;
    }

    public List<Furniture> getLivingRoomFurnitureSet() {
        var list = new ArrayList<Furniture>();
        list.add(factory.makeChair());
        list.add(factory.makeTable());
        list.add(factory.makeSofa());
        return list;
    }
}
