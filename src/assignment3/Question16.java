package assignment3;
import java.util.Scanner;


public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0 ) {
            System.out.println("Entered number is even.");
        } else {
            System.out.println("Entered number is odd");
        }
    }
}