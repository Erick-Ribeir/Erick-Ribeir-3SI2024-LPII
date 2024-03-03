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
public class TestePorta {
    public static void main(String[] args) {
        Porta porta = new Porta();
        
        porta.abre();
        
        porta.pintar("Branco");
        
        porta.setDimensaoX(2.0);
        porta.setDimensaoY(0.8);
        porta.setDimensaoZ(0.05);
        
        //teste de verificação
        
        if(porta.estaAberta()){
            System.out.println("A porta está aberta.");
        }else{
            System.out.println("A porta está fechada.");
        }
        
        porta.fecha();
        
        if (porta.estaAberta()){
            System.out.println("A porta está aberta");
        }else{
            System.out.println("A porta esta fechada");
        }
        
        System.out.println("Cor da porta: "+porta.cor);
    }
   
}
