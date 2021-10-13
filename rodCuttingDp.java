
class Solution{
    int dp[];
    public int cutRod(int price[], int n) {

        int len[]=new int[n];
        dp=new int[n+1];
       
       for(int i=0;i<n;i++){
           len[i]=i+1;
           dp[i]=-1;
       }
       dp[0]=0;
       dp[n]=-1;
       // This is bottom up appraoch(tabulation)
      for(int i=1;i<=n;i++){
          int max=Integer.MIN_VALUE;
          for(int j=0;j<i;j++){
              max=Math.max(max,price[j]+dp[i-j-1]);
          }
          dp[i]=max;
      } 
      // Given below is memoization approach
   //    func(price,n,len);
   
       return dp[n];
    }
    int func(int []a ,int sum,int len[]){
        if(sum<=0) return 0;
        if(dp[sum]!=-1){
           return dp[sum];
        }
        int subans=0;
        
        for(int i=1;i<=len.length;i++){
            if(len[i-1]<=sum)
             subans=Math.max(subans,a[i-1]+func(a,sum-len[i-1],len));
        
        }
        return dp[sum]=subans;
    }
}
