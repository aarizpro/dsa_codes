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
         HashMap<Integer,Integer> map = new HashMap<>();
         int count =0;
         for(int i=0;i<N;i++){
             if(map.containsKey(nums[i])){
                 count= map.get(nums[i])+1;
                 map.put(nums[i],count);
             }else{
                 map.put(nums[i],1);
             }
             if(map.get(nums[i])>N/2){
                 return nums[i];
             }
         }
         return 0;
         
          }
           
}