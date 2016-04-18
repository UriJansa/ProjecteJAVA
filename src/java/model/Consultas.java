package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ojans
 */
public class Consultas {
   
    Conexion micon = new  Conexion(); 
    Connection con = micon.conectar();
    String sSQL = "";
        
    public boolean Autentication (String user, String pass) throws SQLException {
            boolean estado = false;
            try {
            sSQL = "SELECT * FROM client WHERE nomClient=? AND password=?" ;
            PreparedStatement ps = con.prepareStatement(sSQL);
            ps.setString(1, user);
            ps.setString(2, pass);
               
            
            ResultSet rs = ps.executeQuery();
            estado = rs.next();
            }catch (Exception e){
                
                System.out.println(e);

                
            }
        
        return estado;
                
    }
     public boolean AutenticationAdmin (String user, String pass) throws SQLException {
        boolean estado = false;
        
        try {
            sSQL = "SELECT * FROM administrador WHERE emailAdmin=? AND password=?";
            
            PreparedStatement ps = con.prepareStatement(sSQL);
            ps.setString(1, user);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            estado = rs.next();
            
        } catch (Exception e) {
            
            System.out.println(e);
        
        }
             
        return estado;
    }
    
    public void mostrar (ArrayList lista){
        sSQL = "select * from client";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()){
                Client ai = new Client();
                ai.setidClient(rs.getInt("idClient"));
                ai.setnomClient(rs.getString("nomClient"));
                ai.setcognomsClient(rs.getString("cognomClient"));
                lista.add(ai);
            }
        }catch(Exception e){
            
        }
    }
    
        public boolean insertar (Client ai){
                sSQL = "insert into `client`(`nomClient`,`cognomClient`, `password`, `emailClient`) values (?,?,?,?,?)";
                try {
                    PreparedStatement pst = con.prepareStatement(sSQL);
                    pst.setString(1, ai.getnomClient());
                    pst.setString(2, ai.getcognomClient());
                    pst.setString(4, ai.getpassword());
                    pst.setString(5, ai.getemailClient());

                    int n = pst.executeUpdate();
                    return n != 0;
                }catch(Exception e){
                    return false;
                }
        }    
    
}
