package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.chair;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Furniture;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.FurnitureType;
import lombok.Getter;

@Getter
public abstract class Chair extends Furniture {

    protected FurnitureType type = FurnitureType.CHAIR;

}
