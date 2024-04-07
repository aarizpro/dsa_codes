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
     
     System.out.println(removeDup(arr1,N));
        
          
   }
public static  int removeDup(int A[], int N) {
    if(N==0||N==1){
        return N;
    }
    int unInt=0;
    for(int i=0;i<N;i++){
        if(A[i]!=A[unInt]){
            unInt++;
            A[unInt]=A[i];
        }
    }
    return unInt+1;
      
    }      
}