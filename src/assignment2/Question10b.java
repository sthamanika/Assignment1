package assignment2;

import javax.swing.*;


public class Question10b {
    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c: "));

        double s = (a + b + c) /2 ;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        JOptionPane.showMessageDialog( null, "Area is: " + area);


    }
}
