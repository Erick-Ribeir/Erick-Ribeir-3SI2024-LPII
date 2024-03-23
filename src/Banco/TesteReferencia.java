/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Ras-E
 */
public class TesteReferencia {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        //Cliente cli1= new Cliente();
        //c1.objCliente = cli1;
        c1.objCliente.setNome("Ana");
        //cli1.setNome("Ana");
        c1.deposita(1000);
        
       // System.out.println("Cliente: "+cli1.getNome());
        System.out.println("Saldo conta: R$"+c1.getSaldo());
        System.out.println("Cliente: "+c1.objCliente.getNome());
        
        
    
    
    
    }
}
