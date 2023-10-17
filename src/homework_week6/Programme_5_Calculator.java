package homework_week6;

public class Programme_5_Calculator {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */

    public static void main(String[] args) {
        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.addition(10, 50);
        obj.subtraction(100, 40);
        multiply(50, 5);
        divide(100, 4);

    }

    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two numbers: " + a + " + " + b + " is = " + ans);
    }

    public void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction of two numbers : " + a + " - " + b + " is = " + ans);       //Concatenation
    }

    public static void multiply(int a, int b) {
        int ans = a * b;
        System.out.println("Multiplication of two numbers : " + a + " * " + b + " is = " + ans);      //Concatenation
    }

    public static void divide(int a, int b) {
        int ans = a / b;
        System.out.println("Division of two numbers : " + a + " / " + b + " is = " + ans);
    }
}
