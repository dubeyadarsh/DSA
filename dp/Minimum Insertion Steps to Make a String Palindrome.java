//  Dekh pehle given String ka longest pallindromic subsequence nikal le ... aur phir string k length se minus kar de woi answer hoga
// Aisa isiliye becoz to make any string pallindrome  maximum answer would be  length of string and if there is some sequence is already pallindromic 
//  then for those we need not to make any insertion. that's why hum log minus kar dete hai string k length mese lps ko.

class Solution {
    public int minInsertions(String s) {
     StringBuilder  sb=new StringBuilder(s);
        String sr=sb.reverse().toString();
        int lps=lps(s,sr);
        return s.length()-lps;
    }
    private int lps(String s1,String s2){
        int n=s1.length();
        int dp[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
}
