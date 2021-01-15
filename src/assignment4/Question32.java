package assignment4;
import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];
        int sum = 0;
        System.out.println("Enter the 5 numbers: ");
        for (int i = 0; i<5; i ++) {
            array[i] = input.nextInt();
            sum = sum + array[i];
        }

        System.out.println("Sum of array numbers: " + sum);

    }
}
