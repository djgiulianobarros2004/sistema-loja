/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.venda.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.venda.datamodel.Venda;

/**
 *
 * @author djgiu
 */
public class VendaDAO extends GenericDAO<Venda> {

    private GenericDAO daoGeneric;

    public VendaDAO() {
        super(Venda.class);
    }

    public void inserirVenda(Venda venda) {
        daoGeneric.inserir(venda);
    }
}
