class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,prices,1,1);
    }
    int helper(int i,int p[],int b1,int b2){
        if(i==p.length) return 0;
       
        if(b2==0) return helper(i+1,p,b1,1);
         if(dp[i][b1]!=-1){
            // System.out.println("Kaa bhau ");
            return dp[i][b1];
            
        }
        if(b1==1){
            int a1=-p[i]+helper(i+1,p,0,b2);
            int a2=helper(i+1,p,b1,b2);
            return dp[i][b1]=Math.max(a1,a2);
        }
        int a1=p[i]+helper(i+1,p,1,0);
        int a2=helper(i+1,p,b1,b2);
        return dp[i][b1]=Math.max(a1,a2);
    }
}
