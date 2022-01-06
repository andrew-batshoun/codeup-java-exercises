package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input radius = new Input();
        Circle circle = new Circle(radius.getInt());
        System.out.printf("%nThe circumference of the circle is: %.2f ", circle.getCircumference());
        System.out.printf("%nThe area of the circle is %.2f", circle.getArea());

    }

}
