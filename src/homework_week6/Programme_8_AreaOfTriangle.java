package homework_week6;

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {
    /**
     * Write a program to calculate the area of a triangle
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Base Size : ");
        float b = scan.nextFloat();
        System.out.println("Enter Height Size : ");
        int h = scan.nextInt();
        float area = (b * h) / 2;
        System.out.println("Area of Triangle is : " +area);
        scan.close();
    }
}
