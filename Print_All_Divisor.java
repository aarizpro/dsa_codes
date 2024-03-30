import java.util.*;
import java.lang.*;
import java.util.Scanner;



class Main {
	 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     System.out.println(printDivisors(n));
   }
    
     public static List< Integer > printDivisors(int n) {
        ArrayList<Integer> divis = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                divis.add(i);
                if(i!=n/i){
                    divis.add(n/i);
                }
            }
        }
        Collections.sort(divis);
        return divis;
    }
     
}