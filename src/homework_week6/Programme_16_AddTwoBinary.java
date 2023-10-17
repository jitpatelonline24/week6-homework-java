package homework_week6;

import java.util.Scanner;

public class Programme_16_AddTwoBinary {
    /**
     * Write a Java program to add two binary numbers.
     * Input Data:
     * Input first binary number: 10
     * Input second binary number: 11
     * Expected Output:
     * Sum of two binary numbers: 101
     */
    public static void main(String[] args) {                    //Main Method
        Scanner scan = new Scanner(System.in);
        System.out.println("First binary number: (10)");                //Input number one
        String b = scan.next();
        System.out.println("Second binary number: (11)");              //Input number two
        String c = scan.next();

        int b1 = Integer.parseInt(b, 2);
        int c1 = Integer.parseInt(c, 2);
        int sum = b1 + c1;
        String binary = Integer.toBinaryString(sum);
        System.out.println("Binary number is :  " + binary);            // Binary output
        scan.close();
    }

}
