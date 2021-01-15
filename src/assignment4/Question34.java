package assignment4;


public class Question34 {

    static void reverse(int a[], int n)
    {
        int [] arr = new int[n];
        int j = n;
        for (int i = 0; i <n; i++)
        {
            arr[j - 1] = a[i];
            j = j -1;
        }

        System.out.println("Reversed array is: ");
        for (int m =0; m<n; m++)
        {
            System.out.print(arr[m] + " ");
        }
    }
    public static void main(String[] args) {
        int [] array = {1,4,5,7,8,9,10};
        System.out.println("Original array ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        reverse(array,array.length);



    }
}
