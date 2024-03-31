import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int N = scn.nextInt();
     long[] arr = new long[N];
     for (int i = 0; i < N; i++) {
            arr[i] = scn.nextLong();
        }
    //long a = (int)N;
    long[] minMax = findMinMax(arr, N);

        System.out.print(minMax[0]);
        System.out.print(" , ");
        System.out.println(minMax[1]);
    
   }
    
   static long[] findMinMax(long[] arr, long N) {
        if (N == 0) {
            return null;
        }

        long min = arr[0];
        long max = arr[0];
     for (int i = 1; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new long[] {min, max};

    }    
}