package assignment4;
import java.util.Scanner;
public class Question28 {
    public static void main(String[] args) {
        int number;
        int temp;
        boolean isPrimeNumber = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();


        for (int i = 2; i <= number/2; i++) {
            temp = number % i;
            if (temp == 0) {
                isPrimeNumber = false;
                break;
            }

        }

        if (isPrimeNumber)
        {
            System.out.println(number + " is a prime number");
        }
        else
        {
            System.out.println(number + " is a not a prime number");
        }

    }
}