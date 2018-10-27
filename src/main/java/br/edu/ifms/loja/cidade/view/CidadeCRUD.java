/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.cidade.bo.CidadeBO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author djgiu
 */
public class CidadeCRUD extends GenericCRUD<Cidade> {

    private Cidade cidade;
    private CidadeBO cidadeBO;
    private CidadeFormulario formularioCidade;

    public CidadeCRUD(Frame parent, Boolean modal) {
        super(parent, modal, Cidade.class, new String[]{"id", "nome", "uf"});

        try {
            cidadeBO = new CidadeBO();
            carregarTabela();

        } catch (SQLException ex) {
            Logger.getLogger(CidadeCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(800, 600);
    }

    @Override
    protected JPanel criarFormulario() {
        formularioCidade = new CidadeFormulario();
        formularioCidade.setVisible(true);
        return formularioCidade;
    }

    @Override
    protected void camposParaObjeto() {
        cidade.setNome(formularioCidade.getCampoNome().getText());
    }

    @Override
    protected void objetoParaCampos() {
        formularioCidade.getCampoNome().setText(cidade.getNome());
    }

    @Override
    protected void salvar() {
        cidadeBO.inserir(cidade);
    }

    @Override
    protected void editar() {

    }

    @Override
    protected void novo() {
        cidade = new Cidade();
    }

    @Override
    protected void cancelar() {

    }

    @Override
    protected void excluir() {
        cidadeBO.remover(cidade.getId());
    }

    @Override
    protected List buscar(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Cidade> carregarListaParaTabela() {
        return cidadeBO.listarTodos();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(Cidade itemSelecionado) {
        this.cidade = itemSelecionado;
    }

}
