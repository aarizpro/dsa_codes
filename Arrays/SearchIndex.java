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
    int X = scn.nextInt();
        System.out.print(search(arr,N,X));
       
   }
     static int search(int arr[], int N, int X)
    {
        for(int i=0;i<N;i++){
            if(arr[i]==X){
                return i;
            }
        }
        return -1;
    }
    
}