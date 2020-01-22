package shapes;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public int getShapeCount(){
        return shapes.size();
    }

    public void showFigures() {
        for(Shape s: shapes){
            System.out.println(s.getShapeName() + " ma pole: " + s.getField());
        }
    }
}
