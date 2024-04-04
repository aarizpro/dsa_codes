import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int X = scn.nextInt();
   
     int[] arr = new int[N];
     for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
    List<List<Integer>> result = fourSum(arr, X);
    for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
          
   }
public static List<List<Integer>> fourSum(int[] nums, int target) {
      Arrays.sort(nums);//so we can do two pointer
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;//skip duplicates
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;//skip duplicates
                }
                int start = j+1;
                int end = nums.length-1;//for the two pointer
                while(start<end){
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                    if(sum==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++;//obviously add to result and increment start and decrement end
                        end--;
                        while(start<end && nums[start] == nums[start-1]){
                            start++;//skip duplicate
                        }
                        while(start<end && nums[end] == nums[end+1]){
                            end--;//skip duplicate
                        }
                    }
                    else if(sum<target){
                        start++;//if sum less than target increment sum to increase the next sum
                    }
                    else{
                        end--;//vice versa
                    }
                }
            }
        }
        return res;   
              }      
}