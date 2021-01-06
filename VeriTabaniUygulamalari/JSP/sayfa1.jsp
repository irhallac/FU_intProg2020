<%-- 
    Document   : sayfa1
    Created on : Jan 6, 2021, 3:14:06 PM
    Author     : ibrahim
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.db.DbIslemleri" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Veri tabanı bağlantı testi</h1>
        <%
            //baglanti testi  
            try {
                //KULLANICI
                DbIslemleri db = new DbIslemleri("sampl_db_1", "1527", "kullanici", "sifre");

                //SAMPLE DERBY DB
                //DbIslemleri db = new DbIslemleri("veri_tabani_1", "1527", "app", "app");
                Connection conn = db.baglan();
                out.println("<h3>Bağlantı kuruldu ! <h3>");
                conn.close();
            } catch (Exception e) {
                out.println("<h3>Hata !<h3>");
                e.printStackTrace();
            }
        %>
    </body>
</html>
