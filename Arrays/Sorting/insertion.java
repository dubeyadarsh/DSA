// i=1 se n tak for loop chalao aur andar while loop lagake check karo ki ith wala banda kitna pichhe jana chahiye
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		int arre[]= {12, 11, 13, 5, 6,34,43,12,15,43,3,5,6,7,8,12,34,87};
		insertion(arre);
		for(int p:arre) System.out.print(p+" ");
		
	}
	static void insertion(int arre[]){
	 int n=arre.length;
	 
	 for(int i=1;i<n;i++){
	     int j=i-1;
	    
	     while(j>=0 && arre[j]>arre[j+1]){
	         int swap=arre[j];
	         arre[j]=arre[j+1];
	         arre[j+1]=swap;
	         j--;
	     }
	 }
	}
}
