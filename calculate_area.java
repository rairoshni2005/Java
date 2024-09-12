//create a geometry class and overload calculate area method for square circle and rectangle

class Geometry {

    // Method to calculate the area of a square
    public double calculate_area(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public double calculate_area(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Geometry geometry = new Geometry();

        double squareArea = geometry.calculate_area(5); // Square with side 5
        double rectangleArea = geometry.calculateArea(5, 10); // Rectangle with length 5 and width 10
        double circleArea = geometry.calculate_area(7, true); // Circle with radius 7

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
