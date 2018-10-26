/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.venda.bo;

import br.edu.ifms.loja.venda.dao.VendaDAO;
import br.edu.ifms.loja.venda.datamodel.Venda;

/**
 *
 * @author djgiu
 */
public class VendaBO {

    private VendaDAO daoVenda;

    public VendaBO() {
        daoVenda = new VendaDAO();
    }
    
    public void inserirVenda(Venda venda){
        daoVenda.inserirVenda(venda);
    }
}
