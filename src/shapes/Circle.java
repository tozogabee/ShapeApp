package shapes;

import interfaces.Shape;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double calculateCircumReference() {
        return 2*this.radius*Math.PI;
    }

    @Override
    public void printShape() {

    }
}
