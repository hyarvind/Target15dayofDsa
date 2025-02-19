import java.util.Scanner;

public class climbingstars {

    static int totalsteps(int n){
        if(n==0 || n==1){
            return 1;
        }
        return totalsteps(n-1)+totalsteps(n-2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int prev1=0,prev2=0;
        for(int i=2;i<=cost.length;i++)
        {
            int curr=Math.min(prev1+cost[i-1],prev2+cost[i-2]);
            prev2=prev1;
            prev1=curr;
        }

        return prev1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Number of N  = ");
       int n=sc.nextInt();
       int result =totalsteps(n);
       System.out.println("Here is your result = "+ result);
        
    }
}