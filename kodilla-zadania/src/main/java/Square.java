import java.util.Objects;

public class Square implements Shape {

    String name;
    double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public double getSide() {
        return side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, side);
    }

    @Override
    public void getShapeName() {
        System.out.println(name);

    }

    @Override
    public double getField() {
        double field;
        field = side *side;
        return 0;
    }
}
