/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04006;

/**
 *
 * @author Hai
 */
public class Sinhvien {
    private String ten, lop, ns;
    private float diem;
    Sinhvien(String ten, String lop, String ns, float diem){
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.diem = diem;
    }
    
    private String chuanhoans(String ns){
        String[] a = this.ns.split("/");
        this.ns = "";
        for(int i=0; i<3; i++){
            if(a[i].length()<2){
                a[i] = "0" + a[i];
                this.ns += a[i];

            }else{
                this.ns += a[i];
            }
            if(i!=2){
                this.ns += "/";
            }
        }
        return this.ns;
    }
    
    @Override
    public String toString(){
        return "B20DCCN001" +" "+ ten +" " + lop +" "+ chuanhoans(this.ns)+" " + String.format("%.2f", diem);
    }
}
