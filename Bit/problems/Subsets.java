// 78. Subsets
class Solution {
//     Solution using Bitmask
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int subset_count=(1<<n);
        List<List<Integer>> list=new ArrayList<>();
        for(int mask=0;mask<subset_count;mask++){
             ArrayList<Integer> al=new ArrayList<>();
              for(int i=0;i<n;i++){
                if((mask & (1<<i))!=0)
                    al.add(nums[i]);
                
            }
                   list.add(al);
        }
                   return list;
        
    }
}
