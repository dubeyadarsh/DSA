class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int back[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++) back[i]=i;
        int max=0;
        int l=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    back[i]=j;
                }
            }
            if(dp[i]>max)  {
                max=dp[i];
                l=i;
            }
        }
        int ans=dp[l];
//         Printing longest increasing subseq
       while(l!=back[l]){
           System.out.print(nums[l]+" ");
           l=back[l];
       }
        System.out.println(nums[l]);
        return ans;
    }
}
// We can use binary search as well 
// https://youtu.be/on2hvxBXJH4
