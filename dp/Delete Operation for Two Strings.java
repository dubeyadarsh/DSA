// Whenever such type of question comes , first thing i should think is in string which i character i shouldn't touch ?
//  jo dono string me common hai unko touch mat karo 

// so final answer ho jaayega {word1.length()-cmn+word2.length()-(common seq);}


class Solution {

   
    public int lcs(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
    
        int prev[]=new int[m];
        for(int i=0;i<n;i++){
            int curr[]=new int[m];
            for(int j=0;j<m;j++){
                if(i==0){
                    if(text1.charAt(i)==text2.charAt(j)) curr[j]=1;
                    else if(j>0) curr[j]=curr[j-1];
                }else if(j==0){
                    if(text1.charAt(i)==text2.charAt(j)) curr[j]=1;
                    else curr[j]=prev[j];
                }else{
                    if(text1.charAt(i)==text2.charAt(j)){
                        curr[j]=prev[j-1]+1;
                    }else {
                        curr[j]=Math.max(curr[j-1],prev[j]);
                    }
                }
            }
            prev=curr;
        }
        return prev[m-1];
        
    }
    public int minDistance(String word1, String word2) {
        int cmn=lcs(word1,word2);
        return word1.length()-cmn+word2.length()-cmn;
    }
}
