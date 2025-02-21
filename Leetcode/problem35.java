package Leetcode;

public class problem35 {
    /// aproach use binary serach
    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
///// to solve leaner seach 
public int searchInserts(int[] nums, int target) {
    for(int i=0; i<nums.length; i++){
        if(nums[i]== target){
            return i;
        }else if(nums[i] > target){
            return i;
        }
    }
    return nums.length;
}
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5)); // Output: 2
        System.out.println(searchInsert(nums, 2)); // Output: 1
        System.out.println(searchInsert(nums, 7)); // Output: 4
        System.out.println(searchInsert(nums, 0)); // Output: 0
    }
}
