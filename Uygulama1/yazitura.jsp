<%-- 
    Document   : yazitura
    Created on : Nov 25, 2020, 9:09:35 PM
    Author     : ibrahim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oyun Sayfası</title>
    </head>
    <body>
        <h1>.. Yazı Tura Oyna ...</h1>
        <form action="yazitura.jsp">
            <label for="oyun">Seçimini yap:</label>
            <select name="oyun" id="oyun"> 
                <option value="yazi">YAZI</option>
                <option value="tura">TURA</option>
            </select>
            <input type="submit" value="Oyna!">
            
        </form>
        </br>
        <% 
            String k_tahmin = request.getParameter("oyun");
           
      if(k_tahmin !=null)    {    
           out.println("<b> Seçiminiz: " +k_tahmin + " </b> </br>");
            double b_tahmin = Math.random();
            out.println("<b>" +b_tahmin + "</b>");
            
           //  System.out.println("b_tahmin = " + b_tahmin);
           String b_tahmin_s = "";
           if(b_tahmin < 0.5) //yazi
               b_tahmin_s = "yazi";
           else
               b_tahmin_s = "tura";
           if(k_tahmin.equals(b_tahmin_s)) //kazandı
               out.println("<h2> KAZANDINIZ ! </h2>");
              // System.out.println("kazandı");
           else{
              out.println("<h2> KAYBETTİNİZ ! </h2>");
              %>
              <a href="<%= request.getRequestURI() %>">: ( Yeniden Dene </a>
           <%
           //System.out.println("kaybetti");
           }
           
      }
      else{
          out.println("<h2>Tahmin yapıp, oyna butonuna basın </h2>");
      }
               
         %>
        
    </body>
</html>
