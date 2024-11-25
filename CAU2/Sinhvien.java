package CAU2;

public class Sinhvien {

    String msv;
    String ten;
    String lop;
    private String email, sdt;
    Sinhvien(String msv, String ten, String lop, String email, String sdt){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    
    public String getTen(){
        return ten;
    }
    
        public String getLop(){
        return lop;
    }
    
    @Override
    public String toString(){
      return msv + " " + ten + " " + lop + " " + email + " " + sdt;
    }
}
