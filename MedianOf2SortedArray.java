/*
 Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 
 */
import java.util.Arrays;

public class MedianOf2SortedArray {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums1={1,2};
        int[] nums2={3,4};
       double median= s.findMedianSortedArrays(nums1,nums2);
       System.out.println(median);
        
    }
    
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int combolength=nums1.length+nums2.length;
        int[] combo=new int[combolength];
        int j=0; int k=0;
        for(int i=0; i<combolength;i++){
            if(i<nums1.length){
                combo[i]=nums1[j];
                j++;
            }
            else{
                combo[i]=nums2[k];
                k++;
            }
        }
        Arrays.sort(combo);
        int point;double median;
        if(combolength%2==0){
            point=(combo.length/2)-1;
            median =(combo[point]+combo[point+1]);
            median=median/2;
        }
        else{
            point=combo.length/2;
            median =combo[point];
        }
        return median;
    }
}