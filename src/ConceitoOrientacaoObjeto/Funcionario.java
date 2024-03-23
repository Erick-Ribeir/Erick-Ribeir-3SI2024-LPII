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
public class Funcionario {
    private String Nome;
    private String dataNascimento;
    private String cpf;
    private String cel;
    private String end;
    private int chavePix;
    private String areaAtuacao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getChavePix() {
        return chavePix;
    }

    public void setChavePix(int chavePix) {
        this.chavePix = chavePix;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    public Funcionario(String nome, String areAtuacao){
        this.Nome = nome;
        this.areaAtuacao = areAtuacao;
    }
}
