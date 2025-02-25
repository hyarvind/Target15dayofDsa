package ARRAY;
import java.util.Arrays;
public class Mergetwoarr {
        
        public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
           int [] mergearr = new int[arr1.length +arr2.length];
            int i=0, j=0, k=0;

            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    mergearr[k++] =arr1[i++];
                }else {
                    mergearr[k++] =arr2[j++];
                }
            }
            while (i <arr1.length) {
                mergearr[k++] = arr1[i++];
                
            }
            while (j <arr2.length) {
                mergearr[k++] =arr2[j++];
                
            }
            return mergearr;
        }
        
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 = {2, 4, 6, 8};
            int[] mergedArray = mergeSortedArrays(arr1, arr2);
            System.out.println("Merged Array: " + Arrays.toString(mergedArray));
            System.out.println( Arrays.toString(mergeSortedArrays(arr1, arr2)));
        }
    }
    
