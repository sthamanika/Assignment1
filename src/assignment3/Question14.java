package assignment3;
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        if (num1 == num2)
        {
            System.out.println(" Num1 is equal to num2!!");

        }
        else if (num1 > num2)
        {
            System.out.println("Num1 is greather than num2!!!");

        }
        else if (num1 < num2)
        {
            System.out.println("num2 is greater than num1!!");
        }






    }
}
