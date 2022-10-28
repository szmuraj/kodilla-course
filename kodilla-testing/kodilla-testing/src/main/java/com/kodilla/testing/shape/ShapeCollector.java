package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList <Shape> List = new ArrayList<>();

    public void addFigure(Shape shape) {
        List.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        List.remove(shape);
    }

    public Shape getFigure(int n) {
        return null;
    }

    public void showFigures() {
    }
}
