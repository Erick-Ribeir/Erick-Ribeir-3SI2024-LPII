/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Ras-E
 */
public class Casa {
    String cor;
    Porta porta1, porta2, porta3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    public void pinta(String cor){
        cor = cor;
    }
    public int qtdPortasAbertas(){
        int portasAbertas =0;
        
        if(porta1 != null && porta1.estaAberta()){
            portasAbertas++;
        }
        if(porta2 != null && porta2.estaAberta()){
            portasAbertas++;
        }
        if(porta3 != null && porta3.estaAberta()){
            portasAbertas++;
        }
                  
        return portasAbertas;
    }
    
}
