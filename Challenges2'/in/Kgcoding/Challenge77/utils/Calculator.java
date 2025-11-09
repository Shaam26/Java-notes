package in.Kgcoding.Challenge77.utils;

import in.Kgcoding.Challenge77.geometry.Circle;
import in.Kgcoding.Challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(10,5);

        double circleArea = Math.PI * Math.pow(circle.radius,2);
        double rectangleArea = rectangle.breadth * rectangle.length;

        System.out.printf("Area of the circle is: %f,Area of the rectangle: %f",circleArea , rectangleArea);
    }
}
