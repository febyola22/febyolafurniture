
package furniture;

public class furniture {
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
    
    public void lihatfurniture(){
        System.out.println("Nama        : " + nama );
        System.out.println("Merk        : " + merk );
        System.out.println("Warna       : " + warna );
        System.out.println("Harga       : " + harga );
    }
}
