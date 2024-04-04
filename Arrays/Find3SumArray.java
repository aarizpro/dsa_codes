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
     System.out.print(find3Numbers(arr,N,M));
          
   }
public static boolean find3Numbers(int A[], int n, int X) { 
    
       Arrays.sort(A);
       for(int i=0; i<n-2;i++){
           int targetSum = X- A[i];
           int left = i+1;
           int right = n-1;
           while(left<right){
               int curSum = A[left]+A[right];
               if(curSum==targetSum){
                   return true;
               }else if(curSum<targetSum){
                   left++;
               }else{
                   right--;
               }
           }
       }
    return false;
    }      
}