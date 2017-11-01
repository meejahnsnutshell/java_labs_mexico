package part_06;

public class Lion extends Feline {

    private boolean hasMane;
    private int numInPride;

    //a default constructor for Lion
    //ex of method overloading, two methods, same name, different parameters
    public Lion() {
    }

    public Lion(String preferredFood, String habitat, boolean catLike, boolean domesticated, String sound,
                boolean hasMane, int numInPride) {
        super(preferredFood, habitat, catLike, domesticated, sound);
        this.hasMane = hasMane;
        this.numInPride = numInPride;
    }

    public void huntingTime(){

        System.out.println("The lion left his pride of " + numInPride + " to hunt " + getPreferredFood() + ".");
        eatsFood();

    }

    // an overridden method to demonstrate dynamic method dispatch:
    public void runs(){
        System.out.println("The Lion runs.");
    }


}
