
 
package posttest2;

public class Posttest2 {

    private int no;
    private String nama;
    private String lantai_kamar;
    private String harga;
    
//    constructor
    public Posttest2 (int no, String nama, String lantai_kamar, String harga){
//keyword this untuk memnaggil property kelas itu sendiri
            this.no = no;
            this.nama = nama;
            this.lantai_kamar= lantai_kamar;
            this.harga = harga;    
    }
    
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getLantai_kamar() {
        return lantai_kamar;
    }


    public void setLantai_kamar(String lantai_kamar) {
        this.lantai_kamar = lantai_kamar;
    }


    public String getHarga() {
        return harga;
    }


    public void setHarga(String harga) {
        this.harga = harga;
    }


}
