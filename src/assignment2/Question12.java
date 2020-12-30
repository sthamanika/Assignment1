package assignment2;
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {

        String name;
        String nationality;
        int roll;
        Scanner input = new Scanner(System.in);



        System.out.print("Enter your Roll number: ");
        roll = input.nextInt();

        System.out.print("Enter your name: ");
        name = input.next();

        System.out.print("Enter your nationality: ");
        nationality = input.next();

        System.out.println("Roll no: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Nationality: " + nationality);






    }
}
