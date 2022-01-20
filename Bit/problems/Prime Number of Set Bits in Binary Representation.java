// 762. Prime Number of Set Bits in Binary Representation

class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
    while (L <= R)
        count += 665772 >> Integer.bitCount(L++) & 1;
    return count;
    }
}
