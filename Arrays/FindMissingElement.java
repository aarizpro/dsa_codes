import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int N = scn.nextInt();
     int[] arr = new int[N];
     for (int i = 0; i < N-1; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.print(missingNumber(arr,N));
       
   }
    static int missingNumber(int array[], int n) {
        int totalSum = n*(n+1)/2;
        int arraySum=0;
        for(int num:array){
            arraySum+=num;
        }
        return totalSum-arraySum;
    }
    
}