package app.service;

import app.models.Circle;
import app.models.Square;
import app.models.Triangle;

public class ShapeCalculator {

    private  final Shape[] shapes;

    public ShapeCalculator(double side, double radius,
                           double base, double height){
        shapes = new Shape[]{
                new Square(side),
                new Circle(radius),
                new Triangle(base, height)};


    }

    public double getTotalShapesArea(){
        double result = 0;
        for (Shape shape :
                    shapes) {
            double area = shape.getArea();
            result += area;
            System.out.println("Area" + shape.getClass().getSimpleName() +
                    " = " + area);
        }
        return result;
    }
}
