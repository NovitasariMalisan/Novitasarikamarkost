

package kamarkostirene;

import java.util.ArrayList;
import java.util.Scanner;



public class KamarKostIrene {
    static ArrayList<buat> kamarkost = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
            System.out.println("======================================================");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
//            System.out.println("No \t Nama Penyewa \t Harga kamar \t lantai Kamar ");
            System.out.println("=======================================================");
                

            System.out.print("Masukkan Pilihan: ");
            int choice = sc.nextInt();
            
             switch (choice) {
                case 1:
                    insertbuat();
                    break;
                case 2:
                    displaybuat();
                    break;
                case 3:
                    updatebuat();
                    break;
                case 4:
                    deletebuat();
                    break;
                case 5:
//                    System.out.println("==================================");
                    System.out.println(" \n           PROGRAM SELESAI       ");
//                    System.out.println("==================================");
                    System.exit(0);
                default:
                    System.out.println("Masukkan angka 1-5 saja!");
            }
        }
    }
    
    static void insertbuat() {
        System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
        System.out.println("======================================================");
        System.out.print("Masukkan Nomor Kamar   : ");
        sc.nextLine();
        int no = sc.nextInt();
        System.out.print("Masukkan Nama Penyewa  : ");
        sc.nextLine();
        String nama = sc.next();
        System.out.print("Masukkan Lantai Kamar  :  ");
        sc.nextLine(); 
        String lantai_kamar = sc.next();
        sc.nextLine(); 
//        String harga = sc.nextLine();
        System.out.print("Masukkan Harga         :  ");
//        sc.nextLine();
        String harga = sc.nextLine();
        System.out.println("======================================================");
     
        buat data = new buat(no, nama, lantai_kamar, harga);
        kamarkost.add(data);
        System.out.println("Data berhasil ditambahkan!");
    }

    static void displaybuat() {
        System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
        System.out.println("======================================================");
        if (kamarkost.isEmpty()) {
            System.out.println("\nData kosong");
        } else {
            
            for (int i = 0; i < kamarkost.size(); i++) {
//                System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
//                System.out.println("======================================================");
                System.out.println("      Data ke-" + (i + 1));
                System.out.println("============================");
                System.out.println("No Kamar          : " + kamarkost.get(i).getNo());
                System.out.println("Nama Penyewa      : " + kamarkost.get(i).getNama());
                System.out.println("Lantai Kamar      : " + kamarkost.get(i).getLantai_kamar());
                System.out.println("Harga             : " + kamarkost.get(i).getHarga());
                System.out.println("=============================");
              
                System.out.println();
            }
        }
    }
    
    static void updatebuat() {
        System.out.println("\n\n    Program Pendataan Kamar Kost Irene Rvelvet");
        System.out.println("======================================================");
        if (kamarkost.isEmpty()) {
            System.out.println("Kosong!");
        } else {
            System.out.print("Ubah pada data ke : ");
            int index = sc.nextInt() - 1;

            if (index < 0 || index >= kamarkost.size()) {
                System.out.println("Inputan salah!");
            } else {
                System.out.print("Masukkan Nomor Kamar   : ");
                int no = sc.nextInt();

                System.out.print("Masukkan  Penyewa      : ");
                String nama = sc.next();

                System.out.print("Masukkan Lantai Kamar  : ");
                String lantai_kamar = sc.next();
                
                System.out.print("Masukkan Harga         : ");
                String harga = sc.next();
                
                buat data = new buat(no, nama, lantai_kamar, harga);
                kamarkost.set(index, data);
                

                System.out.println("Berhasil");
            System.out.println("======================================================");
            }
        }
    }

    static void deletebuat() {
            if (kamarkost.isEmpty()) {
                System.out.println("Kosong!");
            } else {
                System.out.print("Hapus pada data ke : ");
                int index = sc.nextInt() - 1;

                if (index < 0 || index >= kamarkost.size()) {
                    System.out.println(" data tidak sesuai!");
                } else {
                    kamarkost.remove(index);
                    System.out.println("      Berhasil Dihapus!");
                    }
               }
        }
}
class buat {
    private int no;
    private String nama;
    private String lantai_kamar;
    private String harga;
    
//    constructor
    public buat (int no, String nama, String lantai_kamar, String harga){
            this.no = no;
            this.nama = nama;
            this.lantai_kamar= lantai_kamar;
            this.harga = harga;    
    }
//    setter
public int getNo() {
    return no;
    }
////getter
//    public void setNama(int no) {
//        this.no = no;
//    }
//    setter
public String getNama() {
    return nama;
    } 
//getter
//    public void setLantai_kamar(String lantai_kamar) {
//        this.lantai_kamar = lantai_kamar;
//    }
//    setter
public String getLantai_kamar() {
    return lantai_kamar;
    }
//getter
//    public void setHarga(String harga) {
//        this.harga = harga;
//    }
//setter     
public String getHarga() {
    return harga;        
    }

}

//tes123
    