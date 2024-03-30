import java.util.*;
import java.lang.*;
import java.util.Scanner;


class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     int result = powerOfReverse(num);
     System.out.println(result);
   }
    public static int powerOfReverse(int num) {
        int reversed = reverse(num);
        int power = power(num, reversed);
        return power;
    }
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static int power(int N, int R) {
    double result = Math.pow(N, R)%1000000007;

       return (int)result;
    } 
    
     
}