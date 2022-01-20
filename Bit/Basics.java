// Choose 1 number that contains all st bit in it?
//  Number is -1 

// How positive or Negative value stored in computer memory ?
// 	in java int has 4 byte capacity i.e, 32 bit
// 	 e.g, 4 bit number can store at max value is 2^4-1(15) . 15 is biggest number that can formed using 4 bit .
// 	so the right most range of integer should be (2^32-1)... But thrill is left most bit is considered for sign that's why rightmost range of integer is (2^31-1)
// 	if u inisitialize int as unsigned then max range will be 2^32-1 but by default int in java is signed
	
// 	positive value directly satored in computer but when it omes it to negative value it got convert into 2's compliment then it stored in memory

// Length of binary is :
len=(Math.log(N)/Math.log(2))+1;
// To print binary representation of number
          //aap kisi bhi number k binary ko agar 5 baar right shift karte ho aur phir 1 se &
			  //karte ho to wo 5th index pe konsa bit tha wo return karta hai 
for(int i=10;i>=0;i--){
System.out.print( (num>>i)&1);
}
// Code to make ith bit set::::
System.out.print(a|(1<<i));

// Code to make ith bit Unset::::
System.out.print(a&(~(1<<i));
                 
// To revert binary representyation of number we use tilda(~) operator
 System.out.println(~a);                
                 
// Toggle bit at particular index
//     Xor operator is used to toggle the bit at particular index
System.out.print(a^(1<<i));
                 
// Count set bit
for(int i=10;i>=0;i--){
count+=(num>>i)&1);
}
                 
// Convert lowercase character into uppercase , yes it is possible using bit operation because in every character
// has their own ASCII value and ASCII value can have binary representation.
// Difference in binary representation of 'a' to 'A"	
		'a': 1100001 || 'A': 1000001
		'b': 1100010 || 'B': 1000010
// 		 you can notice that binary code of 'A' is similar to 'a' just one small difference is at 5th index there is not set bit in binaru code of'A' while there is 
// 		 set bit in binary code of'a' at 5th index.. vice versa for 'b'.
// 		 So we can say that if we want to convert 'a' t0 'A' just make 5th index as 0 in binary code of 'a', How to do this?
// 		 As u already know how to make bit unset at particular index use that and you'll have your answer.
		 
		 char a='b';
                 System.out.println((char)(a&(~(1<<5))));
// 		 Output:'B'
		 
// 		Now,  if we want to convert 'A' to 'a' just make 5th index as 1 in binary code of 'A', How to do this?
// 		 As u already know how to make bit set at particular index use that and you'll have your answer.
		
		 char a='B';
     		 System.out.println((char)(a|((1<<5))));
// 		 Output:'b'
		 
// 		 For shortcut -->
// 		 'a' ='A' | ' ' ;    Or operation of uppercase char to blank space convert into lowercase
// 		 'A'='a'  & '_';   it will convert lowercase char into upper case
       
		 
// How to clear LSB? .. unset every element till ith index from right;
	ans=a&(~((1<<i+1)-1));	 
// How to clear MSB? .. unset every element till ith index from left;
	ans=a&((1<<i+1)-1);	  
		 
// XOR Property ----->
// 		 a^b^c=A^c^b=C^a^b
