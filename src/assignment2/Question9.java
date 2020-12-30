package assignment2;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double kg_per_pound = 0.454;
        System.out.println("Enter a number of pounds: ");
        double pound = input.nextDouble();

        double result = pound * kg_per_pound;
        System.out.println(pound + " pounds is " + result + " kg.");

    }
}
