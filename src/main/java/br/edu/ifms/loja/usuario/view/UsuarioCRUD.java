/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.usuario.view;

import br.edu.ifms.loja.app.layouts.GenericCRUD;
import br.edu.ifms.loja.usuario.bo.UsuarioBO;
import br.edu.ifms.loja.usuario.datamodel.Usuario;
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
public class UsuarioCRUD extends GenericCRUD<Usuario> {

    private Usuario usuario;
    private UsuarioBO usuarioBO;
    private UsuarioFormulario formularioUsuario;

    public UsuarioCRUD(Frame parent, boolean modal) {
        super(parent, modal, Usuario.class, new String[]{"id", "nome", "email", "cidade.uf.sigla:UF"});

        try {
            usuarioBO = new UsuarioBO();
            carregarTabela();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(800, 600);
    }

    @Override
    protected JPanel criarFormulario() {
        formularioUsuario = new UsuarioFormulario();
        return formularioUsuario;
    }

    @Override
    protected void camposParaObjeto() {
        usuario.setNome(formularioUsuario.getCampoNome().getText());
        usuario.setCpf(formularioUsuario.getCampoCPF().getText());
        usuario.setEmail(formularioUsuario.getCampoEmail().getText());
        usuario.setSenha(formularioUsuario.getCampoSenha().getName());
        usuario.setPapel(formularioUsuario.getCampoPapel().getText());
        usuario.setBairro(formularioUsuario.getCampoBairro().getText());
        usuario.setRua(formularioUsuario.getCampoRua().getText());
        usuario.setNumero(formularioUsuario.getCampoNumero().getText());
        usuario.setCep(formularioUsuario.getCampoCEP().getText());
        usuario.setCidade(formularioUsuario.getComboBoxUFCidade().getSelectedCidade());
    }

    @Override
    protected void objetoParaCampos() {
        formularioUsuario.getCampoNome().setText(usuario.getNome());
        formularioUsuario.getCampoCPF().setText(usuario.getCpf());
        formularioUsuario.getCampoEmail().setText(usuario.getEmail());
        formularioUsuario.getCampoSenha().setText(usuario.getSenha());
        formularioUsuario.getCampoPapel().setText(usuario.getPapel());
        formularioUsuario.getCampoBairro().setText(usuario.getBairro());
        formularioUsuario.getCampoRua().setText(usuario.getRua());
        formularioUsuario.getCampoNumero().setText(usuario.getNumero());
        formularioUsuario.getCampoCEP().setText(usuario.getCep());
        formularioUsuario.getComboBoxUFCidade().setSelectedCidade(usuario.getCidade());
    }

    @Override
    protected void salvar() {
        usuarioBO.inserir(usuario);
    }

    @Override
    protected void editar() {

    }

    @Override
    protected void novo() {
        usuario = new Usuario();
    }

    @Override
    protected void cancelar() {

    }

    @Override
    protected void excluir() {
        usuarioBO.remover(usuario);
    }

    @Override
    protected List buscar(String param) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected List<Usuario> carregarListaParaTabela() {
        return usuarioBO.listarTodos();
    }

    @Override
    protected void obterItemSelecionadoNaTabela(Usuario itemSelecionado) {
        usuario = itemSelecionado;
    }

}
