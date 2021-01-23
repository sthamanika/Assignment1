//Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh//

package assignment4;


import java.util.Scanner;


public class Question39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First name: ");
        String first = input.next();

        System.out.println("Enter your middle name: ");
        String middle = input.next();

        System.out.println("Enter your last name: ");
        String last = input.next();
        shortform(first, middle, last);



    }

    public static void shortform(String first, String middle,  String last)

    {
                String initials = (Character.toUpperCase(first.charAt(0)) + ". " + (Character.toUpperCase(middle.charAt(0)) + ". "));
        System.out.println(initials + last);


    }
}
