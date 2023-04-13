
package furniture;

public final class kursi extends furniture implements TambahFuniture{
    private String jenis;
    private int kodebarang;
    
    public final String namamebel = "Funiture";
    
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
     public void add(){
        System.out.println("===============================================");
        System.out.println("|  Barang " + this.namamebel + " Telah Berhasil Ditambahkan |");
        System.out.println("===============================================");         
    }
     
    @Override
     public void edit(){
        System.out.println("===============================================");
        System.out.println("Barang " + this.namamebel + " Telah Berhasil Diubah");
        System.out.println("===============================================");    
    }
    
    @Override
    public void delete(){
        System.out.println("===============================================");
        System.out.println("|     Produk " + this.namamebel + " Telah Berhasil Dihapus    |");
        System.out.println("===============================================");    
    }
    
    @Override
    public void furniture(){
       System.out.println("Nama Barang         : " + getNama());
       System.out.println("Merk Barang         : " + getMerk());
       System.out.println("Warna Barang        : " + getWarna());
       System.out.println("Harga Barang        : " + getHarga());
       System.out.println("Jenis               : " + jenis);
       System.out.println("Kode Barang         : " + kodebarang);
       System.out.println("Bahan               : " + Bahan());
       System.out.println("Stok                : " + Stok());
    }
    
    @Override
    public String Bahan(){
        return "Katun";
    }
    
    @Override
    public String Stok(){
        return "5";
    }
}