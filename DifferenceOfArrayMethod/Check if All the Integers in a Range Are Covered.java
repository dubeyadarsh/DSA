// 1893. Check if All the Integers in a Range Are Covered
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
    int n=52;
        int a[]=new int[n];
        int pre[]=new int[n];
        for(int b[]:ranges){
            a[b[0]]+=1;
            a[b[1]+1]-=1;
        }
        pre[0]=a[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+a[i];
            // System.out.println(i+" "+pre[i]);
        }
        
        for(int i=left;i<=right;i++){
            if(pre[i]<1) return false;
        }
        return true;
    }
}

// below are brute force approach 
// class Solution {
//     public boolean isCovered(int[][] ranges, int left, int right) {
//       for(int i=left;i<=right;i++){
//           boolean is=false;
//           for(int l[]:ranges){
//               if(l[0]<=i && l[1]>=i) {
//                   is=true;
//                   break;
//               }
//           }
//           if(!is) return false;
//       }
//         return true;
//     }
// }
