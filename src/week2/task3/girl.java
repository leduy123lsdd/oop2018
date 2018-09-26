package week2.task3;

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
