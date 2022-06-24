// Using gap strategy we can solve
// https://youtu.be/WpYHNHofwjc

class Solution {
    public String longestPalindrome(String s) {
              int l=s.length();
        boolean dp[][]=new boolean[l][l];
        String c="";
     for(int g=0;g<l;g++){
         for(int i=0,j=g;j<l;j++,i++){
             if(g==0){
                 dp[i][j]=true;
                 c=s.substring(i,j+1);
             }
            else if(g==1){
                 if(s.charAt(i)==s.charAt(j)){
                     dp[i][j]=true;
                     c=s.substring(i,j+1);
                 }
            
         }
            else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                 dp[i][j]=true;
                 c=s.substring(i,j+1);
            }
     }
                    }   
        
      
        
       return c;   
    }
}
