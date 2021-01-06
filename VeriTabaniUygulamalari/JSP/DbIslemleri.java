package com.db;

import java.sql.*;

/**
 *
 * @author ibrahim
 */
public class DbIslemleri {

    String connectionURL = "jdbc:derby://localhost:";
    String k_adi = "kullanici";
    String sifre = "sifre";

    public DbIslemleri(String db_adi, String port, String k_adi, String sifre) {
        this.connectionURL = connectionURL + port + "/" + db_adi;
        this.k_adi = k_adi;
        this.sifre = sifre;
    }

    public Connection baglan() {
        System.out.println(this.connectionURL);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionURL, k_adi, sifre);
            System.out.println("Bağlantı kuruldu! ");
        } catch (Exception e) {
            System.out.println("Bağlantı Hatası! ");
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) {
        //baglanti testi  
        try {
            //KULLANICI
            DbIslemleri db = new DbIslemleri("sampl_db_1", "1527", "kullanici", "sifre");

            //SAMPLE DERBY DB
            //DbIslemleri db = new DbIslemleri("veri_tabani_1", "1527", "app", "app");
            Connection conn = db.baglan();
            conn.close();
        } catch (Exception e) {
            System.out.println("hata");
        }

    }
}
