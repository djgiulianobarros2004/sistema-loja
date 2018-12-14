/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.itemvenda.bo;

import br.edu.ifms.loja.app.bo.GenericBO;
import br.edu.ifms.loja.itemvenda.dao.ItemVendaDAO;
import br.edu.ifms.loja.itemvenda.datamodel.ItemVenda;

/**
 *
 * @author djgiu
 */
public class ItemVendaBO extends GenericBO<ItemVenda> {

    private ItemVendaDAO daoItemVenda;

    public ItemVendaBO() {
        super(ItemVenda.class);
        daoItemVenda = new ItemVendaDAO();
    }

}
