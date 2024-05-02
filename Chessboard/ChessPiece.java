
public abstract class ChessPiece {
    public final String  color;
    public int location[]=new int[2];
    private boolean isDead;

    public ChessPiece(String color){
        this.color=color; 
        isDead=false;
    }
    public  abstract void move(int x,int y);

    public  void setLocation(int x,int y){
        location[0]=x;
        location[1]=y;
    }
    public int[] getLocation() {
        return location;
    }

    public void  kill(){
        isDead = true;
    }

    public boolean isAlive(){
        return !isDead;
    }


}
