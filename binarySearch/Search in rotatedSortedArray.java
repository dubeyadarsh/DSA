class Solution {
    public boolean search(int[] nums, int target) {
 
    int i=0,j=nums.length-1;
    while(i<=j){
        
        while(i<j && nums[i]==nums[i+1]) i++;
        while(i<j && nums[j]==nums[j-1]) j--;
        
        int mid=i+(j-i)/2;
        if(nums[mid]==target) return true;
      
//       agar left half sorted hai to check karo kya banda left me aayega 
      
        if(nums[i]<=nums[mid]){
            if(target>=nums[i] && target<=nums[mid]){
                j=mid-1;
            }else i=mid+1;
        }
      //       agar right half sorted hai to check karo kya banda right me aayega 
      else{
            if(target>=nums[mid] && target<=nums[j]){
                i=mid+1;
            }else j=mid-1;
        }
    }
        return false;
    }
}
