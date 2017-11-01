package part_06;

//Animals is the superclass
public class Animals {

    //private variables
    private String preferredFood;
    private String habitat;

    //a default constructor for Animals
    public Animals() {
    }

    //overloading constructors by adding others with differing argument types
    public Animals(String habitat) {

        this.habitat = habitat;
    }

    //Superclass constructor
    public Animals(String preferredFood, String habitat) {

        this.preferredFood = preferredFood;
        this.habitat = habitat;
    }

    //getters and setters
    public String getPreferredFood() {

        return preferredFood;
    }

    public void setPreferredFood(String preferredFood) {

        this.preferredFood = preferredFood;
    }

    public String getHabitat() {

        return habitat;
    }

    public void setHabitat(String habitat) {

        this.habitat = habitat;
    }

    //two methods in the Superclass that could apply to all animals
    public void eatsFood() {

        System.out.println("The animal eats the food.");
    }

    // an overridden method to demonstrate dynamic method dispatch (see the main method):
    public void runs() {

        System.out.println("The Animal runs.");
    }
}
