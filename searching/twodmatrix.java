package searching;

public class twodmatrix {


    public static  boolean searchMatrix(int [][] matrix,int target){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]== target){
                    return true;
                }
            }
           
        }
        return false;
    }
    //// second methos big(o)
    public boolean searchMatrixs(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        
        while(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else if(matrix[i][j] < target) i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix [][]={{1,2,3,4},{5,6,7},{8,9,10},{11,12,13,14}};
        int target =9;
        System.out.println(searchMatrix(matrix,target));
    }
    
}
