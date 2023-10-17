package homework_week6;

import java.util.Scanner;

public class Programme_6_AreaOfCircle {
    /**
     * Write a program to enter any radius value of the circle and find out the
     * area.(Formula of Area A=PI*r*r)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any radius value of the circle: ");
        double radius = scan.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Formula Area of A : " + area);
        scan.close();

    }
}
