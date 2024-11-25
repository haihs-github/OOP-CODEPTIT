
package J06003;


public class Sinhvien {
    private String msv, hoten, sdt;
    private int nhom;
    Sinhvien(String msv, String hoten, String sdt, int nhom){
        this.msv = msv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.nhom = nhom;
    }
    
    public int getnhom(){
        return nhom;
    }
    
    @Override
    public String toString(){
        return msv + " " + hoten + " " + sdt;
    }
    
}
