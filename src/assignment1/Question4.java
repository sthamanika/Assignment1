package assignment1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float p, r, t, interest;
    System.out.print("Enter the Principal: ");
    p = input.nextFloat();
        System.out.print("Enter the Time Period: ");
        t = input.nextFloat();
        System.out.print("Enter the Rate: ");
        r = input.nextFloat();
        interest =(float) (p*t*r) / 100;
        System.out.println("Simple Interest is: " + interest);
    }
}
