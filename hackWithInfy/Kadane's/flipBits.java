// Q.--->  https://www.codingninjas.com/codestudio/guided-paths/hack-with-infy-preparation-path/content/125342/offering/1468966?leftPanelTab=1

public class Solution {
	public static int flipBits(int[] arr,int n) {
        int count=0;
        int difOf1and0=0;
        for(int i=0;i<n;i++){
            count+=arr[i]==0?1:-1;
            difOf1and0=Math.max(count,difOf1and0);
            if(count<0) count=0;
            
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1) difOf1and0++;
        }
        return difOf1and0;
	}
}
