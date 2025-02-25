package Leetcode;

import java.util.*;
////// to merge 2d array 
public class problemno2570 {
        public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
            int i = 0, j = 0;
            List<int[]> result = new ArrayList<>();
            
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i][0] < nums2[j][0]) {
                    result.add(nums1[i]);
                    i++;
                } else if (nums1[i][0] > nums2[j][0]) {
                    result.add(nums2[j]);
                    j++;
                } else {
                    result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                    i++;
                    j++;
                }
            }
            
            while (i < nums1.length) {
                result.add(nums1[i]);
                i++;
            }
            
            while (j < nums2.length) {
                result.add(nums2[j]);
                j++;
            }
            
            return result.toArray(new int[result.size()][]);
        }
    
        public static void main(String[] args) {
            int nums1[][] = {{1, 2}, {2, 3}, {4, 5}};
            int nums2[][] = {{1, 4}, {3, 2}, {4, 1}};
            int result[][] = mergeArrays(nums1, nums2);
            
            for (int[] row : result) {
                System.out.println("[" + row[0] + ", " + row[1] + "]");
            }
        }
    }
    

