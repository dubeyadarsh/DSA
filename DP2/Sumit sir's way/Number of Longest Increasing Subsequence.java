class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int back[]=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(back,1);
        // for(int i=0;i<n;i++) back[i]=i;
        int max=0;
        int l=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    back[i]=back[j];
                }
                else if(nums[j]<nums[i] && 1+dp[j]==dp[i]){
                    back[i]+=back[j];
                }
            }
          max=Math.max(dp[i],max);
        }
  
     int ans=0;
        for(int i=0;i<n;i++) if(dp[i]==max) ans+=back[i];
        return ans;
    }
}
