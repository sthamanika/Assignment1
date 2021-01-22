package assignment4;

import java.util.Scanner;


public class Question41 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter: ");
        String str = input.nextLine();
        duplicate(str);

    }

    public static void duplicate(String str){

        int count = 0;
        char[] inp = str.toCharArray();
        System.out.println("Dupplicate are: ");
        for (int i = 0; i < str.length(); i++)
        {
            count++;
            for (int j = i +1 ; j <str.length();j++)
            {
                if (inp[i] == inp[j] && inp[i] ! = '')
                {
                    count++;
                    inp[j] = '0';

            }
        }



    }
}
