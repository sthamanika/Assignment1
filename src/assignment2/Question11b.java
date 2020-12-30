package assignment2;

public class Question11b {
    public static void main(String[] args) {
        int a = 10; //without using temporary variable
        int b = 20;

        System.out.println("value of a and b before swapping, \na: " + a + "\nb: " + b);

        a = a + b; // now a is 30 and b is 20
        b = a - b; //  now a is 30 minus b is 20 ( b is 10)
        a = a - b; // now a is 30 minus b is 10, ( a is 20)

        System.out.println("Value of a and b after swapping, \na: " + a + "\nb: " + b);


    }
}
