package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables.
 * Class_02 must also have at least 3 overloaded constructors.
 * In Class_01.main() create several instances of Class_02 using each overloaded constructor.
 * Each constructor should do something slightly differently.
 * Class_02 must have at least two private instance variables.
 * Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 */

class Human {


    public static void main(String[] args) {

        // create an alien object named Squeeeeeep from Neptune.
        Alien Squeeeeeep = new Alien("Squeeeeeep", "Neptune");

        System.out.println(Squeeeeeep.getName() + " is from Planet " + Squeeeeeep.getHomePlanet() +
                " and he/she does not have an age assigned.");

        // assign Squeeeeeep an age
        Squeeeeeep.setAge(5123);

        System.out.println("Squeeeeeep is now " + Squeeeeeep.getAge() + " years old.");

        // create an alien object named Florp from PSR etc age 357.
        Alien Florp = new Alien("Florp", "PSR1257 + 12 B", 357);

        System.out.println(Florp.getName() + " is from Planet " + Florp.getHomePlanet() +
                " and he/she is " + Florp.getAge() + " years old.");

        // call alienAging method on Florp and assign his new age to a var
        int florpNewAge = Florp.alienAging(Florp.getAge());

        System.out.println(Florp.getName() + " aged and he is now " + florpNewAge + " years old.");

        // create an alien object named Steve
        Alien Steve = new Alien("Steve");

        System.out.println("This aliens name is " + Steve.getName());

        // Steve changes his name
        Steve.alienNameChange("Glip");

        System.out.println(Steve.getName() + " is the alien formerly known as Steve.");

    }


}

class Alien {

    private String name;
    private String homePlanet;
    private int age;

    // overloading constructors
    Alien(String name) {
        this.name = name;
    }

    Alien(String name, String homePlanet, int age) {
        this.name = name;
        this.age = age;
        this.homePlanet = homePlanet;
    }

    Alien(String name, String homePlanet) {
        this.name = name;
        this.homePlanet = homePlanet;
    }

    // create getters so we can use the private instance variables up in Humans class
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // a method that manipulates age instance variable
    public int alienAging(int age) {
        age += 53;
        return age;
    }

    // a method that manipulates name
    public String alienNameChange(String name) {
        this.name = name; // because sometimes an alien wants to change its name
        return name;
    }


}
