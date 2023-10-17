package homework_week6;

public class Programme_18_PrintOperation {
    /**
     * Write a Java program to print the sum (addition), multiply, subtract, divide and
     * remainder of two numbers.
     * Test Data:
     * Input first number: 125
     * Input second number: 24
     * Expected Output :
     * 125 + 24 = 149
     * 125 - 24 = 101
     * 125 x 24 = 3000
     * 125 / 24 = 5
     * 125 mod 24 = 5
     */

    public static void main(String[] args) {        // main method

        int a = 125;
        int b = 24;
        System.out.println("First number is : " + a); // First number assign
        System.out.println("Second number is : " + b); // second number assign
        int add = a + b;        //addition
        int sub = a - b;        //subtraction
        int mul = a * b;        //multiplication
        int div = a / b;        //division
        int mod = a % b;        //modulus
        System.out.println("Addition: = " + a + " + " + b + " = " + add);
        System.out.println("Subtraction: = " + a + " - " + b + " = " + sub);
        System.out.println("Multiplication: = " + a + " * " + b + " = " + mul);
        System.out.println("Division: = " + a + " / " + b + " = " + div);
        System.out.println("Modulus: = " + a + " mod " + b + " = " + mod);

    }
}
