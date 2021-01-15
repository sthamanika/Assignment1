package assignment4;

public class Question36 {

    void printRepeating(int []a, int total)

    {

        System.out.println("The repeating elements are: ");

       for (int i = 0; i < total; i++)
       {
           int j = Math.abs(a[i]);
            if (a[j] >= 0)
            {
                a[j] = - a[j];
                               }
            else
            {
                System.out.println(j + "");
           }
       }
    }


    public static void main(String[] args) {

        Question36 duplicate = new Question36();


        int ar[] = {4, 5, 22, 22, 44};
        System.out.println("Original array ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        duplicate.printRepeating( ar, 5);

    }
}