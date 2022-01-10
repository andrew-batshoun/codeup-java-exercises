package shapes;

public class Square extends Quadrilateral {
    private double side;

    public Square(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double width) {
        this.side = width;
    }

    @Override
    public void setLength(double length) {
        this.side = length;
    }

    @Override
    public double getPerimeter() {

        return (side * 2) + (side *2);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
