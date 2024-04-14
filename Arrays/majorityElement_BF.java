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
     System.out.println(majorityElement(arr1,N));
          
   }
      public static int majorityElement(int[] nums,int N){
          int maxCount=0;
          int index=-1;
          for(int i=0;i<N;i++){
              int count=0;
              for(int j=0;j<N;j++){
                  if(nums[i]==nums[j]){
                      count++;
                  }
              }
              if(count>maxCount){
                  maxCount=count;
                  index=i;
              }
          }
          if(maxCount>N/2){
              return nums[index];
          }else{
              return 0;
          }
      }     
}