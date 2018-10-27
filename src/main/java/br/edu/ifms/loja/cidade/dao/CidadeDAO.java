/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import java.sql.SQLException;

/**
 *
 * @author djgiu
 */
public class CidadeDAO extends GenericDAO<Cidade> {
   

    public CidadeDAO() throws SQLException {
        super(Cidade.class); //chama o construtor da classe pai
    }

}
