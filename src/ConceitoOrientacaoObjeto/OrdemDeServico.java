/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConceitoOrientacaoObjeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ras-E
 */
public class OrdemDeServico {
    
        private Cliente cliente;
        private Funcionario funcionario;
        private Servico tipoServico;

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public Funcionario getFuncionario() {
            return funcionario;
        }

        public void setFuncionario(Funcionario funcionario) {
            this.funcionario = funcionario;
        }

        public Servico getTipoServico() {
            return tipoServico;
        }

        public void setTipoServico(Servico tipoServico) {
            this.tipoServico = tipoServico;
        }
        
        public OrdemDeServico(Cliente cliente, Funcionario funcionario, Servico TipoServico){
            this.cliente = cliente;
            this.funcionario = funcionario;
            this.tipoServico = tipoServico;
        }
    
}
