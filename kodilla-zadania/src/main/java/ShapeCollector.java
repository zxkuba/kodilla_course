import java.util.ArrayList;

public class ShapeCollector {
    //JAK ZAINICJOWAĆ ArrayList interfejsem ?
    Shape shape;


    public ShapeCollector(Shape shape, ArrayList<Shape> shapes) {
        this.shape = shape;
        this.shapes = shapes;
    }

    public void addFigure(Shape shape){

    }

    public boolean removeFigure(Shape shape){
        return true;
    }

    public Shape getFigure(int n){
        return null;
    }

    public Shape showFigures(){

        //cz tutaj ma być iteracja w pętli
        return null;
    }
}
