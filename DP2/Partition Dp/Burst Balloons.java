// Watch Striver videoto understand this 
//  Basically for 3,1,5,8 ko pehle 1,3,5,8,1 ban diya 
//  phir humne i ko 1 and j=4 pe rakh diya aur ab i and j k dauraan sabpe partition karunga aur optimise answer return karunga 
// One slight change in this question is 
// num[k]*num[i-1]*num[j+1]
// yahan pe maine i-1 and j+1 liya hai instead of k-1 and k+1 
//   this is because humlog isko ulta execute karrhe hai 
//  matlab jab first time k =1 to 4 chalega to uska matlab ye hoga ki k index pe jo banda bacha hai wo last banda hai isiliye i-1 matlab hum 1 return kare
//  aur j+1 pe bhi 1 return kar rhe .
// agar hum k-1 and k+! use karenege to solution accept nahi hoga 

// ******** abhi  bhi nahi smjha to striver k video me 17:30 k aage dekh lo 
// https://youtu.be/Yz4LlDSlkns


class Solution {
    int dp[][];
    public int maxCoins(int[] nums) {
        int num[]=new int[nums.length+2];
        dp=new int[num.length][num.length];
        num[0]=1;
        num[num.length-1]=1;
        int n=nums.length;
        // for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        for(int i=1;i<num.length-1;i++){
            num[i]=nums[i-1];
        }
//        Tabulation
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                int max=Integer.MIN_VALUE;
            for(int k=i;k<=j;k++){
            
            int cost=num[k]*num[i-1]*num[j+1] + dp[i][k-1]+ dp[k+1][j];
            max=Math.max(cost,max);
        }
         dp[i][j]=max;
            }
        }
        return dp[1][n];
        // return helper(1,num.length-2,num);
    }
  
//   ******************Memoization *****************
  
//     int helper(int i,int j,int nums[]){
//         if(i>j) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];
//         int max=Integer.MIN_VALUE;
//         for(int k=i;k<=j;k++){
            
//             int cost=nums[k]*nums[i-1]*nums[j+1] + helper(i,k-1,nums)+ helper(k+1,j,nums);
//             max=Math.max(cost,max);
//         }
//         return dp[i][j]=max;
//     }
}
