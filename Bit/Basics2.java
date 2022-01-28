https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary%3A-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently



When we have to find bitwise &  in some range like, find bitwise & in [5,7] then instead of finding & of every member we have another approach
i.e, --> find the common prefixe from 5 and 7
   0 1 0 1
   0 1 1 1
  From left 2 index are common in both and that will too common in every element whoever comes between 5 and 7 so after anding these prefix will not change and 
  it will be considered in answer
  and check how many bit are consecutively not common from right like in above case at index 0 and 1 are not common so for in answer at index 0 and 1 we put 0,0 there
  answer would be --> 0100 i.e, 4
    
    class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // Brute Force Approach
        // int ans=left;
        // while(left<=right){
        //     ans&=left&right;
        //     if(ans==0) return 0;
        //     left++;
        //     right--;
        // }
        // return ans;
       
//         Optimised Approach
        int ans=1;
        while(left!=right){
            
            left>>=1;
            right>>=1;
            ans<<=1;
        }
        return (left*ans);
    }      
}
    
