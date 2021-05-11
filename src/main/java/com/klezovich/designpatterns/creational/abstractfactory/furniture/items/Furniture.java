package com.klezovich.designpatterns.creational.abstractfactory.furniture.items;

public abstract class Furniture {

    abstract public Material getMaterial();
    abstract public FurnitureType getType();
}
