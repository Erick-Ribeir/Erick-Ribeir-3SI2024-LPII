/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitosorientacaoobjeto;

/**
 *
 * @author 11067060642
 */
public class Cliente {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String cel;

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
    private String endereco;
    private String servicoContratado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getServicoContratado() {
        return servicoContratado;
    }

    public void setServicoContratado(String servicoContratado) {
        this.servicoContratado = servicoContratado;
    }
    
}
