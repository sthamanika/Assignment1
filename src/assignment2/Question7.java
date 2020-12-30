package assignment2;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double v, r, h ;
        double pi = 3.14;

        System.out.println("Enter the radius of the cylinder: ");
        r = s.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        h = s.nextInt();
        v = pi * r * r * h;
        System.out.println("Volume of the cylinder: " + v);



    }
}
