/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.cidade.bo.CidadeBO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.uf.bo.UfBO;
import br.edu.ifms.loja.uf.datamodel.Uf;
import java.awt.Frame;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author djgiu
 */
public class CidadeCRUD extends GenericCRUD<Cidade> {

    private Cidade cidade;
    private CidadeBO cidadeBO;
    private UfBO ufBO;
    private CidadeFormulario formularioCidade;

    public CidadeCRUD(Frame parent, boolean modal) {
        super(parent, modal, Cidade.class, new String[]{"id", "nome", "uf.nome"});

        cidadeBO = new CidadeBO();
        ufBO = new UfBO();
        carregarTabela();
        carregarComboBoxUF();
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(800, 600);
    }

    private void carregarComboBoxUF() {
        List<Uf> ufs = ufBO.listarTodos();
        formularioCidade.carregarComboBoxUF(ufs);
    }

    @Override
    protected JPanel criarFormulario() {
        formularioCidade = new CidadeFormulario();
        return formularioCidade;
    }

    @Override
    protected void camposParaObjeto() {
        cidade.setNome(formularioCidade.getCampoNome().getText());
        cidade.setUf(formularioCidade.getUFSelecionada());
    }

    @Override
    protected void objetoParaCampos() {
        formularioCidade.getCampoNome().setText(cidade.getNome());
        formularioCidade.setUFSelectionada(cidade.getUf());
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
        cidadeBO.remover(cidade);
    }

    @Override
    protected List buscar(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Cidade> carregarListaParaTabela() {
        carregarComboBoxUF();
        return cidadeBO.listarTodasasCidades();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(Cidade itemSelecionado) {
        cidade = itemSelecionado;
    }

}
