package part_06;

// HouseCat inherits Feline (and Animals, because feline inherits Animals)
public class HouseCat extends Feline {

    // a private var unique to HouseCats
    private String petName;

    //a default constructor for HouseCat
    public HouseCat() {
    }

    // HouseCat constructor, which includes all vars in Animals AND Feline (using super keyword)
    public HouseCat(String preferredFood, String habitat, boolean catLike, boolean domesticated, String sound,
                    String petName) {
        super(preferredFood, habitat, catLike, domesticated, sound);
        this.petName = petName;
    }

//    public void feedingTime(HouseCat obj){
//
//        System.out.println(obj.petName + " is being fed her favorite food of " + obj.getPreferredFood() + ".");
//
//    }

    public void feedingTime(){

        System.out.println(petName + " is being fed her favorite food of " + getPreferredFood() + ".");
        eatsFood();

    }

}
