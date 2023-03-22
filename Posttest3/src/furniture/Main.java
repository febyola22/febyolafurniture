
package furniture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<kursi> listkrs = new ArrayList<>();
    static ArrayList<meja> listmja = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
   
    public static void ADD() throws IOException {
        System.out.println("-------------------------------------");
        System.out.println("            TAMBAH DATA              ");
        System.out.println("-------------------------------------");
        System.out.println("1. KURSI");
        System.out.println("2. MEJA");
        System.out.println("-------------------------------------");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        
        if(pil == 1){
            System.out.println("=====================================");
            System.out.println("======== MASUKKAN DATA KURSI ========");
            System.out.println("=====================================");
            System.out.print("Masukkan Nama         : ");
            String nama = input.readLine();
            System.out.print("Masukkan Jenis        : ");
            String jenis = input.readLine();
            System.out.print("Masukkan KodeBarang   : ");
            int kodebarang = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Merk         : ");
            String merk = input.readLine();
            System.out.print("Masukkan Warna        : ");
            String warna = input.readLine();
            System.out.print("Masukkan Harga        : ");
            int harga = Integer.parseInt(input.readLine());
            System.out.println("====================================");
            listkrs.add(new kursi(nama,merk,warna,harga, jenis, kodebarang));
            System.out.println("Data berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("=====================================");
            System.out.println("======== MASUKKAN DATA MEJA =========");
            System.out.println("=====================================");
            System.out.print("Masukkan Nama      : ");
            String nama = input.readLine();
            
            System.out.print("Masukkan Merk      : ");
            String merk = input.readLine();
            System.out.print("Masukkan Warna     : ");
            String warna = input.readLine();
            System.out.print("Masukkan Harga     : ");
            int harga = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Made In   : ");
            String madeIn = input.readLine();
            System.out.print("Masukkan Panjang   : ");
            int panjang = Integer.parseInt(input.readLine());
            System.out.println("=====================================");
            listmja.add(new meja(nama,merk, warna, harga, madeIn, panjang));
            System.out.println("Data berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void DISPLAY() throws IOException{
        System.out.println("-------------------------------------");
        System.out.println("            TAMPILKAN DATA           ");
        System.out.println("-------------------------------------");
        System.out.println("1. Kursi");
        System.out.println("2. Meja");
        System.out.println("-------------------------------------");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("=====================================");
            System.out.println("======== TAMPILAN DATA KURSI ========");
            System.out.println("=====================================");
                for(int i = 0; i < listkrs.size();i++){
                    System.out.println("Data Index ke-" + (i+1));
                    System.out.println("Kode Barang :" + listkrs.get(i).getKodebarang());
                    System.out.println("Nama        :" + listkrs.get(i).getNama());
                    System.out.println("Jenis       :" + listkrs.get(i).getJenis());
                    System.out.println("Merk        :" + listkrs.get(i).getMerk());
                    System.out.println("Warna       :" + listkrs.get(i).getWarna());
                    System.out.println("Harga       :" + listkrs.get(i).getHarga());
                }
                System.out.println("=====================================");

        }else if(pil == 2){
            System.out.println("====================================");
            System.out.println("======== TAMPILAN DATA Meja ========");
            System.out.println("=====================================");
                for(int i = 0; i < listmja.size();i++){
                    System.out.println("Data Index ke-" + (i+1));
                    System.out.println("Nama     :" + listmja.get(i).getNama());
                    System.out.println("Merk     :" + listmja.get(i).getMerk());
                    System.out.println("Warna    :" + listmja.get(i).getWarna());
                    System.out.println("Made In  :" + listmja.get(i).getMadeIn());
                    System.out.println("Panjang  :" + listmja.get(i).getPanjang() + " m");
                    System.out.println("Harga    : Rp." + listmja.get(i).getHarga());
                }
                System.out.println("=====================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void EDIT() throws IOException{
        System.out.println("-------------------------------------");
        System.out.println("             Jenis Data              ");
        System.out.println("-------------------------------------");
        System.out.println("1. KURSI");
        System.out.println("2. MEJA");
        System.out.println("-------------------------------------");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listkrs.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data kursi yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listkrs.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    kursi krs = listkrs.get(index);
                    System.out.println("Data kursi dengan indeks " + index);
                    System.out.println(krs);
                    System.out.println("-------------------------------------");
                    System.out.println("=== Masukkan Data Kursi Yang Baru ===");
                    System.out.println("-------------------------------------");
                    System.out.print("Kode Barang         : ");
                    krs.setKodebarang(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama   : ");
                    krs.setNama(input.readLine());
                    System.out.print("Masukkan Jenis  : ");
                    krs.setJenis(input.readLine());
                    System.out.print("Masukkan Merk   : ");
                    krs.setMerk(input.readLine());
                    System.out.print("Masukkan Warna  : ");
                    krs.setWarna(input.readLine());
                    System.out.print("Masukkan Harga  : ");
                    krs.setHarga(Integer.parseInt(input.readLine()));
                    System.out.println("=====================================");
                    System.out.println("Data berhasil diubah!!");
                }
            }
        }else if(pil == 2){
            if (listmja.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data meja yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listmja.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    meja mja = listmja.get(index);
                    System.out.println("Data meja dengan indeks " + index);
                    System.out.println(mja);
                    System.out.println("------------------------------------");
                    System.out.println("=== Masukkan data meja yang baru ===");
                    System.out.println("------------------------------------");
                    System.out.print("Masukkan Nama     : ");
                    mja.setNama(input.readLine());
                    System.out.print("Masukkan Merk     : ");
                    mja.setMerk(input.readLine());
                    System.out.print("Masukkan Warna    : ");
                    mja.setWarna(input.readLine());
                    System.out.print("Masukkan Made In  : ");
                    mja.setMadeIn(input.readLine());
                    System.out.print("Masukkan Panjang  : ");
                    mja.setPanjang(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Harga    : ");
                    mja.setHarga(Integer.parseInt(input.readLine()));
                    System.out.println("=====================================");
                    System.out.println("Data berhasil diubah!!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void DELETE() throws IOException{
        System.out.println("-------------------------------------");
        System.out.println("             Jenis Data              ");
        System.out.println("-------------------------------------");
        System.out.println("1. KURSI");
        System.out.println("2. MEJA");
        System.out.println("-------------------------------------");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listkrs.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data kursi yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listkrs.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    kursi krs = listkrs.get(index);
                    listkrs.remove(index);
                    System.out.println("Data kursi dengan indeks " + index + " berhasil dihapus:");
                    System.out.println(krs);
                }
            }
        }else if(pil == 2){
            if (listmja.isEmpty()) {
                System.out.println("Belum yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data meja yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listmja.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    meja mja = listmja.get(index);
                    listmja.remove(index);
                    System.out.println("Data meja dengan indeks " + index + " berhasil dihapus:");
                    System.out.println(mja);
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
    
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("======================================");
        System.out.println("     Pendataan Furniture BaekStarla   ");
        System.out.println("======================================");
        System.out.println("                MENU:");
        System.out.println("           1. ADD Data");
        System.out.println("           2. Display Data");
        System.out.println("           3. Edit Data");
        System.out.println("           4. Delete Data");
        System.out.println("           5. EXIT");
        System.out.println("=====================================");
        System.out.print("Enter Your Choice: ");
        int pilih = Integer.parseInt(input.readLine());
       
        switch(pilih){
            case 1:
                ADD();
                froze();
                break;
            case 2:
                DISPLAY();
                froze();
                break;
            case 3:
                EDIT();
                froze();
                break;
            case 4:
                DELETE();
                froze();
                break;
            case 5:
                System.out.println("Program terhenti");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah");
                froze();
                break;
        }
    }
    }    
}
