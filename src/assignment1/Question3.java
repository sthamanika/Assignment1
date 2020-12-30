package assignment1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int avg = ((number1 +number2) /2);
        System.out.println("Sum:" + sum);
        System.out.println("Average:" + avg);


    }
}
