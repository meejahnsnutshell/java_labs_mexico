package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs.
 * Print this statement to the console. Do this at least 3 times with different Strings/sentences.
 */

class VarArity{

    public static String add(String... strings) {

        StringBuilder builder = new StringBuilder();

        for (String arg : strings) {

            builder.append(arg);
        }
        return builder.toString();  //Outputs the entire contents of the StringBuilder.
    }

    public static void main(String[] args) {

        String sentence;

        sentence = add("Hello ", "my ", "name ", "is ", "Meghan.");
        System.out.println(sentence);

    }












}


/*
    public StringBuilder stringSentence(String ... v) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < v.length; i++) {

            StringBuilder s = sb.append(v[i]);
            //System.out.println(s);    //prints 5 times, adding a word each time
            return s;                   // trying to save the sentence, but s doesn't exist outside for
        }


    }

    public static void main(String[] args) {

        VarArity va = new VarArity();

        StringBuilder sent = va.stringSentence("Hello", "my", "name", "is", "Meghan");

    }
}
*/

/*
Without using StringBuilder:

for(int i=0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println(".");

    }

    public static void main(String[] args) {
        VarArity test = new VarArity();

        test.stringSentence("Hello", "my", "name", "is", "Meghan");
    }
*/
