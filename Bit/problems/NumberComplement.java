// 476. Number Complement

class Solution {
    public int findComplement(int num) {
       int cb=(int) Math.floor((Math.log(num)/Math.log(2)))+1;
       int m=(1<<cb)-1;
       return  m^num;
    }
}

// **Dry run**: Say we have 5. It's binary would be 101.
// First line of above code, counts total bits that is 3. Second, will turn its' all bits to set.
// Thus, ones will hold 111 now.
// Now. our XOR operator will swap all the bits of n. S0, 101 will become 010 (2).
