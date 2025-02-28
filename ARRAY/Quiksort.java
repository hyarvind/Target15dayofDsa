/*
 *steps .......
  1. Choose the  index value has pivot
  2. Take two variables to point left and right of the list 
     excluding pivot
  3. Left points to the low index
  4. Right points to the high
  5. While value at left is less than pivot move right
  6. While value at right is greater than pivot move left
  7. If both step 5 and step 6 does not match swap left and right
  8. If left ≥ right, the point where they met is new pivot
 */


public class Quiksort {
    /////partitions 
    static int partitons(int []arr ,int low ,int high){
        int pivot =arr[high];  /// to pass array-1 =high
        int index =(low -1);

        for(int j=low ;j<high ;j++){
            if (arr[j] < pivot ) {
                index ++;
                int temp =arr[index];
                arr[index] =arr[j];
                arr[j] =temp;
            }
        }
        int temp =arr[index+ 1];
        arr[index + 1] =arr[high];
        arr[high] =temp;

        return index + 1;
    }

    /// quik sort 
    static void quickSorts(int arr [] ,int low ,int high){
        if (low  < high) {
            int pivotindex =partitons(arr, low, high);
            quickSorts(arr, low, pivotindex - 1);
            quickSorts(arr, pivotindex + 1, high);
        }
       
    }
     /// to print 
     public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
        public static void main(String[] args) {
            int[] arr = {2,7,15,4,3,10};
            System.out.println("Original array:");
            printArray(arr);
            quickSorts(arr, 0, arr.length -1);
            System.out.println("Sorted array:");
            printArray(arr);
        }
    }
    