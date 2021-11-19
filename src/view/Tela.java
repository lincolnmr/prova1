package view;

import Facade.FuncoesData;
import controller.CtrlConta;
import controller.CtrlExtrato;
import Facade.Movimentacoes;
import controller.CtrlClientes;
import controller.CtrlContratarProduto;
import controller.CtrlProduto;
import controller.CtrlTipoProduto;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import static view.Extrato.tabelaExtrato;

public class Tela extends javax.swing.JFrame {

    private CtrlTipoProduto ctrlTipoProd;
    private CtrlClientes ctrlClientes;
    private CtrlConta ctrlConta;
    private CtrlContratarProduto ctrlContratarProduto;
    private CtrlExtrato ctrlExtrato;
    private CtrlProduto ctrlProduto;
    private boolean controle = true;

    public static final String agenciaContaCorrente = "01";
    public static final String agenciaContaInvestimento = "02";

    private int tipoCliente = 0;

    public Tela() {
        initComponents();
        instanciaControllers();
        inicioPrograma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBanco = new javax.swing.JTabbedPane();
        painelClientes = new javax.swing.JPanel();
        novoCliente = new javax.swing.JButton();
        gravaCliente = new javax.swing.JButton();
        editaCliente = new javax.swing.JButton();
        excluiCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        nomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        enderecoCliente = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cidadeCliente = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        emailCliente = new javax.swing.JTextField();
        painelClienteFisica = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rgCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cpfCliente = new javax.swing.JFormattedTextField();
        painelClienteJuridico = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        inscEstadualCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cnpjCliente = new javax.swing.JFormattedTextField();
        tipoPessoa = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        telefoneCliente = new javax.swing.JFormattedTextField();
        painelConta = new javax.swing.JPanel();
        novoConta = new javax.swing.JButton();
        gravaConta = new javax.swing.JButton();
        editaConta = new javax.swing.JButton();
        excluiConta = new javax.swing.JButton();
        mostrarExtrato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConta = new javax.swing.JTable();
        agenciaConta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbAtivo = new javax.swing.JCheckBox();
        saldoConta = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cbInvestimento = new javax.swing.JCheckBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        descricaoConta = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        painelTipoProduto = new javax.swing.JPanel();
        novoTipoProduto = new javax.swing.JButton();
        gravaTipoProduto = new javax.swing.JButton();
        editaTipoProduto = new javax.swing.JButton();
        excluiTipoProduto = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaTipoProduto = new javax.swing.JTable();
        nomeTipoProduto = new javax.swing.JTextField();
        modalidadeTipoProduto = new javax.swing.JTextField();
        taxaRentabilidadeTipoProduto = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        painelProduto = new javax.swing.JPanel();
        novoProduto = new javax.swing.JButton();
        gravaProduto = new javax.swing.JButton();
        editaProduto = new javax.swing.JButton();
        excluiProduto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        nomeProduto = new javax.swing.JTextField();
        capacidadeProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        prazoVencimentoProduto = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        diaFechamentoProduto = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        valorMinimoProduto = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        taxaFixaProduto = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        taxaOperacionalProduto = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tipoProduto = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        descricaoProduto = new javax.swing.JTextArea();
        dataInicioProduto = new javax.swing.JFormattedTextField();
        dataTerminoProduto = new javax.swing.JFormattedTextField();
        produtoProcessamento = new javax.swing.JToggleButton();
        painelContratarProduto = new javax.swing.JPanel();
        novoContratarProd = new javax.swing.JButton();
        gravaContrataProd = new javax.swing.JButton();
        editaContratarProd = new javax.swing.JButton();
        excluiContrataProd = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaContratarProd = new javax.swing.JTable();
        codClienteContrataProd = new javax.swing.JTextField();
        codProdutoContrataProd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        codContaContrataProd = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        dataContratacaoProd = new javax.swing.JFormattedTextField();
        dataLiquidacaoContrataProd = new javax.swing.JFormattedTextField();
        painelTransferencia = new javax.swing.JPanel();
        codContaOrigemTransf = new javax.swing.JTextField();
        valorTransf = new javax.swing.JTextField();
        codContaDestinoTransf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        transferirTransf = new javax.swing.JButton();
        painelMovimentacao = new javax.swing.JPanel();
        painelDeposito = new javax.swing.JPanel();
        valorDepositoConta = new javax.swing.JTextField();
        codContaDeposito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        depositarConta = new javax.swing.JButton();
        painelSaque = new javax.swing.JPanel();
        valorSaqueConta = new javax.swing.JTextField();
        codContaSaque = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        sacarConta = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BancoDJL");

        novoCliente.setText("Novo");
        novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoClienteActionPerformed(evt);
            }
        });

        gravaCliente.setText("Gravar");
        gravaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaClienteActionPerformed(evt);
            }
        });

        editaCliente.setText("Editar");
        editaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaClienteActionPerformed(evt);
            }
        });

        excluiCliente.setText("Excluir");
        excluiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiClienteActionPerformed(evt);
            }
        });

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "RG", "CNPJ", "Inscrição Estadual", "Endereço", "Cidade", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaClienteMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaCliente);

        jLabel5.setText("Nome*");

        jLabel18.setText("Endereço");

        jLabel19.setText("Cidade");

        jLabel20.setText("Telefone");

        jLabel21.setText("Email");

        painelClienteFisica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setText("CPF*");

        jLabel7.setText("RG");

        try {
            cpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelClienteFisicaLayout = new javax.swing.GroupLayout(painelClienteFisica);
        painelClienteFisica.setLayout(painelClienteFisicaLayout);
        painelClienteFisicaLayout.setHorizontalGroup(
            painelClienteFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteFisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClienteFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(rgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelClienteFisicaLayout.setVerticalGroup(
            painelClienteFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteFisicaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(rgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelClienteJuridico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel16.setText("CNPJ*");

        jLabel17.setText("Incrição Estadual");

        try {
            cnpjCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelClienteJuridicoLayout = new javax.swing.GroupLayout(painelClienteJuridico);
        painelClienteJuridico.setLayout(painelClienteJuridicoLayout);
        painelClienteJuridicoLayout.setHorizontalGroup(
            painelClienteJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteJuridicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClienteJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addComponent(inscEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnpjCliente))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        painelClienteJuridicoLayout.setVerticalGroup(
            painelClienteJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteJuridicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addComponent(inscEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pessoa Física", "Pessoa Jurídica" }));
        tipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPessoaActionPerformed(evt);
            }
        });

        jLabel22.setText("Tipo Cliente");

        try {
            telefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelClientesLayout = new javax.swing.GroupLayout(painelClientes);
        painelClientes.setLayout(painelClientesLayout);
        painelClientesLayout.setHorizontalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(cidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(enderecoCliente)
                            .addComponent(telefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(emailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(tipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133)
                        .addComponent(painelClienteFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(painelClienteJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(novoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(gravaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(editaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(excluiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        painelClientesLayout.setVerticalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(11, 11, 11)
                        .addComponent(emailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel22)
                        .addGap(10, 10, 10)
                        .addComponent(tipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelClienteFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelClienteJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelClientesLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(jLabel19)
                                .addGap(10, 10, 10)
                                .addComponent(cidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelClientesLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel18)
                                .addGap(10, 10, 10)
                                .addComponent(enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(102, 102, 102)
                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoCliente)
                    .addComponent(gravaCliente)
                    .addComponent(editaCliente)
                    .addComponent(excluiCliente)))
        );

        jPBanco.addTab("Clientes", painelClientes);

        novoConta.setText("Novo");
        novoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoContaActionPerformed(evt);
            }
        });

        gravaConta.setText("Gravar");
        gravaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaContaActionPerformed(evt);
            }
        });

        editaConta.setText("Editar");
        editaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaContaActionPerformed(evt);
            }
        });

        excluiConta.setText("Excluir");
        excluiConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiContaActionPerformed(evt);
            }
        });

        mostrarExtrato.setText("Extrato");
        mostrarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarExtratoActionPerformed(evt);
            }
        });

        tabelaConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Número", "Agência", "Saldo", "Investimento", "Ativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaContaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaConta);

        jLabel2.setText("Agência");

        cbAtivo.setText("Ativo");
        cbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtivoActionPerformed(evt);
            }
        });

        jLabel26.setText("Saldo");

        cbInvestimento.setText("Investimento");

        descricaoConta.setColumns(20);
        descricaoConta.setRows(5);
        jScrollPane7.setViewportView(descricaoConta);

        jLabel42.setText("Descrição");

        javax.swing.GroupLayout painelContaLayout = new javax.swing.GroupLayout(painelConta);
        painelConta.setLayout(painelContaLayout);
        painelContaLayout.setHorizontalGroup(
            painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContaLayout.createSequentialGroup()
                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelContaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelContaLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addGap(141, 141, 141)
                        .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelContaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelContaLayout.createSequentialGroup()
                                .addComponent(agenciaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbInvestimento)
                                .addGap(71, 71, 71))
                            .addGroup(painelContaLayout.createSequentialGroup()
                                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(saldoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbAtivo)
                                .addGap(109, 109, 109))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(novoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(gravaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(editaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(excluiConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(mostrarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelContaLayout.setVerticalGroup(
            painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelContaLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelContaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbInvestimento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agenciaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cbAtivo))
                        .addGap(1, 1, 1)
                        .addComponent(saldoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103)
                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoConta)
                    .addComponent(gravaConta)
                    .addComponent(editaConta)
                    .addComponent(excluiConta)
                    .addComponent(mostrarExtrato))
                .addGap(24, 24, 24))
        );

        jPBanco.addTab("Conta", painelConta);

        novoTipoProduto.setText("Novo");
        novoTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoTipoProdutoActionPerformed(evt);
            }
        });

        gravaTipoProduto.setText("Gravar");
        gravaTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaTipoProdutoActionPerformed(evt);
            }
        });

        editaTipoProduto.setText("Editar");
        editaTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaTipoProdutoActionPerformed(evt);
            }
        });

        excluiTipoProduto.setText("Excluir");
        excluiTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiTipoProdutoActionPerformed(evt);
            }
        });

        tabelaTipoProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Modalidade", "Taxa Rentabilidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaTipoProdutoMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(tabelaTipoProduto);

        jLabel37.setText("Nome");

        jLabel38.setText("Modalidade");

        jLabel39.setText("Taxa Rentabilidade");

        javax.swing.GroupLayout painelTipoProdutoLayout = new javax.swing.GroupLayout(painelTipoProduto);
        painelTipoProduto.setLayout(painelTipoProdutoLayout);
        painelTipoProdutoLayout.setHorizontalGroup(
            painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTipoProdutoLayout.createSequentialGroup()
                .addGap(0, 182, Short.MAX_VALUE)
                .addComponent(novoTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(gravaTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(editaTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(excluiTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
            .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(nomeTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(modalidadeTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taxaRentabilidadeTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTipoProdutoLayout.setVerticalGroup(
            painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(10, 10, 10)
                        .addComponent(nomeTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(10, 10, 10)
                        .addComponent(modalidadeTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelTipoProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(10, 10, 10)
                        .addComponent(taxaRentabilidadeTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(novoTipoProduto)
                        .addComponent(gravaTipoProduto))
                    .addComponent(editaTipoProduto)
                    .addComponent(excluiTipoProduto))
                .addGap(29, 29, 29))
        );

        jPBanco.addTab("Tipo Produto", painelTipoProduto);

        novoProduto.setText("Novo");
        novoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProdutoActionPerformed(evt);
            }
        });

        gravaProduto.setText("Gravar");
        gravaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaProdutoActionPerformed(evt);
            }
        });

        editaProduto.setText("Editar");
        editaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaProdutoActionPerformed(evt);
            }
        });

        excluiProduto.setText("Excluir");
        excluiProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiProdutoActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição", "Capacidade", "Data Inicio", "Data Termino", "Prazo de vencimento", "Dia Fechamento", "Valor Minimo Investimento", "Taxa Fixa", "Taxa Operacional", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaProdutoMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaProduto);

        jLabel8.setText("Nome");

        jLabel9.setText("Descrição");

        jLabel12.setText("Capacidade");

        jLabel23.setText("Data Inicio");

        jLabel30.setText("Data Termino");

        jLabel31.setText("Prazo de Vencimento");

        jLabel32.setText("Dia Fechamento");

        jLabel33.setText("Valor Minimo Inv.");

        jLabel34.setText("Taxa Fixa");

        jLabel35.setText("Taxa Operacional");

        jLabel36.setText("Cód. tipo produto");

        descricaoProduto.setColumns(20);
        descricaoProduto.setRows(5);
        jScrollPane8.setViewportView(descricaoProduto);

        try {
            dataInicioProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            dataTerminoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        produtoProcessamento.setText("Processamento");
        produtoProcessamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoProcessamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProdutoLayout = new javax.swing.GroupLayout(painelProduto);
        painelProduto.setLayout(painelProdutoLayout);
        painelProdutoLayout.setHorizontalGroup(
            painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutoLayout.createSequentialGroup()
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(capacidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataInicioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel30)
                            .addComponent(dataTerminoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(diaFechamentoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(prazoVencimentoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(valorMinimoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(taxaFixaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8)
                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(tipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxaOperacionalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
            .addGroup(painelProdutoLayout.createSequentialGroup()
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(novoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(gravaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(editaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(excluiProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(produtoProcessamento)))
                .addGap(25, 25, 25))
        );
        painelProdutoLayout.setVerticalGroup(
            painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel12)
                                .addGap(6, 6, 6)
                                .addComponent(capacidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelProdutoLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addGap(8, 8, 8)
                                        .addComponent(valorMinimoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelProdutoLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(6, 6, 6)
                                        .addComponent(dataInicioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13)
                                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelProdutoLayout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(6, 6, 6)
                                        .addComponent(dataTerminoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelProdutoLayout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(taxaFixaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(painelProdutoLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(6, 6, 6)
                                    .addComponent(taxaOperacionalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelProdutoLayout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(diaFechamentoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel31)
                                    .addGap(8, 8, 8)
                                    .addComponent(prazoVencimentoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painelProdutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoProduto)
                    .addComponent(gravaProduto)
                    .addComponent(editaProduto)
                    .addGroup(painelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(excluiProduto)
                        .addComponent(produtoProcessamento))))
        );

        jPBanco.addTab("Produtos", painelProduto);

        novoContratarProd.setText("Novo");
        novoContratarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoContratarProdActionPerformed(evt);
            }
        });

        gravaContrataProd.setText("Gravar");
        gravaContrataProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaContrataProdActionPerformed(evt);
            }
        });

        editaContratarProd.setText("Editar");
        editaContratarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaContratarProdActionPerformed(evt);
            }
        });

        excluiContrataProd.setText("Excluir");
        excluiContrataProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiContrataProdActionPerformed(evt);
            }
        });

        tabelaContratarProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Produto", "Data Contratação", "Data Liquidação", "Conta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaContratarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaContratarProdMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tabelaContratarProd);

        jLabel13.setText("Cliente");

        jLabel14.setText("Produto");

        jLabel15.setText("Data Contratação");

        jLabel40.setText("Data Liquidação");

        jLabel41.setText("Conta Corrente");

        try {
            dataContratacaoProd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            dataLiquidacaoContrataProd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelContratarProdutoLayout = new javax.swing.GroupLayout(painelContratarProduto);
        painelContratarProduto.setLayout(painelContratarProdutoLayout);
        painelContratarProdutoLayout.setHorizontalGroup(
            painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContratarProdutoLayout.createSequentialGroup()
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelContratarProdutoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane5))
                    .addGroup(painelContratarProdutoLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(novoContratarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(gravaContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(editaContratarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(excluiContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContratarProdutoLayout.createSequentialGroup()
                .addGap(0, 112, Short.MAX_VALUE)
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(codClienteContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codContaContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(60, 60, 60)
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(codProdutoContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(dataContratacaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(dataLiquidacaoContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        painelContratarProdutoLayout.setVerticalGroup(
            painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContratarProdutoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelContratarProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(10, 10, 10)
                        .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataContratacaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataLiquidacaoContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painelContratarProdutoLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(10, 10, 10)
                            .addComponent(codProdutoContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelContratarProdutoLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(10, 10, 10)
                            .addComponent(codClienteContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelContratarProdutoLayout.createSequentialGroup()
                            .addComponent(jLabel41)
                            .addGap(10, 10, 10)
                            .addComponent(codContaContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelContratarProdutoLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(30, 30, 30))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoContratarProd)
                    .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editaContratarProd)
                        .addComponent(gravaContrataProd))
                    .addComponent(excluiContrataProd))
                .addGap(58, 58, 58))
        );

        jPBanco.addTab("Contratar Produto", painelContratarProduto);

        jLabel4.setText("Conta Origem");

        jLabel10.setText("Valor");

        jLabel11.setText("Conta Destino");

        transferirTransf.setText("Transferir");
        transferirTransf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirTransfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTransferenciaLayout = new javax.swing.GroupLayout(painelTransferencia);
        painelTransferencia.setLayout(painelTransferenciaLayout);
        painelTransferenciaLayout.setHorizontalGroup(
            painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTransferenciaLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transferirTransf)
                    .addGroup(painelTransferenciaLayout.createSequentialGroup()
                        .addGroup(painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codContaOrigemTransf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(84, 84, 84)
                        .addGroup(painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(codContaDestinoTransf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(79, 79, 79)
                .addGroup(painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorTransf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        painelTransferenciaLayout.setVerticalGroup(
            painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTransferenciaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelTransferenciaLayout.createSequentialGroup()
                        .addGroup(painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codContaOrigemTransf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codContaDestinoTransf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelTransferenciaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTransf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addComponent(transferirTransf)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jPBanco.addTab("Transferencia", painelTransferencia);

        painelDeposito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setText("Valor");

        jLabel27.setText("Conta");

        depositarConta.setText("Depositar");
        depositarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDepositoLayout = new javax.swing.GroupLayout(painelDeposito);
        painelDeposito.setLayout(painelDepositoLayout);
        painelDepositoLayout.setHorizontalGroup(
            painelDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDepositoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositarConta, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGroup(painelDepositoLayout.createSequentialGroup()
                        .addGroup(painelDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codContaDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(valorDepositoConta))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelDepositoLayout.setVerticalGroup(
            painelDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDepositoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorDepositoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codContaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(depositarConta)
                .addContainerGap())
        );

        painelSaque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel28.setText("Valor");

        jLabel29.setText("Conta");

        sacarConta.setText("Sacar");
        sacarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSaqueLayout = new javax.swing.GroupLayout(painelSaque);
        painelSaque.setLayout(painelSaqueLayout);
        painelSaqueLayout.setHorizontalGroup(
            painelSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sacarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(valorSaqueConta)
                    .addComponent(codContaSaque)
                    .addGroup(painelSaqueLayout.createSequentialGroup()
                        .addGroup(painelSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelSaqueLayout.setVerticalGroup(
            painelSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaqueLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorSaqueConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codContaSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(sacarConta)
                .addContainerGap())
        );

        jLabel24.setText("Depositar");

        jLabel25.setText("Sacar");

        javax.swing.GroupLayout painelMovimentacaoLayout = new javax.swing.GroupLayout(painelMovimentacao);
        painelMovimentacao.setLayout(painelMovimentacaoLayout);
        painelMovimentacaoLayout.setHorizontalGroup(
            painelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(painelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelMovimentacaoLayout.createSequentialGroup()
                    .addGap(261, 261, 261)
                    .addGroup(painelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelMovimentacaoLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel24)
                            .addGap(104, 104, 104)
                            .addComponent(jLabel25))
                        .addGroup(painelMovimentacaoLayout.createSequentialGroup()
                            .addComponent(painelDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(painelSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(277, Short.MAX_VALUE)))
        );
        painelMovimentacaoLayout.setVerticalGroup(
            painelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(painelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelMovimentacaoLayout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addGroup(painelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25))
                    .addGap(6, 6, 6)
                    .addGroup(painelMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(painelDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(113, Short.MAX_VALUE)))
        );

        jPBanco.addTab("Entrada/Saida", painelMovimentacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPBanco))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBanco)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inicioPrograma() {
        cnpjCliente.setEnabled(false);
        inscEstadualCliente.setEnabled(false);
        carregarTabelas();
        camposInativos();
    }

    private void carregarTabelas() {
        carregarTabelaCliente();
        carregarTabelaConta();
        carregarTabelaTipoProduto();
        carregarTabelaProduto();
        carregarTabelaContrataProduto();
    }

    private void instanciaControllers() {
        ctrlTipoProd = new CtrlTipoProduto();
        ctrlClientes = new CtrlClientes();
        ctrlConta = new CtrlConta();
        ctrlContratarProduto = new CtrlContratarProduto();
        ctrlExtrato = new CtrlExtrato();
        ctrlProduto = new CtrlProduto();
    }

    private String gerarNumeroConta() {
        Random gerador = new Random();
        String numero = new String();

        for (int i = 0; i < 6; i++) {
            numero += gerador.nextInt(10);
        }
        return numero;
    }

    private boolean verificaObrigatoriedade() {

        if (nomeCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PREENCHA O CAMPO NOME");
            return false;
        }

        if (tipoCliente == 0) {
            if (cpfCliente.getText().trim().length() != 14) {
                JOptionPane.showMessageDialog(null, "PREENCHA O CAMPO CPF");
                return false;
            }
        } else {
            if (cnpjCliente.getText().trim().length() != 18) {
                JOptionPane.showMessageDialog(null, "PREENCHA O CAMPO CNPJ");
                return false;
            }
        }
        return true;
    }

    private void vinculaClienteConta() {

        JSONArray arrayJSON = new JSONArray();
        arrayJSON.add("0");
        arrayJSON.add("Conta gerada pelo cadastro do cliente");
        arrayJSON.add(gerarNumeroConta());
        arrayJSON.add(agenciaContaCorrente);
        arrayJSON.add("0");
        arrayJSON.add("false");
        arrayJSON.add("true");
        ctrlConta.inserir(arrayJSON);

        arrayJSON.removeAll(arrayJSON);

        String[][] cliente = ctrlClientes.recuperarTodos(7);
        String[][] conta = ctrlConta.recuperarTodos(12);
        arrayJSON.add("0");
        arrayJSON.add(cliente[0][0]);
        arrayJSON.add("4");
        arrayJSON.add(FuncoesData.now());
        arrayJSON.add(FuncoesData.somaUmAno());
        arrayJSON.add(conta[0][0]);
        ctrlContratarProduto.inserir(arrayJSON);
    }

    private void gravaCliente() {
        JSONArray arrayJSON = new JSONArray();
        int iLinha = tabelaCliente.getSelectedRow();

        if (controle) {
            arrayJSON.add("0");
            arrayJSON.add(nomeCliente.getText());
            arrayJSON.add(cpfCliente.getText());
            arrayJSON.add(rgCliente.getText());
            arrayJSON.add(cnpjCliente.getText());
            arrayJSON.add(inscEstadualCliente.getText());
            arrayJSON.add(enderecoCliente.getText());
            arrayJSON.add(cidadeCliente.getText());
            arrayJSON.add(telefoneCliente.getText());
            arrayJSON.add(emailCliente.getText());
            ctrlClientes.inserir(arrayJSON);
            vinculaClienteConta();
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso");
        } else {
            arrayJSON.add(String.valueOf(tabelaCliente.getValueAt(iLinha, 0)));
            arrayJSON.add(nomeCliente.getText());
            arrayJSON.add(cpfCliente.getText());
            arrayJSON.add(rgCliente.getText());
            arrayJSON.add(cnpjCliente.getText());
            arrayJSON.add(inscEstadualCliente.getText());
            arrayJSON.add(enderecoCliente.getText());
            arrayJSON.add(cidadeCliente.getText());
            arrayJSON.add(telefoneCliente.getText());
            arrayJSON.add(emailCliente.getText());
            ctrlClientes.atualizar(arrayJSON);
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");
        }
    }

    private void gravaConta() {
        JSONArray arrayJSON = new JSONArray();
        int iLinha = tabelaConta.getSelectedRow();

        if (controle) {
            arrayJSON.add("0");
            arrayJSON.add(descricaoConta.getText());
            arrayJSON.add(gerarNumeroConta());
            arrayJSON.add(agenciaConta.getText());
            arrayJSON.add(saldoConta.getText());
            arrayJSON.add(String.valueOf(cbInvestimento.isSelected()));
            arrayJSON.add(String.valueOf(cbAtivo.isSelected()));
            ctrlConta.inserir(arrayJSON);
            JOptionPane.showMessageDialog(null, "Conta inserida com sucesso");
        } else {
            arrayJSON.add(String.valueOf(tabelaConta.getValueAt(iLinha, 0)));
            arrayJSON.add(descricaoConta.getText());
            arrayJSON.add(String.valueOf(tabelaConta.getValueAt(iLinha, 2)));
            arrayJSON.add(String.valueOf(tabelaConta.getValueAt(iLinha, 3)));
            arrayJSON.add(String.valueOf(tabelaConta.getValueAt(iLinha, 4)));
            arrayJSON.add(String.valueOf(cbInvestimento.isSelected()));
            arrayJSON.add(String.valueOf(cbAtivo.isSelected()));
            ctrlConta.atualizar(arrayJSON);
            JOptionPane.showMessageDialog(null, "Conta atualizada com sucesso");
        }
    }

    private void gravaTipoProduto() {
        JSONArray arrayJSON = new JSONArray();
        int iLinha = tabelaTipoProduto.getSelectedRow();

        if (controle) {
            arrayJSON.add("0");
            arrayJSON.add(nomeTipoProduto.getText());
            arrayJSON.add(modalidadeTipoProduto.getText());
            arrayJSON.add(taxaRentabilidadeTipoProduto.getText());
            ctrlTipoProd.inserir(arrayJSON);
            JOptionPane.showMessageDialog(null, "Tipo inserido com sucesso");
        } else {
            arrayJSON.add((String) tabelaTipoProduto.getValueAt(iLinha, 0));
            arrayJSON.add(nomeTipoProduto.getText());
            arrayJSON.add(modalidadeTipoProduto.getText());
            arrayJSON.add(taxaRentabilidadeTipoProduto.getText());
            ctrlTipoProd.atualizar(arrayJSON);
            JOptionPane.showMessageDialog(null, "Tipo atualizado com sucesso");
        }
    }

    private void gravaProduto() {
        JSONArray arrayJSON = new JSONArray();
        int iLinha = tabelaProduto.getSelectedRow();

        if ((!taxaOperacionalProduto.getText().isEmpty() || !taxaFixaProduto.getText().isEmpty())
                && Integer.parseInt(tipoProduto.getText()) == 6
                && (Double.parseDouble(taxaOperacionalProduto.getText()) != 0.0 || Double.parseDouble(taxaFixaProduto.getText()) != 0.0)) {
            JOptionPane.showMessageDialog(null, "Esta modalidade de conta não pode ter nenhuma taxa");
        } else {
            if (controle) {
                arrayJSON.add("0");
                arrayJSON.add(nomeProduto.getText());
                arrayJSON.add(descricaoProduto.getText());
                arrayJSON.add(capacidadeProduto.getText());
                arrayJSON.add(dataInicioProduto.getText());
                arrayJSON.add(dataTerminoProduto.getText());
                arrayJSON.add(prazoVencimentoProduto.getText());
                arrayJSON.add(diaFechamentoProduto.getText());
                arrayJSON.add(valorMinimoProduto.getText());
                arrayJSON.add(taxaFixaProduto.getText());
                arrayJSON.add(taxaOperacionalProduto.getText());
                arrayJSON.add(tipoProduto.getText());
                ctrlProduto.inserir(arrayJSON);
                JOptionPane.showMessageDialog(null, "Produto inserido com sucesso");
            } else {
                arrayJSON.add(String.valueOf(tabelaProduto.getValueAt(iLinha, 0)));
                arrayJSON.add(nomeProduto.getText());
                arrayJSON.add(descricaoProduto.getText());
                arrayJSON.add(capacidadeProduto.getText());
                arrayJSON.add(dataInicioProduto.getText());
                arrayJSON.add(dataTerminoProduto.getText());
                arrayJSON.add(prazoVencimentoProduto.getText());
                arrayJSON.add(diaFechamentoProduto.getText());
                arrayJSON.add(valorMinimoProduto.getText());
                arrayJSON.add(taxaFixaProduto.getText());
                arrayJSON.add(taxaOperacionalProduto.getText());
                arrayJSON.add(tipoProduto.getText());
                ctrlProduto.atualizar(arrayJSON);
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");
            }
        }
    }

    private void criaContaInvestimento(Integer codConta, Integer codProduto) throws SQLException {
        JSONArray arrayJSON = new JSONArray();

        arrayJSON.add("0");
        arrayJSON.add("Conta de investimento criada");
        arrayJSON.add(gerarNumeroConta());
        arrayJSON.add(agenciaContaInvestimento);
        arrayJSON.add("0");
        arrayJSON.add(String.valueOf("true"));
        arrayJSON.add(String.valueOf("true"));
        ctrlConta.inserir(arrayJSON);

        JSONArray produtoContratado = ctrlProduto.recuperar(codProduto);
        String[][] ultimaConta = ctrlConta.recuperarTodos(1);
        Movimentacoes.transferir(codConta, Integer.parseInt(ultimaConta[0][0]), String.valueOf(produtoContratado.get(8)));
    }

    private void gravaContrataProduto() throws ParseException, SQLException {
        JSONArray arrayJSON = new JSONArray();
        int iLinha = tabelaContratarProd.getSelectedRow();

        if (verificaCapacidadeProduto(Integer.parseInt(codProdutoContrataProd.getText()))) {
            JSONArray produtoContratado = ctrlProduto.recuperar(Integer.parseInt(codProdutoContrataProd.getText()));
            JSONArray contaContratada = ctrlConta.recuperar(Integer.parseInt(codContaContrataProd.getText()));

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            if (sdf.parse(dataContratacaoProd.getText()).before(sdf.parse(String.valueOf(produtoContratado.get(4)))) || sdf.parse(dataContratacaoProd.getText()).after(sdf.parse(String.valueOf(produtoContratado.get(5))))) {
                JOptionPane.showMessageDialog(null, "Um produto somente pode ser contratado entre as datas de início e término.");
            } else if (Double.valueOf(String.valueOf(contaContratada.get(4))) < Double.valueOf(String.valueOf(produtoContratado.get(8)))) {
                JOptionPane.showMessageDialog(null, "Não é possível contratar esse produto. O saldo da conta é menor que o mínimo de investimento.");
            } else {
                if (controle) {
                    arrayJSON.add("0");
                    arrayJSON.add(codClienteContrataProd.getText());
                    arrayJSON.add(codProdutoContrataProd.getText());
                    arrayJSON.add(dataContratacaoProd.getText());
                    arrayJSON.add(dataLiquidacaoContrataProd.getText());
                    arrayJSON.add(codContaContrataProd.getText());
                    ctrlContratarProduto.inserir(arrayJSON);
                    criaContaInvestimento(Integer.parseInt((String.valueOf(arrayJSON.get(5)))), Integer.parseInt(String.valueOf(arrayJSON.get(2))));
                    JOptionPane.showMessageDialog(null, "Produto contratado com sucesso");
                } else {
                    arrayJSON.add((String) tabelaContratarProd.getValueAt(iLinha, 0));
                    arrayJSON.add(codClienteContrataProd.getText());
                    arrayJSON.add(codProdutoContrataProd.getText());
                    arrayJSON.add(dataContratacaoProd.getText());
                    arrayJSON.add(dataLiquidacaoContrataProd.getText());
                    arrayJSON.add(codContaContrataProd.getText());
                    ctrlContratarProduto.atualizar(arrayJSON);
                    JOptionPane.showMessageDialog(null, "Contrato editado com sucesso");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "A capacidade de contas vinculadas a esse produto foi atingida, o contrato não pode ser feito.");
        }
    }

    private boolean verificaCapacidadeProduto(Integer codProduto) {
        JSONArray dados = ctrlProduto.recuperar(codProduto);
        int capacidade = Integer.parseInt(String.valueOf(dados.get(3)));
        int soma = 1;

        String[][] quantidadeProduto = ctrlContratarProduto.recuperarTodos(1);

        for (String[] dado : quantidadeProduto) {
            if (Integer.parseInt(dado[2]) == codProduto) {
                soma++;
            }
        }
        if (soma <= capacidade) {
            return true;
        } else {
            return false;
        }
    }

    private void novoCadastro() {
        camposAtivos();
        controle = true;

        nomeCliente.setText("");
        cpfCliente.setText("");
        rgCliente.setText("");
        cnpjCliente.setText("");
        inscEstadualCliente.setText("");
        enderecoCliente.setText("");
        cidadeCliente.setText("");
        telefoneCliente.setText("");
        emailCliente.setText("");

        descricaoConta.setText("");
        agenciaConta.setText("");
        saldoConta.setText("");
        valorDepositoConta.setText("");
        codContaDeposito.setText("");
        valorSaqueConta.setText("");
        codContaSaque.setText("");
        cbInvestimento.setSelected(false);
        cbAtivo.setSelected(false);

        nomeTipoProduto.setText("");
        modalidadeTipoProduto.setText("");
        taxaRentabilidadeTipoProduto.setText("");

        nomeProduto.setText("");
        dataInicioProduto.setText("");
        dataTerminoProduto.setText("");
        capacidadeProduto.setText("");
        diaFechamentoProduto.setText("");
        prazoVencimentoProduto.setText("");
        tipoProduto.setText("");
        valorMinimoProduto.setText("");
        descricaoProduto.setText("");
        taxaOperacionalProduto.setText("");
        taxaFixaProduto.setText("");

        codClienteContrataProd.setText("");
        codContaContrataProd.setText("");
        codProdutoContrataProd.setText("");
        dataContratacaoProd.setText("");
        dataLiquidacaoContrataProd.setText("");
    }

    private void camposAtivos() {
        nomeCliente.setEnabled(true);

        if (tipoCliente == 1) {
            cnpjCliente.setEnabled(true);
            inscEstadualCliente.setEnabled(true);
        } else {
            cpfCliente.setEnabled(true);
            rgCliente.setEnabled(true);
        }

        enderecoCliente.setEnabled(true);
        cidadeCliente.setEnabled(true);
        telefoneCliente.setEnabled(true);
        emailCliente.setEnabled(true);
        tipoPessoa.setEnabled(true);

        descricaoConta.setEnabled(true);
        agenciaConta.setEnabled(false);
        saldoConta.setEnabled(false);
        cbInvestimento.setEnabled(true);
        cbAtivo.setEnabled(true);

        nomeTipoProduto.setEnabled(true);
        modalidadeTipoProduto.setEnabled(true);
        taxaRentabilidadeTipoProduto.setEnabled(true);

        nomeProduto.setEnabled(true);
        dataInicioProduto.setEnabled(true);
        dataTerminoProduto.setEnabled(true);
        capacidadeProduto.setEnabled(true);
        diaFechamentoProduto.setEnabled(true);
        prazoVencimentoProduto.setEnabled(true);
        tipoProduto.setEnabled(true);
        valorMinimoProduto.setEnabled(true);
        descricaoProduto.setEnabled(true);
        taxaOperacionalProduto.setEnabled(true);
        taxaFixaProduto.setEnabled(true);

        codClienteContrataProd.setEnabled(true);
        codContaContrataProd.setEnabled(true);
        codProdutoContrataProd.setEnabled(true);
        dataContratacaoProd.setEnabled(true);
        dataLiquidacaoContrataProd.setEnabled(true);

        gravaCliente.setEnabled(true);
        gravaConta.setEnabled(true);
        gravaTipoProduto.setEnabled(true);
        gravaProduto.setEnabled(true);
        gravaContrataProd.setEnabled(true);
    }

    private void camposInativos() {
        nomeCliente.setEnabled(false);
        cpfCliente.setEnabled(false);
        rgCliente.setEnabled(false);
        cnpjCliente.setEnabled(false);
        inscEstadualCliente.setEnabled(false);
        enderecoCliente.setEnabled(false);
        cidadeCliente.setEnabled(false);
        telefoneCliente.setEnabled(false);
        emailCliente.setEnabled(false);
        tipoPessoa.setEnabled(false);

        descricaoConta.setEnabled(false);
        agenciaConta.setEnabled(false);
        saldoConta.setEnabled(false);
        cbInvestimento.setEnabled(false);
        cbAtivo.setEnabled(false);

        nomeTipoProduto.setEnabled(false);
        modalidadeTipoProduto.setEnabled(false);
        taxaRentabilidadeTipoProduto.setEnabled(false);

        nomeProduto.setEnabled(false);
        dataInicioProduto.setEnabled(false);
        dataTerminoProduto.setEnabled(false);
        capacidadeProduto.setEnabled(false);
        diaFechamentoProduto.setEnabled(false);
        prazoVencimentoProduto.setEnabled(false);
        tipoProduto.setEnabled(false);
        valorMinimoProduto.setEnabled(false);
        descricaoProduto.setEnabled(false);
        taxaOperacionalProduto.setEnabled(false);
        taxaFixaProduto.setEnabled(false);

        codClienteContrataProd.setEnabled(false);
        codContaContrataProd.setEnabled(false);
        codProdutoContrataProd.setEnabled(false);
        dataContratacaoProd.setEnabled(false);
        dataLiquidacaoContrataProd.setEnabled(false);

        gravaCliente.setEnabled(false);
        gravaConta.setEnabled(false);
        gravaTipoProduto.setEnabled(false);
        gravaProduto.setEnabled(false);
        gravaContrataProd.setEnabled(false);
    }

    private void gravaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaContaActionPerformed
        try {
            gravaConta();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conta não inserido");
        }

        carregarTabelaConta();
        camposInativos();
    }//GEN-LAST:event_gravaContaActionPerformed

    private void novoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoContaActionPerformed
        novoCadastro();
    }//GEN-LAST:event_novoContaActionPerformed

    private void excluiContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiContaActionPerformed
        int linha = tabelaConta.getSelectedRow();

        try {
            ctrlConta.excluir(Integer.parseInt(String.valueOf(tabelaConta.getValueAt(linha, 0))));
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não excluido.");
        }

        carregarTabelaConta();
        novoCadastro();
    }//GEN-LAST:event_excluiContaActionPerformed

    private void tabelaContaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaContaMousePressed
        controle = false;

        int linha = tabelaConta.getSelectedRow();

        descricaoConta.setText((String) tabelaConta.getValueAt(linha, 1));
        agenciaConta.setText((String) tabelaConta.getValueAt(linha, 3));
        saldoConta.setText((String) tabelaConta.getValueAt(linha, 4));

        String cbInvest = (String) tabelaConta.getValueAt(linha, 5);
        String cbAtiv = (String) tabelaConta.getValueAt(linha, 6);
        if ("Sim".equals(cbInvest)) {
            cbInvestimento.setSelected(true);
        } else {
            cbInvestimento.setSelected(false);
        }

        if ("Sim".equals(cbAtiv)) {
            cbAtivo.setSelected(true);
        } else {
            cbAtivo.setSelected(false);
        }
    }//GEN-LAST:event_tabelaContaMousePressed

    private void editaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaContaActionPerformed
        camposAtivos();
    }//GEN-LAST:event_editaContaActionPerformed

    private void mostrarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarExtratoActionPerformed
        (new Extrato()).setVisible(true);
        carregarTabelaExtrato();
    }//GEN-LAST:event_mostrarExtratoActionPerformed

    private void transferirTransfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirTransfActionPerformed
        int codContaOrigem = Integer.parseInt(codContaOrigemTransf.getText());
        int codContaDestino = Integer.parseInt(codContaDestinoTransf.getText());
        String valor = valorTransf.getText();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            String[][] contratosProdutos = ctrlContratarProduto.recuperarTodos(6);
            for (String[] dado : contratosProdutos) {
                if (sdf.parse(FuncoesData.now()).before(sdf.parse(dado[4])) && Integer.parseInt(dado[5]) == codContaOrigem) {
                    JOptionPane.showMessageDialog(null, "Não é possível realizar a transferência. Data atual é anterior à data de liquidação.");
                    return;
                }
            }
            Movimentacoes.transferir(codContaOrigem, codContaDestino, valor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar transferir - view " + e);
        }
        carregarTabelaConta();
    }//GEN-LAST:event_transferirTransfActionPerformed

    private void novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoClienteActionPerformed
        novoCadastro();
    }//GEN-LAST:event_novoClienteActionPerformed

    private void gravaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaClienteActionPerformed

        try {
            if (verificaObrigatoriedade()) {
                if (verificaCapacidadeProduto(4)) {
                    gravaCliente();
                } else {
                    JOptionPane.showMessageDialog(null, "Este cliente não pode ser cadastrado pois o produto Conta Corrente atingiu seu limite");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não inserido");
        }

        carregarTabelas();
        camposInativos();
    }//GEN-LAST:event_gravaClienteActionPerformed

    private void editaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaClienteActionPerformed
        camposAtivos();
    }//GEN-LAST:event_editaClienteActionPerformed

    private void excluiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiClienteActionPerformed
        int linha = tabelaCliente.getSelectedRow();

        try {
            ctrlClientes.excluir(Integer.parseInt(String.valueOf(tabelaCliente.getValueAt(linha, 0))));
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não excluido.");
        }

        carregarTabelaCliente();
        novoCadastro();
    }//GEN-LAST:event_excluiClienteActionPerformed

    private void tabelaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMousePressed
        controle = false;

        int linha = tabelaCliente.getSelectedRow();

        nomeCliente.setText((String) tabelaCliente.getValueAt(linha, 1));
        cpfCliente.setText((String) tabelaCliente.getValueAt(linha, 2));
        rgCliente.setText((String) tabelaCliente.getValueAt(linha, 3));
        cnpjCliente.setText((String) tabelaCliente.getValueAt(linha, 4));
        inscEstadualCliente.setText((String) tabelaCliente.getValueAt(linha, 5));
        enderecoCliente.setText((String) tabelaCliente.getValueAt(linha, 6));
        cidadeCliente.setText((String) tabelaCliente.getValueAt(linha, 7));
        telefoneCliente.setText((String) tabelaCliente.getValueAt(linha, 8));
        emailCliente.setText((String) tabelaCliente.getValueAt(linha, 9));
    }//GEN-LAST:event_tabelaClienteMousePressed

    private void novoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProdutoActionPerformed
        novoCadastro();
    }//GEN-LAST:event_novoProdutoActionPerformed

    private void gravaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaProdutoActionPerformed
        try {
            gravaProduto();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não inserido");
        }
        carregarTabelas();
        camposInativos();
    }//GEN-LAST:event_gravaProdutoActionPerformed

    private void editaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaProdutoActionPerformed
        camposAtivos();
    }//GEN-LAST:event_editaProdutoActionPerformed

    private void excluiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiProdutoActionPerformed
        int linha = tabelaProduto.getSelectedRow();
        try {
            ctrlProduto.excluir(Integer.parseInt(String.valueOf(tabelaProduto.getValueAt(linha, 0))));
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não excluido.");
        }

        carregarTabelaProduto();
        novoCadastro();
    }//GEN-LAST:event_excluiProdutoActionPerformed

    private void tabelaProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMousePressed
        controle = false;

        int linha = tabelaProduto.getSelectedRow();

        nomeProduto.setText((String) tabelaProduto.getValueAt(linha, 1));
        descricaoProduto.setText((String) tabelaProduto.getValueAt(linha, 2));
        capacidadeProduto.setText((String) tabelaProduto.getValueAt(linha, 3));
        dataInicioProduto.setText((String) tabelaProduto.getValueAt(linha, 4));
        dataTerminoProduto.setText((String) tabelaProduto.getValueAt(linha, 5));
        prazoVencimentoProduto.setText((String) tabelaProduto.getValueAt(linha, 6));
        diaFechamentoProduto.setText((String) tabelaProduto.getValueAt(linha, 7));
        valorMinimoProduto.setText((String) tabelaProduto.getValueAt(linha, 8));
        taxaFixaProduto.setText((String) tabelaProduto.getValueAt(linha, 9));
        taxaOperacionalProduto.setText((String) tabelaProduto.getValueAt(linha, 10));
        tipoProduto.setText((String) tabelaProduto.getValueAt(linha, 11));

    }//GEN-LAST:event_tabelaProdutoMousePressed

    private void novoContratarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoContratarProdActionPerformed
        novoCadastro();
    }//GEN-LAST:event_novoContratarProdActionPerformed

    private void gravaContrataProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaContrataProdActionPerformed
        try {
            gravaContrataProduto();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não contratado");
        }

        carregarTabelas();
        camposInativos();
    }//GEN-LAST:event_gravaContrataProdActionPerformed

    private void editaContratarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaContratarProdActionPerformed
        camposAtivos();
    }//GEN-LAST:event_editaContratarProdActionPerformed

    private void excluiContrataProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiContrataProdActionPerformed
        int linha = tabelaContratarProd.getSelectedRow();
        try {
            ctrlContratarProduto.excluir(Integer.parseInt(String.valueOf(tabelaContratarProd.getValueAt(linha, 0))));
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não excluido.");
        }

        carregarTabelaContrataProduto();
        novoCadastro();
    }//GEN-LAST:event_excluiContrataProdActionPerformed

    private void tabelaContratarProdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaContratarProdMousePressed
        controle = false;

        int linha = tabelaContratarProd.getSelectedRow();

        codClienteContrataProd.setText((String) tabelaContratarProd.getValueAt(linha, 1));
        codProdutoContrataProd.setText((String) tabelaContratarProd.getValueAt(linha, 2));
        dataContratacaoProd.setText((String) tabelaContratarProd.getValueAt(linha, 3));
        dataLiquidacaoContrataProd.setText((String) tabelaContratarProd.getValueAt(linha, 4));
        codContaContrataProd.setText((String) tabelaContratarProd.getValueAt(linha, 5));
    }//GEN-LAST:event_tabelaContratarProdMousePressed

    private void cbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAtivoActionPerformed

    private void novoTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoTipoProdutoActionPerformed
        novoCadastro();
    }//GEN-LAST:event_novoTipoProdutoActionPerformed

    private void gravaTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaTipoProdutoActionPerformed
        try {
            gravaTipoProduto();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo não inserido");
        }
        carregarTabelas();
        camposInativos();
    }//GEN-LAST:event_gravaTipoProdutoActionPerformed

    private void editaTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaTipoProdutoActionPerformed
        camposAtivos();
    }//GEN-LAST:event_editaTipoProdutoActionPerformed

    private void excluiTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiTipoProdutoActionPerformed
        int linha = tabelaTipoProduto.getSelectedRow();
        try {
            ctrlTipoProd.excluir(Integer.parseInt(String.valueOf(tabelaTipoProduto.getValueAt(linha, 0))));
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não excluido.");
        }

        carregarTabelaTipoProduto();
        novoCadastro();
    }//GEN-LAST:event_excluiTipoProdutoActionPerformed

    private void tabelaTipoProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTipoProdutoMousePressed
        controle = false;

        int linha = tabelaTipoProduto.getSelectedRow();

        nomeTipoProduto.setText((String) tabelaTipoProduto.getValueAt(linha, 1));
        modalidadeTipoProduto.setText((String) tabelaTipoProduto.getValueAt(linha, 2));
        taxaRentabilidadeTipoProduto.setText((String) tabelaTipoProduto.getValueAt(linha, 3));
    }//GEN-LAST:event_tabelaTipoProdutoMousePressed

    private void tipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPessoaActionPerformed
        tipoCliente = tipoPessoa.getSelectedIndex();
        if (tipoCliente == 0) {
            cpfCliente.setEnabled(true);
            rgCliente.setEnabled(true);
            cnpjCliente.setEnabled(false);
            inscEstadualCliente.setEnabled(false);
            cnpjCliente.setText("");
            inscEstadualCliente.setText("");
        } else {
            cnpjCliente.setEnabled(true);
            inscEstadualCliente.setEnabled(true);
            cpfCliente.setEnabled(false);
            rgCliente.setEnabled(false);
            cpfCliente.setText("");
            rgCliente.setText("");
        }
    }//GEN-LAST:event_tipoPessoaActionPerformed

    private void depositarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarContaActionPerformed

        JSONArray retorno = ctrlConta.recuperar(Integer.parseInt(codContaDeposito.getText()));

        if ("Sim".equals(retorno.get(5))) {
            JOptionPane.showMessageDialog(null, "Não é possível realizar depósitos em contas de investimento");
        } else {
            double valorConta = Double.parseDouble(String.valueOf(retorno.get(4)));
            double valorDeposito = Double.parseDouble(valorDepositoConta.getText());
            retorno.set(4, String.valueOf(valorConta + valorDeposito));
            ctrlConta.atualizar(retorno);
            Movimentacoes.extratoEntradaSaida(String.valueOf(retorno.get(0)), "E", valorDepositoConta.getText());
        }
        carregarTabelaConta();
    }//GEN-LAST:event_depositarContaActionPerformed

    private void sacarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarContaActionPerformed
        JSONArray retorno = ctrlConta.recuperar(Integer.parseInt(codContaSaque.getText()));

        double valorConta = Double.parseDouble(String.valueOf(retorno.get(4)));
        double valorSaque = Double.parseDouble(valorSaqueConta.getText());

        if ("Sim".equals(retorno.get(5))) {
            JOptionPane.showMessageDialog(null, "Não é possível realizar saques em contas de investimento");
        } else if (Double.parseDouble(String.valueOf(retorno.get(4))) < valorSaque) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {
            retorno.set(4, valorConta - valorSaque);
            ctrlConta.atualizar(retorno);
            Movimentacoes.extratoEntradaSaida(String.valueOf(retorno.get(0)), "S", valorSaqueConta.getText());
            carregarTabelaConta();
        }
    }//GEN-LAST:event_sacarContaActionPerformed

    private void produtoProcessamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoProcessamentoActionPerformed
        int linha = tabelaProduto.getSelectedRow();

        String codProduto = String.valueOf(tabelaProduto.getValueAt(linha, 0));
        String codTipoProduto = String.valueOf(tabelaProduto.getValueAt(linha, 11));

        String[][] contratosProduto = ctrlContratarProduto.recuperarTodos(1);
        JSONArray rentabilidade = ctrlTipoProd.recuperar(11);

        for (String[] dado : contratosProduto) {
            if (dado[2].equals(codProduto)) {
                JSONArray conta = ctrlConta.recuperar(Integer.parseInt(dado[5]));
                //model.addRow(dado);
            }
        }
    }//GEN-LAST:event_produtoProcessamentoActionPerformed

    private void carregarTabelaCliente() {
        DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
        model.setNumRows(0);

        String[][] lista = ctrlClientes.recuperarTodos(model.getColumnCount());

        for (String[] dado : lista) {
            model.addRow(dado);
        }
    }

    private void carregarTabelaConta() {
        DefaultTableModel model = (DefaultTableModel) tabelaConta.getModel();
        model.setNumRows(0);

        String[][] lista = ctrlConta.recuperarTodos(model.getColumnCount());

        for (String[] dado : lista) {
            model.addRow(dado);
        }
    }

    private void carregarTabelaTipoProduto() {
        DefaultTableModel model = (DefaultTableModel) tabelaTipoProduto.getModel();
        model.setNumRows(0);

        String[][] lista = ctrlTipoProd.recuperarTodos(model.getColumnCount());

        for (String[] dado : lista) {
            model.addRow(dado);
        }
    }

    private void carregarTabelaProduto() {
        DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
        model.setNumRows(0);

        String[][] lista = ctrlProduto.recuperarTodos(model.getColumnCount());

        for (String[] dado : lista) {
            model.addRow(dado);
        }
    }

    private void carregarTabelaContrataProduto() {
        DefaultTableModel model = (DefaultTableModel) tabelaContratarProd.getModel();
        model.setNumRows(0);

        String[][] lista = ctrlContratarProduto.recuperarTodos(model.getColumnCount());

        for (String[] dado : lista) {
            model.addRow(dado);
        }
    }

    private void carregarTabelaExtrato() {
        int codConta = Integer.parseInt((String) tabelaConta.getValueAt(tabelaConta.getSelectedRow(), 0));
        DefaultTableModel model = (DefaultTableModel) tabelaExtrato.getModel();
        model.setNumRows(0);

        String[][] lista = ctrlExtrato.recuperarTodos(model.getColumnCount());

        for (String[] dado : lista) {
            if (Integer.parseInt(dado[5]) == codConta) {
                model.addRow(dado);
            }
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agenciaConta;
    private javax.swing.JTextField capacidadeProduto;
    private javax.swing.JCheckBox cbAtivo;
    private javax.swing.JCheckBox cbInvestimento;
    private javax.swing.JTextField cidadeCliente;
    private javax.swing.JFormattedTextField cnpjCliente;
    private javax.swing.JTextField codClienteContrataProd;
    private javax.swing.JTextField codContaContrataProd;
    private javax.swing.JTextField codContaDeposito;
    private javax.swing.JTextField codContaDestinoTransf;
    private javax.swing.JTextField codContaOrigemTransf;
    private javax.swing.JTextField codContaSaque;
    private javax.swing.JTextField codProdutoContrataProd;
    private javax.swing.JFormattedTextField cpfCliente;
    private javax.swing.JFormattedTextField dataContratacaoProd;
    private javax.swing.JFormattedTextField dataInicioProduto;
    private javax.swing.JFormattedTextField dataLiquidacaoContrataProd;
    private javax.swing.JFormattedTextField dataTerminoProduto;
    private javax.swing.JButton depositarConta;
    private javax.swing.JTextArea descricaoConta;
    private javax.swing.JTextArea descricaoProduto;
    private javax.swing.JTextField diaFechamentoProduto;
    private javax.swing.JButton editaCliente;
    private javax.swing.JButton editaConta;
    private javax.swing.JButton editaContratarProd;
    private javax.swing.JButton editaProduto;
    private javax.swing.JButton editaTipoProduto;
    private javax.swing.JTextField emailCliente;
    private javax.swing.JTextField enderecoCliente;
    private javax.swing.JButton excluiCliente;
    private javax.swing.JButton excluiConta;
    private javax.swing.JButton excluiContrataProd;
    private javax.swing.JButton excluiProduto;
    private javax.swing.JButton excluiTipoProduto;
    private javax.swing.JButton gravaCliente;
    private javax.swing.JButton gravaConta;
    private javax.swing.JButton gravaContrataProd;
    private javax.swing.JButton gravaProduto;
    private javax.swing.JButton gravaTipoProduto;
    private javax.swing.JTextField inscEstadualCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jPBanco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField modalidadeTipoProduto;
    private javax.swing.JButton mostrarExtrato;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JTextField nomeTipoProduto;
    private javax.swing.JButton novoCliente;
    private javax.swing.JButton novoConta;
    private javax.swing.JButton novoContratarProd;
    private javax.swing.JButton novoProduto;
    private javax.swing.JButton novoTipoProduto;
    private javax.swing.JPanel painelClienteFisica;
    private javax.swing.JPanel painelClienteJuridico;
    private javax.swing.JPanel painelClientes;
    private javax.swing.JPanel painelConta;
    private javax.swing.JPanel painelContratarProduto;
    private javax.swing.JPanel painelDeposito;
    private javax.swing.JPanel painelMovimentacao;
    private javax.swing.JPanel painelProduto;
    private javax.swing.JPanel painelSaque;
    private javax.swing.JPanel painelTipoProduto;
    private javax.swing.JPanel painelTransferencia;
    private javax.swing.JTextField prazoVencimentoProduto;
    private javax.swing.JToggleButton produtoProcessamento;
    private javax.swing.JTextField rgCliente;
    private javax.swing.JButton sacarConta;
    private javax.swing.JTextField saldoConta;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTable tabelaConta;
    private javax.swing.JTable tabelaContratarProd;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTable tabelaTipoProduto;
    private javax.swing.JTextField taxaFixaProduto;
    private javax.swing.JTextField taxaOperacionalProduto;
    private javax.swing.JTextField taxaRentabilidadeTipoProduto;
    private javax.swing.JFormattedTextField telefoneCliente;
    private javax.swing.JComboBox tipoPessoa;
    private javax.swing.JTextField tipoProduto;
    private javax.swing.JButton transferirTransf;
    private javax.swing.JTextField valorDepositoConta;
    private javax.swing.JTextField valorMinimoProduto;
    private javax.swing.JTextField valorSaqueConta;
    private javax.swing.JTextField valorTransf;
    // End of variables declaration//GEN-END:variables
}
