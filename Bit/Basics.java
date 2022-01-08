// To print binary representation of number
          //aap kisi bhi number k binary ko agar 5 baar right shift karte ho aur phir 1 se &
			  //karte ho to wo particular index pe konsa bit tha wo return karta hai 
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
                 
// check n                 
                 
