package Tcs;
import java.util.Scanner;
public class no3washingmc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(" Enter your input = ");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Time Estimated : 0 Minutes");
        } else if (n >= 1 && n <= 2000) {
            System.out.println("Time Estimated : 25 Minutes");
        } else if (n >= 2001 && n <= 4000) {
            System.out.println("Time Estimated : 35 Minutes");
        } else if (n >= 4001 && n <= 7000) {
            System.out.println("Time Estimated : 45 Minutes");
        } else {
            System.out.println("INVALID INPUT");
        }
        
        scanner.close();
    }
}
