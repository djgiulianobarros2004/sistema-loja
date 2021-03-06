package br.edu.ifms.loja.cliente.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.cliente.bo.ClienteBO;
import br.edu.ifms.loja.cliente.datamodel.Cliente;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class ClienteCRUD extends GenericCRUD<Cliente> {

    private Cliente cliente;
    private ClienteBO clienteBO;
    private ClienteFormulario formularioCliente;

    public ClienteCRUD(Frame parent, boolean modal) {
        super(parent, modal, Cliente.class, new String[]{"id", "nome", "email", "cidade","cidade.uf.sigla:UF"});

        try {
            clienteBO = new ClienteBO();
            carregarTabela();
         
        } catch (SQLException ex) {
            Logger.getLogger(ClienteCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(800, 600);
    }

    @Override
    protected JPanel criarFormulario() {
        formularioCliente = new ClienteFormulario();
        formularioCliente.setVisible(true);
        return formularioCliente;
    }

    @Override
    protected void camposParaObjeto() {
        cliente.setNome(formularioCliente.getCampoNome().getText());
        cliente.setCpf(formularioCliente.getCampoCPF().getText());
        cliente.setEmail(formularioCliente.getCampoEmail().getText());
        cliente.setTelefone(formularioCliente.getCampoTelefone().getText());
        cliente.setRua(formularioCliente.getCampoRua().getText());
        cliente.setNumero(formularioCliente.getCampoNumero().getText());
        cliente.setCidade(formularioCliente.getComboBoxUFCidade().getSelectedCidade());
    }

    @Override
    protected void objetoParaCampos() {
        formularioCliente.getCampoNome().setText(cliente.getNome());
        formularioCliente.getCampoCPF().setText(cliente.getCpf());
        formularioCliente.getCampoEmail().setText(cliente.getEmail());
        formularioCliente.getCampoTelefone().setText(cliente.getTelefone());
        formularioCliente.getCampoRua().setText(cliente.getRua());
        formularioCliente.getCampoNumero().setText(cliente.getNumero());
        formularioCliente.getComboBoxUFCidade().setSelectedCidade(cliente.getCidade());        
    }

    @Override
    protected void salvar() {
        clienteBO.inserir(cliente);
    }

    @Override
    protected void editar() {

    }

    @Override
    protected void novo() {
        cliente = new Cliente();
    }

    @Override
    protected void cancelar() {
        
    }

    @Override
    protected void excluir() {
        clienteBO.remover(cliente.getId());
    }

    @Override
    protected List buscar(String param) {
        return clienteBO.buscarClientePorNomeOuCPF(param);
    }

    @Override
    protected List<Cliente> carregarListaParaTabela() {
        return clienteBO.listarTodos();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(Cliente itemSelecionado) {
        this.cliente = itemSelecionado;
    }
}
