package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables.
 * At least one of must be static. Within class_01 create at least 3 instances of class_02.
 * Set the instance variables of class_02. Then, just once, in one place, set the static instance variable in
 * class_02. Afterwards, print out the value of each instance variable and the static variable for each class.
 */

class One {

    public static void main(String[] args) {
        // three instances of class 2 (House)
        House meghanHouse = new House("123 A St", 1950, "bungalow");
        House andreaHouse = new House("234 B St", 1895, "victorian" );
        House kevinHouse = new House("345 C St", 1910, "miner's cottage");

        House.city = "Butte";

        System.out.println("Meghan lives in a " + meghanHouse.yearBuilt + "'s " + meghanHouse.type + " at "
                + meghanHouse.streetAddress + " in " + House.city);

        System.out.println("Andrea lives in a " + andreaHouse.yearBuilt + "'s " + andreaHouse.type + " at "
                + andreaHouse.streetAddress + " in " + House.city);

        System.out.println("Kevin lives in a " + kevinHouse.yearBuilt + "'s " + kevinHouse.type + " at "
                + kevinHouse.streetAddress + " in " + House.city);
    }

}

class House {

    //instance vars, one is static
    String streetAddress;
    static String city;
    int yearBuilt;
    String type;

    public House(String streetAddress, int yearBuilt, String type) {
        this.streetAddress = streetAddress;
        this.yearBuilt = yearBuilt;
        this.type = type;
    }
}

