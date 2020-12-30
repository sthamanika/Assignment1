package assignment2;


import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the degree in Fahrenheit: ");
        double userfah = input.nextDouble();

        System.out.println("Input the degree in Celsius");
        double usercel = input.nextDouble();

        double celsius = ((5 *( userfah - 32.0)) / 9.0);
        double fahrenheit = ((9 * usercel + (32*5)) / 5 );
        System.out.println(userfah + " degree Fahrenheit is equal to " + celsius + " degree Celsius.");
        System.out.println(usercel + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit.");
    }
}
