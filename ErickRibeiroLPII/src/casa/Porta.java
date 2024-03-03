/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Ras-E
 */
public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX, dimensaoY, dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    
    //Metodos 
    
    public void abre(){
       this.aberta = true;
    }
    public void fecha(){
        this.aberta = false;
    }
    public void pintar(String cor){
        this.cor = cor;
    }
    public boolean estaAberta(){
        return this.aberta;
    }
    
}
