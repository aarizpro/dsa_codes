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
     frequencyCount(arr,N,M);
          
   }
public static void frequencyCount(int arr[], int N, int P)
    {
        for(int i=1; i<=P; i++){
            int count=0;
            for(int j= 0;j<N;j++){
              if(i==arr[j]){
                  count++;
              }
                }
            System.out.print(count+" ");    
            }
    
            
        }
    
      
}