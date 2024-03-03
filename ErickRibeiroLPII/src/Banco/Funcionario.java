/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ras-E
 */
public class Funcionario {
    String nomeFuncionario;
    String dataNascimento;
    String função;
    String dataEntrada;
    String RG;
    String CPF;
    int NINS;
    double salario;
    boolean ativo;
    static int ultimoNINS= 000000;
       
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNINS() {
        return NINS;
    }

    public void setNINS(int NINS) {
        this.NINS = NINS;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

   public Funcionario(){
       ultimoNINS++;
       this.NINS = ultimoNINS;
   }
       
    
        //Metodos
    void mostra (){
        System.out.println("Nome do Funcionário: " + this.nomeFuncionario);
        System.out.println("Função: "+this.função);
        System.out.println("CPF: "+this.CPF);
        System.out.println("Salário: "+ this.salario); 
        System.out.println("Idade do Funcionário: "+calculoIdade());
        System.out.println("Tempo de Serviço: "+ CalculoTempoServico());
        System.out.println("___________________________________________________________\n\n");
    }
    
    void bonifica(double aumento){
        this.salario =salario + 500;
    }
   
    public int calculoIdade(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(this.dataNascimento, formatter);
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }
   
    public String CalculoTempoServico(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataEntrada = LocalDate.parse(this.dataEntrada, formatter);
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataEntrada, hoje);
        return periodo.getDays()+ " dias , " +periodo.getMonths()+" meses e " + periodo.getYears()+ " ano(s)";
    }
    
    public void demitir(){
        this.ativo = false;
    }
}
