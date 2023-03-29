
package furniture;

public class kursi extends furniture {
    private String jenis;
    private int kodebarang;
    
    public kursi(String nama,String merk,String warna, int harga, String jenis, int kodebarang){
        super(nama,merk,warna,harga);
        this.jenis = jenis;
        this.kodebarang = kodebarang;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(int kodebarang) {
        this.kodebarang = kodebarang;
    }
    
    @Override
    public void lihatfurniture(){
        super.lihatfurniture();
        System.out.println("Jenis       : " + jenis);
        System.out.println("Kode Barang : " + kodebarang);
    }
    
    // overloading
    public void lihatfurniture(boolean lihatnama){
        if(lihatnama) lihatfurniture();
        else super.lihatfurniture();
    }
    
}