package homework_week6;

public class Programme_15_SwapTheValue {
    /**
     * Write a Java Program to swap two variables
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Variable value before swapping: a = " + a + " and b = " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Variable values after swapping: a = " + a + " and b = " + b);


    }
}
