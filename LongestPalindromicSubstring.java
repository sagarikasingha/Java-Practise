/*
 Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
*/
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
    Solution1 s=new Solution1();
    String  str="babad";
    String sol=s.longestPalindrome(str);
    System.out.println(sol);
    }
    
}
class Solution1 {
    public String longestPalindrome(String s) {
        char[] ch= s.toCharArray();
        for(int i=0;i<s.length();i++){
            boolean flag=true;
            for(int j=s.length()-1;j>i;j--){
                if(ch[i]==ch[j]){
                    int start=i;
                    int end=j;
                   
                    for(int k=i+1;k<j-1 && end<j;k++){
                        if(!(ch[k]==ch[end-1])){
                            flag=false;
                            break;
                        }
                        end++; 
                    }
                    if(flag){
                        String subString=s.substring(start, end+1);
                      return subString;  
                    }

                }
            }
        }
        s=Character.toString(ch[0]);
        return s;
    }
}