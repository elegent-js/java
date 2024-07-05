package fun.elegentjs.designpattern.factory.simple.impl;

import fun.elegentjs.designpattern.factory.simple.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
