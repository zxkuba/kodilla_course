import java.util.Objects;

public class Circle implements Shape {

    private String name;
    final double numberPi=3.14;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getNumberPi() {
        return numberPi;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.numberPi, numberPi) == 0 &&
                Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberPi, radius);
    }

    @Override
    public void getShapeName() {
        System.out.println(name);
    }

    @Override
    public double getField() {
        double field;
        field = numberPi *(radius * radius);
        return field;
    }
}
