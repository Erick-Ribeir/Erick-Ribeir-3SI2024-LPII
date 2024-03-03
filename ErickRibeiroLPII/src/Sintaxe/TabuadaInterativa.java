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
public class TabuadaInterativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        int i = 1;
        
        System.out.println("tabuada do" + numero + ":");
        
        while(i <11){
         int resultado;
         resultado = numero * i;
            System.out.println(numero+" * "+i +"= "+resultado);
            i++;
        }//fim while
        
        
    }
}
