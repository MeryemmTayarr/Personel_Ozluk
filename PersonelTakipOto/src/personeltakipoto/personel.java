
package personeltakipoto;
public class personel {

    private int personelid;
    private String tckn;
    private String ad;
    private String soyad;
    private String telefon;
    private String email;
    private String dogumtarihi;
    private String baslamaTarihi;
    private String adlisicilKaydı;
    private String AskerlikDurumu;
    private String kangrubu;
    private int terfiid;
    private String adres;

    public personel(int personelid, String tckn, String ad, String soyad, String telefon, String email, String dogumtarihi, String baslamaTarihi, String adlisicilKaydı, String AskerlikDurumu, String kangrubu, int terfiid, String adres) {
        this.personelid = personelid;
        this.tckn = tckn;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.email = email;
        this.dogumtarihi = dogumtarihi;
        this.baslamaTarihi = baslamaTarihi;
        this.adlisicilKaydı = adlisicilKaydı;
        this.AskerlikDurumu = AskerlikDurumu;
        this.kangrubu = kangrubu;
        this.terfiid = terfiid;
        this.adres = adres;
    }
    
    public personel()
    {
    }

    /**
     * @return the personelid
     */
    public int getPersonelid() {
        return personelid;
    }

    /**
     * @param personelid the personelid to set
     */
    public void setPersonelid(int personelid) {
        this.personelid = personelid;
    }

    /**
     * @return the tckn
     */
    public String getTckn() {
        return tckn;
    }

    /**
     * @param tckn the tckn to set
     */
    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dogumtarihi
     */
    public String getDogumtarihi() {
        return dogumtarihi;
    }

    /**
     * @param dogumtarihi the dogumtarihi to set
     */
    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    /**
     * @return the baslamaTarihi
     */
    public String getBaslamaTarihi() {
        return baslamaTarihi;
    }

    /**
     * @param baslamaTarihi the baslamaTarihi to set
     */
    public void setBaslamaTarihi(String baslamaTarihi) {
        this.baslamaTarihi = baslamaTarihi;
    }

    /**
     * @return the adlisicilKaydı
     */
    public String getAdlisicilKaydı() {
        return adlisicilKaydı;
    }

    /**
     * @param adlisicilKaydı the adlisicilKaydı to set
     */
    public void setAdlisicilKaydı(String adlisicilKaydı) {
        this.adlisicilKaydı = adlisicilKaydı;
    }

    /**
     * @return the AskerlikDurumu
     */
    public String getAskerlikDurumu() {
        return AskerlikDurumu;
    }

    /**
     * @param AskerlikDurumu the AskerlikDurumu to set
     */
    public void setAskerlikDurumu(String AskerlikDurumu) {
        this.AskerlikDurumu = AskerlikDurumu;
    }

    /**
     * @return the kangrubu
     */
    public String getKangrubu() {
        return kangrubu;
    }

    /**
     * @param kangrubu the kangrubu to set
     */
    public void setKangrubu(String kangrubu) {
        this.kangrubu = kangrubu;
    }

    /**
     * @return the terfiid
     */
    public int getTerfiid() {
        return terfiid;
    }

    /**
     * @param terfiid the terfiid to set
     */
    public void setTerfiid(int terfiid) {
        this.terfiid = terfiid;
    }

    /**
     * @return the adres
     */
    public String getAdres() {
        return adres;
    }

    /**
     * @param adres the adres to set
     */
    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
    
}
