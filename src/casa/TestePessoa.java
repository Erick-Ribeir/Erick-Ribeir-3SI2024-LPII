/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author Ras-E
 */
public class TestePessoa {
    public static void main(String[] args) {
                
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Erick Ribeiro";
        pessoa.idade = 31;
        
       pessoa.fazAniversario();
       pessoa.fazAniversario();
       pessoa.fazAniversario();
       pessoa.fazAniversario();
       
        System.out.println("Nome: "+pessoa.nome + " \n Idade: "+ pessoa.idade);
        
      
    }
}
