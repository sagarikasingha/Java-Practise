/*
 * Maximum Subarray
Given an integer array nums, find the subarray with the largest
sum, and return its sum.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum of 1.

 */

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int  currSum = nums[0];
        int maxSum=nums[0];
        for (int i=1;i<nums.length;i++){
            currSum=currSum+nums[i];
            if (currSum >maxSum){
                maxSum=currSum;
            }
            if(currSum<nums[i]){
               currSum=nums[i];
           }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Sum is " + maxSubArray(nums));
    }
    
}
