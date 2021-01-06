/**
 *
 * @author ibrahim
 */
import java.sql.*;
//JDBC veri ekleme (insert)
public class uygulama_C {
            public static void main(String[] args) throws SQLException {

        String connectionURL = "jdbc:derby://localhost:1527/sampl_db_1";

        try {
            Connection conn = DriverManager.getConnection(connectionURL, "kullanici", "sifre");
            System.out.println("Bağlantı kuruldu! ");
            //2. aşama statement nesnesi
            Statement stmt = conn.createStatement();
            //3. aşama query: sorgu oluşturma
            String sorgu = "insert into VATANDAS values('Hasan Adıyaman', 2009, 'Öğrenci')";
            //4. aşama ResultSet: sonuçların okunması
            System.out.println(stmt.executeUpdate(sorgu));
             

            conn.close();
        } catch (SQLException ex) {
            System.out.println("Bağlantı Hatası! ");
            ex.printStackTrace();
        }
    }
}
