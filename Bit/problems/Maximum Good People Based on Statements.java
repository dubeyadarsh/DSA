// 2151. Maximum Good People Based on Statements


// **Disclaimer: If you don't know how to represent subset using bitwise then don't look into solution , you only be frustrated **
// I considered all the possible assumption and then tried to validate these assumption from statement table.
// E.g, [[2,1,2],[1,2,2],[2,0,2]]
// here n is 3
// then there will be 2^3 possibility
// 0 0 0
// 0 0 1
// 0 1 0
// 0 1 1
// 1 0 0
// 1 0 1
// 1 1 0
// 1 1 1

// Herer 1 1 1 means --> I'm assuming all these three guy are good now let's validate this from statement matrix

// 0th guy is good
// consider 0th row and check what 0 is saying about all other person, if the statement of 0 is not equal to our assumption we will reject our assumption and if our assumption is right we will calculate number of good guy we considered in our assumption and that will be answer.
// Similarly , we can dry run it for 1st and 2nd
// 1st guy is good
// 2nd guy is good


class Solution {
    public int maximumGood(int[][] stat) {
        int n=stat.length;
        int Nofbit=1<<n;
        int ans=0;
        boolean is=false;
        for(int i=0;i<Nofbit;i++){
            is=true;
           int count=0;
            for(int j=0;j<n;j++){
                if(((i>>j) &1)==1){
                    for(int k=0;k<n;k++){
                       if(stat[j][k]!=2 &&  stat[j][k]!=((i>>k)&1)){
                           is=false;
                           break;
                       } 
                    }
                   count++;
                }
            }
               if(is){
                         ans=Math.max(ans,count);
                     }    
        }
        return ans;
    }
}


adarsh2dubey's avatar
adarsh2dubey
-4
Last Edit: a few seconds ago

**Disclaimer: If you don't know how to represent subset using bitwise then don't look into solution , you only be frustrated **
I considered all the possible assumption and then tried to validate these assumption from statement table.
E.g, [[2,1,2],[1,2,2],[2,0,2]]
here n is 3
then there will be 2^3 possibility
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1

Herer 1 1 1 means --> I'm assuming all these three guy are good now let's validate this from statement matrix

0th guy is good
consider 0th row and check what 0 is saying about all other person, if the statement of 0 is not equal to our assumption we will reject our assumption and if our assumption is right we will calculate number of good guy we considered in our assumption and that will be answer.
Similarly , we can dry run it for 1st and 2nd
1st guy is good
2nd guy is good

class Solution {
    public int maximumGood(int[][] stat) {
        int n=stat.length;
        int Nofbit=1<<n;
        int ans=0;
        boolean is=false;
        for(int i=0;i<Nofbit;i++){
            is=true;
           int count=0;
            for(int j=0;j<n;j++){
                if(((i>>j) &1)==1){
                    for(int k=0;k<n;k++){
                       if(stat[j][k]!=2 &&  stat[j][k]!=((i>>k)&1)){
                           is=false;
                           break;
                       } 
                    }
                   count++;
                }
            }
               if(is){
                         ans=Math.max(ans,count);
                     }    
        }
        return ans;
    }
}
// Time Complexity :O(2^N * N^2 );
