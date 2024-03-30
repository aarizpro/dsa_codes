import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     System.out.println(armstrongNumber(n));
   }
    
     static String armstrongNumber(int n){
        int numDigits= countDigits(n);
        int temp =n;
        int sum =0;
        while(temp>0){
            int digit = temp %10;
            sum+=power(digit,numDigits);
            temp/=10;
        }
        if(sum==n){
            return "Yes";
        }else{
            return "No";
        }
       
    }
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    
    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
     
}