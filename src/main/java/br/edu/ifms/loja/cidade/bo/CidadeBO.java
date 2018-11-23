/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.bo;

import br.edu.ifms.loja.app.bo.GenericBO;
import br.edu.ifms.loja.cidade.dao.CidadeDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.cliente.datamodel.Cliente;
import java.util.List;

/**
 *
 * @author djgiu
 */
public class CidadeBO extends GenericBO<Cidade> {

    private CidadeDAO daoCidade;

    public CidadeBO() {
        super(Cliente.class);
        daoCidade = new CidadeDAO();
    }

    public List<Cidade> listarCidadesPorIdUF(Long idUF) {
        return daoCidade.listarCidadesPorIdUF(idUF);
    }

    public List<Cidade> listarTodasasCidades() {
        return daoCidade.listarTodasasCidades();
    }

}
