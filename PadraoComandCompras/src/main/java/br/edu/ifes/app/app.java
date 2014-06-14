/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.app;

import br.edu.ifes.cci.PagamentoCartaoDebito;

/**
 *
 * @author Henrique
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarrinhoDeCompra compras = new CarrinhoDeCompra();
        ExecutaComandos listaDeComandos = new ExecutaComandos();
        String produto = "Camisa";
        String produto2 = "Calca";
        double valorTotal = 524.33;
        
        listaDeComandos.adicionaCarinho(new AdicionaCarrinho(compras, produto));
        listaDeComandos.adicionaCarinho(new AdicionaCarrinho(compras, produto2));
        listaDeComandos.remover(produto, new RemoveCarrinho(compras, produto));
        
        
        listaDeComandos.finalizarCarrinho(457.6, new PagamentoCartaoDebito());
        
    }
    
}
