public class NumberInString {
    public static void main(String[] args) {
        String str = "I have 12 apples.";
        char[]  c = str.toCharArray();
        //--------------- with method---------------------------------------
        for(int i=0;i<c.length;i++) {
            if(Character.isLetter(c[i])){
                System.out.print(c[i]);
            }
            if(c[i]==' '){
                System.out.print(" ");
            }
        }  
        System.out.println();
        //--------------- without method---------------------------------------   
        for(int i=0;i<c.length;i++) {
            if(c[i]>=65 && c[i]<=90 ){
                System.out.print(c[i]);
            }
            if(c[i]>=97 && c[i]<=122){
                System.out.print(c[i]);
            }
            if(c[i]==' '){
                System.out.print(" ");
            }
        }
    }
}
