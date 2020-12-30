package assignment3;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1- 7: ");
        int day = input.nextInt();

        System.out.println(getDayWeek(day));

    }

    public static String getDayWeek(int day)
    {
        String dayWeek = "";
        switch (day)
        {
            case 1: dayWeek = "Monday"; break;
            case 2: dayWeek = "Tuesday"; break;
            case 3: dayWeek = "Wednesday"; break;
            case 4: dayWeek = "Thursday"; break;
            case 5: dayWeek = "Friday"; break;
            case 6: dayWeek = "Saturday"; break;
            case 7: dayWeek = "Sunday"; break;
            default:
                dayWeek = "Invalid";




        }
        return dayWeek;


    }
}
