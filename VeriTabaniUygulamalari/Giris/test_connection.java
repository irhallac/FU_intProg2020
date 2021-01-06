
import java.sql.*;

public class test_connection {

    public static void main(String[] args) throws SQLException {

        String connectionURL = "jdbc:derby://localhost:1527/sampl_db_1";

        //ConnectionURL, username and password should be specified in getConnection()
        try {

            Connection conn = DriverManager.getConnection(connectionURL, "kullanici", "sifre");
            System.out.println("Bağlantı kuruldu! ");
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Bağlantı Hatası! ");
            ex.printStackTrace();
        }
    }

}