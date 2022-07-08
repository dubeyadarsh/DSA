// Jaise sumit sir bolte hai ki dp array ka definition defined karo sabse pehle 0th index k liye phir 1st index k liye 
// phir 2nd index k liye and so on ....
// So maine kisi bhi index pe khade hoke uske pichhe jitne bhi index hai sab pe jaata hu aur jaake dekhta hu agar wo index wale bande divsible
// karte hai merko to mai apne dp[i]=Math.max(dp[i],1+dp[j]) ye kar dunga.

//  is wale question me mai dp array ith index pe length of largest divisible subset ith index tak ko store kar raha hu.
//  1 bar length mil jaayega to back array use karke mai elements bhi find kar lunga

// ********Similar to longest increasing subseq.
class Solution {
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
       int dp[]=new int[n];
        int back[]=new int[n];
        Arrays.fill(dp,1);
        
        int fl=0;
        for(int i=0;i<n;i++){
            back[i]=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    back[i]=j;
                }
            }
            if(dp[i]>dp[fl]) fl=i;
        }
        List<Integer> ans=new ArrayList<>();
        while(back[fl]!=fl){
            ans.add(nums[fl]);
            fl=back[fl];
        }
           ans.add(nums[fl]);
        // for(int i=0;i<n;i++) System.out.print(back[i]+" ");
        return ans;
    }
  
  
// You can see recursive code here as well --> 
  
//     void helper(int i,List<Integer> tans,int prev,int []nums){
//         if(i==nums.length){
//           if(tans.size()>ans.size()) ans=new ArrayList(tans);
//         return;
//         } 
        
//         if(prev==-1 || nums[i]%nums[prev]==0){
//             tans.add(nums[i]);
//             helper(i+1,tans,i,nums);
//             tans.remove(tans.size()-1);
//         }
//         helper(i+1,tans,prev,nums);
//         return;
//     }
}
