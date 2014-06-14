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
public class CarrinhoDeCompra {
    
    public void adicionaCarrinho(String produto){
        System.out.println("Produto Adicionado "+ produto);
    }
    
    public void removeCarrinho(String produto){
        System.out.println("Produto Removido"+ produto);
    }
}
