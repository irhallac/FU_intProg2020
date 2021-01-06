SQL 

Structured Query Language

</br></br>

SEQUEL

Structured English Query Language  -  IBM (1970)

</br></br>

MySQL
Microsoft SQL Server
PostgreSQL
SQLite

https://netbeans.org/kb/docs/ide/java-db.html

</br></br>

select * from APP.PRODUCT

select CUSTOMER_ID, NAME, CITY, STATE from APP.CUSTOMER order by CUSTOMER_ID

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
insert into VATANDAS values('Ahmet Akça', 1953, 'Emekli')
insert into VATANDAS values('Şengül Özer', 1990, 'Doktor')

</br></br></br></br>

1- Veri tabanı bağlantısı = Connection
2- İfade oluştur = Statement
3- Sorgu oluştur = Query
4- Sonucu işle = ResultSet
</br></br></br></br>
//1. aşama: bağlantı
Connection conn = DriverManager.getConnection(connectionURL, "kullanici", "sifre");
System.out.println("Bağlantı kuruldu! ");
//2. aşama statement nesnesi
Statement stmt = conn.createStatement();
//3. aşama query: sorgu oluşturma
String sorgu = "select * from VATANDAS";
//4. aşama ResultSet: sonuçların okunması
ResultSet rs = stmt.executeQuery(sorgu);

</br></br>
rs.getString()  method
</br></br></br></br>
ResultSetMetaData object
    ColumnCount
    ColumnName
    ColumnTypeName


</br></br></br></br>
JDBC üzerinden veri ekleme:
</br></br>
insert into VATANDAS values('Hasan Adıyaman', 2009, 'Öğrenci')

</br></br></br></br>
boolean execute(): Her türlü SQL ifadesi

ResultSet executeQuery(): SELECT

int executeUpdate():  INSERT, UPDATE veya DELETE


</br></br></br></br>
Web Uygulaması : JspDbApp

Package com.db

	DbIslemleri.java
		baglan()
	sayfa1.jsp

</br></br>	 
	uyg1.java
		vatandasBilgileri()
	sayfa2.jsp
		musteriBilgileri()
	sayfa3.jsp
