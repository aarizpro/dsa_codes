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
    
     System.out.println(doUnion(arr1,arr2,N,M));
        
          
   }
public static  int doUnion(int a[],int b[], int n, int m) {
     Set<Integer> set = new HashSet<>();
    for(int num :a){
        set.add(num);
    }
    for(int num:b){
        set.add(num);
    }
    int [] unionArray = new int[set.size()];
    int index=0;
    for(int num:set){
        unionArray[index++]=num;
    }
    return unionArray.length;
    
       
    }      
}