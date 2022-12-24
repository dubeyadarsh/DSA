https://leetcode.com/problems/smallest-value-after-replacing-with-sum-of-prime-factors/description/
This was leetcode question.
  

class Solution {
    public int smallestValue(int n) {
        if(n==1) return n;
        
        while(!isPrime(n)){
            int sum=0;
             int p=n;
          //*************************
          // Calculating factors and adding all the factors
            while(p%2==0){
                sum+=2;
                p=p/2;
            }
            for(int i=3;i*i<=n;i+=2){
                while(p%i==0){
                    sum+=i;
                    p=p/i;
                }
            } 
            if(p!=1) sum+=p;
          
           // Till here we have code of calculating factors 
            // T.C. is O(Sqrt(N));
          // ********************************
            if(sum==n) return n;
            n=sum;
        }
        
        return n;
    }
    boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
}
