package assignment2;

public class Question11a {
    public static void main(String[] args) {
        int a = 10; //using temporary variable
        int b = 20;

        System.out.println("value of a and b before swapping, \na: " + a + "\nb: " + b);

        int temp = a; // a value is assigned to b. temp equals 10
        a = b; // b value is assigned to a. now a equals 20
        b = temp; // temp value is assigned to b. now b equals 10

        System.out.println("Value of a and b after swapping, \na: " + a + "\nb: " + b);






    }
}
