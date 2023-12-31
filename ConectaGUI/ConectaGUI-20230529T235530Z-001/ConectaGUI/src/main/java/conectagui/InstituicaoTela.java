/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conectagui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Trabalho
 */
public class InstituicaoTela extends javax.swing.JFrame {

    private void buscarInstituicoes (){ 
	try{ 
		DAO dao = new DAO(); 
		Instituicao [] instituicoes = dao.obterInstituicoes(); 
		instituicoesComboBox.setModel(new DefaultComboBoxModel<>(instituicoes)); 
	} 
	catch (Exception e){ 
		JOptionPane.showMessageDialog(null, "Instituicoes indisponíveis, tente "
		+ "novamente mais tarde."); 
		e.printStackTrace(); 
	} 
    }
    
    /**
     * Creates new form CursosTela
     */
    public InstituicaoTela() {
        super("Instituicao");
        initComponents();
        buscarInstituicoes();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        instituicoesComboBox = new javax.swing.JComboBox<>();
        idInstituicaoTextField = new javax.swing.JTextField();
        nomeInstituicaoTextField = new javax.swing.JTextField();
        telefoneInstituicaoTextField = new javax.swing.JTextField();
        adicionarInstituicaoButton = new javax.swing.JButton();
        atualizarInstituicaoButton = new javax.swing.JButton();
        removerInstituicaoButton = new javax.swing.JButton();
        cancelarInstituicaoButton = new javax.swing.JButton();
        mostraItensButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instituicoes");
        setFocusCycleRoot(false);

        jPanel1.setBackground(new java.awt.Color(255, 254, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de Instituicoes"));
        jPanel1.setRequestFocusEnabled(false);

        instituicoesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instituicoesComboBoxActionPerformed(evt);
            }
        });

        idInstituicaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("id"));

        nomeInstituicaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("nome"));
        nomeInstituicaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeInstituicaoTextFieldActionPerformed(evt);
            }
        });

        telefoneInstituicaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        adicionarInstituicaoButton.setText("Novo");
        adicionarInstituicaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarInstituicaoButtonActionPerformed(evt);
            }
        });

        atualizarInstituicaoButton.setText("Atualizar");
        atualizarInstituicaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarInstituicaoButtonActionPerformed(evt);
            }
        });

        removerInstituicaoButton.setText("Remover");
        removerInstituicaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerInstituicaoButtonActionPerformed(evt);
            }
        });

        cancelarInstituicaoButton.setText("Cancelar");
        cancelarInstituicaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInstituicaoButtonActionPerformed(evt);
            }
        });

        mostraItensButton.setText("Mostra Instituicoes");
        mostraItensButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraItensButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(instituicoesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idInstituicaoTextField)
                            .addComponent(nomeInstituicaoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(telefoneInstituicaoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(removerInstituicaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelarInstituicaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adicionarInstituicaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(atualizarInstituicaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(mostraItensButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instituicoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idInstituicaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeInstituicaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(telefoneInstituicaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarInstituicaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarInstituicaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarInstituicaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerInstituicaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostraItensButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Gerenciamento de Cursos");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeInstituicaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInstituicaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInstituicaoTextFieldActionPerformed

    private void adicionarInstituicaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarInstituicaoButtonActionPerformed
        String nomeInstituicao = nomeInstituicaoTextField.getText(); 
        String telefoneInstituicao = telefoneInstituicaoTextField.getText(); 
        if (nomeInstituicao == null || nomeInstituicao.length() == 0 || 
                telefoneInstituicao == null || telefoneInstituicao.length() == 0){ 
            JOptionPane.showMessageDialog (null, "Preencha instituicao e telefone"); 
        } 
        else{ 
            try{ 
                int escolha = JOptionPane.showConfirmDialog(null, "Confirmar cadastro" 
                + " de nova instituicao?"); 
                if (escolha == JOptionPane.YES_OPTION){ 
                    Instituicao curso = new Instituicao (nomeInstituicao, telefoneInstituicao); 
                    DAO dao = new DAO(); 
                    dao.inserirInstituicao(curso); 
                    JOptionPane.showMessageDialog(null, "Instituicao cadastrada com" + 
                        "sucesso"); 
                    nomeInstituicaoTextField.setText(""); 
                    telefoneInstituicaoTextField.setText(""); 
                    buscarInstituicoes(); 
                }  
            } 
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Falha técnica, tente mais tarde"); 
                e.printStackTrace(); 
            }
        }
    }//GEN-LAST:event_adicionarInstituicaoButtonActionPerformed

    private void atualizarInstituicaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarInstituicaoButtonActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Atualizar instituicao?"); 
        if (escolha == JOptionPane.YES_OPTION){ 
            try{ 
                int id = Integer.parseInt (idInstituicaoTextField.getText()); 
                String nome = nomeInstituicaoTextField.getText(); 
                String tipo = telefoneInstituicaoTextField.getText(); 
                Instituicao curso = new Instituicao (id, nome, tipo); 
                DAO dao = new DAO(); 
                dao.atualizaInstituicao(curso); 
                JOptionPane.showMessageDialog(null, "Instituicao atualizada com sucesso"); 
                buscarInstituicoes(); 
                idInstituicaoTextField.setText(""); 
                nomeInstituicaoTextField.setText(""); 
                telefoneInstituicaoTextField.setText(""); 
            } 
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente " 
                    + "mais tarde."); 
                e.printStackTrace(); 
            } 
        }   
    }//GEN-LAST:event_atualizarInstituicaoButtonActionPerformed

    private void instituicoesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instituicoesComboBoxActionPerformed
        Instituicao instituicao = (Instituicao) instituicoesComboBox.getSelectedItem(); 
        idInstituicaoTextField.setText(Integer.toString(instituicao.getId())); 
        nomeInstituicaoTextField.setText(instituicao.getNomeInstituicao()); 
        telefoneInstituicaoTextField.setText(instituicao.getTelefone());
    }//GEN-LAST:event_instituicoesComboBoxActionPerformed

    private void removerInstituicaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerInstituicaoButtonActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Remover instituicao?"); 
        if (escolha == JOptionPane.YES_OPTION){ 
            try{ 
                int id = Integer.parseInt (idInstituicaoTextField.getText()); 
                Instituicao curso = new Instituicao (id); 
                DAO dao = new DAO(); 
                dao.removerInstituicao(curso); 
                JOptionPane.showMessageDialog(null, "Instituicao removida com sucesso!"); 
                buscarInstituicoes(); 
                nomeInstituicaoTextField.setText(""); 
                telefoneInstituicaoTextField.setText(""); 
                idInstituicaoTextField.setText(""); 
            } 
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente " 
                    +"mais tarde."); 
                e.printStackTrace(); 
            } 
             
        } 
    }//GEN-LAST:event_removerInstituicaoButtonActionPerformed

    private void cancelarInstituicaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInstituicaoButtonActionPerformed
        DashboardTela dt = new DashboardTela();
        dt.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_cancelarInstituicaoButtonActionPerformed

    private void mostraItensButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraItensButtonActionPerformed
        Instituicao instituicao = (Instituicao) instituicoesComboBox.getSelectedItem();        
        MostraItensInstituicaoTela ac = new MostraItensInstituicaoTela(instituicao);
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostraItensButtonActionPerformed
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InstituicaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstituicaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstituicaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstituicaoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstituicaoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarInstituicaoButton;
    private javax.swing.JButton atualizarInstituicaoButton;
    private javax.swing.JButton cancelarInstituicaoButton;
    private javax.swing.JTextField idInstituicaoTextField;
    private javax.swing.JComboBox<conectagui.Instituicao> instituicoesComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostraItensButton;
    private javax.swing.JTextField nomeInstituicaoTextField;
    private javax.swing.JButton removerInstituicaoButton;
    private javax.swing.JTextField telefoneInstituicaoTextField;
    // End of variables declaration//GEN-END:variables
}
