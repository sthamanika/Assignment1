package assignment3;
import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highscore = 0;
        String highscorer = "";
        System.out.println("Enter the number of students: ");
        int studentnumbers = input.nextInt();

        System.out.println("Enter each students name and score:");
        for (int i = 0; i <studentnumbers; i++)
        {
            System.out.print("Student: " + (i+1)+
                    "\n Name: ");
            String name = input.next();
            System.out.print("Score: ");
            int score = input.nextInt();

            if (score> highscore)
            {
                highscore = score;
                highscorer = name;

            }
        }

        System.out.println("Student with the highest score is " + highscorer);



    }
}
