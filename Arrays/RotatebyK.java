import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     ArrayList<Integer> arr = new ArrayList<>();

     for (int i = 0; i < n; i++) {
            arr.add(scn.nextInt());
        }
        int k = scn.nextInt();

      ArrayList<Integer> rotatedArray = rotateArray(arr, k);
      System.out.println("Rotated array: " + rotatedArray);

         
   }
   
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
         int n = arr.size();
        ArrayList<Integer> rotatedArray = new ArrayList<>(n);
        k = k % n;
        for (int i = k; i < n; i++) {
            rotatedArray.add(arr.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotatedArray.add(arr.get(i));
        }

        return rotatedArray;
    }   
}