package fun.elegentjs.designpattern.factory.method.impl;

import fun.elegentjs.designpattern.factory.method.ShapeFactory;
import fun.elegentjs.designpattern.factory.simple.Shape;
import fun.elegentjs.designpattern.factory.simple.impl.Circle;

/**
 * 工厂方法模式：具体工厂类
 */
public class CycleShapeFactory implements ShapeFactory {

    @Override
    public Shape create() {
        return new Circle();
    }
}
