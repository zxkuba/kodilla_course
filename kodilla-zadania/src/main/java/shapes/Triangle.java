package shapes;

import java.util.Objects;

public class Triangle implements Shape {


    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return (base * height)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.base, base) == 0 &&
                Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }
}
