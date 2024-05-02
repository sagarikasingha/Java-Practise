/*
 Given an integer array nums, return true if any value appears at
least twice in the array, and return false if every element is
distinct.
Input: nums = [1,2,3,1]
Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        boolean isdublicate=false;
        int num[]={1,2,3,1};
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    isdublicate=true;
                }
            }
        }
        if(isdublicate){
            System.out.println("contains dublicate");
        }
    }
}
