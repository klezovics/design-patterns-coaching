package com.klezovich.designpatterns.creational.prototype;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int w, int h) {
        super();
        this.width =w;
        this.height=h;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }


    public Shape clone() {
        return new Rectangle(this);
    }

}
