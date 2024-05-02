

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread  1 is running");
        System.out.println("Thread Name - "+Thread.currentThread().getName()); 
    }
    
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start(); 
        t1.run();
        /*
            Thread  1 is running
            Thread  1 is running
            Thread Name - Thread-0
            Thread Name - main
         */
          
    }
    
}
