package part_06;

// Feline (a subclass) inherits Animals ( a super class)
public class Feline extends Animals {

    // instance variables unique to Felines (that the Animals class doesn't have)
    private boolean catLike;
    private boolean domesticated;
    private String sound;

    //a default constructor for Feline
    public Feline() {
    }

    // Feline's constructor, which uses super to refer to Animals instance vars
    public Feline(String preferredFood, String habitat, boolean catLike, boolean domesticated, String sound) {
        super(preferredFood, habitat);
        this.catLike = catLike;
        this.domesticated = domesticated;
        this.sound = sound;
    }

    //getters and setters for Feline vars


    public boolean isCatLike() {
        return catLike;
    }

    public void setCatLike(boolean catLike) {
        this.catLike = catLike;
    }

    public boolean isDomesticated() {
        return domesticated;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // a method for Feline subclasses to use
    void makesSound(){
        System.out.println(this.sound);

    }

    // an overridden method to demonstrate dynamic method dispatch:

    public void runs(){
        System.out.println("The Feline runs.");
    }
}
