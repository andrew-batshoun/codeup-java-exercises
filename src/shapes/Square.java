package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public double getPerimeter() {

        return (length * 2) + (length *2);
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
