import java.util.*;
import java.lang.*;
class Main {
	public static void main(String args[]) {
     
        int[] arr = {1, 2, 3, 4, 5};
        int[] suffixSum = calculateSuffixSum(arr);
        
        System.out.println("Suffix Sum:");
        for (int num : suffixSum) {
            System.out.print(num + " ");
        }
		}
        public static int[] calculateSuffixSum(int[] arr) {
        int n = arr.length;
        int[] suffixSum = new int[n];
        
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        
        return suffixSum;
    }
       
}