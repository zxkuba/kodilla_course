package shapes;

import java.util.Objects;

public class Square implements Shape {

    private double side;

    public Square( double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "square";
    }
    @Override
    public double getField() {
        return side *side;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
