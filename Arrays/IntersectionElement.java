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
    
     System.out.println(NumberofElementsInIntersection(arr1,arr2,N,M));
        
          
   }
public static  int NumberofElementsInIntersection(int a[],int b[], int n, int m) {
     Set<Integer> setA = new HashSet<>();
    for(int num :a){
        setA.add(num);
    }
    Set<Integer> commonInt= new HashSet<>();
    for(int num:b){
        if(setA.contains(num)){
            commonInt.add(num);
        }
    }
    return commonInt.size();
       
    }      
}