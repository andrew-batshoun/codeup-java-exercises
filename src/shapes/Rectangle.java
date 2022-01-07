package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle() {
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }
}
