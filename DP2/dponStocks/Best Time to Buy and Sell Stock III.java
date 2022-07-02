// Memoization
S.C. & T.C. => O(N*2*2)


class Solution {
    int dp[][][];
    
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2][2];
        for(int i=0;i<prices.length;i++) {
            Arrays.fill(dp[i][0],-1);
            Arrays.fill(dp[i][1],-1);
        }
        return helper(0,prices,1,1);
        
    }
    
    
    int helper(int i,int p[],int buy,int time){
      if(i==p.length || time<0) return 0;
        if(dp[i][buy][time]!=-1){
       // System.out.println("Kaa re bhayva");
            return dp[i][buy][time]; 
        } 
        if(buy==1){
            int a1=-p[i]+helper(i+1,p,0,time);
            int a2=helper(i+1,p,1,time);
            return dp[i][buy][time]=Math.max(a1,a2);
        }
        int a1=p[i]+helper(i+1,p,1,time-1);
        int a2=helper(i+1,p,0,time);
        return dp[i][buy][time]=Math.max(a1,a2);
    }
}
