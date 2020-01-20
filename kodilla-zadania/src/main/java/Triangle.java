import java.util.Objects;

public class Triangle implements Shape {

    String name;
    double base;
    double height;

    public Triangle(String name, double base, double height) {
        this.name = name;
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.base, base) == 0 &&
                Double.compare(triangle.height, height) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, base, height);
    }

    @Override
    public void getShapeName() {
        System.out.println(name);
    }

    @Override
    public double getField() {
        double field;
        field = (base * height)/2;
        return field;
    }
}
