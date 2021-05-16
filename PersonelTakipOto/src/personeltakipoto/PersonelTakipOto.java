
package personeltakipoto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class PersonelTakipOto {
    
    private static String VTkullanici = "root";
    private static String VTparola = "159951";
    private static String veritabaniyolu = "jdbc:mysql://localhost:3306/personel?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static String ekle = "insert into kullanicilar(kullanici,parola) values(?,?)";

    public static void main(String[] args) throws SQLException {
        
        Connection baglan = DriverManager.getConnection(veritabaniyolu,VTkullanici,VTparola);
        PreparedStatement ps = baglan.prepareStatement(ekle);
        ps.setString(1, "adminsabroid");
        ps.setString(2, "159951");
        ps.executeUpdate();
        System.out.println("VERİ EKLLENDİ");  
    }
}
