/*
Project: Rectangle Class (Exercise)
Goal:
- Create a Rectangle class with:
  - fields: width, height (double)
  - no-arg constructor: width=1, height=2
  - constructor with width & height
  - method getArea(): width * height
  - method getPerimeter(): 2 * (width + height)
 */

public class Chapter9Project1 {
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        // Display width, height, area, perimeter (in this order) for each
        System.out.println("Rectangle 1");
        System.out.println("width: " + r1.width);
        System.out.println("height: " + r1.height);
        System.out.println("area: " + r1.getArea());
        System.out.println("perimeter: " + r1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle 2");
        System.out.println("width: " + r2.width);
        System.out.println("height: " + r2.height);
        System.out.println("area: " + r2.getArea());
        System.out.println("perimeter: " + r2.getPerimeter());
    }
}

class Rectangle {
    // Two double data fields
    double width;
    double height;

    // No-arg constructor: default width=1, height=2
    Rectangle() {
        width = 1;
        height = 2;
    }

    // Constructor with specified width and height
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // Returns area
    double getArea() {
        return width * height;
    }

    // Returns perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }
}