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
     System.out.println(trappingWater(arr1,N));
          
   }
    public static long trappingWater(int arr[], int n) { 
   if (n <= 2) {
        return 0; // Not enough blocks to trap water
    }
    
    int left = 0; // Left pointer
    int right = n - 1; // Right pointer
    int leftMax = 0; // Maximum height encountered from the left
    int rightMax = 0; // Maximum height encountered from the right
    long waterTrapped = 0;

    while (left <= right) {
        if (arr[left] <= arr[right]) {
            if (arr[left] >= leftMax) {
                leftMax = arr[left];
            } else {
                waterTrapped += leftMax - arr[left];
            }
            left++;
        } else {
            if (arr[right] >= rightMax) {
                rightMax = arr[right];
            } else {
                waterTrapped += rightMax - arr[right];
            }
            right--;
        }
    }

    return waterTrapped;
     }
        
}