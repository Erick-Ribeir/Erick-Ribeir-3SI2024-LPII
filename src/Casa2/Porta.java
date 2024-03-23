/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa2;

/**
 *
 * @author Ras-E
 */
public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX, dimensaoY, dimensaoZ;
    private int idPorta;
    private static int contPorta;
    
    public Porta(){
        Porta.contPorta = Porta.contPorta+1;
        idPorta = idPorta;
    
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public String getCor() {
        return cor;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public int getIdPorta() {
        return idPorta;
    }

    public static int getContPorta() {
        return contPorta;
    }
    public void abre(){
        this.aberta = true;
    }
    public void fecha(){
        this.aberta = false;
    }
    public void pinta(String cor){
        this.cor = cor;
    }
    public boolean estaAberta(){
        if(this.aberta ==true){
            System.out.println("Porta Aberta");
            return true;
        }else{
            System.out.println("Porta Fechada");
            return false;
        }
        
    }
}
