package fun.elegentjs.designpattern.factory.simple.impl;

import fun.elegentjs.designpattern.factory.simple.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
