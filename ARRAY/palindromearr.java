import java.util.Scanner;

public class palindromearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int reverse = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        if (originalNum == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
    }

    // static int reverse(int n) {
    //     int rev = 0;
    //     while (n > 0) {
    //         int d = n % 10;
    //         rev = rev * 10 + d;
    //         n = n / 10;
    //     }
    //     return rev;
    // }

    // static boolean isplidrome(int n) {
    //     return (n == reverse(n));
    // }

    // static int countdigit(int n) {
    //     int c = 0;
    //     while (n > 0) {
    //         n /= 10;
    //         c++;
    //     }
    //     return c;
    // }

    // public static int countdigitpali(int arr[], int n) {
    //     int s = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] < 10 || isplidrome(arr[i])) {
    //             s = countdigit(arr[i]);
    //         }
    //     }
    //     return s;
    // }

  
