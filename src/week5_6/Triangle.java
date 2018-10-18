package week5_6;

public class Triangle extends Shape {
    public String kind = "Triangle";

    public int width = 0;
    public int height = 0;

    public Triangle(){}

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
