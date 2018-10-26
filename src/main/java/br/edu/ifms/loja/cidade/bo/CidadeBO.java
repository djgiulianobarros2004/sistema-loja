/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.bo;

import br.edu.ifms.loja.cidade.dao.CidadeDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import java.sql.SQLException;

/**
 *
 * @author djgiu
 */
public class CidadeBO {

    private CidadeDAO daoCidade;

    public CidadeBO() throws SQLException {
        daoCidade = new CidadeDAO();
    }
    
    public void inserirCidade(Cidade cidade){
        daoCidade.inserirCidade(cidade);
    }

}
