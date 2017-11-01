package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.
**/

/*
class OneClass {

    String var1 = "";
    String var2 = "";
    String var3 = "";

    public OneClass(String var1, String var2, String var3) { // the constructor

        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;

    }



    public void redMethod() {
        if ((var1 < var2) && (var1<var3)) {
            System.out.println("This is the redMethod!");
        }


    }



    public static void main(String[] args) {

        OneClass littleObject = new OneClass(2,4, 6);
        OneClass mediumObject = new OneClass(3,5, 7);
        OneClass bigObject = new OneClass(4, 6, 8);

        littleObject.redMethod();
        mediumObject.redMethod();
        bigObject.redMethod();


    }
}

class TwoClass {

    char var4 = 'c';
    char var5 = 'd';
    char var6 = 'e';

    TwoClass whoClass = new TwoClass(); //an object of class TwoClass called whoClass


}

class ThreeClass {

    double var7 = 100.0;
    double var8 = 101.0;
    double var9 = 102.0;

}

*/

class Dance{

    String styleName; // instance variables, each object will have this but will be different
    private String steps;
    int tempo;


    Dance(String styleName, String steps, int tempo) {

        this.styleName = styleName;
        this.steps = steps;
        this.tempo = tempo;

    }

    public int getTempo(){
        return this.tempo;
    }

    public void setTempo(int tempo){ // setter like alternative to constructor
        this.tempo = tempo;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public void insideTurn(){

    System.out.println("You did an inside turn!");
 }

    public void outsideTurn(){

    System.out.println("You did an outside turn!");
 }
}

class Dancer{
    String name;
    int experienceLevel;

    Dancer(String name, int experienceLevel){
        this.experienceLevel = experienceLevel;
        this.name = name;

    }

    Dancer(){

    }

    public String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }

    public void checkName(String name){
        if (name == "Meghan"){
            setName(name);
        }
    }





}


class DanceDemo{


    public static void main(String[] args) {

        Dance salsa = new Dance("salsa", "eightCount", 16 );

        Dance bachata = new Dance ("bachata", "fourCount", 7);

        Dance tango = new Dance ("tango", "fourCount", 4);

        salsa.tempo = 24;

        int salsaTempo = salsa.getTempo();
        System.out.println(salsaTempo);

        salsa.insideTurn();
        salsa.setTempo(5);

        Dancer meghan = new Dancer();

        meghan.checkName("Meghan");


    }

}














