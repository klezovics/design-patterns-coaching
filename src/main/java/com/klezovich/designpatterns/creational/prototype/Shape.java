package com.klezovich.designpatterns.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//This is the base prototype, you can think of it like an interface
@EqualsAndHashCode
public abstract class Shape {

    private int x;
    private int y;
    private String color;

    //First part of the prototype pattern - the clone method
    //Implemented by every subclass
    public abstract Shape clone();

    //Second part of the prototype pattern - constructor, which copies
    //the fields
    //Implemented by every subclass
    protected Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    protected Shape() {
       this.x=0;
       this.y=0;
       this.color="black";
    }


}
