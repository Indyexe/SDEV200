import java.util.Scanner;

public class NewTriangle {

    public abstract class GeometricObject {
        private String color = "white";
        private boolean filled;

        // Default constructor
        protected GeometricObject() {
        }

        // Constructor to initialize color and filled status
        protected GeometricObject(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        // Getter method for color
        public String getColor() {
            return color;
        }

        // Setter method for color
        public void setColor(String color) {
            this.color = color;
        }

        // Getter method for filled status
        public boolean isFilled() {
            return filled;
        }

        // Setter method for filled status
        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        // Abstract method to find the area
        public abstract double getArea();

        // Abstract method to get the perimeter
        public abstract double getPerimeter();
    }

    // Extending the GeometricObject
    public class Triangle extends GeometricObject {
        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;

        public Triangle() {
        }

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        // Initializing sides, color, and filled status
        public Triangle(double side1, double side2, double side3, String shade, boolean isfilled) {
            super(shade, isfilled);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        //Methods for gettings sides * added for new commmit
        public double getFirstSide() {
            return side1;
        }

        public double getSecondSide() {
            return side2;
        }

        public double getThirdSide() {
            return side3;
        }

        // Implements the abstract method to calculate the area
        public double getArea() {
            double angleC = Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2));
            return 0.5 * side1 * side2 * Math.sin(angleC);
        }

        // Implements the abstract method to calculate the perimeter
        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        // This String describes the triangle
        public String toString() {
            return "Triangle Details: " +
            "\nSide 1: " + side1 + 
            "\nSide 2: " + side2 +
            "\nSide 3: " + side3 +
            "\nTotal Perimeter: " + getPerimeter() +
            "\nArea: " + getArea();
            "\nFilled: " + ();
        }
    }

    // Main method to test the Triangle class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Outputs that prompt users to enter information about triangle
        System.out.println("Please enter the length for the first side of the Triangle: ");
        double side1 = input.nextDouble();
        System.out.println("Please enter the length for the second side of the Triangle: ");
        double side2 = input.nextDouble();
        System.out.println("Please enter the length for the third side of the Triangle: ");
        double side3 = input.nextDouble();

        // Asks user to enter in the color of the triangle
        System.out.println("Please enter the color of the Triangle: ");
        String color = input.next();

        System.out.println("Is the triangle filled? Please input True or False: ");
        boolean filled = input.nextBoolean();

        NewTriangle outer = new NewTriangle();
        Triangle triangle = outer.new Triangle(side1, side2, side3, color, filled);

        // This displays the properties of the triangle
        System.out.println("\nThis is what your Triangle is detailed of:");
        System.out.println(triangle);
        


        input.close();
    }
}
