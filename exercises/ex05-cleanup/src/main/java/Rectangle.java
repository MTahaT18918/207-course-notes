/**
 * Rectangle class with width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /** 
  * Constructs Rectangle.
  * 
  * @param w Rectangle width.
  * 
  * @param h Rectangle height.
  */

  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates the area of the rectangle.
   * 
   * @return Rectangle's area.
   */

  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   * 
   * @param factor The factor by which to scale the rectangle.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Checks if this rectangle is larger than another.
   * 
   * @param other The rectangle to compare to.
   * 
   * @return Whether this rectangle is larger than the other.
   */

  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
