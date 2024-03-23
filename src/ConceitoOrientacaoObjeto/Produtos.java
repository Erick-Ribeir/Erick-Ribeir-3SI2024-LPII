/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConceitoOrientacaoObjeto;

/**
 *
 * @author 11067060642
 */
public class Produtos {
    String nome;
    int codProduto;
    String descricao;
    String DataValidade;
    double precoCusto;
    double precoVenda;
    int quantidade;
    
    
    //construtores 
    
    public Produtos(String nome, String descricao, int codProduto, int quantidade){
        this.nome = nome;
        this.descricao = descricao;
        this.codProduto = codProduto;
        this.quantidade =  quantidade;
    }

    
    //get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String DataValidade) {
        this.DataValidade = DataValidade;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produtos{" + "nome=" + nome + ", codProduto=" + codProduto + ", descricao=" + descricao + ", quantidade=" + quantidade + '}';
    }
    
    
     
}
