
package personeltakipoto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class personelYonetim {
    
    private PreparedStatement islem=null;
    private Connection baglanti=null;
    private ResultSet veridondur=null;
    
    private Veritabani veritabani= new Veritabani();
    private String personelEkleSql = "insert into personel(tckn, ad, soyad, telefon, email, dogumtarihi, baslamatarihi, adlisicilkaydi, askerlikdurumu, kangrubu, terfiid, adres) values(?,?,?,?,?,?,?,?,?,?,?,?)";
    private String personelSilSql = "delete from personel where personelid = ?";
    private String personelGuncelleSql = "update personel set tckn = ?, ad = ?, soyad = ?, telefon = ?, email = ?, dogumtarihi = ?, baslamatarihi = ?, adlisicilkaydi = ?, askerlikdurumu = ?, kangrubu = ?, terfiid = ?, adres = ?  where personelid = ?";
    private String personelVeriListele = "select personel.personelid, personel.tckn, personel.ad, personel.soyad, personel.telefon, personel.email, personel.dogumtarihi, personel.baslamatarihi, personel.adlisicilkaydi, personel.askerlikdurumu, personel.kangrubu, terfi.terfitipi, personel.adres, terfi.terfiid from (personel inner join terfi on personel.terfiid=terfi.terfiid)";
    
    
     public void Ekle(personel personel) {
    
        try {
            
            baglanti = veritabani.baglantiDondur();
            islem = baglanti.prepareStatement(personelEkleSql);
            islem.setString(1, personel.getTckn());
            islem.setString(2, personel.getAd());
            islem.setString(3, personel.getSoyad());
            islem.setString(4, personel.getTelefon());
            islem.setString(5, personel.getEmail());
            islem.setString(6, personel.getDogumtarihi());
            islem.setString(7, personel.getBaslamaTarihi());
            islem.setString(8, personel.getAdlisicilKaydı());
            islem.setString(9, personel.getAskerlikDurumu());
            islem.setString(10, personel.getKangrubu());
            islem.setInt(11, personel.getTerfiid());
            islem.setString(12, personel.getAdres());
            islem.executeUpdate();
            System.out.println("Personel Eklendi");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Sil(int personelId) {
         try {
             if(personelId>=0){
                baglanti = veritabani.baglantiDondur();
                islem = baglanti.prepareStatement(personelSilSql);
                islem.setInt(1, personelId);
                islem.executeUpdate();
                System.out.println("Personel Silindi");
             }           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Guncelle(personel personel) {
    
         try {
             if(personel.getPersonelid()>=0){
                 
                 System.out.println("personel yönetim içindeki personel sınıfı " + personel.getTckn() + " - " + personel.getTerfiid() + " - " + personel.getPersonelid());
                baglanti = veritabani.baglantiDondur();
                islem = baglanti.prepareStatement(personelGuncelleSql);
               
                    islem.setString(1, personel.getTckn());
                    islem.setString(2, personel.getAd());
                    islem.setString(3, personel.getSoyad());
                    islem.setString(4, personel.getTelefon());
                    islem.setString(5, personel.getEmail());
                    islem.setString(6, personel.getDogumtarihi());
                    islem.setString(7, personel.getBaslamaTarihi());
                    islem.setString(8, personel.getAdlisicilKaydı());
                    islem.setString(9, personel.getAskerlikDurumu());
                    islem.setString(10, personel.getKangrubu());
                    islem.setInt(11, personel.getTerfiid());
                    islem.setString(12, personel.getAdres());
                    islem.setInt(13, personel.getPersonelid());
                
                islem.executeUpdate();
                System.out.println("Personel Guncellendi");
                
                //    private String personelGuncelleSql = "update personel set tckn = ?, ad = ?, soyad = ?, telefon = ?, email = ?, dogumtarihi = ?, baslamatarihi = ?, adlisicilkaydi = ?, askerlikdurumu = ?, kangrubu = ?, terfiid = ?, adres = ?  where personelid = ?";

             }           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public DefaultTableModel Listele() {
        
        DefaultTableModel tablo=new DefaultTableModel();
        try {
            baglanti = veritabani.baglantiDondur();
            islem = baglanti.prepareStatement(personelVeriListele);
            veridondur = islem.executeQuery();
            int kolonSayisi = veridondur.getMetaData().getColumnCount();
            
            for(int i=1;i<=kolonSayisi;i++){
                tablo.addColumn(veridondur.getMetaData().getColumnName(i));
            }
             while(veridondur.next()){
              Object[] row=new Object[kolonSayisi];
               for(int i=1;i<=kolonSayisi;i++){
                   row[i-1]=veridondur.getObject(i);
               }
              tablo.addRow(row);
            }
             
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tablo;
    }
    
    
    
    public void arama(){}
    
     public void temizle(personel personel){
        if(personel!=null){
            
           personel.setPersonelid(0);
           personel.setTckn(null);
           personel.setAd(null);
           personel.setSoyad(null);
           personel.setTelefon(null);
           personel.setEmail(null);
           personel.setDogumtarihi(null);
           personel.setBaslamaTarihi(null);
           personel.setAdlisicilKaydı(null);
           personel.setAskerlikDurumu(null);
           personel.setKangrubu(null);
           personel.setAdres(null);
           personel.setTerfiid(0);
        }
    }
    
}
