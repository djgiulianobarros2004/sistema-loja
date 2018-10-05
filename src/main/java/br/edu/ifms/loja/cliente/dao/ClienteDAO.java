package br.edu.ifms.loja.cliente.dao;

import br.edu.ifms.loja.app.bd.GenericDAO;
import br.edu.ifms.loja.cliente.datamodel.Cliente;
import java.util.List;

public class ClienteDAO extends GenericDAO<Cliente>{
    
    public ClienteDAO() {
        super(Cliente.class);//chama o construtor da classe pai
    }

    public List<Cliente> buscarPorCpf(String cpf) {
        return null;
    }

    public List<Cliente> buscarClientePorNome(String nome) {
        return null;
    }
}
