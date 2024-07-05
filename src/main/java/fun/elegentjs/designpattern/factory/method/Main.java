package fun.elegentjs.designpattern.factory.method;

import fun.elegentjs.designpattern.factory.method.impl.CycleShapeFactory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CycleShapeFactory();
        shapeFactory.create().draw();
    }
}
