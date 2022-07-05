// I have implemented this problem in 3 way
//  Last one is most optimised


// ********Memoization***********
class Solution {
    int dp[][];
    public int maxProfit(int[] prices, int fee) {
        dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,1,prices,fee);
    }
    int helper(int i,int buy,int []prices,int fees){
        if(i==prices.length) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        if(buy==1){
            int a1=-prices[i]+helper(i+1,0,prices,fees);
            int a2=helper(i+1,buy,prices,fees);
            return dp[i][buy]= Math.max(a1,a2);
        }
        int a1=prices[i]-fees+helper(i+1,1,prices,fees);
        int a2=helper(i+1,0,prices,fees);
        return dp[i][buy]= Math.max(a1,a2);
    }
}
//   T.C. => O(N*2) , S.C. => O(N*2) and Aux space is O(N)


// **************Tabulation******************

class Solution {
    int dp[][];
    public int maxProfit(int[] prices, int fee) {
        dp=new int[prices.length+1][2];
        int n=prices.length;
        for(int i=n-1;i>=0;i--){
           
             dp[i][1]= Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
        
            dp[i][0]= Math.max(prices[i]-fee+dp[i+1][1],dp[i+1][0]);
              
        }
        return dp[0][1];
       
    }
  
//  T.C. => S.C.=> O(N*2)
  
//  After removing unwanted code 
//   Most optimised version is here.... Thanks to striver again !!
  
  class Solution {
  
    public int maxProfit(int[] prices, int fee) {
       
        int n=prices.length;
        int a1=0,a2=0;
        for(int i=n-1;i>=0;i--){
           
             a1= Math.max(-prices[i]+a2,a1);
        
            a2= Math.max(prices[i]-fee+a1,a2);
              
        }
        return a1;
        
    }
  }
  
//  T.C.=> O(N) , S.C.=> O(1)
