package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape check = null;

        if (n >= 0 && n < shapeList.size()) {
            check = shapeList.get(n);
        }
        return check;
    }

    public Shape showFigures(){
        return null;
    }

    public int getShapeListSize() {
        return shapeList.size();
    }

}

