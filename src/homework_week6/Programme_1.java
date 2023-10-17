package homework_week6;

public class Programme_1 {
    /**
     * Write a Java programme using the following steps.
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */
    int a = 10;    // instance or global variable;
    String name = "Week 6 Java Homework"; // instance variable

    public static void main(String[] args) {            //Main Method
        Programme_1 obj = new Programme_1();
        obj.myMethod();                                     //call the instance method into main method

    }

    public void myMethod() {                     // Instance method
        Programme_1 v1 = new Programme_1();
        System.out.println(v1.a);
        System.out.println(v1.name);
    }

}
