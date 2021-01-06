<%-- 
    Document   : sayfa1
    Created on : Jan 6, 2021, 3:14:06 PM
    Author     : ibrahim
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.db.uyg1" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
    </head>
    <body>
        <h1>Veri tabanı bağlantı testi</h1>
        <table border="1">
            <tr>
                <td>İSİM </td>
                <td> DOĞUM T.</td>
                <td> MESLEK</td>
            </tr>
            <%
                try {
                    uyg1 u = new uyg1();
                    String icerik = u.vatandasBilgileri();
                    out.println(icerik);
                } catch (Exception e) {
                    out.println("<h3>Hata !<h3>");
                    e.printStackTrace();
                }
            %>
        </table>
    </body>
</html>
