package assignment2;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int r, l , b , s1, s2, s3;
    double pi = 3.14;
    double perimeter_c, perimeter_r, perimeter_t;

        System.out.println("Enter the radius: ");
        r = s.nextInt();
        perimeter_c = 2 * pi * r;
        System.out.println("Perimeter of circle: " + perimeter_c);

        System.out.println("Enter the length of rectangle: ");
        l = s.nextInt();
        System.out.println("Enter the breadth of rectangle");
        b = s.nextInt();
        perimeter_r = 2 * (l+b);
        System.out.println("Perimeter of Rectangle: " + perimeter_r);

        System.out.println("Enter length of first side of triangle:");
        s1 = s.nextInt();
        System.out.println("Enter length of second side of triangle:");
        s2 = s.nextInt();
        System.out.println("Enter length of third side of triangle:");
        s3 = s.nextInt();
        perimeter_t = s1 + s2 + s3;
        System.out.println("Perimeter of triangle: "+perimeter_t);





    }
}
