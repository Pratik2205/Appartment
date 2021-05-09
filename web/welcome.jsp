
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: lightblue;
            }    
        </style>
    </head>
    <body>
        <center>
            <%
                response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            %>
            <% 
                if(session.getAttribute("name")==null || session.getAttribute("name")==""){
                
                    response.sendRedirect("login.jsp");
                
                }
                
            %>
            <h1>Welcome<br><%=session.getAttribute("name")%></h1>
            <br><br>
            Contact me:<%=session.getAttribute("mobileno")%>
            <br><br>
            <h2><a href="logout.jsp">Logout</a></h2>
                   
        </center>
    </body>
</html>
