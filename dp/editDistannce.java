// Memoization
// T.C. for recursive might be O(3^Math.min(m,n))
class Solution {
    int n,m;
    int dp[][];
    public int minDistance(String word1, String word2) {
        int n=word1.length();
         int m=word2.length();
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(n-1,m-1,word1,word2);
        // return tab(word1,word2);
    }
    
// ***********    E raha memoization ************************
    
    int helper(int i,int j,String s1,String s2){
        if(i<0 && j<0) return 0;
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1){
            return dp[i][j]; 
        } 
        if(s1.charAt(i)==s2.charAt(j)) {
            return dp[i][j]=helper(i-1,j-1,s1,s2);
        }
		//This below line is whole crux of this problem .. once you understand this you can code it easily !
        return dp[i][j]=1+Math.min(helper(i-1,j-1,s1,s2),Math.min(helper(i-1,j,s1,s2),helper(i,j-1,s1,s2)));
    }
    
  
  
  
  
  
// Tabulation

class Solution {
    public int minDistance(String word1, String word2) {
        return tab(word1,word2);
    }
    
//   ******************  E raha tabulation ****************
    int tab(String s1,String s2){
        int n1=s1.length();
        int m1=s2.length();
        
        int dp1[][]=new int[n1+1][m1+1];
        
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=m1;j++){
                if(i==0){
                    dp1[i][j]=j;
                }
                else if(j==0) dp1[i][j]=i;
                else{
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp1[i][j]=dp1[i-1][j-1];
                    }
                    else dp1[i][j]=1+Math.min(dp1[i-1][j-1],Math.min(dp1[i-1][j],dp1[i][j-1]));
                }
            }
        }
        return dp1[n1][m1];
    }
}
  
  
  
  
// Space Optimization

class Solution {
   
    public int minDistance(String word1, String word2) {
       
        return tab(word1,word2);
    }
    

 
    int tab(String s1,String s2){
        int n1=s1.length();
        int m1=s2.length();
        
        int dp1[]=new int[m1+1];
        
        for(int i=0;i<=n1;i++){
            int curr[]=new int[m1+1];
            for(int j=0;j<=m1;j++){
                if(i==0){
                    curr[j]=j;
                }
                else if(j==0) curr[j]=i;
                else{
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        curr[j]=dp1[j-1];
                    }
                    else curr[j]=1+Math.min(dp1[j-1],Math.min(dp1[j],curr[j-1]));
                }
            }
            dp1=curr;
        }
        return dp1[m1];
    }
}
  
  
