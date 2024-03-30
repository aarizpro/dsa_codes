import java.util.*;
import java.lang.*;
import java.util.Scanner;


class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    String a = scn.nextLine();
    String b = scn.nextLine();
    System.out.println(getLastDigit(a,b));

        
    }
     
     static int getLastDigit(String a, String b) {
   
    long base = Long.parseLong(a) % 10;
     long exponent = Long.parseLong(b);
     long result =1;
     
     if(exponent==0){
         result =1;
     }
     for(long i=0; i<exponent;i++){
         result=(result*base)%10;
     }
     return (int)result;
    
    }
     
}