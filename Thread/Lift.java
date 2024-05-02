public class Lift {
    private static int floor;
   
    public static void main(String[] args) {
        Person person=new Person() ;
        person.setPriority(5);
        person.setFloorReques(2);
        person.start();
        
        Person person1=new Person() ;
        person1.setPriority(1);
        person1.setFloorReques(5);
        person1.start();

        Person person2=new Person() ;
        person2.setPriority(10);
        person2.setFloorReques(8);
        person2.start();
    }

    public synchronized void move(int f){
       floor=f;
        System.out.println("Going to Floor " + floor+ " by Priority "+ Thread.currentThread().getPriority());
    }


}
class Person extends Thread{
    private int floorRequest;
    public void setFloorReques(int  fr) {floorRequest=fr;}
    private Lift lift=new Lift();
    @Override
    public void run(){
       
        lift.move(floorRequest);
    }   
}
