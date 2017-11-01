package part_10.UseThread;

public class UsingThread extends Thread{
    // Create an application that demonstrates how to create threads by extending Thread

    UsingThread(String name){

        super(name);
        start();

    }

    public void run(){
        System.out.println("Thread " + getName() + " is running.");
    }


}
