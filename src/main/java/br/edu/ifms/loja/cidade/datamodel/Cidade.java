/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.datamodel;

import br.edu.ifms.loja.uf.datamodel.Uf;
import com.towel.el.annotation.Resolvable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author djgiu
 */
@Entity
public class Cidade {    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Resolvable(colName = "id")
    private Long id;
    @Resolvable(colName = "nome")
    private String nome;
    @Resolvable(colName = "uf")
    @ManyToOne
    private Uf uf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return nome;
    }

}
