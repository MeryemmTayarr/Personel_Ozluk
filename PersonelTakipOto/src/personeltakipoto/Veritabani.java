
package personeltakipoto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Veritabani {

    private String VTkullaniciAdi="dkamod_okuldb";//root
    private String VTparola="-Izj1aM*JxY)";//159951
    private String VTyolu="jdbc:mysql://mucahitonurdiril.com.tr:3306/dkamod_personel?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    public Connection baglantiDondur() throws SQLException{
        return DriverManager.getConnection(VTyolu, VTkullaniciAdi, VTparola);
    }
    
}
