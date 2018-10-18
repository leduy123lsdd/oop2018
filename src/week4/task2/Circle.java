package week4.task2;

public class Circle extends Shape {
    private final Double PI = 3.14;

    private Double radius = 1.0;

    public Circle(Double rad) {
        this.radius = rad;
    }
    public Circle(Double rad, String color, Boolean filled) {
        super.color = color;
        super.filled = filled;
        this.radius = rad;
    }

    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return PI*Math.pow(this.radius,2);
    }

    public Double getPerimeter() {
        return 2*PI*this.radius;
    }
}
