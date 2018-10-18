package week4.task2;

public class Shape {
    protected String color = "red";
    protected Boolean filled = true;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Boolean Filled() {
        return filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Shape(){}
    public Shape(String c, Boolean f) {
        this.color = c;
        this.filled = f;
    }
}
