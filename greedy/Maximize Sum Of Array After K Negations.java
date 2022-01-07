// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
      Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0 && k>0){
                nums[i]=-nums[i];
                k--;
            }
            ans+=nums[i];
        }
        if(k>0){
            Arrays.sort(nums);
            if((k&1)!=0) ans-=2*nums[0];
        }
        return ans;
    }
}
