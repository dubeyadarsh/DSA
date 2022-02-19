// Problem Statement :

// Given an array consisting of only 0s, 1s and 2s, sort the array.
  
//   /*
// 	array of size N from 0 to N-1 is considered        
// */
// function DNF(arr, N)

// 	//	Initializing low, mid and high pointers
// 	low = 0
// 	mid = 0
// 	high = N-1

// 	while mid <= high
// 		/* 
//         	Check if arr[mid] == 0, swap arr[low] and arr[mid], increment mid and 
//           	low pointers
// 		*/
// 		if arr[mid] == 0
// 			swap(arr[mid],arr[low])
// 			low += 1
// 			mid += 1
	
// 		//	Check if arr[mid] == 1, increment mid pointer
// 		else if arr[mid] == 1
// 			mid += 1

// 		/* 
//         	Check if arr[mid] == 2, swap arr[mid] and arr[high], decrement high pointer
//  		*/
// 		else if arr[mid] == 2
// 			swap(arr[mid],arr[high])
// 			high -= 1


public class Solution 
{
    public static void sort012(int[] arr)
    {
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        
    }
}
