/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.app.bd;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Gustavo
 */
public class GenericDAO <T>{
    private EntityManager em;
    private Class clazz;

    public GenericDAO(Class clazz) {
        this.clazz = clazz;
        em = FabricaDeGerenciadorDeEntidades.getEntityManager();
    }
    
    public void inserir(T t){
        em.persist(t);
    }
    
    public void atualizar(T t){
        em.merge(t);
    }
    
    public void remover(Long id){
        T t = buscarPorId(id);
        em.remove(t);
    }
    
    public void remover(T t){
     em.remove(t);
    }
    
    public T buscarPorId(Long id){
        em.find(clazz, id);
        return null;
    }
    
    public List<T> listarTodos(Class clazz){
        return new ArrayList<>();
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
