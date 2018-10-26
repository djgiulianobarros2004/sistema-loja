/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedor.view;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gustavo
 */
public class FornecedorFormulario extends javax.swing.JPanel {

    /**
     * Creates new form FormularioFornecedor2
     */
    public FornecedorFormulario() {
        initComponents();
    }

    public JTextField getCampoBairro() {
        return campoBairro;
    }

    public void setCampoBairro(JTextField campoBairro) {
        this.campoBairro = campoBairro;
    }

    public JTextField getCampoCEP() {
        return campoCEP;
    }

    public void setCampoCEP(JTextField campoCEP) {
        this.campoCEP = campoCEP;
    }

    public JTextField getCampoCNPJ() {
        return campoCNPJ;
    }

    public void setCampoCNPJ(JTextField campoCNPJ) {
        this.campoCNPJ = campoCNPJ;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JTextField getCampoNomeFantasia() {
        return campoNomeFantasia;
    }

    public void setCampoNomeFantasia(JTextField campoNomeFantasia) {
        this.campoNomeFantasia = campoNomeFantasia;
    }    

    public JTextField getCampoNumero() {
        return campoNumero;
    }

    public void setCampoNumero(JTextField campoNumero) {
        this.campoNumero = campoNumero;
    }

    public JTextField getCampoRazaoSocial() {
        return campoRazaoSocial;
    }

    public void setCampoRazaoSocial(JTextField campoRazaoSocial) {
        this.campoRazaoSocial = campoRazaoSocial;
    }

    public JTextField getCampoRua() {
        return campoRua;
    }

    public void setCampoRua(JTextField campoRua) {
        this.campoRua = campoRua;
    }

    public JTextField getCampoTelefone() {
        return campoTelefone;
    }

    public void setCampoTelefone(JTextField campoTelefone) {
        this.campoTelefone = campoTelefone;
    }

    public JLabel getLabelBairro() {
        return labelBairro;
    }

    public void setLabelBairro(JLabel labelBairro) {
        this.labelBairro = labelBairro;
    }

    public JLabel getLabelCEP() {
        return labelCEP;
    }

    public void setLabelCEP(JLabel labelCEP) {
        this.labelCEP = labelCEP;
    }

    public JLabel getLabelCNPJ() {
        return labelCNPJ;
    }

    public void setLabelCNPJ(JLabel labelCNPJ) {
        this.labelCNPJ = labelCNPJ;
    }

    public JLabel getLabelEmail() {
        return labelEmail;
    }

    public void setLabelEmail(JLabel labelEmail) {
        this.labelEmail = labelEmail;
    }

    public JLabel getLabelNomeFantasia() {
        return labelNomeFantasia;
    }

    public void setLabelNomeFantasia(JLabel labelNomeFantasia) {
        this.labelNomeFantasia = labelNomeFantasia;
    }  

    public JLabel getLabelNumero() {
        return labelNumero;
    }

    public void setLabelNumero(JLabel labelNumero) {
        this.labelNumero = labelNumero;
    }

    public JLabel getLabelRazaoSocial() {
        return labelRazaoSocial;
    }

    public void setLabelRazaoSocial(JLabel labelRazaoSocial) {
        this.labelRazaoSocial = labelRazaoSocial;
    }

    public JLabel getLabelRua() {
        return labelRua;
    }

    public void setLabelRua(JLabel labelRua) {
        this.labelRua = labelRua;
    }

    public JLabel getLabelTelefone() {
        return labelTelefone;
    }

    public void setLabelTelefone(JLabel labelTelefone) {
        this.labelTelefone = labelTelefone;
    }
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeFantasia = new javax.swing.JLabel();
        campoNomeFantasia = new javax.swing.JTextField();
        labelCNPJ = new javax.swing.JLabel();
        campoCNPJ = new javax.swing.JTextField();
        labelRazaoSocial = new javax.swing.JLabel();
        campoRazaoSocial = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        campoCEP = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        labelRua = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();

        labelNomeFantasia.setText("Nome Fantasia:");

        labelCNPJ.setText("CNPJ:");

        labelRazaoSocial.setText("Razão Social");

        labelTelefone.setText("Telefone");

        labelEmail.setText("e-mail");

        labelCEP.setText("Cep");

        labelBairro.setText("Bairro");

        labelRua.setText("Rua");

        labelNumero.setText("Numero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRazaoSocial)
                    .addComponent(labelNomeFantasia)
                    .addComponent(labelCNPJ)
                    .addComponent(labelTelefone)
                    .addComponent(labelEmail)
                    .addComponent(labelCEP)
                    .addComponent(labelBairro)
                    .addComponent(labelRua)
                    .addComponent(labelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCNPJ)
                    .addComponent(campoNomeFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(campoRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoTelefone)
                    .addComponent(campoEmail)
                    .addComponent(campoCEP)
                    .addComponent(campoBairro)
                    .addComponent(campoRua)
                    .addComponent(campoNumero))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeFantasia)
                    .addComponent(campoNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRazaoSocial)
                    .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCNPJ))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCEP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBairro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCNPJ;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNomeFantasia;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRazaoSocial;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCNPJ;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNomeFantasia;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRazaoSocial;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelTelefone;
    // End of variables declaration//GEN-END:variables
}
