//arraylist to string conversion
import java.util.ArrayList;

public class Arraylist2String {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Original: "+al);
        StringBuilder sb=new StringBuilder();
        for(Integer arr : al){
            sb.append(arr).append(",");
        }
        System.out.println("in String :"+sb);
    }    
}
