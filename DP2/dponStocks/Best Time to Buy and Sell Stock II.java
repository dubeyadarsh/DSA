// ************Memoization************

class Solution {
    int n;
    int dp[][];
    public int maxProfit(int[] prices) {
        // either buy or sell ?
         n=prices.length;
        dp=new int[n][2];
       for(int i=0;i<n;i++){
           Arrays.fill(dp[i],-1);
       }
        
        return helper(0,1,prices);
    }
    int helper(int i,int able,int prices[]){
        if(i>=n) return 0;
        if(dp[i][able]!=-1) return dp[i][able];
        int ans=0;
        if(able==1){
            ans=Math.max(-prices[i]+helper(i+1,0,prices),helper(i+1,1,prices));
        }else{ 
            ans=Math.max(prices[i]+helper(i+1,1,prices),helper(i+1,0,prices));
        }
        return dp[i][able]=ans;
    }
}


*************Tabulation****************
class Solution {
    int n;
    int dp[][];
    public int maxProfit(int[] prices) {
        // either buy or sell ?
         n=prices.length;
        dp=new int[n+1][2];
       for(int i=n-1;i>=0;i--){
           for(int j=0;j<2;j++){
               if(j==1){
                   dp[i][j]=Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
               }else{
                dp[i][j]=Math.max(prices[i]+dp[i+1][1],dp[i+1][0]);

               }
           }
       }
        
        return dp[0][1];
    }
    
    
    
//   *More oprimised in O(1) space**********
class Solution {
    int n;
    public int maxProfit(int[] prices) {
        
         n=prices.length;
  
        int x=0,y=0;
       for(int i=n-1;i>=0;i--){
           for(int j=0;j<2;j++){
               if(j==1){
                  y=Math.max(-prices[i]+x,y);
               }else{
                x=Math.max(prices[i]+y,x);

               }
           }
       }
        
        return y;
    }
