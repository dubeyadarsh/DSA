//338. Counting Bits

//  Brute Force Approach*************

// class Solution {
//     public int[] countBits(int n) {
//         int ans[]=new int[n+1];
//         for(int i=0;i<=n;i++){
//             ans[i]=countset(i);
//         }
//         return ans;
//     }
//     int countset(int i){
//         int count=0;
//         while(i!=0){
//             if((i&1)!=0) count++;
//             i=i>>1;
//         }
//         return count;
//     }
// }



// ********************optimised approach using dp*******************************

// Explaination.
// Take number X for example, 10011001.
// Divide it in 2 parts:
// <1>the last digit ( 1 or 0, which is " i&1 ", equivalent to " i%2 " )
// <2>the other digits ( the number of 1, which is " f[i >> 1] ", equivalent to " f[i/2] " )
class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        
        for(int i=0;i<=n;i++){
            ans[i]=ans[i>>1] + (i&1);
        }
        return ans;
    }
}
