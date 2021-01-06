SQL </br>

Structured Query Language

</br></br>

SEQUEL </br>

Structured English Query Language  -  IBM (1970)

</br></br>

MySQL </br>
Microsoft SQL Server </br>
PostgreSQL </br>
SQLite </br>

https://netbeans.org/kb/docs/ide/java-db.html

</br></br>

select * from APP.PRODUCT </br>

select CUSTOMER_ID, NAME, CITY, STATE from APP.CUSTOMER order by CUSTOMER_ID </br>

</br></br>

DB bağlantı testi

public class test_connection {

    public static void main(String[] args) throws SQLException {

        String connectionURL = "jdbc:derby://localhost: ...";

        //ConnectionURL, username and password should be specified in getConnection()
        try {

            Connection conn = DriverManager.getConnection(connectionURL, "username", "paswd");
            System.out.println("Bağlantı kuruldu! ");
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Bağlantı Hatası! ");
            ex.printStackTrace();
        }
    }

}

</br></br>

Yeni veri tabanı oluşturma
Tablo Ekleme
</br></br>
isim, doğum tarihi, meslek


</br></br>
insert into VATANDAS values('Ahmet Akça', 1953, 'Emekli') </br>
insert into VATANDAS values('Şengül Özer', 1990, 'Doktor') </br>

</br></br>

1- Veri tabanı bağlantısı = Connection </br>
2- İfade oluştur = Statement </br>
3- Sorgu oluştur = Query </br>
4- Sonucu işle = ResultSet </br>
</br></br></br>
//1. aşama: bağlantı</br>
Connection conn = DriverManager.getConnection(connectionURL, "kullanici", "sifre");</br>
System.out.println("Bağlantı kuruldu! ");</br>
//2. aşama statement nesnesi </br>
Statement stmt = conn.createStatement(); </br>
//3. aşama query: sorgu oluşturma </br>
String sorgu = "select * from VATANDAS"; </br>
//4. aşama ResultSet: sonuçların okunması </br>
ResultSet rs = stmt.executeQuery(sorgu); </br>

</br></br>
rs.getString()  method </br>
</br></br></br>
ResultSetMetaData object </br>
    ColumnCount </br>
    ColumnName </br>
    ColumnTypeName </br>


</br></br></br>
JDBC üzerinden veri ekleme:
</br></br>
insert into VATANDAS values('Hasan Adıyaman', 2009, 'Öğrenci')

</br></br></br></br>
boolean execute(): Her türlü SQL ifadesi </br>

ResultSet executeQuery(): SELECT </br>

int executeUpdate():  INSERT, UPDATE veya DELETE </br>


</br></br></br>
Web Uygulaması : JspDbApp

Package com.db </br>

	DbIslemleri.java </br>
		baglan() </br>
	sayfa1.jsp </br>

</br></br>	 
	uyg1.java </br>
		vatandasBilgileri() </br>
	sayfa2.jsp </br>
		musteriBilgileri() </br>
	sayfa3.jsp </br>
