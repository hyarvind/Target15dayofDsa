package Leetcode;

import java.util.Scanner;

public class problem13 {

        public int romanToInt(String s) {
            java.util.Map<Character, Integer> romanMap = new java.util.HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);
            
            int result = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 < s.length() && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                    result -= romanMap.get(s.charAt(i));
                } else {
                    result += romanMap.get(s.charAt(i));
                }
            }
            
            return result;
        }
    
        public static void main(String[] args) {
           problem13 solution = new problem13();
            
            // System.out.println(solution.romanToInt("III"));
            // System.out.println(solution.romanToInt("IV"));
            // System.out.println(solution.romanToInt("IX"));
            // System.out.println(solution.romanToInt("LVIII"));
            // System.out.println(solution.romanToInt("MCMXCIV"));
            Scanner sc =new Scanner(System.in);
            System.out.println("input your roman number  = ");
            String roman = sc.nextLine().toUpperCase();
            System.out.println(solution.romanToInt(roman));
        }
    }
    