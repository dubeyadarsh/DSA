// 2134. Minimum Swaps to Group All 1's Together II
window ka size total number of 1 k bararbar hoga kyuki hum sabko sath me rakhna chahta jiska matlab window me sab 1 hone chahiye
kisi bhi window me minimum number of zero jo hoga woi answer hoga
class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int nof1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) nof1++;
        }
       int i=0;
       int min=0; 
       for(i=0;i<nof1;i++){
           if(nums[i%n]==0) min++;
       }
     int ans=min;
        for(;i<2*n;i++){
            if(nums[(i-nof1)%n]==0) min--;
            if(nums[i%n]==0) min++;
            ans=Math.min(ans,min);
            
        }
        return ans;
    }
}
