// har baar i+1 to n tak minimum banda dhundo aur usko i pe laake rakh do that's what selection is !

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
	 
	 for(int i=0;i<n;i++){
	    int min=i;
	    
	    for(int j=i+1;j<n;j++){
	        if(arre[j]<arre[min]) min=j;
	    }
	    int swap=arre[min];
	    arre[min]=arre[i];
	    arre[i]=swap;
	 }
	}
}
