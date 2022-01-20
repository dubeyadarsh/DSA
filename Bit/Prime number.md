 For those still wondering: 0b10100010100010101100 is the bit wise representation of 665772.
Here 2nd,3rd,5th,7th,11th,13th,17th,19th,23rd and 29th bits are 1 and rest are 0s.
What do all these positions have in common? they are prime numbers!
Example:
-Let say a number has 5 bits set, (calculated by using __builtin_popcount(L)).
-To check if 5 is prime shift 0b10100010100010101100 by 5
-This gives you 0b00000101000101000101,
-When you & it with 0b1 you get 1, hence 5 is prime number!

Given below whol discussion is lit !!
https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/discuss/113232/665772


List =[2,3,5,7,11,13,17,19]
create a mask in which at index(element in list) will be set bit .. Using this property 665772 has been formed

int mask=0;

for(element in list){

mask|=1<<(list[i])

After above operation value of mask become 665772

