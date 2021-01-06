package com.db;

import java.sql.*;

/**
 *
 * @author ibrahim
 */
public class uyg1 {

    //vatandas bilgilerini tablosal olarak oluştur
    public String vatandasBilgileri() {
        try {
            //KULLANICI
            DbIslemleri db = new DbIslemleri("sampl_db_1", "1527", "kullanici", "sifre");
            Connection conn = db.baglan();

            //bilgileri html tablo olarak yazdır
            String html_tablo = "";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from VATANDAS");
            while (rs.next()) {
                html_tablo += "<tr>";
                html_tablo += "<td>" + rs.getString("ISIM") + "</td>";
                html_tablo += "<td>" + rs.getString("DOGUM_TARIHI") + "</td>";
                html_tablo += "<td>" + rs.getString("MESLEK") + "</td>";
                html_tablo += "</tr>";
            }
            System.out.println(html_tablo);
            conn.close();
            return html_tablo;
        } catch (Exception e) {
            System.out.println("hata");
            return "";
        }
    }

    //müşteri bilgilerini tablosal olarak oluştur
    public String musteriBilgileri() {
        try {
            //Derby Sample veritabanından al
            DbIslemleri db = new DbIslemleri("veri_tabani_1", "1527", "app", "app");
            Connection conn = db.baglan();

            //bilgileri html tablo olarak yazdır
            String html_tablo = "";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from CUSTOMER");
            while (rs.next()) {
                html_tablo += "<tr>";
                html_tablo += "<td>" + rs.getString(1) + "</td>"; //id
                html_tablo += "<td>" + rs.getString(4) + "</td>"; //isim
                html_tablo += "<td>" + rs.getString(7) + "</td>";  //şehir
                html_tablo += "<td>" + rs.getString(11) + "</td>"; //email
                html_tablo += "</tr>";
            }
            System.out.println(html_tablo);
            conn.close();
            return html_tablo;
        } catch (Exception e) {
            System.out.println("hata");
            return "";
        }
    }

    public static void main(String[] args) {
        //test
        uyg1 u = new uyg1();
        u.vatandasBilgileri();
       // u.musteriBilgileri();
    }
}
