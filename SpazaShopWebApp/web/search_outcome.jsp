<%-- 
    Document   : search_outcome
    Created on : 03 Jul 2024, 2:51:58 PM
    Author     : User
--%>


<%@page import="java.util.Base64"%>
<%@page import="za.ac.tut.entities.ProductImage"%>
<%@page import="za.ac.tut.entities.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Outcome Page</title>
    </head>
    <body>
        <h1>Search Outcome</h1>
        <%
            Product product=(Product)request.getAttribute("product");
            ProductImage image=product.getImage();
        %>
        <p>
           
            <br>
            Product name: <%=product.getName()%>
            <br>
            Product price:<%=product.getPrice()%>
            <br>
            Product quantity:<%=product.getQuantity()%>
            <br>
            Product image:
            <%
                if(image != null){
                    String image_name=image.getImg_name();
                    String image_source="data:image/jpg;base64,"+Base64.getEncoder().encodeToString(image.getImg_source());
            %>
            <img src="<%=image_source%>" alt="<%=image_name%>" width="200px" height="200px" />
            <%
                }
            %>
            

        </p>
    </body>
</html>
