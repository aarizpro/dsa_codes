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
        sort012(arr,N);
         
   }
    public static void sort012(int a[], int n)
    {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                c0++;
            }else if(a[i]==1){
                c1++;
            }else{
                c2++;
            }
        }
        for(int j=0;j<c0;j++){
            a[j]=0;
        }
        for(int j=c0;j<c0+c1;j++){
            a[j]=1;
        }
        for(int j=c0+c1;j<n;j++){
            a[j]=2;
        }
        for (int num : a) {
        System.out.print(num + " ");
    }
    }   
}