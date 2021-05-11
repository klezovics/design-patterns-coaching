package com.klezovich.designpatterns.creational.abstractfactory.furniture.items.table;

import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.Furniture;
import com.klezovich.designpatterns.creational.abstractfactory.furniture.items.FurnitureType;
import lombok.Getter;

@Getter
public abstract class Table extends Furniture {

    protected FurnitureType type = FurnitureType.TABLE;
}
