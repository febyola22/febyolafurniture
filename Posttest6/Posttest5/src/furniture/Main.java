
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
           
           kursi krs = new kursi(nama,merk,warna,harga, jenis, kodebarang);
           listkrs.add(krs);
           krs.toko(nama, harga);
           krs.add();
           
           
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
           
          meja mja = new meja (nama,merk, warna, harga, madeIn, panjang);
          listmja.add(mja);
           mja.add();
//          Listmja.add(mja);
//          mja.info(nama);1


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
             System.out.println("\n============ List Data Kursi ============");
            if (listkrs.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listkrs.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    listkrs.get(i).furniture();
                    }
                }
                System.out.println("===========================================");

        }else if(pil == 2){
            System.out.println("\n=========== List Data Meja ===========");
            if (listmja.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listmja.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    listmja.get(i).furniture();
                }
            }
                System.out.println("======================================");
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
                for(int i = 0; i < listkrs.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listkrs.get(i).furniture();
                    }
                System.out.print("Masukkan indeks data Kursi yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if(index <= listkrs.size() || index > 0){
                    System.out.println("-------------------------------------");
                    System.out.println("=== Masukkan Data Kursi Yang Baru ===");
                    System.out.println("-------------------------------------");
                    System.out.print("Kode Barang         : ");
                    int kodebarang = Integer.parseInt(input.readLine());
                    
                    System.out.print("Masukkan Nama   : ");
                    String nama = input.readLine();
                    listkrs.get(index-1).setNama(nama);
                    
                    System.out.print("Masukkan Jenis  : ");
                    String jenis = input.readLine();
                    listkrs.get(index-1).setJenis(jenis);
                    
                    System.out.print("Masukkan Merk   : ");
                    String merk = input.readLine();
                    listkrs.get(index-1).setMerk(merk);
                    
                    System.out.print("Masukkan Warna  : ");
                    String warna = input.readLine();
                    listkrs.get(index-1).setWarna(warna);
                    
                    System.out.print("Masukkan Harga  : ");
                     int harga = Integer.parseInt(input.readLine());
                    listkrs.get(index-1).setHarga(harga);
                   
                    listkrs.get(index-1).setKodebarang(kodebarang);
                    listkrs.get(index-1).edit();
                    System.out.println("=====================================");
                }else{
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
            
        }else if(pil == 2){
           if (listmja.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                for(int i = 0; i < listmja.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listkrs.get(i).furniture();
                    }
                System.out.print("Masukkan indeks data meja yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if(index <= listmja.size() || index > 0){
                    System.out.println("------------------------------------");
                    System.out.println("=== Masukkan data meja yang baru ===");
                    System.out.println("------------------------------------");
                    System.out.print("Masukkan Nama     : ");
                    String nama = input.readLine();
                    
                    System.out.print("Masukkan Merk     : ");
                    String merk = input.readLine();
                    
                    System.out.print("Masukkan Warna    : ");
                    String warna = input.readLine();
                    
                    System.out.print("Masukkan Made In  : ");
                    String madeIn = input.readLine();
                    
                    System.out.print("Masukkan Panjang  : ");
                    int panjang = Integer.parseInt(input.readLine());
                    
                    System.out.print("Masukkan Harga    : ");
                    int harga = Integer.parseInt(input.readLine());
                    
                    listmja.get(index-1).setMadeIn(madeIn);
                    listmja.get(index-1).edit();
                    System.out.println("=====================================");
                }else{
                    System.out.println("indeks tidak ditemukan");
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
                for(int i = 0; i < listkrs.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listkrs.get(i).furniture();
                    }
                System.out.print("Masukkan indeks data kursi yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listkrs.size() || index > 0) 
                {
                    listkrs.remove(index-1);
                    System.out.println("Data penduduk dengan indeks " + index + " berhasil dihapus");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (listmja.isEmpty()) {
                System.out.println("Belum yang tersimpan!");
            } else {
                for(int i = 0; i < listmja.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listmja.get(i).furniture();
                    }
                System.out.print("Masukkan indeks data anak yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listmja.size() || index > 0) 
                {
                    listmja.remove(index-1);
                    System.out.println("Data anak dengan indeks " + index + " berhasil dihapus:");
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

