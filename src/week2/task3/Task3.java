package week2.task3;

import java.security.SecureRandom;


public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

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
//Class 2
class car {
    private String color;
    private Float price;
    private String madeIn;

    public String getColor() {
        return color;
    }
    public Float getPrice(){
        return price;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setColor(String c){
        this.color = c;
    }
    public void setPrice(Float p){
        this.price = p;
    }
    public void setMadeIn(String m){
        this.madeIn = m;
    }

    public car(String c, Float p, String m) {
        this.color = c;
        this.price = p;
        this.madeIn = m;
    }

    public String quality() {
        if(madeIn == "china") {
            return "Safeful for people";
        } else  {
            return "Need considered";
        }
    }

    public String expensive(){
        if(price > 1000.00) return "very expensive";
        else return "normal";
    }

}
//Class 3
class girl {
    private String name;
    private int height;
    private int weight;
    private String farivoteGift;
    private String character;

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFarivoteGift(String farivoteGift) {
        this.farivoteGift = farivoteGift;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getCharacter() {
        return character;
    }

    public String getFarivoteGift() {
        return farivoteGift;
    }

    public String getName() {
        return name;
    }


    public girl(String name, int height,int weight, String farivoteGift, String character) {
        this.name = name;
        this.height = height;
        this.farivoteGift = farivoteGift;
        this.character = character;
        this.weight = weight;
    }

    public String hot() {
        if( height>160 && weight < 55) return "HOTTTTTTT.";
        else return "so so" ;
    }

    public String Good(){
        if(character == "kind" || character == "beauty" ||character == "Smiley"){
            return "Good person.";
        }
        else  return "Well i don't know men.";
    }
}