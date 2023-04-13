
package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Reguler extends kos implements penyewa{
    private String fasilitas = "Kipas Angin + Kamar Mandi Dalam";
    private String lantai  = "1";
    private int harga = 700000;
    private String status;
    private int lamasewa;
   
    public Reguler(String nama,String alamat, int noHp,  String status, int lamasewa) {
        super(nama, alamat, noHp);
        this.status = status;
        this.lamasewa =lamasewa;
        
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
    public double getLamasewa() {
        return lamasewa;
    }

    public void setLamasewa(int lamasewa) {
        this.lamasewa = lamasewa;
    }
     @Override
    public void SEE(){
        System.out.println("Nama Kosan      : " +namaKosan);
        System.out.println("Fasilitas       : " + fasilitas);
        System.out.println("Lantai          : "+lantai);
        System.out.println("Harga(perbulan) : "+harga);
        System.out.println("Nama Penyewa    : "+getNama());
        System.out.println("Alamat          : "+getAlamat());
        System.out.println("Nomor Hp.       : "+getNoHp());
        System.out.println("Jenis Kelamin   : "+jeniskelamin());
        System.out.println("Status          : " + status);
        System.out.println("Lama Sewa       : "+ lamasewa);
        System.out.println("Total Biaya     : "+totalbiaya());
    }
    
    @Override
    public int totalbiaya(){
        return harga * lamasewa;
    } 
    @Override
    public String jeniskelamin(){
        return "Perempuan";
    }
}
