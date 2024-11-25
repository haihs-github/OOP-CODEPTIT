package J06005;

public class Khachhang {
    private String ma, ten, gioitinh, ngaysinh, diachi;
    
    Khachhang(String ma, String ten, String gioitinh, String ngaysinh, String diachi){
        this.ma = ma;       
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten;
    }
}
