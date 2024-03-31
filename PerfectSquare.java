import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     long n = scn.nextLong();
     
     System.out.println(isPerfectNumber(n));
   }
    
    static int isPerfectNumber(long N) {
       if (N <= 1) {
        return 0;
    }

    long sum = 1; 
    for (long i = 2; i * i <= N; i++) {
        if (N % i == 0) {
            sum += i;
            if (i != N / i) {
                sum += N / i;
            }
        }
    }
    if (sum == N) {
        return 1; 
    } else {
        return 0; 
    }
    }    
}