package CAU1;

import java.util.*;
import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String [] args) throws IOException, ClassNotFoundException{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
//        Set<Integer> ans = new TreeSet<>();
        int[] ans = new int[1005];
        for(int i : list){
            ++ans[i];
        }
        for(int i=0; i<=1000; ++i){
            if(ans[i]>0){
                System.out.println(i+" "+ans[i]);
            }
        }
    }
}
