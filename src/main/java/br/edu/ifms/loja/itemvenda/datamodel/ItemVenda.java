/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.itemvenda.datamodel;

import br.edu.ifms.loja.produto.datamodel.Produto;
import br.edu.ifms.loja.venda.datamodel.Venda;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author djgiu
 */
@Entity(name = "TB_ITEM_VENDA")
public class ItemVenda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private BigDecimal valorVenda;
    private Integer qtdeVenda;
    @ManyToOne
    private Produto produtos;
    @ManyToOne
    private Venda vendas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getQtdeVenda() {
        return qtdeVenda;
    }

    public void setQtdeVenda(Integer qtdeVenda) {
        this.qtdeVenda = qtdeVenda;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public Venda getVendas() {
        return vendas;
    }

    public void setVendas(Venda vendas) {
        this.vendas = vendas;
    }
    
}
