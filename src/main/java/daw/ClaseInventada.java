/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
public class ClaseInventada {
    
    private String atributoTexto;
    private int atributoEntero;
    private double atributoDoble;

    
    //añado constructores
    public ClaseInventada(String atributoTexto, int atributoEntero, double atributoDoble) {
        this.atributoTexto = atributoTexto;
        this.atributoEntero = atributoEntero;
        this.atributoDoble = atributoDoble;
    }

    public ClaseInventada() {
    }

    public String getAtributoTexto() {
        return atributoTexto;
    }

    public int getAtributoEntero() {
        return atributoEntero;
    }

    public double getAtributoDoble() {
        return atributoDoble;
    }

    public void setAtributoTexto(String atributoTexto) {
        this.atributoTexto = atributoTexto;
    }

    public void setAtributoEntero(int atributoEntero) {
        this.atributoEntero = atributoEntero;
    }

    public void setAtributoDoble(double atributoDoble) {
        this.atributoDoble = atributoDoble;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClaseInventada{");
        sb.append("atributoTexto=").append(atributoTexto);
        sb.append(", atributoEntero=").append(atributoEntero);
        sb.append(", atributoDoble=").append(atributoDoble);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
