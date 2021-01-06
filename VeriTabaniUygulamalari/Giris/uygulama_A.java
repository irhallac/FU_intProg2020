
import java.sql.*;

/**
 *
 * @author ibrahim
 */
//veri tabanı bağlantısı
//verilerin consola yazdırılması
public class uygulama_A {

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

            while (rs.next()) {
                System.out.println(rs.getString("ISIM") + " " + rs.getString(2) + " " + rs.getString(3));
            }


            conn.close();
        } catch (SQLException ex) {
            System.out.println("Bağlantı Hatası! ");
            ex.printStackTrace();
        }
    }
}
