/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Ras-E
 */
public class Conta {

    /**
     * @param args the command line arguments
     */
   private int numero;
   private String cliente;
   private double saldo;
   private double limete;
   
   
//Construtores 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimete() {
        return limete;
    }

    public void setLimete(double limete) {
        this.limete = limete;
    }
   
   //Metodos
    public void saca(double quantidade){
        this.saldo = this.saldo- quantidade;
    }
    public void deposita(double quantidade){
        this.saldo= this.saldo+ quantidade;
    }
}
