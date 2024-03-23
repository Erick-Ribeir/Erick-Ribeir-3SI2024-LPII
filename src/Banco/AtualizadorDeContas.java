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
public class AtualizadorDeContas {
   private double saldoTotal = 0;
private double selic;
AtualizadorDeContas(double selic) {
this.selic = selic;
} 
public void roda(Conta c) {
    double saldoAnterior = c.getSaldo();
    c.atualiza(this.selic);
    double saldoFinal = c.getSaldo();
    System.out.println("Saldo anterior: " + saldoAnterior);
    System.out.println("Saldo final: " + saldoFinal);
    saldoTotal += saldoFinal;
}
public double getSaldoTotal() {
    return saldoTotal;
}
}
