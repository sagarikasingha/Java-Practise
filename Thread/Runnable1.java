

public class Runnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
        System.out.println("Thread Name - "+Thread.currentThread().getName()); 

    }

    public static void main(String[] args) {
        Runnable1  r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        r.run();
    }
    /*
        Thread is running
        Thread is running
        Thread Name - main
        Thread Name - Thread-0

        ----------------------------
        Thread is running
        Thread is running
        Thread Name - Thread-0
        Thread Name - main

     */
    
}
