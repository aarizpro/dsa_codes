import java.util.*;
import java.lang.*;
import java.util.Scanner;


class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(oddEven(n));

        
    }
     static String oddEven(int N){
            if(N%2==0)
            {
                return "Even";
            }
            else
            {
            return "Odd";
            }
    }
      
}