// Capital first letter in String
class CapitalString {
    public static void main(String[] args){
         String str = "java is fun";
         System.out.println("Original: " +str);
        // Using toUpperCase() method of class String 
        char[] c=str.toCharArray();  

  //--------------------------------------with in built methods--------------------------------------         
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(c[0]));
        //System.out.println(sb);
        for (int i=1;i<c.length;i++) {                      
            if(c[i]==' ' && i<c.length-1){
                sb.append(c[i]);
                sb.append(Character.toUpperCase(c[++i]));
            }else{
                sb.append(c[i]);
            }
        }
        System.out.println("Capitalized WITH METHOD : "+sb);

        //--------------------------------------with in built methods--------------------------------------         
        StringBuilder sb1=new StringBuilder();
        int converter=32;
        char upper=(char) (c[0]-converter);
        sb1.append(upper);//Converting First character to Uppercase using ASCII values
        for (int i=1;i<c.length;i++) {                      
            if(c[i]==' ' && i<c.length-1){
                sb1.append(c[i]);
                 upper=(char)(c[++i]-converter);
                sb1.append(upper);
            }else{
                sb1.append(c[i]);
            }
        }
        System.out.println("Capitalized  WITHOUT METHOD: "+sb1);

    }
    

}