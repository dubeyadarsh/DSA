// 1 baar bus agar * wala case handle kar liya to question solved!!!
// Memoization approach

class Solution {
  int dp[][];
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return recur(n-1,m-1,s,p);
    }
    boolean recur(int i,int j,String s1,String s2){
        if(i<0 && j<0) return true;
        if(i<0) {
            for(int k=0;k<=j;k++){
                if(s2.charAt(k)!='*') return false;
            }
            return true;
        }
        if(i<0 || j<0) return false;
        if(dp[i][j]!=-1) {
            System.out.println("Bhai mai call hua");
            return dp[i][j]==1?true:false;
        
        }
        if(s1.charAt(i)==s2.charAt(j) || s2.charAt(j)=='?'){
            boolean is= recur(i-1,j-1,s1,s2);
            dp[i][j]=is?1:0;
            return is;
        }
    
        
        if(s2.charAt(j)=='*'){
          boolean iss=recur(i-1,j,s1,s2) || recur(i,j-1,s1,s2);   
            dp[i][j]=iss?1:0;
            return iss;
        }
        
        dp[i][j]=0;
        return false;
        
    }
}
