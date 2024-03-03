/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author Ras-E
 */
public class Programa {
    public static void main(String[] args) {
        Produto produto1 =  new Produto();
        Produto produto2 = new Produto();
       
        Cliente cliente1= new Cliente();
        Cliente cliente2= new Cliente();
        
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        
        cliente1.setNomeCliente("Joazinho");
        cliente1.setCpf("111.222.333-44");
        cliente2.setNomeCliente("Sr. Tiaozinho");
        cliente2.setCpf("222.333.444-55");
        
        produto1.setDescricaoProduto("Teclado Mecanico Top");
        produto1.setValorProduto(350.5);
        produto2.setDescricaoProduto("Tela 32' 4k full");
        produto2.setValorProduto(2500.99);
        
        conta1.setIdConta(1);
        conta1.setDataVencimento("Indeterminado");
        conta1.setDataPagamento("03/03/2024");
        conta1.setPro(produto1);
        conta1.setCli(cliente1);
        conta2.setIdConta(2);
        conta2.setDataVencimento("Indeterminado");
        conta2.setDataPagamento("04/03/2024");
        conta2.setPro(produto2);
        conta2.setCli(cliente2);
        
        //informações clientes
        System.out.println("CONTAS PAGAS");
        System.out.println("IDENTIFICADOR:  "+conta1.getIdConta());
        System.out.println("PRODUTO: "+produto1.getDescricaoProduto());        
        System.out.println("CLIENTE: "+cliente1.getNomeCliente()+"  CPF: "+cliente1.getCpf());
        System.out.println("VALOR: R$"+produto1.getValorProduto());
        System.out.println("DATA VENCIMENTO: "+conta1.getDataVencimento());
        System.out.println("DATA PAGAMENTO: "+conta1.getDataPagamento());
        System.out.println("________________________________________________________");
        System.out.println("\nCONTAS PAGAS");
        System.out.println("IDENTIFICADOR:  "+conta2.getIdConta());
        System.out.println("PRODUTO: "+produto2.getDescricaoProduto());        
        System.out.println("CLIENTE: "+cliente2.getNomeCliente()+"  CPF: "+cliente1.getCpf());
        System.out.println("VALOR: R$"+produto2.getValorProduto());
        System.out.println("DATA VENCIMENTO: "+conta2.getDataVencimento());
        System.out.println("DATA PAGAMENTO: "+conta2.getDataPagamento());
    
    }
}
