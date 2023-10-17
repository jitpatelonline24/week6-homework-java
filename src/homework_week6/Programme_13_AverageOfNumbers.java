package homework_week6;

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {
    /**
     * Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = scan.nextInt();
        System.out.println("Number one: "+a);
        int b = scan.nextInt();
        System.out.println("Number two: "+b);
        int c = scan.nextInt();
        System.out.println("Number three: "+c);
        int avg = (a + b + c ) / 3;
        System.out.println("Average of the numbers: "+avg);
    }
}
