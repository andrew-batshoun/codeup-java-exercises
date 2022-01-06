package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input radius = new Input();
        int count = 0;
        do{

            Circle circle = new Circle(radius.getInt());
            System.out.printf("%nThe circumference of the circle is: %.2f ", circle.getCircumference());
            System.out.printf("%nThe area of the circle is %.2f%n", circle.getArea());
            count++;
            System.out.println(count + " Circle(s) made. ");

        }while (radius.yesNo("Would you like to make another circle?"));



    }

}
