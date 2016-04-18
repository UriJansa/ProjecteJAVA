/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ojans
 */
public class Admin {
    private int idAdmin;
    private String nomAdmin;
    private String password;
    private String emailAdmin;
          

    public Admin() {
    }

    public Admin(int idAdmin, String nomAdmin, String password, String emailAdmin) {
        this.idAdmin = idAdmin;
        this.nomAdmin = nomAdmin;
        this.password = password;
        this.emailAdmin = emailAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNomAdmin() {
        return nomAdmin;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    
    
    
}


