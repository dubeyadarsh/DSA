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
		mergii(arre);
		for(int p:arre) System.out.print(p+" ");
		
	}
	static void mergii(int arre[]){
	 int n=arre.length;
	 sort(arre,0,n-1);
	 
	}
	static void sort(int arre[],int l,int r){
	    if(l>=r) return;
	    
	    int mid=l+(r-l)/2;
	    
	    sort(arre,l,mid);
	    sort(arre,mid+1,r);
	    
	    merge(arre,l,mid,r);
	    
	    
	    
	}
	static void merge(int arre[],int l,int m,int r){
	   int n1=m-l+1;
	   int n2=r-m;
	   
	   int a1 []=new int[n1];
	   int a2 []=new int[n2];
	   
	   for(int i=0;i<n1;i++){
	       a1[i]=arre[l+i];
	   }
	   for(int i=0;i<n2;i++){
	       a2[i]=arre[m+i+1];
	   }
	   
	   int k=l;
	   
	   
	   int i=0,j=0;
	   while(i<n1 && j<n2){
	       if(a1[i]<a2[j]){
	           arre[k]=a1[i];
	           i++;
	       }else{
	           arre[k]=a2[j];
	           j++;
	       }
	       k++;
	   }
	   
	   while(i<n1){
	       arre[k]=a1[i];
	        k++;
	        i++;
	   }
	   while(j<n2){
	        arre[k]=a2[j];
	        k++;
	        j++;
	   }
	   
	}
}
