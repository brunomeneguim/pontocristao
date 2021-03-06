package pontocristao.visao;

import java.awt.*;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;
import pontocristao.controle.*;
import pontocristao.modelo.*;
import pontocristao.util.Utilidades;

/**
 *
 * @author Marcondes
 */
public class FrmCadastrarFilme extends javax.swing.JDialog {

    private static Frame frame;
    private ControleFilme controle;
    private Boolean modeloAtualizado = false;
    private java.util.List<Fornecedor> listaFornecedores;
    private java.util.List<TipoFilme> listaTiposFilme;

    public Boolean getModeloAtualizado() {
        return modeloAtualizado;
    }

    public Filme getFilme() {
        return controle.getFilme();
    }

    public FrmCadastrarFilme(java.awt.Frame parent, boolean modal, long id) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);

        txtCodigo.setEnabled(false);
        jcDataCadastro.setEnabled(false);
        
        txtNomeProduto.requestFocus();

        InicializarControle(id);
    }

    public static FrmCadastrarFilme Mostrar(java.awt.Frame parent, long id) {
        frame = parent;
        FrmCadastrarFilme frm = new FrmCadastrarFilme(parent, true, id);
        frm.setVisible(true);
        return frm;
    }

    private void InicializarControle(long id) {
        controle = new ControleFilme();
        
        listaFornecedores = controle.RetornarFornecedores();
        listaTiposFilme = controle.RetornarTiposFilme();
        
        for (Fornecedor fornecedor : listaFornecedores) {
            jComboFornecedor.addItem(RetornarDescricaoFornecedor(fornecedor));
        }
        
        for (TipoFilme tipoFilme : listaTiposFilme) {
            jComboTipoFilme.addItem(RetornarDescricaoTipoFilme(tipoFilme));
        }
        
        jComboFornecedor.setSelectedIndex(-1);
        jComboTipoFilme.setSelectedIndex(-1);
        
        if (id > 0) {
            Exception erro = controle.RecuperarFilme(id);

            if (erro != null) {
                Utilidades.MostrarMensagemErro(erro);
            } else {
                AtualizarCampos();
            }
        }
    }
    
    private String RetornarDescricaoFornecedor(Fornecedor fornecedor) {
        return fornecedor.getId() + " - " + fornecedor.getNomeFantasia() + " - " + fornecedor.getCnpj();
    }
    
    private String RetornarDescricaoTipoFilme(TipoFilme tipoFilme) {
        return tipoFilme.getId() + " - " + tipoFilme.getDescricao();
    }

    private void AtualizarCampos() {
        txtCodigo.setText(String.valueOf(controle.getFilme().getId()));
        txtCodigoBarra.setText(controle.getFilme().getCodigoBarra());
        jcDataCadastro.setDate(controle.getFilme().getDataCadastro());
        txtNomeProduto.setText(controle.getFilme().getNome());
        jspValor.setValue(controle.getFilme().getValorVenda());
        jspQuantidade.setValue(controle.getFilme().getQuantidade());
        jComboFornecedor.setSelectedItem(RetornarDescricaoFornecedor(controle.getFilme().getFornecedor()));
        jComboTipoFilme.setSelectedItem(RetornarDescricaoTipoFilme(controle.getFilme().getTipoFilme()));
        chkLancamento.setSelected(controle.getFilme().getLancamento());
    }

    private void AtualizarModelo() {
        controle.getFilme().setCodigoBarra(txtCodigoBarra.getText());
        controle.getFilme().setNome(txtNomeProduto.getText());
        controle.getFilme().setValorVenda((Double)jspValor.getValue());
        controle.getFilme().setQuantidade((Integer)jspQuantidade.getValue());
        controle.getFilme().setLancamento(chkLancamento.isSelected());
        String descricaoFornecedor = jComboFornecedor.getSelectedItem().toString();
        String descricaoTipoProduto = jComboTipoFilme.getSelectedItem().toString();
        
        for (Fornecedor fornecedor : listaFornecedores) {
            if (RetornarDescricaoFornecedor(fornecedor).equals(descricaoFornecedor)) {
                controle.getFilme().setFornecedor(fornecedor);
            }
        }
        
        for (TipoFilme tipoFilme : listaTiposFilme) {
            if (RetornarDescricaoTipoFilme(tipoFilme).equals(descricaoTipoProduto)) {
                controle.getFilme().setTipoFilme(tipoFilme);
            }
        }
    }

    public Boolean ValidaCampos() {
        Boolean retorno = true;

        if (txtNomeProduto.getText().equals("")
                || jspValor.getValue().toString().equals("")
                || jspQuantidade.getValue().toString().equals("")
                || jComboFornecedor.getSelectedIndex() < 0
                || jComboTipoFilme.getSelectedIndex() < 0) {
            retorno = false;
            JOptionPane.showMessageDialog(null, "Todos os campos em negrito devem estar preenchidos.");
        }

        return retorno;
    }

    @Override
    public void dispose() {
        if (controle != null) {
            controle.Dispose();
        }

        super.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCodigoProduto = new javax.swing.JLabel();
        jspQuantidade = new javax.swing.JSpinner();
        jspValor = new javax.swing.JSpinner();
        BtnCancelar = new javax.swing.JButton();
        jComboFornecedor = new javax.swing.JComboBox<>();
        lFornecedor = new javax.swing.JLabel();
        BtnConfirmar1 = new javax.swing.JButton();
        lTipoProduto = new javax.swing.JLabel();
        jComboTipoFilme = new javax.swing.JComboBox<>();
        lQuantidade = new javax.swing.JLabel();
        lValorVenda = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lNomeProduto = new javax.swing.JLabel();
        jcDataCadastro = new com.toedter.calendar.JDateChooser();
        txtCodigo = new javax.swing.JTextField();
        lDataCadastro = new javax.swing.JLabel();
        txtCodigoBarra = new javax.swing.JFormattedTextField();
        lCodigoBarra = new javax.swing.JLabel();
        chkLancamento = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Filmes");

        lCodigoProduto.setText("Código");

        jspQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jspValor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.1d));

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnCancelar.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        lFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lFornecedor.setText("Fornecedor*");

        BtnConfirmar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnConfirmar.png"))); // NOI18N
        BtnConfirmar1.setText("Confirmar");
        BtnConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmar1ActionPerformed(evt);
            }
        });

        lTipoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lTipoProduto.setText("Tipo do filme*");

        lQuantidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lQuantidade.setText("Quantidade*");

        lValorVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lValorVenda.setText("Valor de Venda*");

        lNomeProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lNomeProduto.setText("Nome*");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setEnabled(false);

        lDataCadastro.setText("Data de Cadastro");

        lCodigoBarra.setText("Código de Barras");

        chkLancamento.setText("Lançamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lCodigoProduto))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lCodigoBarra))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lDataCadastro)
                                        .addComponent(jcDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lNomeProduto)
                                .addComponent(txtNomeProduto))
                            .addComponent(lFornecedor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkLancamento)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lValorVenda)
                            .addComponent(jspValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lQuantidade)
                            .addComponent(jspQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTipoProduto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboTipoFilme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnConfirmar1)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigoProduto)
                    .addComponent(lCodigoBarra)
                    .addComponent(lDataCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValorVenda)
                    .addComponent(lQuantidade)
                    .addComponent(lTipoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboTipoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkLancamento))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConfirmar1)
                    .addComponent(BtnCancelar))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmar1ActionPerformed
        if (ValidaCampos()) {
            AtualizarModelo();

            Exception erro = controle.Salvar();

            if (erro != null) {
                Utilidades.MostrarMensagemErro(erro);
            } else {
                modeloAtualizado = true;
                this.dispose();
            }
        }
    }//GEN-LAST:event_BtnConfirmar1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastrarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadastrarFilme dialog = new FrmCadastrarFilme(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar1;
    private javax.swing.JCheckBox chkLancamento;
    private javax.swing.JComboBox<String> jComboFornecedor;
    private javax.swing.JComboBox<String> jComboTipoFilme;
    private com.toedter.calendar.JDateChooser jcDataCadastro;
    private javax.swing.JSpinner jspQuantidade;
    private javax.swing.JSpinner jspValor;
    private javax.swing.JLabel lCodigoBarra;
    private javax.swing.JLabel lCodigoProduto;
    private javax.swing.JLabel lDataCadastro;
    private javax.swing.JLabel lFornecedor;
    private javax.swing.JLabel lNomeProduto;
    private javax.swing.JLabel lQuantidade;
    private javax.swing.JLabel lTipoProduto;
    private javax.swing.JLabel lValorVenda;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCodigoBarra;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables
}
