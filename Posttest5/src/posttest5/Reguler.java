
package posttest5;
public class Reguler extends kos{
    private String fasilitas = "Kipas Angin + Kamar Mandi Dalam";
    private String lantai  = "1";
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
     @Override
    public void SEE(){
        System.out.println("Nama Kosan   : " +namaKosan);
        System.out.println("Fasilitas    : " + fasilitas);
        System.out.println("Lantai       : "+lantai);
        System.out.println("Harga        : "+harga);
        System.out.println("Nama Penyewa : "+getNama());
        System.out.println("Alamat       : "+getAlamat());
        System.out.println("Nomor Hp.    : "+getNoHp());
        System.out.println("Status       : " + status);
    }
    

}
