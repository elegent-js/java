package fun.elegentjs.designpattern.factory.simple.impl;

import fun.elegentjs.designpattern.factory.simple.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
