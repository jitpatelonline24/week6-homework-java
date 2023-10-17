package homework_week6;

import java.util.Scanner;

public class Programme_7_TempConversion {
    /**
     * Write a program to insert any temperature value in degree Fahrenheit and
     * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    public static void main(String[] args) { // Main methods
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Degree Fahrenheit:  ");
        double F = scan.nextDouble();
        double c = ((F - 32) * 5/9);
        System.out.println("Temperature in Celsius is : "+c+ " C");  // convert to degree Celsius
        scan.close();
    }
}
