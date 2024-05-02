public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result=solution(s,t);
        System.out.println(result);
    }

    private static String solution(String s, String t) {
        if (s == null || t == null){
            return "";
        }
        char [] charS=s.toCharArray();
        char[]  charT=t.toCharArray();
        int first=0,last=0,mimimum=s.length();
        for(int i=0;i<t.length();i++){
            for(int j=0;j<s.length();j++){
                if(charT[i]==charS[j]){
                    System.out.println(charS[j]);
                    if(charT[0]==charS[j]){
                        first=j;
                    }
                    if(charT[t.length()-1]==charS[j]){
                        last=j;
                    }
                }
            } 
            if(mimimum>(last-first)){
                mimimum=(last-first);
                first=0;
                last=0;
            }

        }
        StringBuilder sb=new StringBuilder("");
        for(int i=first;i<=last;i++){
            sb.append(charS[i]);
        }
        return sb.toString();
    }
}

