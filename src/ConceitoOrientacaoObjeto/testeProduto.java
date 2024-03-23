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
public class testeProduto {
    public static void main(String[] args) {
        Produtos cameraIP =  new Produtos("Câmera dome","Imagens de qualidade, Tecnologia Starlight; Evite falsos alarmes com a Inteligência Artificial; Mais qualidade na imagem, menos tráfego na rede; Segurança a toda prova com monitoramento robusto", 3430 , 10 );
    
        System.out.println("Nome: "+cameraIP.nome+"\nDescricao: "+cameraIP.descricao+"\nCodigo do Produto: "+cameraIP.codProduto+"\nQuantidade: "+cameraIP.quantidade);
    }
}
