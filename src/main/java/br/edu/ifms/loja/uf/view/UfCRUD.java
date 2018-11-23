/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.uf.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.uf.bo.UfBO;
import br.edu.ifms.loja.uf.datamodel.Uf;
import java.awt.Frame;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author djgiu
 */
public class UfCRUD extends GenericCRUD<Uf> {

    private Uf uf;
    private UfBO ufBO;
    private UfFormulario formularioUf;

    public UfCRUD(Frame parent, boolean modal) {
        super(parent, modal, Uf.class, new String[]{"id", "nome", "sigla", "icms"});
        ufBO = new UfBO();
        carregarTabela();
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(800, 600);
    }

    @Override
    protected JPanel criarFormulario() {
        formularioUf = new UfFormulario();
        return formularioUf;
    }

    @Override
    protected void camposParaObjeto() {
        uf.setNome(formularioUf.getCampoUf().getText());
        uf.setSigla(formularioUf.getCampoSigla().getText());
        uf.setIcms(new BigDecimal(formularioUf.getCampoICMS().getText()));
    }

    @Override
    protected void objetoParaCampos() {
        formularioUf.getCampoUf().setText(uf.getNome());
        formularioUf.getCampoSigla().setText(uf.getSigla());
        if (uf.getIcms() != null) {
            formularioUf.getCampoICMS().setText(uf.getIcms().toString());
        } else {
            formularioUf.getCampoICMS().setText("");
        }
    }

    @Override
    protected void salvar() {
        ufBO.inserir(uf);
    }

    @Override
    protected void editar() {

    }

    @Override
    protected void novo() {
        uf = new Uf();
    }

    @Override
    protected void cancelar() {

    }

    @Override
    protected void excluir() {
        ufBO.remover(uf);
    }

    @Override
    protected List buscar(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Uf> carregarListaParaTabela() {
        return ufBO.listarTodos();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(Uf itemSelecionado) {
        uf = itemSelecionado;
    }

}
