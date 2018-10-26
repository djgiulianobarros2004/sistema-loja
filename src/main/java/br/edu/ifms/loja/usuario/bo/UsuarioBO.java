/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.usuario.bo;

import br.edu.ifms.loja.usuario.dao.UsuarioDAO;
import br.edu.ifms.loja.usuario.datamodel.Usuario;
import java.sql.SQLException;

/**
 *
 * @author djgiu
 */
public class UsuarioBO {

    private UsuarioDAO daoUsuario;

    public UsuarioBO() throws SQLException {
        daoUsuario = new UsuarioDAO();
    }
    
    public void inserirUsuario(Usuario usuario){
        daoUsuario.inserirUsuario(usuario);
    }
}
