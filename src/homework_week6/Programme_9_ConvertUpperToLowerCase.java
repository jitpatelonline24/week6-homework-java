package homework_week6;

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {
    /**
     * Write a program to convert the upper case to lower case
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        System.out.println("Enter text Upper case = ");
        string = scan.nextLine();
        String string1 = string.toLowerCase();
        System.out.println("Text converted to lower case = "+string1);
        scan.close();
    }
}
