// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
// This matrix has the following properties:

// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.




class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int i=row-1 ,j=0;
        while(i>=0 && j<col){
            if(matrix[i][j]<target)j++;
            else if(matrix[i][j]>target)i--;
            else return true;
        }
        return false;
    }
}
