import java.util.Scanner;

public class tofindpolynomial {
    static int numofseries(int x,int n){
        if(n-1==0){
            return 1;
        }
        return (int)Math.pow(x, n-1)+numofseries(x,n-1);
    }
    public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
      System.out.print("Enter your Number of X  = ");
       int x=sc.nextInt();
       System.out.print("Enter your Number of N  = ");
       int n=sc.nextInt();
       int result =numofseries(x, n);
       System.out.println("Here is your result = "+ result);
    }      
    }

