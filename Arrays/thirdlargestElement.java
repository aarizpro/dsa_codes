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
    
        System.out.print(thirdLargest(arr,N));
       
   }
    
     static int thirdLargest(int a[], int n)
    {
	   int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            }
            else if (a[i] > second && a[i] != first) {
                third = second;
                second = a[i];
            }
            else if (a[i] > third && a[i] != second && a[i] != first) {
                third = a[i];
            }
        }

        return third;
    } 
}