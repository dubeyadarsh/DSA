// 693. Binary Number with Alternating Bits
class Solution {
    public boolean hasAlternatingBits(int n) {
        // If any number contains alternate bit and if we do right shift by 1 --> then 1 bit get convert into 0 bit and vice versa.
//         e.g, n:  1 0 1 0 1 0 1 0
           // n>>1: 0 1 0 1 0 1 0 1
    // Now Do xor operator all bit will become set bit
        // So Now our task is for any number do xor operator with n>>1 and if that contains all set bit that denotes it contains alternating bit
        
        n=n^(n>>1);
        return (n&(n+1))==0?true:false;
    }
}
