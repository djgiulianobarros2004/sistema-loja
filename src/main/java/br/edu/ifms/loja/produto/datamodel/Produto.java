/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produto.datamodel;

import br.edu.ifms.loja.itemvenda.datamodel.ItemVenda;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
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
@Entity(name = "TB_PRODUTO")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valorVenda;
    private Integer qtdeVenda;
    @ManyToOne
    private Fornecedor fornecedores;
    @ManyToOne
    private ItemVenda itensVendas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Fornecedor getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedor fornecedores) {
        this.fornecedores = fornecedores;
    }

    public ItemVenda getItensVendas() {
        return itensVendas;
    }

    public void setItensVendas(ItemVenda itensVendas) {
        this.itensVendas = itensVendas;
    }
            
}
