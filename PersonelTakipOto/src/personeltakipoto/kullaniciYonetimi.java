package personeltakipoto;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class kullaniciYonetimi {

    private PreparedStatement islem=null;
    private Connection baglanti=null;
    private ResultSet veridondur=null;
    
    private Veritabani veritabani= new Veritabani();
    private String kullaniciEkleSql = "insert into kullanicilar(kullanici,parola,gizlisoru,gizlicevap) values(?,?,?,?)";
    private String kullaniciLoginSql = "select id,kullanici,parola,gizlisoru,gizlicevap from kullanicilar where kullanici =? and parola = ?";
    private String kullaniciSilSql = "delete from kullanicilar where id = ?";
    private String kullaniciGuncelleSql = "update kullanicilar set kullanici = ?, parola = ?, gizlisoru = ?, gizlicevap = ? where id = ?";
    private String kullaniciVeriListele = "select id,kullanici,parola,gizlisoru,gizlicevap from kullanicilar";
    
    
    public void Ekle(kullanici kullanici) {
    
        try {
            
            baglanti = veritabani.baglantiDondur();
            islem = baglanti.prepareStatement(kullaniciEkleSql);
            islem.setString(1, kullanici.getKullaniciAdi());
            islem.setString(2, kullanici.getParola());
            islem.setString(3, kullanici.getGizliSoru());
            islem.setString(4, kullanici.getGizliCevap());
            islem.executeUpdate();
            System.out.println("Kullanıcı Eklendi");
           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Sil(int kullaniciId) {
         try {
             if(kullaniciId>=0){
                baglanti = veritabani.baglantiDondur();
                islem = baglanti.prepareStatement(kullaniciSilSql);
                islem.setInt(1, kullaniciId);
                islem.executeUpdate();
                System.out.println("Kullanıcı Silindi");
             }           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Guncelle(kullanici kullanici) {
    
         try {
             if(kullanici.getId()>=0){
                baglanti = veritabani.baglantiDondur();
                islem = baglanti.prepareStatement(kullaniciGuncelleSql);
                islem.setString(1, kullanici.getKullaniciAdi());
                islem.setString(2, kullanici.getParola());
                islem.setString(3, kullanici.getGizliSoru());
                islem.setString(4, kullanici.getGizliCevap());
                islem.setInt(5, kullanici.getId());
                islem.executeUpdate();
                System.out.println("Kullanıcı Guncellendi");
             }           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public DefaultTableModel Listele() {
        
        DefaultTableModel tablo=new DefaultTableModel();
        try {
            baglanti = veritabani.baglantiDondur();
            islem = baglanti.prepareStatement(kullaniciVeriListele);
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
    
    public kullanici LoginKontrol(kullanici kullanici){
        
        try {
            baglanti = veritabani.baglantiDondur();
            islem = baglanti.prepareStatement(kullaniciLoginSql);
            islem.setString(1, kullanici.getKullaniciAdi());
            islem.setString(2, kullanici.getParola());
            veridondur = islem.executeQuery();
            if(veridondur.next())
            {
                while(veridondur.next())
                {
                    kullanici.setId(veridondur.getInt("id"));
                    kullanici.setKullaniciAdi(veridondur.getString("kullanici"));
                    kullanici.setParola(veridondur.getString("parola"));
                    kullanici.setGizliSoru(veridondur.getString("gizlisoru"));
                    kullanici.setGizliCevap(veridondur.getString("gizlicevap"));
                }
            }else{
                    kullanici = null;
            } 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            return kullanici;
    }

    public void temizle(kullanici kullanici){
        if(kullanici!=null){
            kullanici.setId(0);
            kullanici.setKullaniciAdi(null);
            kullanici.setParola(null);
            kullanici.setGizliSoru(null);
            kullanici.setGizliCevap(null);            
        }
    }


}
