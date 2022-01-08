// 1342. Number of Steps to Reduce a Number to Zero
class Solution {
    // Answer will be = (length of binary + number of set bit)-1;
//     I implemented brute force approach but using above formula we can further optimise it
    public int numberOfSteps(int nums) {
        int c=0;
        while(nums!=0){
            if((nums&1)==0){
                nums=nums>>1;
            }
            else{
                nums--;
            }
            c++;
        }
        return c;
    }
}
