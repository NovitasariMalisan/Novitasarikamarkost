
package posttest3;
public class Reguler extends kos{
    private String fasilitas = "AC + Kamar Mandi Dalam";
    private String lantai  = "2";
    private int harga = 700000;
    private String status;
   
    public Reguler(String nama,String alamat, int noHp,  String status) {
        super(nama, alamat, noHp);
        this.status = status;
    }
    public String getFasilitas() {
        return fasilitas;
    }
    public String getLantai() {
        return lantai;
    }
    public int getHarga() {
        return harga;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
