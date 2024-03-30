import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     System.out.println(is_palindrome(n));
   }
    
     static String is_palindrome(int n)
    {
        int res = reverse(n);
        if(n==res){
            return "Yes";
        }else{
            return "No";
        }
    }
 static int reverse(int num) {
        int reversed = 0;
        
        // Loop to reverse the integer
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return reversed;
    }    
}