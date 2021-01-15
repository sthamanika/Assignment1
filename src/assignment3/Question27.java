package assignment3;
import java.util.Scanner;


public class Question27 {

    public static void main(String[] args) {
        int digits;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        digits = input.nextInt();
        System.out.println("Sum is " + sumDigits(digits));
        System.out.println("Product is " + productDigits(digits));

    }

    public static int sumDigits(int n)
    {
        int sum = 0;

        while ( n > 0)
        {
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;

    }

    public static int productDigits(int n)
    {
        int pro = 1;

        while(n>0)
        {
        pro = pro * (n%10);
        n = n/10;

        }
        return pro;

    }
}
