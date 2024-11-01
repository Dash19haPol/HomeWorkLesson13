package app;

import app.service.ShapeCalculator;

public class HomeWorkLesson13 {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator(
             12, 3, 10, 7
        );

        System.out.println("Total area sum = " + calculator.getTotalShapesArea());
    }
}
