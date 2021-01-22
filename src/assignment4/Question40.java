package assignment4;

import java.util.Scanner;

public class Question40 {

    public static void main(String[] args) {

        String original;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        original = input.nextLine();

        int length = original.length();
        reverse(original,length);



    }

    public static void reverse(String original, int length)
    {
        StringBuilder rev = new StringBuilder();
        for(int i = length -1; i>=0; i--)
            rev.append(original.charAt(i));
            System.out.println(rev);

    }

}

