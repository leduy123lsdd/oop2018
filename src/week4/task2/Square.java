package week4.task2;

public class Square extends Rectangle {

    private Double side = 0.0;

    public Square(){}
    public Square(Double side) {
        this.side = side;
    }
    public Square(Double side,String color,Boolean filled) {
        this.side = side;
        super.color = color;
        super.filled = filled;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public void setWidth(Double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(Double length) {
        super.setLength(length);
    }
}
