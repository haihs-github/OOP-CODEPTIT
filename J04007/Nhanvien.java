package J04007;

public class Nhanvien {
    private String mnv, ten, gt, ns, dc, mst, nkhd;
    public Nhanvien( String ten,String gt,String ns,String dc,String mst, String nkhd){
        this.mnv = "00001";
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }
    
    @Override
    public String toString(){
        return mnv + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd;
    }
}
