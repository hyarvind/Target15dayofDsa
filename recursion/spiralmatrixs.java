import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralmatrixs {

    static int totalways(int m,int n){
        if (m==1 || n==1) {
            return 1;
            
        }
        return totalways(m-1, n) +totalways(m, n-1);

    }
     public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols-1, top = 0, bottom = rows-1;
        
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int m=sc.nextInt(),n=sc.nextInt();
       int result =totalways(m, n);
       System.out.println(result);

        

    }
}