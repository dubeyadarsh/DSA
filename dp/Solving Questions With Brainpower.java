// 2140. Solving Questions With Brainpower
// This is dynamic programming based solution 

// state define--> In dp array at particular index , it state that it will store the maximum value starting from this index to end
//                 e.g, dp[2] will store maximum value starting from 2nd index to last we can select this index or we can ignore this index 
//                 it doesn't make difference it just store maxmimum value it can get after starting from index 2.

class Solution {
    public long mostPoints(int[][] ques) {
        int n=ques.length;
        long dp[]=new long[n];
        dp[n-1]=ques[n-1][0];
        
        for(int i=n-2;i>=0;i--){
            int index=i+1+ques[i][1];
            long ans=ques[i][0];
            if(index<n){
                ans+=dp[index];
            }
            
            dp[i]=Math.max(ans,dp[i+1]); 
        }
        return dp[0];
    }
}
