package assignment4;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {

        String str;
        String rev = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        str = input.nextLine();

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
        {
            System.out.println(str + " is a palindrome!!!!");
        }
        else
            System.out.println(str + " is not a palindrome");





    }
}
