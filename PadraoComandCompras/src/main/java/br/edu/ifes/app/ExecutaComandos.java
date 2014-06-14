/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.app;

import br.edu.ifes.cci.PagamentoInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Henrique
 */
public class ExecutaComandos {
    private List<ComandoInterface> listComando = new ArrayList<ComandoInterface>();
    private Random gera = new Random();
    private int idNota = gera.nextInt(10000);

    public void adicionaCarinho(ComandoInterface comando){
        this.listComando.add(comando);
        comando.execute();
    }
    
    public void remover(String peca,ComandoInterface comando){
        comando.execute(); 
        for(ComandoInterface percorreComandos: this.listComando){
            if (percorreComandos.getProduto() == peca){
                this.listComando.remove(percorreComandos);
         }
    }
    }
    /*    public void executa(){
    for(ComandoInterface comando: this.listComando){
    comando.execute();
    }
    }*/
    public void finalizarCarrinho(double valorTotal, PagamentoInterface pagamento){
        System.out.println("\n\n\n\n");
        for(ComandoInterface comando: this.listComando){
            comando.execute();
        }
        System.out.println("Valor Total: "+ valorTotal +" Nota Fiscal: "+ idNota);
    }
}
