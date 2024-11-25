package CAU2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("C:\\Users\\haidz\\OneDrive\\Documents\\NetBeansProjects\\codeptit\\src\\CAU2\\DANHSACH.in"));
        ArrayList<Sinhvien> sinhviens = new ArrayList<>();
        while (sc.hasNextLine()){
            sinhviens.add(new Sinhvien(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort( sinhviens,Comparator.comparing(Sinhvien::getLop).thenComparing(Sinhvien::getTen));
        for( Sinhvien x : sinhviens){
            System.out.println(x);
        }
    }
}
