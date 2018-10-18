package week4.task2;

import java.util.concurrent.BlockingDeque;

public class Rectangle extends Shape {
    private Double width = 1.0;
    private Double length = 1.0;

    public Rectangle(){}
    public Rectangle(Double w, Double l){
        this.width = w;
        this.length = l;
    }
    public Rectangle(Double w, Double l, String color, Boolean filled) {
        this.length = l;
        this.width = w;
        super.color = color;
        super.filled = filled;
    }

    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    public Double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }

    public Double getArea() {
        return this.width*this.length;
    }

    public Double getPerimeter() {
        return (this.width + this.length)/2;
    }
}
