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
     System.out.println(maxSubarraySum(arr1,N));
          
   }
      public static int maxSubarraySum(int[] arr,int N){
        int maxSum= Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0; i<N;i++){
            curSum=curSum+arr[i];
            if(maxSum<curSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
         
          }
           
}