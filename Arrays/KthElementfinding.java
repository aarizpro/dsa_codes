import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();
    
     int[] arr1 = new int[N];
     for (int i = 0; i < N; i++) {
            arr1[i] = scn.nextInt();
        }
     int[] arr2 = new int[M];
     for (int i = 0; i < M; i++) {
            arr2[i] = scn.nextInt();
        }
    int K = scn.nextInt();
     
     System.out.println(findElementIndex(arr1,arr2,N,M,K));
        
          
   }
public static  int findElementIndex(int A[], int B[], int N, int M, int K) {
    ArrayList<Integer> mergeList = new ArrayList<>();
    for(int num :A){
        mergeList.add(num);
    }
    for(int num :B){
        mergeList.add(num);
    }
    Collections.sort(mergeList);
     int res = mergeList.get(K-1);
     return res;
      }      
}