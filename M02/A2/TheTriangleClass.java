public class TheTriangleClass {


public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;

  //Default construct*/
  protected GeometricObject() {
  }

  //Construct a geometric object/
  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**Getter method for color/
  public String getColor() {
    return color;
  }

  /Setter method for color*/
  public void setColor(String color) {
    this.color = color;
  }

  //Getter method for filled. Since filled is boolean,
     //so, the get method name is isFilled
  public boolean isFilled() {
    return filled;
  }

  /**Setter method for filled/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /Abstract method findArea*/
  public abstract double getArea();

  //Abstract method getPerimeter*/
  public abstract double getPerimeter();
}
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

}





}