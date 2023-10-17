package homework_week6;

public class Programme_2 {
/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
static float a = 20;  // static variable
static String name = "Week 6 Java Programme 2";     // static variable

public static void main(String[] args) {            // main method
    m1();                                           // calling static method into main method
}

public static void m1(){                            // static method
    System.out.println(a);
    System.out.println(name);
}
}
