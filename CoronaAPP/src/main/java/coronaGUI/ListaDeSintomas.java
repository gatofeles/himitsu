/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaGUI;

/**
 *
 * @author gatofeles
 */
public class ListaDeSintomas extends javax.swing.JFrame {

    /**
     * Creates new form ListaDeSintomas
     */
    public ListaDeSintomas() {
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

        jLabel1 = new javax.swing.JLabel();
        sintoma1 = new javax.swing.JCheckBox();
        sintoma2 = new javax.swing.JCheckBox();
        sintoma4 = new javax.swing.JCheckBox();
        sintoma3 = new javax.swing.JCheckBox();
        sintoma5 = new javax.swing.JCheckBox();
        sintoma6 = new javax.swing.JCheckBox();
        textoSintomas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sintoma7 = new javax.swing.JCheckBox();
        sintoma8 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de Sintomas");

        sintoma1.setText("Dor de Cabeça");
        sintoma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintoma1ActionPerformed(evt);
            }
        });

        sintoma2.setText("Febre");
        sintoma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintoma2ActionPerformed(evt);
            }
        });

        sintoma4.setText("Diarréia");

        sintoma3.setText("Falta de ar");
        sintoma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintoma3ActionPerformed(evt);
            }
        });

        sintoma5.setText("Corisa");

        sintoma6.setText("Vômito");
        sintoma6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintoma6ActionPerformed(evt);
            }
        });

        textoSintomas.setText("Selecione um ou mais sintomas");

        jButton1.setText("Cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sintoma7.setText("Tosse");
        sintoma7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintoma7ActionPerformed(evt);
            }
        });

        sintoma8.setText("Espirro");
        sintoma8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintoma8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sintoma3)
                            .addComponent(sintoma4)
                            .addComponent(sintoma6)
                            .addComponent(sintoma5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textoSintomas)
                            .addComponent(sintoma1)
                            .addComponent(sintoma2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sintoma8)
                            .addComponent(sintoma7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(textoSintomas)
                .addGap(18, 18, 18)
                .addComponent(sintoma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sintoma2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sintoma3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma6))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sintoma7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sintoma8)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sintoma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sintoma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sintoma1ActionPerformed

    private void sintoma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sintoma2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sintoma2ActionPerformed

    private void sintoma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sintoma3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sintoma3ActionPerformed

    private void sintoma6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sintoma6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sintoma6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CadastroPaciente cadastroPaciente = new CadastroPaciente();
        cadastroPaciente.setVisible(true);    
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sintoma7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sintoma7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sintoma7ActionPerformed

    private void sintoma8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sintoma8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sintoma8ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaDeSintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeSintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeSintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeSintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeSintomas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox sintoma1;
    private javax.swing.JCheckBox sintoma2;
    private javax.swing.JCheckBox sintoma3;
    private javax.swing.JCheckBox sintoma4;
    private javax.swing.JCheckBox sintoma5;
    private javax.swing.JCheckBox sintoma6;
    private javax.swing.JCheckBox sintoma7;
    private javax.swing.JCheckBox sintoma8;
    private javax.swing.JLabel textoSintomas;
    // End of variables declaration//GEN-END:variables
}
