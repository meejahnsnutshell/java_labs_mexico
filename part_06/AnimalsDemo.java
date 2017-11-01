package part_06;

public class AnimalsDemo {

    public static void main(String[] args) {

        // an object of Animals
        Animals animal = new Animals("meat", "savannah");

        // an object of Feline
        Feline feline = new Feline("canned tuna", "urban", true, true,
                "whine");

        // an object of HouseCat
        HouseCat kitty = new HouseCat("Friskies", "house", true, true,
                "meow", "Nibbles");

        // an object of Lion
        Lion lion = new Lion("antelope carcass", "the Serengeti", true,
                false, "ROAR", true, 4);

        //using a method in the superclass in a subclass
        kitty.feedingTime();
        kitty.makesSound();

        lion.huntingTime();
        lion.makesSound();

        // an object of Lion that initializes with the default constructor
        Lion simba = new Lion();

        // use setters on Lion object called simba:
        simba.setPreferredFood("gazelle");
        // catLike isn't set yet
        System.out.println("Is Simba cat like?");
        //this will print false
        System.out.println(simba.isCatLike());

        //after using the setter in Feline, now will print true.
        simba.setCatLike(true);
        System.out.println("Is Simba cat like now?");
        System.out.println(simba.isCatLike());

        // create an Animals reference variable to use in dynamic method dispatch demo:
        Animals anAnimalRef;

        // we can assign anAnimalRef to objects of all three class levels, which have already been created
        // above, and call the run method on those objects. Java looks to the object type (not the reference
        // variable) to determine which "run" method to execute (there is one in each class except HouseCat).

        anAnimalRef = animal;
        animal.runs();

        anAnimalRef = feline;
        feline.runs();

        anAnimalRef = lion;
        lion.runs();


    }
}
