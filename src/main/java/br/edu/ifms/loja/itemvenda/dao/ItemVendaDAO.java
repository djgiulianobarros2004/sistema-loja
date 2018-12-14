/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.itemvenda.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.itemvenda.datamodel.ItemVenda;

/**
 *
 * @author djgiu
 */
public class ItemVendaDAO extends GenericDAO<ItemVenda> {

    private GenericDAO daoGeneric;

    public ItemVendaDAO() {
        super(ItemVenda.class);
        //chama o construtor da classe pai
    }

}
