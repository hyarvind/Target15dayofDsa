import java.util.HashSet;

public class friquencyarr {
   public static int repeat(int arr[]) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                return arr[i];  
            } else {
                seen.add(arr[i]);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5,2};
        // int count=0;
        // int num=0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         if (arr[i]==arr[j]) {
        //             count++;
        //             num=arr[count];
        //         }
            
        //     }
        // }
        // System.out.println("Element "+num+" is repeated ="+count);        
        int count =repeat(arr);
        System.out.println(count);
    }
    
}
