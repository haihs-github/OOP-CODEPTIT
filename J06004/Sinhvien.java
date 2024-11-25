
package J06004;

public class Sinhvien {

    String msv;
    private String hoten, sdt;
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
        return msv + " " + hoten + " " + sdt + " " + nhom;
    }
    
}
