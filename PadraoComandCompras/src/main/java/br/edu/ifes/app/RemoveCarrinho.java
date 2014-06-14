/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.app;

/**
 *
 * @author Henrique
 */
public class RemoveCarrinho implements ComandoInterface{
    CarrinhoDeCompra carrin;
    private String produto;
    
    public RemoveCarrinho(CarrinhoDeCompra carrin, String produto) {
        this.carrin = carrin;
        this.produto = produto;        
    }
    @Override
    public String getProduto() {
        return this.produto;
    }
    @Override
    public void execute() {
        carrin.removeCarrinho(produto);
    }
    
}
