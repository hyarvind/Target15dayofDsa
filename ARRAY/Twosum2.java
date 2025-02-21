/*
 * 167. Two Sum II - Input Array Is Sorted.
 */
import java.util.Arrays;
public class Twosum2{
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        while (left <right) {
            if (numbers[left]+numbers[right]== target) {
                return new int[]{left+1,right+1};
            }
            else if (numbers[left]+numbers[right] > target) {
                right--;
                
            }else{
                left++;
            }
        }
        return new int[]{left+1 ,right+1};

    }
    public static void main(String[] args) {
        int numbers [] ={1,2,3,4,5,6};
        int target=10;
        Twosum2 t =new Twosum2();
        int[] result = t.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}