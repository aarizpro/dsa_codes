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
    int left[]= new int[n];
    int right[]= new int[n]; 
    int water =0;
    left[0]=arr[0];
    for(int i=1;i<n;i++)
        left[i]=Math.max(left[i-1],arr[i]);
    right[n-1]= arr[n-1];
    for(int i=n-2;i>=0;i--)
        right[i]=Math.max(right[i+1],arr[i]);
    for(int i=0;i<n;i++)
        water+= Math.min(left[i],right[i])-arr[i];
    return water;
    }
        
}