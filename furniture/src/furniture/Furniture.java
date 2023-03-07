package furniture;

import java.util.ArrayList;
import java.util.Scanner;

public class Furniture {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n\n   Pendataan Furniture BaekStarla");
            System.out.println("======================================");
            System.out.println("                MENU:");
            System.out.println("           1. ADD Data");
            System.out.println("           2. Display Data");
            System.out.println("           3. Edit Data");
            System.out.println("           4. Delete Data");
            System.out.println("           5. EXIT");
            System.out.println("=====================================");
            System.out.print("Enter Your Choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Nama Barang: ");
                    String name = scanner.next();
                    System.out.print("Merk Barang: ");
                    String merk = scanner.next();
                    System.out.print("Harga Barang: ");
                    int harga = scanner.nextInt();
                    Item its = new Item(name, merk, harga);
                    items.add(its);
                    System.out.println("Data berhasil ditambahkan.");
                    break;
                case 2:
                    if (items.size() == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        System.out.println("Data:");
                        for (int i = 0; i < items.size(); i++) {
                            Item p = items.get(i);
                            System.out.println("Data ke " + (i+1) + ". " + 
                                               "\nNama Barang : " + p.getName() +
                                               "\nMerk Barang : " + p.getMerk() + " tahun" + 
                                               "\nHarga Barang:" + " Rp. " + p.getHarga() );
                        }
                    }
                    break;
                case 3:
                    if (items.size() == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        System.out.print("Nomor data yang ingin diubah: ");
                        int index = scanner.nextInt();
                        if (index > items.size() || index <= 0) {
                            System.out.println("Nomor data tidak valid.");
                        } else {
                            System.out.print("Masukkan Nama Barang baru: ");
                            String newName = scanner.next();
                            System.out.print("Masukkan Merk Barang baru: ");
                            String newMerk = scanner.next();
                            System.out.print("Masukkan Harga Barang baru: ");
                            int newHarga = scanner.nextInt();
                            Item newItem = new Item(newName, newMerk, newHarga);
                            items.set(index-1, newItem);
                            System.out.println("Data berhasil diubah.");
                        }
                    }
                    break;
                case 4:
                    if (items.size() == 0) {
                        System.out.println("Data masih kosong.");
                    } else {
                        System.out.print("Nomor data yang ingin dihapus: ");
                        int index = scanner.nextInt();
                        if (index > items.size() || index <= 0) {
                            System.out.println("Nomor data tidak valid.");
                        } else {
                            items.remove(index-1);
                            System.out.println("Data berhasil dihapus.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}

class Item {
    private String name;
    private String merk;
    private int harga;
    
    public Item(String name, String merk, int harga) {
        this.name = name;
        this.merk = merk;
        this.harga = harga;
    }
    
    public String getName() {
        return name;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public int getHarga() {
        return harga;
        
    }
    
}
