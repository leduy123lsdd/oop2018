package week5_6;

 class Circle extends Shape {
     public String kind = "Circle";


    public Double radius = 0.0;
    public int x = 0, y = 0;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
