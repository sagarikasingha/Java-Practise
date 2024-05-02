/*
 input = "HP123DK45IM23"
 OUTPUT= 123
         45
         23
 */

public class Numberprint {
    public static void main(String[] args) {
        String s= "HP123DK45IM23" ;
        char ch[]=s.toCharArray();
        for (int i=0;i<s.length();i++){
            boolean digit=Character.isDigit(ch[i]);
            if(digit){
                System.out.print(ch[i]);
                if((i<s.length()-1)&& !Character.isDigit(ch[i+1])){
                    System.out.println();
                }
            } 
        }
    }
}
