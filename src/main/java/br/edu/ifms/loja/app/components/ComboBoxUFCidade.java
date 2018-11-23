/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.app.components;

import br.edu.ifms.loja.cidade.bo.CidadeBO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.uf.bo.UfBO;
import br.edu.ifms.loja.uf.datamodel.Uf;
import com.towel.combo.swing.ObjectComboBoxModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author djgiu
 */
public class ComboBoxUFCidade extends javax.swing.JPanel {

    private UfBO ufBO;
    private CidadeBO cidadeBO;
    private ObjectComboBoxModel<Uf> ufModel;
    private ObjectComboBoxModel<Cidade> cidadeModel;

    public ComboBoxUFCidade() throws SQLException {
        initComponents();
        ufBO = new UfBO();
        cidadeBO = new CidadeBO();
        ufModel = new ObjectComboBoxModel<Uf>();
        cidadeModel = new ObjectComboBoxModel<Cidade>();
        comboBoxUF.setModel(ufModel);
        comboBoxCidade.setModel(cidadeModel);
        carregarUFs();
    }

    private void carregarUFs() {
        List<Uf> ufs = ufBO.listarTodos();
        ufModel.setData(ufs);
        cidadeModel.setData(new ArrayList<Cidade>());
        ufModel.setSelectedObject(null);
        cidadeModel.setSelectedObject(null);
        comboBoxUF.updateUI();
    }

    private void carregarCidades(Uf uf) {
        List<Cidade> cidades = cidadeBO.listarCidadesPorIdUF(uf.getId());
        cidadeModel.setData(cidades);
        comboBoxCidade.updateUI();
    }

    public Cidade getSelectedCidade() {
        return cidadeModel.getSelectedObject();
    }

    public void setSelectedCidade(Cidade cidade) {
        carregarUFs();

        if (cidade == null) {
            return;
        }
        
        ufModel.setSelectedObject(cidade.getUf());
        carregarCidades(cidade.getUf());
        cidadeModel.setSelectedObject(cidade);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxUF = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBoxCidade = new javax.swing.JComboBox<>();

        jLabel1.setText("UF:");

        comboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUFActionPerformed(evt);
            }
        });

        jLabel2.setText("Cidade:");

        comboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCidade, 0, 308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(comboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(comboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUFActionPerformed
        Uf uf = ufModel.getSelectedObject();
        if (uf == null) {
            return;
        }
        carregarCidades(uf);
    }//GEN-LAST:event_comboBoxUFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxCidade;
    private javax.swing.JComboBox<String> comboBoxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
