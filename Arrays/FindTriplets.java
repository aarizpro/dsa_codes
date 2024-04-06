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
      Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) { 
                int left = i + 1;
                int right = n - 1;
                int targetSum = -arr[i];
                while (left < right) {
                    int currentSum = arr[left] + arr[right];
                    if (currentSum == targetSum) {
                        return true; 
                    } else if (currentSum < targetSum) {
                        left++; 
                    } else {
                        right--;
                    }
                }
            }
        }
    return false;
                  }      
}