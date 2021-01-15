package assignment4;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        int i , j , num;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        printPattern(num);



    }
    public static void printPattern(int num)
    {
        int i, j;
        for(i=1; i<num; i++)
        {
            for (j =1;j<=i; j++)
                System.out.print(j);

            System.out.println("");
            System.out.println("");
        }

    }
}
