<%-- 
    Document   : login
    Created on : Apr 8, 2021, 10:17:28 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
        <style>
              *{
                margin: 0;
                padding: 0;
            }
          
            a{
                text-decoration: none;
                color: darkblue;
            }  
            div.login{
                width: 400px;
                height: 400px;
                position: absolute;
                background-color: aquamarine;
                left: 450px;
            }
            input{
                border: navy;
                width: 250px;
                padding: 12px;
                border-radius: 3px;
            }

            
            
        </style>
    </head>
    <body>
        <div class="login">
        <form action="LoginController" method="post"><br><br>
            Email id:&emsp;
            <input type="email" name="email" placeholder="Enter Email Address"> <br><br>
            Password:&ensp;
            <input type="password" name="password" placeholder="Enter password"><br><br>&emsp;&emsp;
            <input type="submit" name="btn_login" value="Login" style="width: 150px;padding: 12px;"><br><br>
            <h1>You don't have Account?? <a href="reg.jsp">Register here</a>
        </form>
        </div>
        
    </body>
</html>
 