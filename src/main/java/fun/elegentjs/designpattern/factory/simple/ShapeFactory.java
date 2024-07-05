package fun.elegentjs.designpattern.factory.simple;

import fun.elegentjs.designpattern.factory.simple.impl.Circle;
import fun.elegentjs.designpattern.factory.simple.impl.Rectangle;
import fun.elegentjs.designpattern.factory.simple.impl.Square;

/**
 * 演示简单工厂模式
 */
public class ShapeFactory {

    public static Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }


    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("CIRCLE");
        circle.draw();

        Shape rectangle = ShapeFactory.createShape("RECTANGLE");
        rectangle.draw();

        Shape square = ShapeFactory.createShape("SQUARE");
        square.draw();
    }
}
