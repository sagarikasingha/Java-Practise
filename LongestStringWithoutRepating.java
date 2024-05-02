import java.util.ArrayList;

public class LongestStringWithoutRepating {
    public static void main(String[] args){
        String s="abcabdefbcdb";
       int length= lengthOfLongestSubstring(s);
       System.out.println(length);
    }
        public static int lengthOfLongestSubstring(String s) {
            char[] ch=s.toCharArray();
            int count=0;
            int max=0;
            ArrayList<Character> longString=new ArrayList<>();
            for(int i=0;i<s.length();i++){
               if(!longString.contains(ch[i])){
                longString.add(ch[i]);
                count++;
                if(max<count){
                    max=count;
                }
               } 
               else{
                
                longString.clear();
                longString.add(ch[i]);
                count=1;
               }
           // System.out.println(longString+" "+count);
            }
            return max;
        }
    }
    
