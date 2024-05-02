/*
 Product of Array Except Self

 Given an integer array nums, return an array answer such that
answer[i] is equal to the product of all the elements of nums
except nums[I].
The product of any prefix or suffix of nums is guaranteed to fit in a
32-bit integer.
You must write an algorithm that runs in O(n) time and without
using the division operation.
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

 */

public class ProductOfArrayExceptSelf {   
    public static void main (String[] args){
        int[] input={1,2,3,4};
        int[] output=new int[input.length];

        //----with division operator with O(n) compelxity --------------
        int product=1; 
        for (int i=0;i<input.length;i++){
            product=product*input[i];  
        }
        for (int i=0;i<input.length;i++){
            output[i]=product/input[i];  
            System.out.print(output[i]+ " ");
        }

         //----without division operator with O(n) compelxity --------------

        // int[] input2={1,2,3,4};
        // int[] output2=new int[input2.length];
        // int product2[]=new int[input2.length];; 
        
        
    }
    
}
