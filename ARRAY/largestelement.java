public class largestelement {

    public static int largest(int arr[]){
        int num=Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if (num<arr[i]) {
                num=arr[i];
            }
        }
       return num;

    }
    public static int minmum(int arr[]){
        int num=Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if (num>arr[i]) {
                num=arr[i];
            }
        }
       return num;

    }
    
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
    //     int largest=0;
    //     for(int i =0; i<arr.length; i++){
    //        for(int j=0; j<arr.length; j++){
    //         if (arr[i]>arr[j]) {
    //             largest=arr[i];
    //         }
    //        }
    // }
    // System.out.println(largest);
    System.out.println(largest(arr));
    System.out.println(minmum(arr));
    
}
}
