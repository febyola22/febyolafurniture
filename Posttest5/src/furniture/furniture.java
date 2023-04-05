
package furniture;

public abstract class furniture {
    private String nama;
    private String merk;
    private String warna;
    private int harga;
    
    public furniture(String nama, String merk, String warna, int harga){
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }


    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void add(){
        System.out.println("Produk Mebel Berhasil Ditambahkan!");      
    }
    
    public void edit(){
        System.out.println("Produk Mebel Berhasil Diubah!"); 
    }
    
    public void delete(){
        System.out.println("Produk toko Berhasil Dihapus!");
    }
    
    //Overloading
    public void toko(String nama, int harga){
        System.out.println("===============================================");
        System.out.println("Data produk dengan nama " + nama);
        System.out.println("Harga Rp." + harga +  "Berhasil ditambahkan");
        System.out.println("===============================================");
    }
    
    //Overloading
    public void toko(String nama){
        System.out.println("===============================================");
        System.out.println("  | Data produk dengan nama " + nama + " telah diubah |");
        System.out.println("===============================================");
    }
    
    //Abstract Method
    public abstract void furniture();
    
}
