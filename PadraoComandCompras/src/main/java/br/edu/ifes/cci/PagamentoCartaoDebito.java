/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.cci;

/**
 *
 * @author Henrique
 */
public class PagamentoCartaoDebito implements PagamentoInterface{

    @Override
    public void processaCompra() {
        System.out.println("Pagamento realizado via Cartão de Débito");
    }
    
}
