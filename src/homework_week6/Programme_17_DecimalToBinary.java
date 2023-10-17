package homework_week6;

import java.util.Scanner;

public class Programme_17_DecimalToBinary {
    /**
     * 17. Write a Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     * Binary number is: 101
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a Decimal number: (5) ");
        int dec = scan.nextInt();
        conversion(dec);
        scan.close();
    }

    public static void conversion(int dec) {
        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary number is : " + bin);        //Concatenation
    }


}
