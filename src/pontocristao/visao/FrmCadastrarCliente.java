package pontocristao.visao;

import java.awt.*;
import javax.swing.*;
import pontocristao.util.CepWebService;

/**
 *
 * @author Marcondes
 */
public class FrmCadastrarCliente extends javax.swing.JDialog {

    public FrmCadastrarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        txtNome.requestFocus();
        txtCodigo.setEnabled(false);
        jcDataCadastro.setEnabled(false);
        BtnEditar.setEnabled(false);
        BtnExcluir.setEnabled(false);
        txtCpf.setEnabled(false);
        txtRg.setEnabled(false);
        txtCnpj.setEnabled(false);
        jComboSexo.setEnabled(false);

    }

    private static Frame frame;

    public static FrmCadastrarCliente Mostrar(java.awt.Frame parent) {
        frame = parent;
        FrmCadastrarCliente frmCadastrarCliente = new FrmCadastrarCliente(parent, true);
        frmCadastrarCliente.setVisible(true);
        return frmCadastrarCliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGroupTipoCliente = new javax.swing.ButtonGroup();
        pCadastroCliente = new javax.swing.JPanel();
        pTipoCliente = new javax.swing.JPanel();
        jRadioPessoaJuridica = new javax.swing.JRadioButton();
        jRadioPessoaFisica = new javax.swing.JRadioButton();
        pInformacoesPessoais = new javax.swing.JPanel();
        lDataCadastro = new javax.swing.JLabel();
        lTelefone = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        lSexo = new javax.swing.JLabel();
        lCodigo = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        lNome = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        jComboSexo = new javax.swing.JComboBox<>();
        lRg = new javax.swing.JLabel();
        lDataNascimento = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lCelular = new javax.swing.JLabel();
        lCnpj = new javax.swing.JLabel();
        jcDataNascimento = new com.toedter.calendar.JDateChooser();
        jcDataCadastro = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        jComboEstado = new javax.swing.JComboBox<>();
        txtComplemento = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        lEstado = new javax.swing.JLabel();
        lNumero = new javax.swing.JLabel();
        lRua = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lComplemento = new javax.swing.JLabel();
        lCep = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lBairro = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lCidade = new javax.swing.JLabel();
        BtnConsultarCep = new javax.swing.JButton();
        pCadastroDependente = new javax.swing.JPanel();
        BtnNovo = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDependente = new javax.swing.JTable();
        BtnConfirmar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        pCadastroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pTipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jButtonGroupTipoCliente.add(jRadioPessoaJuridica);
        jRadioPessoaJuridica.setText("Pessoa Jurídica");
        jRadioPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPessoaJuridicaActionPerformed(evt);
            }
        });

        jButtonGroupTipoCliente.add(jRadioPessoaFisica);
        jRadioPessoaFisica.setText("Pessoa Física");
        jRadioPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPessoaFisicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTipoClienteLayout = new javax.swing.GroupLayout(pTipoCliente);
        pTipoCliente.setLayout(pTipoClienteLayout);
        pTipoClienteLayout.setHorizontalGroup(
            pTipoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTipoClienteLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jRadioPessoaFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioPessoaJuridica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pTipoClienteLayout.setVerticalGroup(
            pTipoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTipoClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pTipoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPessoaJuridica)
                    .addComponent(jRadioPessoaFisica))
                .addContainerGap())
        );

        pInformacoesPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        lDataCadastro.setText("Data do Cadastro");

        lTelefone.setText("Telefone");

        lSexo.setText("Sexo");

        lCodigo.setText("Código");

        lCpf.setText("CPF");

        lNome.setText("Nome");

        lEmail.setText("E-mail");

        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));

        lRg.setText("RG");

        lDataNascimento.setText("Data de Nascimento");

        lCelular.setText("Celular");

        lCnpj.setText("CNPJ");

        javax.swing.GroupLayout pInformacoesPessoaisLayout = new javax.swing.GroupLayout(pInformacoesPessoais);
        pInformacoesPessoais.setLayout(pInformacoesPessoaisLayout);
        pInformacoesPessoaisLayout.setHorizontalGroup(
            pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lTelefone)
                                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lCpf))
                                        .addGap(18, 18, 18)
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lCelular)
                                            .addComponent(lRg)
                                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lEmail)
                                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lCnpj))
                                        .addGap(18, 18, 18)
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lSexo)
                                            .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesPessoaisLayout.createSequentialGroup()
                                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCodigo)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNome)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lDataNascimento)
                            .addComponent(jcDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jcDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail)))
                .addContainerGap())
        );
        pInformacoesPessoaisLayout.setVerticalGroup(
            pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(lCodigo)
                    .addComponent(lDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(lRg)
                    .addComponent(lCnpj)
                    .addComponent(lSexo)
                    .addComponent(lDataCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefone)
                    .addComponent(lCelular)
                    .addComponent(lEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lEstado.setText("Estado");

        lNumero.setText("Número");

        lRua.setText("Rua");

        lComplemento.setText("Complemento");

        lCep.setText("CEP");

        lBairro.setText("Bairro");

        lCidade.setText("Cidade");

        BtnConsultarCep.setText("Consultar");
        BtnConsultarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lCep)
                        .addGap(626, 626, 626)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lEstado)
                            .addComponent(jComboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lBairro)
                                .addGap(154, 154, 154)
                                .addComponent(lCidade)
                                .addGap(135, 135, 135)
                                .addComponent(lComplemento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(BtnConsultarCep)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lRua)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtComplemento)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCep)
                    .addComponent(lRua)
                    .addComponent(lNumero)
                    .addComponent(lEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsultarCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBairro)
                    .addComponent(lCidade)
                    .addComponent(lComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pCadastroClienteLayout = new javax.swing.GroupLayout(pCadastroCliente);
        pCadastroCliente.setLayout(pCadastroClienteLayout);
        pCadastroClienteLayout.setHorizontalGroup(
            pCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroClienteLayout.createSequentialGroup()
                .addGroup(pCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTipoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInformacoesPessoais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pCadastroClienteLayout.setVerticalGroup(
            pCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pInformacoesPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pCadastroDependente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dependentes"));

        BtnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnNovo.png"))); // NOI18N
        BtnNovo.setText("Novo");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });

        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnExcluir.png"))); // NOI18N
        BtnExcluir.setText("Excluir");

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnEditar.png"))); // NOI18N
        BtnEditar.setText("Editar");

        jTableDependente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDependente);

        javax.swing.GroupLayout pCadastroDependenteLayout = new javax.swing.GroupLayout(pCadastroDependente);
        pCadastroDependente.setLayout(pCadastroDependenteLayout);
        pCadastroDependenteLayout.setHorizontalGroup(
            pCadastroDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroDependenteLayout.createSequentialGroup()
                .addComponent(BtnNovo)
                .addGap(18, 18, 18)
                .addComponent(BtnEditar)
                .addGap(18, 18, 18)
                .addComponent(BtnExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        pCadastroDependenteLayout.setVerticalGroup(
            pCadastroDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroDependenteLayout.createSequentialGroup()
                .addGroup(pCadastroDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnConfirmar.png"))); // NOI18N
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnCancelar.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar))
                    .addComponent(pCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCadastroDependente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCadastroDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
        FrmCadastrarDependente frmCadastrarDependente = FrmCadastrarDependente.Mostrar(frame);
    }//GEN-LAST:event_BtnNovoActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null,
                "Deseja finalizar o Cadastro do Cliente? ",
                "Confirmação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                botoes, botoes[0]);
        if (resposta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null,
                "Deseja finalizar o Cadastro do Cliente? ",
                "Confirmação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                botoes, botoes[0]);
        if (resposta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void jRadioPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPessoaFisicaActionPerformed
        txtCpf.setEnabled(true);
        txtRg.setEnabled(true);
        jComboSexo.setEnabled(true);
        txtCnpj.setText("");
        txtCnpj.setEnabled(false);
    }//GEN-LAST:event_jRadioPessoaFisicaActionPerformed

    private void jRadioPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPessoaJuridicaActionPerformed
        txtCnpj.setEnabled(true);
        txtCpf.setText("");
        txtCpf.setEnabled(false);
        txtRg.setText("");
        txtRg.setEnabled(false);
        jComboSexo.setEnabled(false);
        jComboSexo.setSelectedItem("Feminino");
    }//GEN-LAST:event_jRadioPessoaJuridicaActionPerformed

    private void BtnConsultarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarCepActionPerformed
        BuscaCep(txtCep.getText().toString());
        txtNumero.requestFocus();
    }//GEN-LAST:event_BtnConsultarCepActionPerformed

    public void BuscaCep(String cep) {
        try {

            CepWebService cepWebService = new CepWebService(cep);

            if (cepWebService.getResultado() == 1) {

                txtRua.setText(cepWebService.getLogradouro());
                txtBairro.setText(cepWebService.getBairro());
                txtCidade.setText(cepWebService.getCidade());
                jComboEstado.setSelectedItem(cepWebService.getEstado());
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o endereço", "Procura do endereço", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o endereço", "Procura do endereço", JOptionPane.INFORMATION_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadastrarCliente dialog = new FrmCadastrarCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnConsultarCep;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnNovo;
    private javax.swing.ButtonGroup jButtonGroupTipoCliente;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JComboBox<String> jComboSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioPessoaFisica;
    private javax.swing.JRadioButton jRadioPessoaJuridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDependente;
    private com.toedter.calendar.JDateChooser jcDataCadastro;
    private com.toedter.calendar.JDateChooser jcDataNascimento;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lCelular;
    private javax.swing.JLabel lCep;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lCnpj;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lComplemento;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lDataCadastro;
    private javax.swing.JLabel lDataNascimento;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lRg;
    private javax.swing.JLabel lRua;
    private javax.swing.JLabel lSexo;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JPanel pCadastroCliente;
    private javax.swing.JPanel pCadastroDependente;
    private javax.swing.JPanel pInformacoesPessoais;
    private javax.swing.JPanel pTipoCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
