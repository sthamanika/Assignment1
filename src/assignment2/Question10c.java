package assignment2;

public class Question10c {
    public static void main(String[] args) {
        int b = 2;
        int a = 1;
        int c = 3;

        double sq = Math.sqrt((b *b - 4 * a * c));
        double x = (-b + sq) / 2*a;
        System.out.println("x = " + x);

    }
}
