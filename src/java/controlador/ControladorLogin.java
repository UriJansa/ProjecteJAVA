/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Conexion;
import model.Consultas;

/**
 *
 * @author ojans
 */
@WebServlet(name = "ControladorLogin", urlPatterns = {"/ControladorLogin"})
public class ControladorLogin extends HttpServlet  {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        /**/
        
        Consultas con = new Consultas();
        
        try {
            if(con.Autentication(user, pass)){
                
                response.sendRedirect("principal.jsp");
                
            }else{
                response.sendRedirect("index.jsp");
            }
            
          
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
             /* if(usuario.equals("oriol")&&passwd.equals("1234")){
            //abro sesion
            HttpSession sesion=request.getSession();
            sesion.setAttribute("usuario", usuario);
            response.sendRedirect("principal.jsp");
            // request.setAttribute("usuario", usuario);
            //request.getRequestDispatcher("administracion2.jsp").forward(request,response);
            }*/
            
        }
    
}
