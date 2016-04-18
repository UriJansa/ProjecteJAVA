/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Client;
import model.Consultas;

/**
 *
 * @author ojans
 */


@WebServlet(name = "RegistroCliente", urlPatterns = {"/RegistroCliente"})
public class RegistroCliente extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            
            Consultas con = new Consultas();
        
                Client ai = new Client();

               
                ai.setNomClient(request.getParameter("nombre"));
                ai.setcognomClient(request.getParameter("apellidos"));
                ai.setpassword(request.getParameter("pass"));
                ai.setmailClient(request.getParameter("email"));


                if(con.insertar(ai)) {

                    response.sendRedirect("principal.jsp");

                } else {

                    response.sendRedirect("index.jsp");
                }
            
        } catch (Exception e) {
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    

}
