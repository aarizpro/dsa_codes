import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int N = scn.nextInt();
     int[] arr = new int[N];
     for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.print(printTwoElements(arr,N));
       
   }
    static String printTwoElements(int[] arr, int n)
    {
        int[] temp = new int[n]; 
        int repeatingNumber = -1;
        int missingNumber = -1;
 
        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                repeatingNumber = arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                break;
            }
            
        }
        String res = "The repeating number is " + repeatingNumber + ". The missing number is "+ missingNumber + ".";
       return res;
    }
    
}