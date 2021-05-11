package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.sofa;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Furniture;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.FurnitureType;
import lombok.Getter;

@Getter
public abstract class Sofa extends Furniture {

    protected FurnitureType type = FurnitureType.SOFA;
}
