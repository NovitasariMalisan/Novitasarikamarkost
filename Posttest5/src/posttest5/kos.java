
package posttest5;
public abstract class kos {
    protected final String namaKosan = "Kos IreneRVelvet";
    private String nama;
    private String alamat;
    private int noHp;
    
    public kos(String nama, String alamat, int noHp){
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public int getNoHp() {
        return noHp;
    }
    public void setNoHp(int noHp) {
        this.noHp = noHp;
    } 
    
     
     //Overloading
    public void info(String nama){
        System.out.println("Data Kamar dengan Nama " + nama + "  berhasil ditambahkan!" );
    }
    
    //Overloading
    public void info(int noHP){
        System.out.println("Data Kamar dengan NoHP " + noHP + " berhasil diubah !");
    }
    
    
    // abstract method  
    public abstract void SEE();
  
    }
