// Totally similar to lcs just one change at line number 14 because humko longest common subseq to lena hai per aisa lena hai jinka ascci sum sabse jyada ho isiliye dp me ascii sum bhi bhar rahe 


class Solution {
    public int minimumDeleteSum(String text1,String text2) {
      int n = text1.length();
        int m = text2.length();
        
        int[][] dp = new int[n + 1][m + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i -1) == text2.charAt(j - 1)) {
//                     Code is totally similar to lcs just 1 change here
                    dp[i][j] = (int)text1.charAt(i-1) + dp[i - 1][j - 1];
                } else {
                     dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
      
                
 
       
        return getsum(text1)+getsum(text2)-(2*dp[n][m]);
}
    int getsum(String s){
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(int)s.charAt(i);
        }
        return sum;
    }
}
