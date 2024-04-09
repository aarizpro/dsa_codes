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
    
    int K = scn.nextInt();
     
     System.out.println(lenOfLongSubarr(arr1,N,K));
        
          
   }
public static int lenOfLongSubarr (int A[], int N, int K) {
    HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxSub = 0;
        int currentSum = 0;
        for (int i = 0; i < N; i++) {
            currentSum += A[i];
            if (currentSum == K) {
                maxSub = i + 1; 
             
            }

            if (sumMap.containsKey(currentSum - K)) {
                int startIndex = sumMap.get(currentSum - K);
                int subarrayLength = i - startIndex;
                maxSub = Math.max(maxSub, subarrayLength);
             }

            if (!sumMap.containsKey(currentSum)) {
                sumMap.put(currentSum, i);
                }
        }

        return maxSub; 
  }     
}