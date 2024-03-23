/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConceitoOrientacaoObjeto;

/**
 *
 * @author Ras-E
 */
public class testeCliente {
    public static void main(String[] args) {
        
        
        Cliente cliente = new Cliente("Erick Ribeiro","Rua Coronel Jacinto, 60, Centro, Machado-MG", "110.670.606-42");
        
        System.out.println("Nome: "+cliente.getNome()+"\nEndereço: "+cliente.getEndereco()+"\nCPF: "+cliente.getCpf());
        
        
        /*this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.Carrinho = carrinho;*/
    }
}
