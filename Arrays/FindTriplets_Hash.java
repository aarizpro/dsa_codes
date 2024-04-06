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
            System.out.println(findTriplets(arr,N));
        
          
   }
public static boolean findTriplets(int arr[] , int n)
    {
      for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> s = new HashSet<Integer>();
            for (int j = i + 1; j < n; j++) {
                int x = -(arr[i] + arr[j]);
                if (s.contains(x)) {
                    return true;
                }
                else {
                    s.add(arr[j]);
                }
            }
        }
 
        
        return false; 
                  }      
}