package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList <Shape> List = new ArrayList<>();

    public void addFigure(Shape shape) {
        List.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if(List.remove(shape)) {
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int n) {

       return List.get(n);
    }

    public Object showFigures() {
        return List;
    }
}
