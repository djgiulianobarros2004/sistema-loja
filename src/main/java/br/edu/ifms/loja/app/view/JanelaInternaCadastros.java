/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.app.view;

import br.edu.ifms.loja.cidade.view.CidadeCRUD;
import br.edu.ifms.loja.cliente.view.ClienteCRUD;
import br.edu.ifms.loja.fornecedor.view.FornecedorCRUD;
import br.edu.ifms.loja.produto.view.ProdutoCRUD;
import br.edu.ifms.loja.uf.view.UfCRUD;
import br.edu.ifms.loja.usuario.view.UsuarioCRUD;
import javax.swing.JInternalFrame;

/**
 *
 * @author djgiu
 */
public class JanelaInternaCadastros extends javax.swing.JInternalFrame {

    public static JanelaInternaCadastros janelaInternaVendas;

    public JanelaInternaCadastros() {
        initComponents();
        setTitle("Cadastros");
        setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        setClosable(true);
    }

    public static JanelaInternaCadastros getInstance() {
        if (janelaInternaVendas == null) {
            janelaInternaVendas = new JanelaInternaCadastros();
        }
        return janelaInternaVendas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoFornecedores = new javax.swing.JButton();
        botaoUFs = new javax.swing.JButton();
        botaoProdutos = new javax.swing.JButton();
        botaoCidades = new javax.swing.JButton();
        botaoClientes = new javax.swing.JButton();
        botaoUsuarios = new javax.swing.JButton();

        botaoFornecedores.setText("Fornecedores");
        botaoFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFornecedoresActionPerformed(evt);
            }
        });

        botaoUFs.setText("UFs");
        botaoUFs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUFsActionPerformed(evt);
            }
        });

        botaoProdutos.setText("Produtos");
        botaoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutosActionPerformed(evt);
            }
        });

        botaoCidades.setText("Cidades");
        botaoCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCidadesActionPerformed(evt);
            }
        });

        botaoClientes.setText("Clientes");
        botaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClientesActionPerformed(evt);
            }
        });

        botaoUsuarios.setText("Usuarios");
        botaoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoUFs, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botaoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoUFs, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFornecedoresActionPerformed
        FornecedorCRUD cadastroFornecedor = new FornecedorCRUD(null, true);
        cadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_botaoFornecedoresActionPerformed

    private void botaoUFsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUFsActionPerformed
        UfCRUD cadastroUF = new UfCRUD(null, true);
        cadastroUF.setVisible(true);
    }//GEN-LAST:event_botaoUFsActionPerformed

    private void botaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutosActionPerformed
        ProdutoCRUD cadastroProduto = new ProdutoCRUD(null, true);
        cadastroProduto.setVisible(true);
    }//GEN-LAST:event_botaoProdutosActionPerformed

    private void botaoCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCidadesActionPerformed
        CidadeCRUD cadastroCidade = new CidadeCRUD(null, true);
        cadastroCidade.setVisible(true);
    }//GEN-LAST:event_botaoCidadesActionPerformed

    private void botaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClientesActionPerformed
        ClienteCRUD cadastroCliente = new ClienteCRUD(null, true);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_botaoClientesActionPerformed

    private void botaoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUsuariosActionPerformed
        UsuarioCRUD cadastroUsuario = new UsuarioCRUD(null, true);
        cadastroUsuario.setVisible(true);
    }//GEN-LAST:event_botaoUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCidades;
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoFornecedores;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoUFs;
    private javax.swing.JButton botaoUsuarios;
    // End of variables declaration//GEN-END:variables
}
