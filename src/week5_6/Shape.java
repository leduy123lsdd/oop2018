package week5_6;

import javax.swing.*;

public class Shape {
    private String color = "red";
    private Boolean filled = true;

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
    public void draw(){}
}
