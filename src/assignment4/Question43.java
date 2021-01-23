//Write a program to trap the exception handling to trap the divided by zero and out of index value in array.

package assignment4;

import java.util.Scanner;

public class Question43 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Question43 first = new Question43();

        System.out.println("Enter num1");
        int num1 = input.nextInt();

        System.out.println("Enter num2");
        int num2 = input.nextInt();

        first.exceptionHandling(num1, num2);



    }
    
    public void exceptionHandling(int num1, int num2)

    {
        try
        {
            int divide = num1/num2;
            System.out.printf("%d ", divide);

        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
    try
    {
        int[] ar = new int[2];
        System.out.println(ar[2]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }
    }

}
