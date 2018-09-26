package week2.task3;

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
