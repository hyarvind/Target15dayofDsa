package Tcs;
public class Priviteelement {
    public static void main(String[] args) {
        int arr[]={7,4,8,2,9};
       int count=1;
       for(int i=1; i<arr.length; i++){
        boolean flag =true;
        for(int j=0; j<i-1; j++){
            if(arr[j] > arr[i]){
                flag =true;
                break;
            }
            if (flag==true) {
                count++;
            }
        }
       }
        System.out.println(count);
    }
}
