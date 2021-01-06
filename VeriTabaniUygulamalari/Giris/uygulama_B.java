
import java.sql.*;

/**
 *
 * @author ibrahim
 */

//ResultSetMetaData incelenmesi
public class uygulama_B {
        public static void main(String[] args) throws SQLException {

        String connectionURL = "jdbc:derby://localhost:1527/sampl_db_1";

        try {
            Connection conn = DriverManager.getConnection(connectionURL, "kullanici", "sifre");
            System.out.println("Bağlantı kuruldu! ");
            //2. aşama statement nesnesi
            Statement stmt = conn.createStatement();
            //3. aşama query: sorgu oluşturma
            String sorgu = "select * from VATANDAS";
            //4. aşama ResultSet: sonuçların okunması
            ResultSet rs = stmt.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData();
             
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println("-  -  - -  -  - -  -  - -  -  - -  -  - -  -  -");
               String sutun_adi = rsmd.getColumnName(i);
                System.out.println("sutun_adi = " + sutun_adi);
               String sutun_tipi = rsmd.getColumnTypeName(i);
                System.out.println("sutun_tipi = " + sutun_tipi);
            }

            conn.close();
        } catch (SQLException ex) {
            System.out.println("Bağlantı Hatası! ");
            ex.printStackTrace();
        }
    }
}
