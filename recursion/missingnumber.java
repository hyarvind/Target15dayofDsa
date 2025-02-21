import java.util.Arrays;

public class missingnumber {

    ///  first way
    public int missingNumber(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
    
        return xor ^ i;
    }
    // second way
    public int missingNumbe(int[] nums) { //binary search
    Arrays.sort(nums);
    int left = 0, right = nums.length, mid= (left + right)/2;
    while(left<right){
        mid = (left + right)/2;
        if(nums[mid]>mid) right = mid;
        else left = mid+1;
    }
    return left;
}

/// third ways
public int missingNumbers(int[] nums) { //sum
    int len = nums.length;
    int sum = (0+len)*(len+1)/2;
    for(int i=0; i<len; i++){
        sum-=nums[i];
    }
    return sum;
}
    public static void main(String[] args) {
        int nums[]={3,0,1};
        missingnumber m =new missingnumber();
         int result = m.missingNumbers(nums);
        System.out.println(result);
        
    }
}
