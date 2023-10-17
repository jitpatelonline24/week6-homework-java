package homework_week6;

import java.util.Scanner;

public class Programme_10_MultiplicationTable {
    /**
     * . Write a Java program that takes a number as input and prints its
     * multiplication table up to 10.
     * Test Data: Input a number: 8
     * Expected Output :
     * 8 x 1 = 8
     * 8 x 2 = 16
     * 8 x 3 = 24
     * ...
     * 8 x 10 = 80
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number:  ");
        int a = scan.nextInt();
        for (int c = 1; c <= 10; c++) {
            System.out.println(a + " * " + c + " = " + a * c);
            scan.close();
        }

    }
}
