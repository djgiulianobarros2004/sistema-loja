/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.venda.datamodel;

import br.edu.ifms.loja.cliente.datamodel.Cliente;
import br.edu.ifms.loja.usuario.datamodel.Usuario;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author djgiu
 */
@Entity(name = "TB_VENDA")
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numero;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVenda;
    @ManyToOne
    private Cliente clientes;
    @ManyToOne
    private Usuario usuarios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }
    
}
