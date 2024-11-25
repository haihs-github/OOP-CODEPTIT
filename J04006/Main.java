/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04006;

import java.util.*;
        
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sinhvien sinhvien = new Sinhvien(sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextFloat());
        System.out.println(sinhvien);
    }
}
