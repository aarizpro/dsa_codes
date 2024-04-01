import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int N = scn.nextInt();
     int[] arr1 = new int[N];
     for (int i = 0; i < N; i++) {
            arr1[i] = scn.nextInt();
        }
     int[] arr2 = new int[N];
     for (int i = 0; i < N; i++) {
            arr2[i] = scn.nextInt();
        }
        System.out.println(check(arr1,arr2,N));
         
   }
    public static int check(int A[],int B[],int N)
    {
     Arrays.sort(A);
     Arrays.sort(B);
      for (int i = 0; i < N; i++)
            if (A[i] != B[i])
                return 0;
      return 1;
     
    }   
}