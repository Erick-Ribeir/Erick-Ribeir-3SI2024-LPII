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
    private int numero;
    private double saldo;
    private double limite;
    private static int totalContas;
    Cliente objCliente = new Cliente();
    private int identificador;

Conta(){
    Conta.totalContas = Conta.totalContas+1;
    identificador = Conta.totalContas;
    System.out.println("(Construindo uma conta!");

}
Conta(double saldo){
    this();
    this.saldo = saldo;
}
Conta(double saldo, double limite, int numero){
    this(saldo);
    this.limite = limite;
    this.numero = numero;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTotalContas(int totalContas) {
        Conta.totalContas = totalContas;
    }
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public boolean saca (double quantidade){
        if (this.getSaldo()>= quantidade){
           this.saldo = this.saldo - quantidade;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }else{
            System.out.println("Saldo insuficiente"+this.getSaldo());
            return false;
        }
    }
    
    protected void deposita(double quantidade) { //método
        this.saldo = this.saldo + quantidade;
    }
    public void transfere(Conta destino, double quantidade) {
            if (this.saca(quantidade)) {
                destino.deposita(quantidade);
            } else {
                System.out.println("Transferência não realizada!");
            }
    }
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }

}
