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
public class AdicionaCarrinho implements ComandoInterface{
    CarrinhoDeCompra carrin;
    private String produto;
    
    public AdicionaCarrinho(CarrinhoDeCompra carrin, String produto) {
        this.carrin = carrin;
        this.produto = produto;        
    }

    @Override
    public void execute() {
        carrin.adicionaCarrinho(produto);
    }

    @Override
    public String getProduto() {
        return this.produto;
    }
    
}
