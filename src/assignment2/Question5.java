package assignment2;
import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, width, height, base, heighttri;
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = input.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        height = input.nextDouble();
        System.out.println("Enter the base of the triangle: ");
        base = input.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        heighttri = input.nextDouble();

        double pi = 3.14159265359;

        double circle_area = radius * radius * pi;
        System.out.println("Area of circle: " + circle_area);
        double rect_area = width * height;
        System.out.println("Area of rectangle: " + rect_area);
        double triangle_area = (base * heighttri) /2 ;
        System.out.println("Area of Triangle: " + triangle_area);







    }
}
