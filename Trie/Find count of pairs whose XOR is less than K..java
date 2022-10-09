

import java.util.*;
import java.lang.*;
import java.io.*;


class Code
{
  static class Trie{
        Trie ch[];
        int count;
        Trie(){
            count=0;
            ch=new Trie[2];
        }
    }
  
  static Trie root;
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int a[]={1,2,3,5};
		int k=5;
		root=new Trie();
		int ans=0;
		for(int p:a){
		    //jo already inserted value hai unke sath pair banane
		  //  ka try kara aur check kara ki kitne pair possible hai
		    ans+=count(root,p,k);
      
		    insert(root,p);
		}
		System.out.println(ans);
	}
	static int getib(int p,int i){
	    return (p&1<<i)==0?0:1;
	}
	static int count(Trie root,int p,int k){
	    int tans=0;
	    for(int i=30;i>=0 && root!=null;i--){
	        int x=getib(p,i); // getib gives bit of particular index.
	        int y=getib(k,i);
	        if(y==1){
	            //agar k ka wo bit pe 1 hai to mai find krunga ki kis inserted
	           // number me wo particular bit pe mere given number se same hai
	            //agar ye mil gaya to matlab humara k ka uss bit pe 1 hai and pair ka xor
	           // uss bit pe 0, to jo count hoga uss number ka wo answer hoga.
            
	            if(root.ch[x]!=null) tans+=root.ch[x].count;
	            root=root.ch[1-x];
	            }else root=root.ch[x];
	    }
	    return tans;
	}
  
	static void insert(Trie root,int p){
	    for(int i=30;i>=0;i--){
	        int x=getib(p,i);
	        if(root.ch[x]==null) root.ch[x]=new Trie();
	        root.ch[x].count++;
	        root=root.ch[x];
	    }
	}
	
}
