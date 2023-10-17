package homework_week6;

import java.util.Scanner;

public class Programme_19_CoverStringtoLowerCase {

    /**
     * Write a Java program to convert a given string into lowercase.
     *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     *  Output: the quick brown fox jumps over the lazy dog.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper Case String is below : -");
        String string = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(string);
        string = string.toLowerCase();
        lowercase(string);
        scan.close();
    }
    public static void lowercase(String string){
        System.out.println("Lower case String is below: - \n "+string);
    }
}
