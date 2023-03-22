
package posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<VIP> listVip = new ArrayList<>();
    static ArrayList<Reguler> listRegu = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan Enter Untuk Melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    public static void insert() throws IOException {
        System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
        System.out.println("======================================================");
        System.out.println("Pilih Jenis Kamar : ");
        System.out.println("1. VIP");
        System.out.println("2. Reguler");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Kamar VIP ==========");
            System.out.print("Masukkan Nama Penyewa              : ");
            String nama = input.readLine();
            System.out.print("Masukkan Alamat                    : ");
            String alamat = input.readLine();
            System.out.print("Masukkan No. Hp                    : ");
            int noHp = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Status                    : ");
            String status = input.readLine();
            System.out.println("=============================================");
            listVip.add(new VIP(nama, alamat, noHp, status));
            System.out.println("Data " + nama + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Kamar Reguler ==========");
            System.out.print("Masukkan Nama Penyewa              : ");
            String nama = input.readLine();
            System.out.print("Masukkan Alamat                    : ");
            String alamat = input.readLine();
            System.out.print("Masukkan No. Hp                    : ");
            int noHp = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Status                    : ");
            String status = input.readLine();
            System.out.println("=============================================");
            listRegu.add(new Reguler(nama, alamat, noHp, status));
            System.out.println("Data " + nama + " berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void display() throws IOException{
        System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
        System.out.println("======================================================");
        System.out.println("Pilih Jenis Kamar : ");
        System.out.println("1. VIP");
        System.out.println("2. Reguler");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ LIHAT DATA KAMAR ============");
            if (listVip.isEmpty()){
                System.out.println("\ndata kosong!");
            }else{
                for(int i = 0; i < listVip.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("Nama Peny         : " + listVip.get(i).getNama());
                    System.out.println("Alamat            : " + listVip.get(i).getAlamat());
                    System.out.println("No. Hp            : " + listVip.get(i).getNoHp());
                    System.out.println("Lantai            : " + listVip.get(i).getLantai());
                    System.out.println("Harga             : Rp. " + listVip.get(i).getHarga());
                    System.out.println("Status            : " + listVip.get(i).getStatus());
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== LIHAT DATA KAMAR ===========");
            if (listRegu.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listRegu.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("Nama              : " + listRegu.get(i).getNama());
                    System.out.println("Alamat            : " + listRegu.get(i).getAlamat());
                    System.out.println("No. Hp            : " + listRegu.get(i).getNoHp());
                    System.out.println("Lantai            : " + listRegu.get(i).getLantai());
                    System.out.println("Harga             : Rp. " + listRegu.get(i).getHarga());
                    System.out.println("Status            : " + listRegu.get(i).getStatus());
                }
            }
                System.out.println("=======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void update() throws IOException{
        System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
        System.out.println("======================================================");
        System.out.println("Pilih Jenis Kamar : ");
        System.out.println("1. VIP");
        System.out.println("2. Reguler");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listVip.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan Indeks data VIP yang mau diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listVip.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    VIP vip = listVip.get(index);
                    System.out.println("Data Kamar " + index);
                    System.out.println(vip);
                    System.out.println("======= Data Kamar Yang Baru =======");
                    System.out.print("Nama Penyewa               : ");                  
                    vip.setNama(input.readLine());
                    System.out.print("Masukkan Alamat            : ");
                    vip.setAlamat(input.readLine()); 
                    System.out.print("Masukkan No. Hp            : ");
                    vip.setNoHp(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Status            : ");
                    vip.setStatus(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data Kamar berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (listRegu.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan Indeks data Reguler yang mau diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listRegu.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                     Reguler regu = listRegu.get(index);
                    System.out.println("Data Kamar " + index);
                    System.out.println(regu);
                    System.out.println("======= Masukkan Kamar yang Baru =======");
                    System.out.print("Nama Penyewa               : ");                  
                    regu.setNama(input.readLine());
                    System.out.print("Masukkan Alamat            : ");
                    regu.setAlamat(input.readLine()); 
                    System.out.print("Masukkan No. Hp            : ");
                    regu.setNoHp(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Status            : ");
                    regu.setStatus(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data Kamar berhasil diubah!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void delete() throws IOException{
        System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
        System.out.println("======================================================");
        System.out.println("Pilih Jenis Kamar : ");
        System.out.println("1. VIP");
        System.out.println("2. Reguler");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listVip.isEmpty()) {
                System.out.println("\nData Kosong!");
            } else {
                System.out.print("Hapus pada data ke : ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listVip.size()) {
                    System.out.println("Indeks tidak ada!");
                } else {
                    VIP vip = listVip.get(index);
                    listVip.remove(index);
                    System.out.println("Data Kamar dengan indeks " + index + " berhasil dihapus:");
                }
            }
        }else if(pil == 2){
            if (listRegu.isEmpty()) {
                System.out.println("\nData Kosong!");
            } else {
                System.out.print("Hapus pada data ke: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listRegu.size()) {
                    System.out.println("Indeks tidak ada!");
                } else {
                    Reguler regu = listRegu.get(index);
                    listRegu.remove(index);
                    System.out.println("Data Kamar dengan indeks " + index + " berhasil dihapus:");
                    
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
    
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
        System.out.println("======================================================");
        System.out.println("1. Insert");
        System.out.println("2. Display");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("=======================================================");
        System.out.print("Masukkan Pilihan: ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                insert();
                froze();
                break;
            case 2:
                display();
                froze();
                break;
            case 3:
                update();
                froze();
                break;
            case 4:
                delete();
                froze();
                break;
            case 5:
                System.out.println(" \n           PROGRAM SELESAI       ");
                System.exit(0);
            default:
                System.out.println("Masukkan angka 1-5 saja!");
                froze();
                break;
            }
        }
    }
    
}

