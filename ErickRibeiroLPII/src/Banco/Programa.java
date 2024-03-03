/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.Scanner;

/**
 *
 * @author Ras-E
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new Conta();
        minhaConta.setCliente("Erick Ribeiro");
        minhaConta.deposita(50000);
        
        //saida
        System.out.println("Saldo atual: R$"+minhaConta.getSaldo());
        System.out.println("Nome Cliente: "+minhaConta.getCliente());
        
        Conta outraConta = new Conta();
        
    }
}
