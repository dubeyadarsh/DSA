class Solution {
//     Memoization
    int n,m;
    int dp[][];
    public int numDistinct(String s, String t) {
        n=s.length();
     m=t.length();
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,s,t);
    }
    int helper(int i,int j,String s,String t){
       if(j==m) return 1;
        if(i>=n) return 0;
       
        if(dp[i][j]!=-1) {
            // System.out.println("Bhai kuchh optimise hora kya ?");
            return dp[i][j];
        } 
        if(s.charAt(i)==t.charAt(j)) {
            return dp[i][j]=helper(i+1,j,s,t)+ helper(i+1,j+1,s,t);
        }
        return dp[i][j]=helper(i+1,j,s,t);
    }
}


// **Tabulation******
class Solution {

    public  int numDistinct(String s, String t) {
        int dp[][] = new int[s.length()+1][t.length()+1];

        for (int i = 0; i < s.length(); i++)
            dp[i][0] = 1;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i-1) == t.charAt(j-1))// index = length - 1
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[s.length()][t.length()];
    }
}
