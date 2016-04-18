<%-- 
    Document   : LogAdmin
    Created on : 14-abr-2016, 13:11:40
    Author     : ojans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <h1>Login Admins</h1>
        <div>
            <form action = "ControladorLogin" method="POST">
                <p><input type="text" name="user" id="user"/></p>
                <p><input type="password" name="pass" id="pass"/></p>
                <p><input type="submit" name="Entrar" id="Entrar" value="Entrar"/></p>
                
            </form>
            
            
            
        </div>
        
    </body>
</html>
