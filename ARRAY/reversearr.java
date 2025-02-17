public class reversearr {
    public static void main(String[] args) {
        int arr [] ={10,20,30,40,50};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        // }
        
        //// using for each
        for (int i : arr) {
            System.out.println(i);
        }
        }
}
