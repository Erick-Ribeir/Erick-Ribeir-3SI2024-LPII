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
public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Criando um funcionario
       Funcionario funcionario = new Funcionario();
       
       //dados do funcionario
        System.out.println("Nome do Funcionário: " );
        funcionario.setNomeFuncionario(entrada.nextLine());
        System.out.println("Data de Nascimento: ");
        funcionario.setDataNascimento(entrada.nextLine());
        System.out.println("Função: ");
        funcionario.setFunção(entrada.nextLine());
        System.out.println("Data de entrada: ");
        funcionario.setDataEntrada(entrada.nextLine());
        System.out.println("Digite o RG: ");
        funcionario.setRG(entrada.nextLine());
        System.out.println("Digite o CPF:");
        funcionario.setCPF(entrada.nextLine());
        System.out.println("Digite o Salário: R$");
        funcionario.setSalario(entrada.nextDouble());
        System.out.println("Funcionário Ativo? (TRUE se sim),(FALSE para não)");
        funcionario.setAtivo(entrada.nextBoolean());
        
        System.out.println("___________________________________________________________\n\n");
        
        //metodos
        
        funcionario.mostra();
        funcionario.bonifica(500);
        funcionario.mostra();
        
    }
}
