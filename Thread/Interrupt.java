public class Interrupt {
    
    public static void main(String[] args) {
        Thread2 thread2=new Thread2();
        thread2.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() +" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() +i+" is sleeping");
            }
            thread2.interrupt();
            System.out.println("Child thread is interrupted " +thread2.interrupted());
            //change thread status
            System.out.println("Child thread is interrupted  after " +thread2.isInterrupted());
        }
        
    }
}
class Thread2 extends Thread{
    public void run() {
    for(int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName() +" "+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() +i+" is sleeping");
        }
    }
    }
}
