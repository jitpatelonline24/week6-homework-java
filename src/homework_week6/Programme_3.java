package homework_week6;

public class Programme_3 {
    /**
     * Write a Java programme using the following steps.
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme
     */
    static int a = 5;                               //Declare one instance and one static variable.
    String name = "Week 6 Programme 3";

    public void myMethod1() {                  //Declare one instance method
        Programme_3 ob1 = new Programme_3();
        System.out.println(ob1.a);
        System.out.println(ob1.name);

    }
    public static void myMethod2() {  // Declare one static method
        Programme_3 ob2 = new Programme_3();
        System.out.println(ob2.name);
        System.out.println(a);

    }

    public static void main(String[] args) {                // Main Method statement
        Programme_3 obj = new Programme_3();
        obj.myMethod1();
        myMethod2();

    }
}
