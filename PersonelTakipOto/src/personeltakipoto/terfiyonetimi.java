
package personeltakipoto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class terfiyonetimi {

     private PreparedStatement islem=null;
    private Connection baglanti=null;
    private ResultSet veridondur=null;
    
    private Veritabani veritabani= new Veritabani();
    private String terfiEkleSql = "insert into terfi(terfitipi) values(?)";
    private String terfiSilSql = "delete from terfi where terfiid = ?";
    private String terfiGuncelleSql = "update terfi set terfitipi = ? where terfiid = ?";
    private String terfiVeriListele = "select terfiid,terfitipi from terfi";
    
    
    
        public void Ekle(terfi terfi) {
    
        try {
            
            baglanti = veritabani.baglantiDondur();
            islem = baglanti.prepareStatement(terfiEkleSql);
            islem.setString(1, terfi.getTerfiTipi());
            islem.executeUpdate();
            System.out.println("Terfi Eklendi");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Sil(int terfiId) {
         try {
             if(terfiId>=0){
                baglanti = veritabani.baglantiDondur();
                islem = baglanti.prepareStatement(terfiSilSql);
                islem.setInt(1, terfiId);
                islem.executeUpdate();
                System.out.println("Terfi Silindi");
             }           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Guncelle(terfi terfi) {
    
         try {
             if(terfi.getTerfiid()>=0){
                baglanti = veritabani.baglantiDondur();
                islem = baglanti.prepareStatement(terfiGuncelleSql);
                islem.setString(1, terfi.getTerfiTipi());
                islem.setInt(2, terfi.getTerfiid());
                islem.executeUpdate();
                System.out.println("Terfi Guncellendi");
             }           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public DefaultTableModel Listele() {
        
        DefaultTableModel tablo=new DefaultTableModel();
        try {
            baglanti = veritabani.baglantiDondur();
            islem = baglanti.prepareStatement(terfiVeriListele);
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
    
    public void temizle(terfi terfi){
        if(terfi!=null){
            terfi.setTerfiid(0);
            terfi.setTerfiTipi(null);
        }
    }

}
