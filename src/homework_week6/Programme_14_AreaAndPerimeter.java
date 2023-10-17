package homework_week6;

public class Programme_14_AreaAndPerimeter {
    /**
     * Write a Java program to print the area and perimeter of a rectangle.
     * Test Data:
     * Width = 5.5 Height = 8.5
     * Expected Output:
     * Area is 5.6 * 8.5 = 47.60
     * Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    public static void main(String[] args) {
        float width = 5.60f;
        float height = 8.50f;
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.println("Width = " + width + " Height = " + height);
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

    }
}
