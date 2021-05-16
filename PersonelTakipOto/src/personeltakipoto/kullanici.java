
package personeltakipoto;

public class kullanici {

    private int id;
    private String kullaniciAdi;
    private String parola;
    private String gizliSoru;
    private String gizliCevap;
    
    public kullanici(){}
    
    public kullanici(int id,String kullaniciAdi,String parola,String gizliSoru,String gizliCevap)
    {
        this.setId(id);
        this.setKullaniciAdi(kullaniciAdi);
        this.setParola(parola);
        this.setGizliSoru(gizliSoru);
        this.setGizliCevap(gizliCevap);
    }
    
    public void setId(int id){
    
        if(id<0){
            this.id=0;
        }
        this.id = id;
    }
    
    public int getId(){
    return this.id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
    public String getGizliSoru() {
        return gizliSoru;
    }

    public void setGizliSoru(String gizliSoru) {
        this.gizliSoru = gizliSoru;
    }

    public String getGizliCevap() {
        return gizliCevap;
    }

    public void setGizliCevap(String gizliCevap) {
        this.gizliCevap = gizliCevap;
    }
    
}
