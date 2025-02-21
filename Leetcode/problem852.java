package Leetcode;

public class problem852 {
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i; 
            }
        }
        return -1; 
    }
    // binary search 
        public static int peakIndexInMountainArrays(int[] arr) {
            int left = 0, right = arr.length - 1;
    
            while (left < right) {
                int mid = left + (right - left) / 2;
    
                if (arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
    
            return left;
        }
    
        public static void main(String[] args) {
            int[] arr = {0, 2, 3, 4, 3, 2, 1};
            System.out.println(peakIndexInMountainArrays(arr));
        }
    }
    

