package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */
class LoopToPopulateArray{

    public static void main(String[]args){

        int[] years = new int[2017];

        for (int i=0; i<2017; i++){
                years[i] = i+1;
        }

       /*
        System.out.println(years[0]);
        System.out.println(years[1]);
        System.out.println(years[2015]);
        System.out.println(years[2016]);
        */

        for (int i = 2016; i >= 0; i-=2) {
            System.out.println(years[i]);

            //could've used mod to ensure odd values
        }
    }
}