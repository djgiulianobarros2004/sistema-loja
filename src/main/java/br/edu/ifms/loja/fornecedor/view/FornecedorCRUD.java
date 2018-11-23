/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedor.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.fornecedor.bo.FornecedorBO;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class FornecedorCRUD extends GenericCRUD<Fornecedor> {

    private Fornecedor fornencedor;
    private FornecedorBO fornecedorBO;
    private FornecedorFormulario formularioFornecedor;

    public FornecedorCRUD(Frame parent, boolean modal) {
        super(parent, modal, Fornecedor.class, new String[]{"id", "nomeFantasia", "cnpj",
            "razaoSocial", "telefone", "email", "cep", "bairro", "rua", "numero", "cidade.uf.sigla:UF"});

        try {
            fornecedorBO = new FornecedorBO();
            carregarTabela();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(800, 600);
    }

    @Override
    protected JPanel criarFormulario() {
        formularioFornecedor = new FornecedorFormulario();
        return formularioFornecedor;
    }

    @Override
    protected void camposParaObjeto() {
        fornencedor.setNomeFantasia(formularioFornecedor.getCampoNomeFantasia().getText());
        fornencedor.setCnpj(formularioFornecedor.getCampoCNPJ().getText());
        fornencedor.setRazaoSocial(formularioFornecedor.getCampoRazaoSocial().getText());
        fornencedor.setTelefone(formularioFornecedor.getCampoTelefone().getText());
        fornencedor.setEmail(formularioFornecedor.getCampoEmail().getText());
        fornencedor.setCep(formularioFornecedor.getCampoCEP().getText());
        fornencedor.setBairro(formularioFornecedor.getCampoBairro().getText());
        fornencedor.setRua(formularioFornecedor.getCampoRua().getText());
        fornencedor.setNumero(formularioFornecedor.getCampoNumero().getText());
        fornencedor.setCidade(formularioFornecedor.getComboboxUFCidade().getSelectedCidade());
    }

    @Override
    protected void objetoParaCampos() {
        formularioFornecedor.getCampoNomeFantasia().setText(fornencedor.getNomeFantasia());
        formularioFornecedor.getCampoCNPJ().setText(fornencedor.getCnpj());
        formularioFornecedor.getCampoRazaoSocial().setText(fornencedor.getRazaoSocial());
        formularioFornecedor.getCampoTelefone().setText(fornencedor.getTelefone());
        formularioFornecedor.getCampoEmail().setText(fornencedor.getEmail());
        formularioFornecedor.getCampoCEP().setText(fornencedor.getCep());
        formularioFornecedor.getCampoBairro().setText(fornencedor.getBairro());
        formularioFornecedor.getCampoRua().setText(fornencedor.getRua());
        formularioFornecedor.getCampoNumero().setText(fornencedor.getNumero());
        formularioFornecedor.getComboboxUFCidade().setSelectedCidade(fornencedor.getCidade());
    }

    @Override
    protected void salvar() {
        fornecedorBO.inserir(fornencedor);
    }

    @Override
    protected void editar() {

    }

    @Override
    protected void novo() {
        fornencedor = new Fornecedor();
    }

    @Override
    protected void cancelar() {

    }

    @Override
    protected void excluir() {
        fornecedorBO.remover(fornencedor);
    }

    @Override
    protected List<Fornecedor> carregarListaParaTabela() {
        return fornecedorBO.listarTodos();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(Fornecedor itemSelecionado) {
        fornencedor = itemSelecionado;
    }

    @Override
    protected List buscar(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
