package assignment3;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter first side of the triangle: ");
        a = input.nextInt();
        System.out.println("Enter second side of the triangle: ");
        b = input.nextInt();
        System.out.println("Enter third side of the triangle: ");
        c = input.nextInt();

        if ( a==b && b==c)
        {
            System.out.println("Equilateral traingle");

        }
        else if ( a==b || b ==c || a == c)
        {
            System.out.println("Isosceles triangle");

        }
        else
        {
            System.out.println("Scalene triangle");
        }



    }
}


