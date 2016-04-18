<%-- 
    Document   : Registarse
    Created on : 14-abr-2016, 19:16:52
    Author     : ojans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro</h1>
        
        <form action="RegistroCliente" method="POST">
                <p>Nombre</p> 
                <input type="text" name="nombre" id="nombre"/></br>
                
                <p>Apellidos</p>
                <p><input type="text" name="apellidos" id="apellidos"/></p>
                                
                <p>Password</p>
                <p><input type="password" name="pass" id="pass"/></p>
                
                <p>Email</p>
                <p><input type="text" name="email" id="email"/></p>
                
                <p><input type="submit" name="Enviar" id="Enviar" value="Registrate"></p>
                
                
            </form>
    </body>
</html>
