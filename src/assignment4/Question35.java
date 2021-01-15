package assignment4;

public class Question35 {
    public static int getSecondLargest(int[]a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] >a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        return a[total - 2];
    }
    public static void main(String[] args) {
        int ar[] = {4,5,22,67,44};
        System.out.println("Original array ");
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        System.out.println("Second Largest  " + getSecondLargest(ar,5) );
    }



}
