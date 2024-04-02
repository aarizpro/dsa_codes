import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();
   
     int[] arr = new int[N];
     for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
     int[] arr1 = new int[M];
     for (int i = 0; i < M; i++) {
            arr1[i] = scn.nextInt();
        }
        System.out.print(isSubset(arr,arr1,N,M));  
   }
static String isSubset( int a1[], int a2[], int n, int m) {
      for (int i = 0; i < m; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (a2[i] == a1[j]) {
                     a1[j] = -1;
                    break;
                }
            }
            if (j == n) {
                return "No";
            }
        }
        return "Yes";
        
    }
      
}