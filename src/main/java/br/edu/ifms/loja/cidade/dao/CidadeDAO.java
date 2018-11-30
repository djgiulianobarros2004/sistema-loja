/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author djgiu
 */
public class CidadeDAO extends GenericDAO<Cidade> {

    private EntityManager em;

    public CidadeDAO() {
        super(Cidade.class); //chama o construtor da classe pai
        em = getEntityManager();
    }

    public List<Cidade> listarCidadesPorIdUF(Long idUf) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT c ");
        sb.append("FROM Cidade c ");
        sb.append("WHERE c.uf.id = :idUf");

        return em.createQuery(sb.toString())
                .setParameter("idUf", idUf)
                .getResultList();
    }

}
