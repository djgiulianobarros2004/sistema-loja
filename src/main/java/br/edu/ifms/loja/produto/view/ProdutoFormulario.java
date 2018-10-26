/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produto.view;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author djgiu
 */
public class ProdutoFormulario extends javax.swing.JPanel {

    /**
     * Creates new form ProdutoFormulario
     */
    public ProdutoFormulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDescricao = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelQtde = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        campoQtde = new javax.swing.JTextField();
        campoValor = new javax.swing.JTextField();

        labelDescricao.setText("Descrição");

        labelMarca.setText("Marca");

        labelModelo.setText("Modelo");

        labelQtde.setText("Qtde");

        labelValor.setText("Valor");

        campoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescricao)
                    .addComponent(labelQtde)
                    .addComponent(labelMarca)
                    .addComponent(labelModelo)
                    .addComponent(labelValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDescricao)
                    .addComponent(campoMarca)
                    .addComponent(campoModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(campoQtde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(campoValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescricao)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarca)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtde)
                    .addComponent(campoQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValor)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoQtde;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelQtde;
    private javax.swing.JLabel labelValor;
    // End of variables declaration//GEN-END:variables

    public JTextField getCampoDescricao() {
        return campoDescricao;
    }

    public void setCampoDescricao(JTextField campoDescricao) {
        this.campoDescricao = campoDescricao;
    }

    public JTextField getCampoMarca() {
        return campoMarca;
    }

    public void setCampoMarca(JTextField campoMarca) {
        this.campoMarca = campoMarca;
    }

    public JTextField getCampoModelo() {
        return campoModelo;
    }

    public void setCampoModelo(JTextField campoModelo) {
        this.campoModelo = campoModelo;
    }

    public JTextField getCampoQtde() {
        return campoQtde;
    }

    public void setCampoQtde(JTextField campoQtde) {
        this.campoQtde = campoQtde;
    }

    public JTextField getCampoValor() {
        return campoValor;
    }

    public void setCampoValor(JTextField campoValor) {
        this.campoValor = campoValor;
    }

    public JLabel getLabelDescricao() {
        return labelDescricao;
    }

    public void setLabelDescricao(JLabel labelDescricao) {
        this.labelDescricao = labelDescricao;
    }

    public JLabel getLabelMarca() {
        return labelMarca;
    }

    public void setLabelMarca(JLabel labelMarca) {
        this.labelMarca = labelMarca;
    }

    public JLabel getLabelModelo() {
        return labelModelo;
    }

    public void setLabelModelo(JLabel labelModelo) {
        this.labelModelo = labelModelo;
    }

    public JLabel getLabelQtde() {
        return labelQtde;
    }

    public void setLabelQtde(JLabel labelQtde) {
        this.labelQtde = labelQtde;
    }

    public JLabel getLabelValor() {
        return labelValor;
    }

    public void setLabelValor(JLabel labelValor) {
        this.labelValor = labelValor;
    }
    
}