// https://www.codechef.com/JAN221B/problems/PINBS

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    String s=sc.next();
		    int n=s.length();
		    boolean ans=false;
		    for(int i=0;i<n-1;i++){
		        
		            if(s.substring(i,i+2).equals("10") ||s.substring(i,i+2).equals("11")){
		                ans=true;
		                break;
		            }
		
		    }
		    if(ans) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
