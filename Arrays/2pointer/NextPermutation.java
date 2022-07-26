class Solution {
    public void nextPermutation(int[] nums) {
        // pichhe se ditch find out karo and then us ditch ko swap karna padega, per kisse?
        // us ditch ko ,picche se smallest greatest banda jo hai , usko ditch k sath swap karenge!
//         and at the end , ditch k aage se n-1 tak k bando ko reverse kar denge !
        
        // How these intution came?
        // sorted permutation generate karo sequence ka .. aur un sequenco ko dekh k pattern find out karoge to samjhega ki upar ka algorithm kaise work kara
        
        int n=nums.length;
     
        int i=n-2;
       while(i>=0 && nums[i]>=nums[i+1])i--;
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    
     
    }
    void swap(int nums[],int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
    void reverse(int[] nums,int i,int j){
        while(i<j) swap(nums,i++,j--);
    }
}
