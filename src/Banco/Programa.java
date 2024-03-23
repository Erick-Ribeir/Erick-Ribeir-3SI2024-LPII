/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.Scanner;
import java.lang.System;
/**
 *
 * @author Ras-E
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        Conta minhaConta = new Conta();
    minhaConta.setLimite(20000);
    minhaConta.deposita(1000);
    minhaConta.saca(10000);
    
        System.out.println("Saldo minhaConta: "+minhaConta.getSaldo());
    
    Conta outraConta = new Conta();
    
    
    }
}
