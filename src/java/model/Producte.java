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
public class Producte {
    private int idProducte;
    private String nomProducte;
    private String preuProdcute;
    private String tipusProducte;     

    public Producte() {
    }

    public Producte(int idProducte, String nomProducte, String preuProdcute, String tipusProducte) {
        this.idProducte = idProducte;
        this.nomProducte = nomProducte;
        this.preuProdcute = preuProdcute;
        this.tipusProducte = tipusProducte;
    }

    public int getIdProducte() {
        return idProducte;
    }

    public String getNomProducte() {
        return nomProducte;
    }

    public String getPreuProdcute() {
        return preuProdcute;
    }

    public String getTipusProducte() {
        return tipusProducte;
    }

    public void setIdProducte(int idProducte) {
        this.idProducte = idProducte;
    }

    public void setNomProducte(String nomProducte) {
        this.nomProducte = nomProducte;
    }

    public void setPreuProdcute(String preuProdcute) {
        this.preuProdcute = preuProdcute;
    }

    public void setTipusProducte(String tipusProducte) {
        this.tipusProducte = tipusProducte;
    }
    
    
    
    
}
