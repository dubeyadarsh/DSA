// https://leetcode.com/contest/weekly-contest-328/problems/count-the-number-of-good-subarrays/
// We can apply the method of sliding window.
// Use a hashmap count to count the frequency of each A[i].

// When add a new number A[j] at the right of the window,
// we already have count[A[j]] elements with value A[j] in the window,
// so we will have count[A[j]] more pairs.

// If we have pairs more than k,
// we can reduce the size of window,
// until there are pairs < k in the sliding window.
// Then A[i]...A[j] is not a good subarray,
// for other index i2 < i,
// A[i2]...A[j] is a good subarray.
// so we can update res += i for i2 = 0,1,2,...i-1.

// Finally we return the result res.

class Solution {
    public long countGood(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        long ans=0,curr=0;
        for(;j<n;j++){
            if(map.containsKey(nums[j])){
                int p=map.get(nums[j]);
                map.put(nums[j],p+1);
                curr+=p;
            }else map.put(nums[j],1);
            
            if(curr>=k){
                while(i<j){
                     int p=map.get(nums[i]);
                     map.put(nums[i],p-1);
                     curr-=p-1;
                    i++;
                    if(curr<k) break;
                }
            }
            ans+=i;
        }
        return ans;
    }
}
