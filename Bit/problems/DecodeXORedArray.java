// 1720. Decode XORed Array
class Solution {
//     XOR ka ulta XOr hota hai
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int dec[]=new int[n+1];
        dec[0]=first;
        for(int i=0;i<n;i++){
            dec[i+1]=first^encoded[i];
            first=dec[i+1];
        }
        return dec;
    }
}
