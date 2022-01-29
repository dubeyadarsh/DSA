// Just we have to use a fact XOR XOR ko kaatta hai !
// Idea is prefix XOR
// if we have xor value from 0th index to 5th index and we have to find out xor value from 2nd index to 5th index what shourld i do?
// Can't we do xorvalue[5]^xorvalue[1] //Here 1 because we have to find xor from 2 to 5 and we have xor from 0 to 5th index then 
// we have to neutralize the xor vale of 0th and 1st index and .at 1st index we have xor value of 0th and 1st index.


class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int m=queries.length;
        int pre[]=new int[n];
        int ans[]=new int[m];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
        pre[i]=pre[i-1]^arr[i];    
        }
        
        for(int i=0;i<m;i++){
           int x= queries[i][0];
            int y=queries[i][1];
            if(x==y) ans[i]=arr[x];
             else{
                 ans[i]=x-1>=0?pre[y]^pre[x-1]:pre[y];
             }

        }
        return ans;
    }
}
