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
     System.out.print(hasArrayTwoCandidates(arr,N,M));
          
   }
static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
       HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int diff = x - arr[i];
            if (set.contains(diff)) {
                return true;
            }
            set.add(arr[i]);

        }
        return false;
    }    
      
}