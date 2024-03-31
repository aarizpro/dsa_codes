import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     long n = scn.nextLong();
     
     System.out.println(floorSqrt(n));
   }
    
     static long floorSqrt(long x)
	 {
		if (x == 0 || x == 1) {
            return x;
        }
        
        long left = 1;
        long right = x;
        long result = 0;
         while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return mid;
            }
             if (mid * mid <= x) {
                left = mid + 1;
                result = mid; 
            } else 
            { 
                right = mid - 1;
            }
        }
        
        return result;
	 }    
}