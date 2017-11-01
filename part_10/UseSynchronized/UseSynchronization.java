package part_10.UseSynchronized;

public class UseSynchronization implements Runnable {

    Thread thrd;

    UseSynchronization(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " has started..");

    }

    public synchronized double sum(double a, double b){
        return a + b;
    }

    public synchronized double divide(double x, double y) throws ArithmeticException{
        return x / y;
    }
}
