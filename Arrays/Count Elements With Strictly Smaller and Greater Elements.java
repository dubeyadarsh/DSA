// 2148. Count Elements With Strictly Smaller and Greater Elements

// Find the max and min element of array, store in max and min variables
// Compare each element with Min and Max and count while iterating through array in O(N) time
// Return the count as result.

class Solution {
    public int countElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max && nums[i]>min) count++;
        }
        return count;
    }
}
// Space Complexity: O(1)
// Time Complexity: O(N)
