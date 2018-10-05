package br.edu.ifms.loja.app.bd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaDeGerenciadorDeEntidades {

    private static EntityManager em;

    private FabricaDeGerenciadorDeEntidades() {

    }

    public static EntityManager getEntityManager() {
        if (em == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja_dbase_pu");
            em = emf.createEntityManager();
        }

        return em;
    }
}
