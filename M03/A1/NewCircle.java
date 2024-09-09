

import java.time.chrono.ThaiBuddhistChronology;

 public class NewCircle { 

  public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
      dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with the specified color
      *  and filled value */
    public GeometricObject(String color, boolean filled) {
      dateCreated = new java.util.Date();
      this.color = color;
      this.filled = filled;
    }

    /** Return color */
    public String getColor() {
      return color;
    }

    /** Set a new color */
    public void setColor(String color) {
      this.color = color;
    }

    /** Return filled. Since filled is boolean,
       its getter method is named isFilled */
    public boolean isFilled() {
      return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
      this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
      return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
      return "created on " + dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
    }
  }

public class Circle extends GeometricObject
implements Comparable<Circle> {



public class GeometricObject { 

    private double radius;
 
    public Circle() {
    }
 
     public Circle(double radius) {
       this.radius = radius;
     }

    public Circle(double radius, String color, boolean filled) {
      this.radius = radius;
      setColor(color);
      setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
      return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
      this.radius = radius;
    }

    /** Return area */
    public double getArea() {
      return radius * radius * Math.PI;
   }

    /** Return diameter */
    public double getDiameter() {
      return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
      return 2 * radius * Math.PI;
    }


    // This method compares the circles to eachother

    @Override 
    public int compareEach(Circle otherCircle) {
      if (this.radius == otherCircle.radius) {
        return 0;
      }
      return this.radius > otherCircle.radius ? 1 : -1;

    }
// This is the equals method that confims or denies if the radiuses are the same when comparing the circles
    @Override
    public boolean equals(Object obj) {
      if (obj instanceof Circle) {
        Circle other = (Circle) obj;
        return this.radius == other.radius;
      }
      return false;
    }
    


    /** Print the circle info */
    public void printCircle() {
      System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    }

}

}

/*I didn't feel the need to create a test program for this assignment since 
the book just stated to overide the equals method, extennd the GeometricObject, and implement the comparable interface. */

public static void main(String[] args) {
    System.out.println(printCircle);
    
}

}