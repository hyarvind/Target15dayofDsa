/*
 * Find First and Last Position of Element in Sorted Array.
 * 
 */

 import java.util.Arrays;

 public class leetcode34 {
    //  public int[] searchRange(int[] nums, int target) {
    //      int[] result = {-1, -1};
    //      int left = binarySearch(nums, target, true);
    //      int right = binarySearch(nums, target, false);
    //      result[0] = left;
    //      result[1] = right;
    //      return result;        
    //  }
 
    //  private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
    //      int left = 0;
    //      int right = nums.length - 1;
    //      int idx = -1;
 
    //      while (left <= right) {
    //          int mid = left + (right - left) / 2;
             
    //          if (nums[mid] > target) {
    //              right = mid - 1;
    //          } else if (nums[mid] < target) {
    //              left = mid + 1;
    //          } else {
    //              idx = mid;
    //              if (isSearchingLeft) {
    //                  right = mid - 1;
    //              } else {
    //                  left = mid + 1;
    //              }
    //          }
    //      }
 
    //      return idx;
    //  }
 
     //// using two pointer 
     public static void twopointer(int nums[] ,int target){
        int left =0;
        int right=nums.length;
        int ans [] ={-1,-1};
        while (left <right) {
            if (target ==nums[left] && target ==nums [right]) {
                ans[0]=left;
                ans[1]=right;
                break;
            }
            else if (target > nums[left]) {
                left++;
            }else{
                 right--;
            }
            
        }
       
     }
     public static void main(String[] args) {
         int nums[] = {5, 7, 7, 8, 8, 10};
         int target = 8;
         leetcode34 lt = new leetcode34();
         int[] result = lt.twopointer(nums, target);
         System.out.println(Arrays.toString(result));
     }
 }
  