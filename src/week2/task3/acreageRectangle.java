package week2.task3;

//Class 1
class acreageRectangle {
    private String color;
    private Float width;
    private Float height;

    public void setWidth(Float width) {
        this.width = width;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getColor(){
        return this.color;
    }
    public Float getWidth(){
        return this.width;
    }

    public Float getHeight(){
        return this.height;
    }

    public acreageRectangle(Float w, Float h) {
        this.width = w;
        this.height = h;
    }

    public Float acreage(){
        return width * height;
    }

    public Float perimeter() {
        return (width*height)/2;
    }

    public double diagonalLive() {
        return Math.sqrt(width*width + height*height);
    }
}
