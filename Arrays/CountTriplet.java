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
            System.out.println(countTriplet(arr,N));
        
          
   }
public static  int countTriplet(int arr[], int n) {
        if (arr == null || n < 3) {
            return 0; 
        }

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int x = arr[i];
          if (x == 0 && freq.get(x) >= 3) {
                ans += (freq.get(x) * (freq.get(x) - 1) * (freq.get(x) - 2)) / 6;
            }

            if (x != 0 && freq.get(0) != null && freq.get(0) > 0 && freq.containsKey(x)) {
                ans += (freq.get(0) * freq.get(x) * (freq.get(x) - 1)) / 2;
            }
            for (int j = i + 1; j < n; j++) {
                int y = arr[j];
                if (x != y && freq.containsKey(x) && freq.containsKey(y) && freq.containsKey(x + y)) {
                    ans += freq.get(x) * freq.get(y) * freq.get(x + y);
                }
            }
        }

        return ans;
    }      
}