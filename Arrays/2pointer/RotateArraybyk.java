// pehleo se n-k-1 tak ko reverse karo phir n-k se n-1 tak reverse karo phir pura array reverse karo using 2 pointer.

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;      
    
        if(k==0 ) {
            return;
            
        }
        if(k<0)k=k+n;
        int l=0;
        int r=n-k-1;
        while(l<r){
            nums[l]=nums[l]+nums[r];
            nums[r]=nums[l]-nums[r];
            nums[l]=nums[l]-nums[r];
            l++;
            r--;
        }
            
       l=n-k;
        r=n-1;
          while(l<r){
            nums[l]=nums[l]+nums[r];
            nums[r]=nums[l]-nums[r];
            nums[l]=nums[l]-nums[r];
              l++;
              r--;
        }
        l=0;
        r=n-1;
           while(l<r){
            nums[l]=nums[l]+nums[r];
            nums[r]=nums[l]-nums[r];
            nums[l]=nums[l]-nums[r];
               l++;
               r--;
        }
        
        
    }
}
