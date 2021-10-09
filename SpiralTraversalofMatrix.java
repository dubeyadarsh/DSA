
class Solution
{
//   This is box traversal 
//  left wall indicates minimum col
//   right wall indicate max col
//   top wall indicate min row
//   bottom wall indicate max row
	public int findK(int a[][], int n, int m, int k)
	{
	  int minr=0;
	  int minc=0;
	  int maxr=n-1;
	  int maxc=m-1;
	  int tot=m*n;
	  int count=0;
	  while(count<tot){
	      //top wall
	      for(int j=minc, i=minr;j<=maxc && count<tot;j++){
	       //   System.out.println(a[i][j]);
	           count++;
	          if(count==k) return a[j][i];
	      }
	      minr++;
	      //right wall
	      for(int i=minr,j=maxc;i<=maxr && count<tot;i++){
	       //   System.out.println(a[i][j]);
	          count++;
	          if(count==k) return a[i][j];
	      }
	      maxc--;
	      //bottom wall
	      	for(int i=maxr,j=maxc;j>=minc && count<tot;j--){
	       //   System.out.println(a[i][j]);
	          count++;
	          if(count==k) return a[i][j];
	      }
	      maxr--;
	      //left wall
	      for(int i=maxr,j=minc;i>=minr && count<tot;i--){
	       //   System.out.println(a[i][j]);
	          count++;
	          if(count==k) return a[i][j];
	      }
	      minc++;
	  }
	  return -1;
	}
	
}
