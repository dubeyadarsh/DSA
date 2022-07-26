/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int heap[]=new int[25];
    static int size=0;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[]={-1,12,23,2,4,24,8};
		for(int i=3;i>=1;i--){
		  //  insert(arr[i]);
		  heapify(arr,7,i);
	       // System.out.println(heap[i]);
		}
	
		
		
// 		deletion();
// 		deletion();
		for(int i=1;i<=6;i++){
		  //  insert(arr[i]);
	        System.out.println(arr[i]);
		}
	}
	
	static void heapify(int arr[],int n,int index){
	  
	   //  leaf 4,5,6
	    int left=2*index;
	        int right=2*index+1;
	        int larger=index;
	        if(left<n && arr[index]<arr[left]){
            larger=left;	            
	        }
	       else if(right<n && arr[index]<arr[right]){
            larger=right;	            
	        }
	        if(larger!=index){
	             int swap=arr[index];
	            arr[index]=arr[larger];
	           arr[larger]=swap;
	           index=larger;
	           heapify(arr,n,index);
	        }
	   
	}
	static void insert(int b){
	    size=size+1;
	    heap[size]=b;
	    int s=size;
	    while(s>1){
	        int parent=s/2;
	        if(heap[parent]<heap[s]){
	           int swap=heap[s];
	            heap[s]=heap[parent];
	        heap[parent]=swap;
	        s=parent;
	        }else return;
	        
	        
	    }
	}
	static void deletion(){
	    int ans=heap[1];
	    heap[1]=heap[size];
	    size--;
	    int index=1;
	    while(index<size){
	        int left=2*index;
	        int right=2*index+1;
	        int larger=index;
	        if(left<size && heap[index]<heap[left]){
            larger=left;	            
	        }
	       else if(right<size && heap[index]<heap[right]){
            larger=right;	            
	        }
	        if(larger!=index){
	             int swap=heap[index];
	            heap[index]=heap[larger];
	           heap[larger]=swap;
	           index=larger;
	        }else return;
	    }
	    
	}
}
