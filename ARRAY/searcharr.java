public class searcharr {

    public static int searching(int arr[] ,int target){
        for(int i =0; i<arr.length; i++){
            if (arr[i]== target) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr [] ={1,2,3,4,5};
        int target =4;
       int position =searching(arr, target);
       
        if (position==-1) {
            System.out.println("Search element not found  ");
        }else{
            System.out.println("Searching number of "+position);
        }
    }
}