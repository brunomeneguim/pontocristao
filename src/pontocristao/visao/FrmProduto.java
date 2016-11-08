package pontocristao.visao;

import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import pontocristao.controle.*;
import pontocristao.modelo.*;
import pontocristao.util.Utilidades;

/**
 *
 * @author Marcondes
 */
public class FrmProduto extends javax.swing.JDialog {

    private DefaultTableModel modeloTabela;
    private ControleProduto controle = new ControleProduto();
    private static Frame frame;
    private java.util.List<Produto> lista;

    public static FrmProduto Mostrar(java.awt.Frame parent) {
        frame = parent;
        FrmProduto frm = new FrmProduto(parent, true);
        frm.setVisible(true);
        return frm;
    }

    public FrmProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AjustarTabela();

        Rectangle bounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setBounds(bounds);

        txtPesquisar.requestFocus();

        BtnEditar.setEnabled(false);
        BtnExcluir.setEnabled(false);

        Listar();
    }

    private void AjustarTabela() {
        String[] colunas = new String[]{"Nome", "Valor de venda", "Quantidade", "Fornecedor", "Tipo de produto"};
        modeloTabela = new DefaultTableModel(null, colunas) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        jTableLista.setModel(modeloTabela);
        jTableLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jTableLista.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    if (jTableLista.getSelectedRow() >= 0) {
                        BtnEditar.setEnabled(true);
                        BtnExcluir.setEnabled(true);
                    } else {
                        BtnEditar.setEnabled(false);
                        BtnExcluir.setEnabled(false);
                    }
                }
            }
        });
    }

    private void AtualizarTabela(java.util.List<Produto> produtos) {
        while (modeloTabela.getRowCount() > 0) {
            modeloTabela.removeRow(0);
        }

        lista = produtos;

        for (Produto produto : produtos) {
            AdicionarLinha(produto);
        }
    }

    private void AdicionarLinha(Produto produto) {
        modeloTabela.addRow(RetornarNovaLinha(produto));
    }

    private Object[] RetornarNovaLinha(Produto produto) {
        return new Object[]{
            produto.getNome(),
            produto.getValorVenda(),
            produto.getQuantidade(),
            produto.getFornecedor().getNomeFantasia(),
            produto.getTipoProduto().getDescricao()
        };
    }

    public void Listar() {
        try {
            AtualizarTabela(controle.RetornarProdutos());
        } catch (Exception e) {
            Utilidades.MostrarMensagemErro(e);
        }
    }

    public void Listar(String pesquisa) {
        if (pesquisa != null && pesquisa.length() > 0) {
            String[] camposPesquisa = new String[]{"nome", "valorvenda", "quantidade", "Fornecedor.nomeFantasia", "TipoProduto.descricao"};
            AtualizarTabela(controle.RetornarProdutos(camposPesquisa, pesquisa));
        } else {
            Listar();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnNovo = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        BtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");
        setResizable(false);

        BtnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnNovo.png"))); // NOI18N
        BtnNovo.setText("Novo");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnEditar.png"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnExcluir.png"))); // NOI18N
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnPesquisar.png"))); // NOI18N
        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableLista);

        BtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnSair.png"))); // NOI18N
        BtnSair.setText("Sair");
        BtnSair.setPreferredSize(new java.awt.Dimension(139, 65));
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
        FrmCadastrarProduto frm = FrmCadastrarProduto.Mostrar(frame, 0);

        if (frm.getModeloAtualizado()) {
            Produto produto = frm.getProduto();
            AdicionarLinha(produto);
            lista.add(produto);
        }

        controle = new ControleProduto();
    }//GEN-LAST:event_BtnNovoActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null,
                "Deseja sair da lista de produtos? ",
                "Confirmação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                botoes, botoes[0]);
        if (resposta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if (lista != null) {
            int linhaSelecionada = jTableLista.getSelectedRow();
            Produto produto = lista.get(linhaSelecionada);
            FrmCadastrarProduto frm = FrmCadastrarProduto.Mostrar(frame, produto.getId());

            produto = frm.getProduto();

            if (frm.getModeloAtualizado()) {
                modeloTabela.removeRow(linhaSelecionada);
                modeloTabela.insertRow(linhaSelecionada, RetornarNovaLinha(produto));

                controle = new ControleProduto();
            }
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if (lista != null) {

            Boolean podeExcluir = Utilidades.MostrarMensagemPergunta("Confirmação", "Tem certeza que deseja excluir o produto?", false);

            if (podeExcluir) {
                int linhaSelecionada = jTableLista.getSelectedRow();
                Produto produto = lista.get(linhaSelecionada);

                try {
                    controle.Excluir(produto.getId());
                    modeloTabela.removeRow(linhaSelecionada);
                    lista.remove(produto);

                    controle = new ControleProduto();
                } catch (Exception e) {
                    Utilidades.MostrarMensagemErro(e);
                }
            }
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        Listar(txtPesquisar.getText());
    }//GEN-LAST:event_BtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmProduto dialog = new FrmProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnNovo;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
