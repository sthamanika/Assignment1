package assignment3;
import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        int i, fact = 1, num;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        for ( i = 1; i <=num; i++)
        {
            fact = fact * i ;

        }
        System.out.println("Factorial = " + fact);


    }
}
