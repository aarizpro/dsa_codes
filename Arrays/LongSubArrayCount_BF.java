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
    int maxSub=0;
    for(int i=0; i<N;i++){
        for(int j=i;j<N;j++){
           int sum=0;
           int count=0;
           for(int k=i;k<=j;k++){
               sum+=A[k];
               count++;
               
           }
           if(sum==K){
             maxSub=Math.max(maxSub,count);
           }
       }
       
   }
   return maxSub;
    }     
}