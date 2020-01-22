package shapesTest;

import org.junit.Assert;
import org.junit.Test;
import shapes.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(25.0);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(25.0);
        Triangle triangle = new Triangle(45.5, 25.8);
        Square square = new Square(5.25);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertEquals(2,shapeCollector.getShapeCount());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(25.8);
        Triangle triangle = new Triangle(48.5, 5.85);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        //When
        Shape shape = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(triangle, shape);
    }
    @Test
    public void testShowFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(25.8);
        Triangle triangle = new Triangle(48.5, 5.85);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        //When
        shapeCollector.showFigures();
        //Then
    }

}
