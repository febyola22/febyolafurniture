
package furniture;

public final class meja extends furniture {
    private String madeIn;
    private int panjang;
    
    public final String namamebel = "Funiture";
    
    public meja(String nama,String merk,String warna, int harga, String madeIn, int panjang){
        super(nama,merk,warna,harga);
        this.madeIn = madeIn;
        this.panjang = panjang;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    @Override
     public void add(){
        System.out.println("===============================================");
        System.out.println("|  Produk " + this.namamebel + " Berhasil Ditambahkan  |");
        System.out.println("===============================================");        
    }
     
    @Override
     public void edit(){
        System.out.println("===============================================");
        System.out.println("|   Produk " + this.namamebel + " Berhasil Diubah   |");
        System.out.println("===============================================");    
    }
     
    @Override
     public void delete(){
        System.out.println("===============================================");
        System.out.println("|   Produk " + this.namamebel + " Berhasil Dihapus   |");
        System.out.println("===============================================");    
    }
     
    @Override
    public void furniture(){
       System.out.println("Nama Barang         : " + getNama());
       System.out.println("Merk Barang         : " + getMerk());
       System.out.println("Warna Barang        : " + getWarna());
       System.out.println("Harga Barang        : " + getHarga());
       System.out.println("Made In             : " + madeIn);
       System.out.println("Panjang Barang      : " + panjang);
    }
}
