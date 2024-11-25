package J06004;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<Sinhvien> sinhviens= new ArrayList<>();
        for ( int i =0; i<n; i++){
            sc.nextLine();
            sinhviens.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(sinhviens, Comparator.comparing(sinhvien -> sinhvien.msv));
        List<Btl> btls = new ArrayList<>();
        sc.nextLine();
        for (int i = 0;  i<m; i++){
            btls.add(new Btl(sc.nextLine(), i+1));
        }
        for(Sinhvien x : sinhviens){
            System.out.print(x + " ");
            System.out.println(btls.get(x.getnhom()-1));
        }
    }
}
