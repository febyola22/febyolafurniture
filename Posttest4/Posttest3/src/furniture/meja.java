
package furniture;

public class meja extends furniture {
    private String madeIn;
    private int panjang;
    
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
}

