
package J06003;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        Sinhvien[] sinhviens = new Sinhvien[N];
        for(int i =0; i<N; i++){
            sc.nextLine();
            sinhviens[i] = new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Btl[] btls = new Btl[M];
        sc.nextLine();
        for( int i =0; i< M; i++){
            btls[i] = new Btl(sc.nextLine(), i+1);
        }
        int Q = sc.nextInt();
        for(int t =0; t<Q; t++){
            int n = sc.nextInt();
            System.out.println("DANH SACH NHOM " + n + ":");
            for( int i=0; i<N; i++){
                if (sinhviens[i].getnhom()==n){
                    System.out.println(sinhviens[i]);
                }
            }
            System.out.println("Bai tap dang ky: " + btls[n-1]);
        }
    }
}
