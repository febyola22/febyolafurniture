
package furniture;

public class furniture {
    private String name;
    private String merk;
    private int harga;
    
    public furniture(String name, String merk, int harga) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }   
}




