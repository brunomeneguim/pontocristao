package pontocristao.visao;

import pontocristao.teste.PopularBancoTeste;

/**
 *
 * @author Marcondes
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();

        this.setExtendedState(MAXIMIZED_BOTH);
        //PopularBancoTeste.Popular();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnJanelaCliente = new javax.swing.JButton();
        BtnJanelaFornecedor = new javax.swing.JButton();
        BtnJanelaFilme = new javax.swing.JButton();
        BtnJanelaProduto = new javax.swing.JButton();
        BtnJanelaFuncionario = new javax.swing.JButton();
        BtnJanelaContaPagar = new javax.swing.JButton();
        btnTipoProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        BtnJanelaCliente.setText("Clientes");
        BtnJanelaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJanelaClienteActionPerformed(evt);
            }
        });

        BtnJanelaFornecedor.setText("Fornecedores");
        BtnJanelaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJanelaFornecedorActionPerformed(evt);
            }
        });

        BtnJanelaFilme.setText("Filmes");
        BtnJanelaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJanelaFilmeActionPerformed(evt);
            }
        });

        BtnJanelaProduto.setText("Produtos");
        BtnJanelaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJanelaProdutoActionPerformed(evt);
            }
        });

        BtnJanelaFuncionario.setText("Funcionario");
        BtnJanelaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJanelaFuncionarioActionPerformed(evt);
            }
        });

        BtnJanelaContaPagar.setText("Contas a pagar");
        BtnJanelaContaPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJanelaContaPagarActionPerformed(evt);
            }
        });

        btnTipoProduto.setText("Tipo produto");
        btnTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnJanelaFilme)
                    .addComponent(BtnJanelaProduto)
                    .addComponent(BtnJanelaContaPagar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnJanelaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnJanelaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnJanelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnJanelaFuncionario)
                    .addComponent(BtnJanelaFornecedor)
                    .addComponent(BtnJanelaCliente)
                    .addComponent(btnTipoProduto))
                .addGap(35, 35, 35)
                .addComponent(BtnJanelaFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnJanelaProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnJanelaContaPagar)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        BtnJanelaCliente.getAccessibleContext().setAccessibleName("BtnJanelaClientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnJanelaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJanelaClienteActionPerformed
        FrmCliente frmCliente = FrmCliente.Mostrar(this);
    }//GEN-LAST:event_BtnJanelaClienteActionPerformed

    private void BtnJanelaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJanelaFornecedorActionPerformed
        FrmFornecedor frmFornecedor = FrmFornecedor.Mostrar(this);
    }//GEN-LAST:event_BtnJanelaFornecedorActionPerformed

    private void BtnJanelaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJanelaFilmeActionPerformed
        FrmFilme frmFilme = FrmFilme.Mostrar(this);
    }//GEN-LAST:event_BtnJanelaFilmeActionPerformed

    private void BtnJanelaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJanelaProdutoActionPerformed
        FrmProduto frmProduto = FrmProduto.Mostrar(this);
    }//GEN-LAST:event_BtnJanelaProdutoActionPerformed

    private void BtnJanelaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJanelaFuncionarioActionPerformed
        FrmFuncionario frmFuncionario = FrmFuncionario.Mostrar(this);
    }//GEN-LAST:event_BtnJanelaFuncionarioActionPerformed

    private void BtnJanelaContaPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJanelaContaPagarActionPerformed
        FrmContaPagar frmContaPagar = FrmContaPagar.Mostrar(this);
    }//GEN-LAST:event_BtnJanelaContaPagarActionPerformed

    private void btnTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoProdutoActionPerformed
        FrmTipoProduto frm = FrmTipoProduto.Mostrar(this);
    }//GEN-LAST:event_btnTipoProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnJanelaCliente;
    private javax.swing.JButton BtnJanelaContaPagar;
    private javax.swing.JButton BtnJanelaFilme;
    private javax.swing.JButton BtnJanelaFornecedor;
    private javax.swing.JButton BtnJanelaFuncionario;
    private javax.swing.JButton BtnJanelaProduto;
    private javax.swing.JButton btnTipoProduto;
    // End of variables declaration//GEN-END:variables

}
