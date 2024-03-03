/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintaxe;

import java.util.Scanner;

/**
 *
 * @author Ras-E
 */
public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        
        System.out.println("Digite a quantidade de alunos");
        int qtdAlunos = entrada.nextInt();
        double notas[] = new double [qtdAlunos];
        
       for(int i = 0;i <qtdAlunos; i++){
           System.out.println("Digite a nota do aluno"+(i+1)+":");
           notas[i]= entrada.nextDouble();
       }//fim for
       
       //calculo media
       
       double somaNotas = 0;
       for(int i=0; i < qtdAlunos; i++){
           somaNotas += notas[i];
       }
       double media = somaNotas/qtdAlunos;
       
        System.out.println("A média das notas é: "+media);
    }//fim for
       
}
