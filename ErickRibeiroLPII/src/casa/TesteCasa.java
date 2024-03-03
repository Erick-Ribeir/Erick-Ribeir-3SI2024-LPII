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
public class TesteCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        
        casa.pinta("Verniz");
        
        casa.porta1 = new Porta();
        casa.porta2 = new Porta();
        casa.porta3 = new Porta();
        
        casa.porta1.fecha();
        casa.porta2.fecha();
        casa.porta3.abre();
        
        //pintar porta
        
        casa.porta1.pintar("Verniz queimado");
        casa.porta2.pintar("Verniz Caramelo");
        casa.porta3.pintar("Verniz Caramelo");
        
        //imprime situação das portas
        System.out.println("Quantidade de portas abertas: "+casa.qtdPortasAbertas());
        System.out.println("Cor da porta1: " +casa.porta1.getCor());
        System.out.println("Cor da porta2: " + casa.porta2.getCor());
        System.out.println("Cor da porta3: " + casa.porta3.getCor());
        

    }
}
