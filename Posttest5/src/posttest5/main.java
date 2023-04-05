
package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class main {
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
            System.out.print("Masukkan Nama Penyewa         : ");
            String nama = input.readLine();
            System.out.print("Masukkan Alamat               : ");
            String alamat = input.readLine();
            System.out.print("Masukkan No. Hp               : ");
            int noHp = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Status               : ");
            String status = input.readLine();
            System.out.println("=============================================");
            VIP vip = new VIP(nama, alamat, noHp, status);
            listVip.add(vip);
            vip.info(nama);

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Kamar Reguler ==========");
            System.out.print("Masukkan Nama Penyewa          : ");
            String nama = input.readLine();
            System.out.print("Masukkan Alamat                : ");
            String alamat = input.readLine();
            System.out.print("Masukkan No. Hp                : ");
            int noHp = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Status                : ");
            String status = input.readLine();
            System.out.println("=============================================");
            Reguler Regu =new Reguler(nama, alamat, noHp, status);
            listRegu.add(Regu);
            Regu.info(nama);
            
        }else{
            System.out.println("Pilihan Salah");

        }
    }

    static final void SEE() { // final method
       System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
       System.out.println("======================================================");
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
                    System.out.println("\n\tData ke-" + (i+1));
                     System.out.println("==================================");
                    listVip.get(i).SEE();
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== LIHAT DATA KAMAR ===========");
            if (listRegu.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listRegu.size();i++){
                    System.out.println("\n\tData ke-" + (i+1));
                    System.out.println("==================================");
                    listRegu.get(i).SEE();
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
                for(int i = 0; i < listVip.size();i++){
                    System.out.println("\n\tData ke-" + (i+1));
                    System.out.println("==================================");
                    listVip.get(i).SEE();
                     }
                    System.out.println("==================================");
                    System.out.print("Masukkan indeks data Kamar yang diubah: ");
                    int index = Integer.parseInt(input.readLine());
                    
                if (index <= listVip.size() || index > 0){
                     System.out.println("======= Data Kamar Yang Baru =======");
                     System.out.print("Nama Penyewa          :");
                     String nama = input.readLine();
                     listVip.get(index-1).setNama(nama);
                     
                     System.out.print("Masukkan Alamat       :");
                     String alamat = input.readLine();
                     listVip.get(index-1).setAlamat(alamat);
                     
                     System.out.print("Masukkan No. Hp       :");
                     int noHp = Integer.parseInt(input.readLine());
                     listVip.get(index-1).setNoHp(noHp);
                     
                     System.out.print("Masukkan Status       :");
                     String status = input.readLine();
                     listVip.get(index-1).setStatus(status);
                     
                     listVip.get(index-1).info(noHp);
                     System.out.println("=================================================");
                        
                }else{
                    System.out.println("Indeks Kosong");
                    
                }
              }
            }else if(pil == 2){
                if (listRegu.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listRegu.size();i++){
                    System.out.println("\n\tData ke-" + (i+1));
                    System.out.println("==================================");
                    listRegu.get(i).SEE();
                     }
                    System.out.println("==================================");
                    System.out.print("Masukkan indeks data Kamar yang diubah: ");
                    int index = Integer.parseInt(input.readLine());
                    
                if (index <= listRegu.size() || index > 0){
                     System.out.println("======= Data Kamar Yang Baru =======");
                     System.out.print("Nama Penyewa          :");
                     String nama = input.readLine();
                    listRegu.get(index-1).setNama(nama);
                     
                     System.out.print("Masukkan Alamat       :");
                     String alamat = input.readLine();
                    listRegu.get(index-1).setAlamat(alamat);
                     
                     System.out.print("Masukkan No. Hp       :");
                     int noHp = Integer.parseInt(input.readLine());
                    listRegu.get(index-1).setNoHp(noHp);
                     
                     System.out.print("Masukkan Status       :");
                     String status = input.readLine();
                    listRegu.get(index-1).setStatus(status);
                     
                    listRegu.get(index-1).info(noHp);
                     System.out.println("=================================================");
                        
                }else{
                    System.out.println("Indeks Kosong");
                    
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
            for(int i = 0; i < listVip.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    System.out.println("==================================");
                    listVip.get(i).SEE();
                    }
                    System.out.println("==================================");
                    System.out.print("Hapus pada data ke : ");
                    int index = Integer.parseInt(input.readLine());
                    if(index <= listVip.size() || index > 0) 
                    {
                        listVip.remove(index-1);
                        System.out.println("Data Kamar dengan indeks " + index + " berhasil dihapus:");
                    }
                    else
                    {
                        System.out.println("Indeks tidak ditemukan!");
                    }
                
        }else if(pil == 2){
            if (listRegu.isEmpty()) {
                System.out.println("\nData Kosong!");
            } else {
            for(int i = 0; i < listRegu.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    System.out.println("==================================");
                    listRegu.get(i).SEE();
                    }
                    System.out.println("==================================");
                    System.out.print("Hapus pada data ke : ");
                    int index = Integer.parseInt(input.readLine());
                    if(index <= listRegu.size() || index > 0) 
                    {
                        listRegu.remove(index-1);
                        System.out.println("Data Kamar dengan indeks " + index + " berhasil dihapus:");
                    }
                    else
                    {
                        System.out.println("Indeks tidak ditemukan!");
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

