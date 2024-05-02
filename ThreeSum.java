/*
Given an integer array nums, return all the triplets [nums[i],
nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].

 */


public class ThreeSum {
   
    public static void main(String[] args) {
        int[ ] nums = {-1,0,1,2,-1,-4};
        int[] triplets=new int[3];
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(!(nums[i]==nums[j]&&nums[i]==nums[k]&&nums[k]==nums[i])){
                        if(nums[i]+nums[j]+nums[k]==0){
                            triplets[0]=nums[i];
                            triplets[1]=nums[j];
                            triplets[2]=nums[k];
                            for(int a=0;a<3;a++){
                                System.out.print(triplets[a]+ " ");
                            }
                            System.out.println();
                        }
                    }
                }
               
            }
        }
    }
}
