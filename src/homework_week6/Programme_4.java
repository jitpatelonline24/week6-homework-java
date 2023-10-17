package homework_week6;

public class Programme_4 {
    /**
     * Write a Java programme using the following steps.
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme
     */
    static int a = 10;              // static variable
    static int b = 20;
    int ans = a + b;                // instance variable
    String name = "Programme 4 of Java Homework";


    public void myMethod1() {            // Declare one Instance method
        Programme_4 ob1 = new Programme_4();
        System.out.println(a);
        System.out.println(b);
        System.out.println(ob1.ans);
        System.out.println(ob1.name);
    }

    public static void myMethod2() {         // Declare static method
        Programme_4 ob2 = new Programme_4();
        System.out.println(a);
        System.out.println(b);
        System.out.println(ob2.ans);
        System.out.println(ob2.name);

    }

    public static void main(String[] args) {            //Main method
        Programme_4 obj = new Programme_4();
        obj.myMethod1();
        myMethod2();
    }
}