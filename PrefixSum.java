import java.util.*;
import java.lang.*;
class Main {
	public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = calculatePrefixSum(arr);
        
        System.out.println("Prefix Sum:");
        for (int num : prefixSum) {
            System.out.print(num + " ");
        }
    
		}
         public static int[] calculatePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        return prefixSum;
    }
}