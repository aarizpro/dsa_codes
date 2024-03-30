import java.util.*;
import java.lang.*;
import java.util.Scanner;


class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     String input = scn.nextLine();
     long n = Long.parseLong(input);
     System.out.println(reverse_digit(n));

        
    }
     
     private static long reverse_digit(long n)
    {
       long reversed = 0;
        
        while (n != 0) {
            long digit = n % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            n /= 10; // Move to the next digit
        }
        
        return reversed;
    }
     
}