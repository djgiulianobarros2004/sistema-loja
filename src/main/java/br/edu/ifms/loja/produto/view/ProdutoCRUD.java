/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produto.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.produto.bo.ProdutoBO;
import br.edu.ifms.loja.produto.datamodel.Produto;
import java.awt.Frame;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author djgiu
 */
public class ProdutoCRUD extends GenericCRUD<Produto> {

    private Produto produto;
    private ProdutoBO produtoBO;
    private ProdutoFormulario formularioProduto;

    public ProdutoCRUD(Frame parent, boolean modal) {
        super(parent, modal, Produto.class, new String[]{"id", "descricao", "marca", "modelo", "valor", "qtde"});
        try {
            produtoBO = new ProdutoBO();
            carregarTabela();
        } catch (Exception ex) {

        }
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(800, 600);
    }

    @Override
    protected JPanel criarFormulario() {
        formularioProduto = new ProdutoFormulario();
        formularioProduto.setVisible(true);
        return formularioProduto;
    }

    @Override
    protected void camposParaObjeto() {
        produto.setDescricao(formularioProduto.getCampoDescricao().getText());
        produto.setMarca(formularioProduto.getCampoMarca().getText());
        produto.setModelo(formularioProduto.getCampoModelo().getText());
        produto.setValor(new BigDecimal(formularioProduto.getCampoValor().getText()));
        produto.setQtde(new Integer(formularioProduto.getCampoQtde().getText()));
    }

    @Override
    protected void objetoParaCampos() {
        formularioProduto.getCampoDescricao().setText(produto.getDescricao());
        formularioProduto.getCampoMarca().setText(produto.getMarca());
        formularioProduto.getCampoModelo().setText(produto.getModelo());
        if (produto.getValor() != null) {
            formularioProduto.getCampoValor().setText(produto.getValor().toString());
        }else{
            formularioProduto.getCampoValor().setText("");
        }
        if (produto.getQtde() != null) {
            formularioProduto.getCampoQtde().setText(produto.getQtde().toString());
        }else{
            formularioProduto.getCampoQtde().setText("");
        }
    }

    @Override
    protected void salvar() {
        produtoBO.inserir(produto);
    }

    @Override
    protected void editar() {

    }

    @Override
    protected void novo() {
        produto = new Produto();
    }

    @Override
    protected void cancelar() {

    }

    @Override
    protected void excluir() {
        produtoBO.remover(produto);
    }

    @Override
    protected List buscar(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Produto> carregarListaParaTabela() {
        return produtoBO.listarTodos();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(Produto itemSelecionado) {
        this.produto = itemSelecionado;
    }

}
