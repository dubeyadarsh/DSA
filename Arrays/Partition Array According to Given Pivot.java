
// 2161. Partition Array According to Given Pivot
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int low=0,same=0,high;
        
        for(int b:nums){
            if(b<pivot) low++;
            else if(b==pivot) same++;
        }
//         Given below are indexes where element should be inserted like if element equal to pivot it will start filling the value from where low is ending that's why same is starting from low index
        high=same+low;
        same=low;
        low=0;
        int ans[]=new int[nums.length];
        for(int b:nums){
            if(b<pivot) ans[low++]=b;
            else if(b==pivot) ans[same++]=b;
            else ans[high++]=b;
        }
        return ans;
    }
}
