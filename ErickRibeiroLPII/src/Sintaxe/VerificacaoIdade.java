package Sintaxe;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ras-E
 */
public class VerificacaoIdade {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        if (idade > 17){
            System.out.println("Maior de Idade");
        }
        else 
            System.out.println("Menor de idade");
        
       
        
    }
}
