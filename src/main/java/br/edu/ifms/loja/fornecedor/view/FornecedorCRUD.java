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
    private FornecedorFormulario formularioFornecedor2;

    public FornecedorCRUD(Frame parent, boolean modal) {
        super(parent, modal, Fornecedor.class, new String[]{"id", "nomeFantasia", "cnpj",
            "razaoSocial", "telefone", "email", "cep", "bairro", "rua", "numero"});

        try {
            fornecedorBO = new FornecedorBO();
            carregarTabela();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(900, 800);
    }

    @Override
    protected JPanel criarFormulario() {
        formularioFornecedor2 = new FornecedorFormulario();
        return formularioFornecedor2;
    }

    @Override
    protected void camposParaObjeto() {
        fornencedor.setNomeFantasia(formularioFornecedor2.getCampoNomeFantasia().getText());
        fornencedor.setCnpj(formularioFornecedor2.getCampoCNPJ().getText());
        fornencedor.setRazaoSocial(formularioFornecedor2.getCampoRazaoSocial().getText());
        fornencedor.setTelefone(formularioFornecedor2.getCampoTelefone().getText());
        fornencedor.setEmail(formularioFornecedor2.getCampoEmail().getText());
        fornencedor.setCep(formularioFornecedor2.getCampoCEP().getText());
        fornencedor.setBairro(formularioFornecedor2.getCampoBairro().getText());
        fornencedor.setRua(formularioFornecedor2.getCampoRua().getText());
        fornencedor.setNumero(formularioFornecedor2.getCampoNumero().getText());
    }

    @Override
    protected void objetoParaCampos() {
        formularioFornecedor2.getCampoNomeFantasia().setText(fornencedor.getNomeFantasia());
        formularioFornecedor2.getCampoCNPJ().setText(fornencedor.getCnpj());
        formularioFornecedor2.getCampoRazaoSocial().setText(fornencedor.getRazaoSocial());
        formularioFornecedor2.getCampoTelefone().setText(fornencedor.getTelefone());
        formularioFornecedor2.getCampoEmail().setText(fornencedor.getEmail());
        formularioFornecedor2.getCampoCEP().setText(fornencedor.getCep());
        formularioFornecedor2.getCampoBairro().setText(fornencedor.getBairro());
        formularioFornecedor2.getCampoRua().setText(fornencedor.getRua());
        formularioFornecedor2.getCampoNumero().setText(fornencedor.getNumero());
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
