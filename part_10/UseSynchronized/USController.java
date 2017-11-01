package part_10.UseSynchronized;

public class USController {

    public static void main(String[] args) {

        UseSynchronization us1 = new UseSynchronization("oneThread");
        UseSynchronization us2 = new UseSynchronization("twoThread");

        double d1 = us1.divide(5.0, 6.234);
        System.out.println(d1);
        double d2 =  us2.divide(2.444, 2.444);
        System.out.println(d2);
    }
}
