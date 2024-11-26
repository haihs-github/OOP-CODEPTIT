package BASICJAVA;

import java.util.*;

public class J02004 {
    public static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    public static void interchange_sort(int[] a, int n){
        for( int i=0; i<n; i++){
            boolean change = false;
            int step = i+1;
            for (int j= i+1; j<n; j++){
                if(a[i] > a[j]){
                    swap(a, i, j);
                    change=true;
                }
            }
            if(change){
                System.out.print("Buoc " + step+ ": ");
                for(int x : a){
                    System.out.print(x+ " ");
                }
                System.out.println();                
            }
        }
    }
    
    public static void selection_sort(int[] a, int n){
        for( int i=0; i<n; i++){
            int min_index = i;
            int step=i+1;
            boolean change = false;
            for( int j=i+1; j<n; j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                    change = true;
                }
            }
            if(change){
                swap(a, i, min_index);
                System.out.print("Buoc " + step+ ": ");
                for(int x : a){
                    System.out.print(x+ " ");
                }
                System.out.println();   
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for ( int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        selection_sort(a, n);
    }
}
