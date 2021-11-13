package view;

import controller.CtrlConta;
import controller.CtrlExtrato;
import Utilitario.TransferenciaContas;
import controller.CtrlClientes;
import controller.CtrlContratarProduto;
import controller.CtrlProduto;
import controller.CtrlTipoProduto;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela extends javax.swing.JFrame {

    private CtrlTipoProduto ctrlTipoProd;
    private CtrlClientes ctrlClientes;
    private CtrlConta ctrlConta;
    private CtrlContratarProduto ctrlContratarProduto;
    private CtrlExtrato ctrlExtrato;
    private CtrlProduto ctrlProduto;
    private boolean controle = true;
    
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
        telefoneCliente = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        emailCliente = new javax.swing.JTextField();
        painelClienteFisica = new javax.swing.JPanel();
        cpfCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rgCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        painelClienteJuridico = new javax.swing.JPanel();
        cnpjCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        inscEstadualCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tipoPessoa = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
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
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
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
        dataInicioProduto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        dataTerminoProduto = new javax.swing.JTextField();
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
        painelContratarProduto = new javax.swing.JPanel();
        novoContratarProd = new javax.swing.JButton();
        gravaContrataProd = new javax.swing.JButton();
        editaContratarProd = new javax.swing.JButton();
        excluiContrataProd = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaContratarProd = new javax.swing.JTable();
        codClienteContrataProd = new javax.swing.JTextField();
        codProdutoContrataProd = new javax.swing.JTextField();
        dataContratacaoProd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dataLiquidacaoContrataProd = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        codContaContrataProd = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        painelExtrato = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaExtrato = new javax.swing.JTable();
        painelTransferencia = new javax.swing.JPanel();
        codContaOrigemTransf = new javax.swing.JTextField();
        valorTransf = new javax.swing.JTextField();
        codContaDestinoTransf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        transferirTransf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BancoDJL");

        painelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        novoCliente.setText("Novo");
        novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoClienteActionPerformed(evt);
            }
        });
        painelClientes.add(novoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 363, 80, -1));

        gravaCliente.setText("Gravar");
        gravaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaClienteActionPerformed(evt);
            }
        });
        painelClientes.add(gravaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 363, 80, -1));

        editaCliente.setText("Editar");
        editaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaClienteActionPerformed(evt);
            }
        });
        painelClientes.add(editaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 363, 80, -1));

        excluiCliente.setText("Excluir");
        excluiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiClienteActionPerformed(evt);
            }
        });
        painelClientes.add(excluiCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 363, 80, -1));

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

        painelClientes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 773, 107));
        painelClientes.add(nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, 80, -1));

        jLabel5.setText("Nome*");
        painelClientes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel18.setText("Endereço");
        painelClientes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 193, -1, -1));
        painelClientes.add(enderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 217, 80, -1));

        jLabel19.setText("Cidade");
        painelClientes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, -1, -1));
        painelClientes.add(cidadeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 80, -1));

        jLabel20.setText("Telefone");
        painelClientes.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 130, -1, -1));
        painelClientes.add(telefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 154, 80, -1));

        jLabel21.setText("Email");
        painelClientes.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 129, -1, -1));
        painelClientes.add(emailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 154, 80, -1));

        painelClienteFisica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setText("CPF*");

        jLabel7.setText("RG");

        javax.swing.GroupLayout painelClienteFisicaLayout = new javax.swing.GroupLayout(painelClienteFisica);
        painelClienteFisica.setLayout(painelClienteFisicaLayout);
        painelClienteFisicaLayout.setHorizontalGroup(
            painelClienteFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteFisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClienteFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(21, Short.MAX_VALUE))
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

        painelClientes.add(painelClienteFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 129, -1, -1));

        painelClienteJuridico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel16.setText("CNPJ*");

        jLabel17.setText("Incrição Estadual");

        javax.swing.GroupLayout painelClienteJuridicoLayout = new javax.swing.GroupLayout(painelClienteJuridico);
        painelClienteJuridico.setLayout(painelClienteJuridicoLayout);
        painelClienteJuridicoLayout.setHorizontalGroup(
            painelClienteJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteJuridicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClienteJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(inscEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        painelClienteJuridicoLayout.setVerticalGroup(
            painelClienteJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteJuridicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(10, 10, 10)
                .addComponent(cnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addComponent(inscEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelClientes.add(painelClienteJuridico, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 129, -1, -1));

        tipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pessoa Física", "Pessoa Jurídica" }));
        tipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPessoaActionPerformed(evt);
            }
        });
        painelClientes.add(tipoPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 217, -1, -1));

        jLabel22.setText("Tipo Cliente");
        painelClientes.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 193, -1, -1));

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

        jLabel24.setText("Depositar");

        jLabel25.setText("Sacar");

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

        jLabel26.setText("Saldo");

        cbInvestimento.setText("Investimento");
        cbInvestimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInvestimentoActionPerformed(evt);
            }
        });

        descricaoConta.setColumns(20);
        descricaoConta.setRows(5);
        jScrollPane7.setViewportView(descricaoConta);

        jLabel42.setText("Descrição");

        javax.swing.GroupLayout painelContaLayout = new javax.swing.GroupLayout(painelConta);
        painelConta.setLayout(painelContaLayout);
        painelContaLayout.setHorizontalGroup(
            painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelContaLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(novoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gravaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(editaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(excluiConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(mostrarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelContaLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(agenciaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(saldoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbInvestimento)
                    .addComponent(cbAtivo))
                .addGap(107, 107, 107)
                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelContaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel25))
                    .addGroup(painelContaLayout.createSequentialGroup()
                        .addComponent(painelDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(painelSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        painelContaLayout.setVerticalGroup(
            painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelContaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(6, 6, 6)
                        .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContaLayout.createSequentialGroup()
                                .addComponent(cbInvestimento)
                                .addGap(7, 7, 7)
                                .addComponent(cbAtivo)
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContaLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(agenciaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addGap(6, 6, 6)
                                .addComponent(saldoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(painelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoConta)
                    .addComponent(gravaConta)
                    .addComponent(editaConta)
                    .addComponent(excluiConta)
                    .addComponent(mostrarExtrato)))
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
                .addGap(0, 167, Short.MAX_VALUE)
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

        painelProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        novoProduto.setText("Novo");
        novoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProdutoActionPerformed(evt);
            }
        });
        painelProduto.add(novoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 406, 80, -1));

        gravaProduto.setText("Gravar");
        gravaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaProdutoActionPerformed(evt);
            }
        });
        painelProduto.add(gravaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 406, 80, -1));

        editaProduto.setText("Editar");
        editaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaProdutoActionPerformed(evt);
            }
        });
        painelProduto.add(editaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 406, 80, -1));

        excluiProduto.setText("Excluir");
        excluiProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiProdutoActionPerformed(evt);
            }
        });
        painelProduto.add(excluiProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 406, 80, -1));

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

        painelProduto.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 773, 100));
        painelProduto.add(nomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, -1));
        painelProduto.add(capacidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, -1));

        jLabel8.setText("Nome");
        painelProduto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel9.setText("Descrição");
        painelProduto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 260, -1, -1));

        jLabel12.setText("Capacidade");
        painelProduto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        painelProduto.add(dataInicioProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 149, 83, -1));

        jLabel23.setText("Data Inicio");
        painelProduto.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 129, -1, -1));

        jLabel30.setText("Data Termino");
        painelProduto.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 187, -1, -1));
        painelProduto.add(dataTerminoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 212, 83, -1));

        jLabel31.setText("Prazo de Vencimento");
        painelProduto.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 187, -1, -1));
        painelProduto.add(prazoVencimentoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 212, 83, -1));

        jLabel32.setText("Dia Fechamento");
        painelProduto.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 129, -1, -1));
        painelProduto.add(diaFechamentoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 149, 83, -1));

        jLabel33.setText("Valor Minimo Inv.");
        painelProduto.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 187, -1, -1));
        painelProduto.add(valorMinimoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 212, 83, -1));

        jLabel34.setText("Taxa Fixa");
        painelProduto.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));
        painelProduto.add(taxaFixaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 83, -1));

        jLabel35.setText("Taxa Operacional");
        painelProduto.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 90, -1));
        painelProduto.add(taxaOperacionalProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 83, -1));

        jLabel36.setText("Cód. tipo produto");
        painelProduto.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 129, -1, -1));
        painelProduto.add(tipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 149, 83, -1));

        descricaoProduto.setColumns(20);
        descricaoProduto.setRows(5);
        jScrollPane8.setViewportView(descricaoProduto);

        painelProduto.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 280, -1, -1));

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

        jLabel41.setText("Conta");

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
                .addGap(0, 74, Short.MAX_VALUE)
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
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataContratacaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(52, 52, 52)
                .addGroup(painelContratarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataLiquidacaoContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(77, 77, 77))
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
                        .addComponent(dataLiquidacaoContrataProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGap(10, 10, 10)
                            .addComponent(dataContratacaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        tabelaExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Data", "Tipo", "Valor", "Código Conta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaExtrato);

        javax.swing.GroupLayout painelExtratoLayout = new javax.swing.GroupLayout(painelExtrato);
        painelExtrato.setLayout(painelExtratoLayout);
        painelExtratoLayout.setHorizontalGroup(
            painelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelExtratoLayout.setVerticalGroup(
            painelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPBanco.addTab("Extrato", painelExtrato);

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
                .addContainerGap(235, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void inicioPrograma() {
        cnpjCliente.setEnabled(false);
        inscEstadualCliente.setEnabled(false);
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
    
    private void verificaObrigatoriedade(){
        if (tipoPessoa.getSelectedIndex() == 0) {
            if("".equals(cpfCliente.getText())){
                   JOptionPane.showMessageDialog(null, "PREENCHA O CAMPO CPF");
            }
            else{
               gravaCliente(); 
            }
        }
        else{
            if("".equals(cnpjCliente.getText())){
                   JOptionPane.showMessageDialog(null, "PREENCHA O CAMPO CNPJ");    
            }
            else{
               gravaCliente(); 
            }
        }
    }
    
    private void gravaCliente() {
        String[] dados = new String[10];
        int iLinha = tabelaCliente.getSelectedRow();
        
        if (controle) {
            dados[0] = "0";
            dados[1] = nomeCliente.getText();
            dados[2] = cpfCliente.getText();
            dados[3] = rgCliente.getText();
            dados[4] = cnpjCliente.getText();
            dados[5] = inscEstadualCliente.getText();
            dados[6] = enderecoCliente.getText();
            dados[7] = cidadeCliente.getText();
            dados[8] = telefoneCliente.getText();
            dados[9] = emailCliente.getText();
            ctrlClientes.inserir(dados);
        } else {
            dados[0] = (String) tabelaCliente.getValueAt(iLinha, 0);
            dados[1] = nomeCliente.getText();
            dados[2] = cpfCliente.getText();
            dados[3] = rgCliente.getText();
            dados[4] = cnpjCliente.getText();
            dados[5] = inscEstadualCliente.getText();
            dados[6] = enderecoCliente.getText();
            dados[7] = cidadeCliente.getText();
            dados[8] = telefoneCliente.getText();
            dados[9] = emailCliente.getText();
            ctrlClientes.atualizar(dados);
        }
    }
    
    private void gravaConta() {
        String[] dados = new String[7];
        int iLinha = tabelaConta.getSelectedRow();

        if (controle) {
            dados[0] = "0";
            dados[1] = descricaoConta.getText();
            dados[2] = gerarNumeroConta();
            dados[3] = agenciaConta.getText();
            dados[4] = saldoConta.getText();
            dados[5] = String.valueOf(cbInvestimento.isSelected());
            dados[6] = String.valueOf(cbAtivo.isSelected());
            ctrlConta.inserir(dados);
        } else {
            dados[0] = String.valueOf(tabelaConta.getValueAt(iLinha, 0));
            dados[1] = descricaoConta.getText();
            dados[2] = String.valueOf(tabelaConta.getValueAt(iLinha, 2));
            dados[3] = agenciaConta.getText();
            dados[4] = saldoConta.getText();
            dados[5] = String.valueOf(cbInvestimento.isSelected());
            dados[6] = String.valueOf(cbAtivo.isSelected());
            ctrlConta.atualizar(dados);
        }
    }

    private void gravaTipoProduto() {
        String[] dados = new String[4];
        int iLinha = tabelaTipoProduto.getSelectedRow();

        if (controle) {
            dados[0] = "0";
            dados[1] = nomeTipoProduto.getText();
            dados[2] = modalidadeTipoProduto.getText();
            dados[3] = taxaRentabilidadeTipoProduto.getText();
            ctrlTipoProd.inserir(dados);
        } else {
            dados[0] = (String) tabelaTipoProduto.getValueAt(iLinha, 0);
            dados[1] = nomeTipoProduto.getText();
            dados[2] = modalidadeTipoProduto.getText();
            dados[3] = taxaRentabilidadeTipoProduto.getText();
            ctrlTipoProd.atualizar(dados);
        }
    }

    private void gravaProduto() {
        String[] dados = new String[12];
        int iLinha = tabelaProduto.getSelectedRow();

        if (controle) {
            dados[0] = "0";
            dados[1] = nomeProduto.getText();
            dados[2] = descricaoProduto.getText();
            dados[3] = capacidadeProduto.getText();
            dados[4] = dataInicioProduto.getText();
            dados[5] = dataTerminoProduto.getText();
            dados[6] = prazoVencimentoProduto.getText();
            dados[7] = diaFechamentoProduto.getText();
            dados[8] = valorMinimoProduto.getText();
            dados[9] = taxaFixaProduto.getText();
            dados[10] = taxaOperacionalProduto.getText();
            dados[11] = tipoProduto.getText();
            ctrlProduto.inserir(dados);
        } else {
            dados[0] = (String) tabelaProduto.getValueAt(iLinha, 0);
            dados[1] = nomeProduto.getText();
            dados[2] = descricaoProduto.getText();
            dados[3] = capacidadeProduto.getText();
            dados[4] = dataInicioProduto.getText();
            dados[5] = dataTerminoProduto.getText();
            dados[6] = prazoVencimentoProduto.getText();
            dados[7] = diaFechamentoProduto.getText();
            dados[8] = valorMinimoProduto.getText();
            dados[9] = taxaFixaProduto.getText();
            dados[10] = taxaOperacionalProduto.getText();
            dados[11] = tipoProduto.getText();
            ctrlProduto.atualizar(dados);
        }
    }

    private void gravaContrataProduto() {
        String[] dados = new String[6];
        int iLinha = tabelaContratarProd.getSelectedRow();

        if (controle) {
            dados[0] = "0";
            dados[1] = codClienteContrataProd.getText();
            dados[2] = codProdutoContrataProd.getText();
            dados[3] = dataContratacaoProd.getText();
            dados[4] = dataLiquidacaoContrataProd.getText();
            dados[5] = codContaContrataProd.getText();
            ctrlContratarProduto.inserir(dados);
        } else {
            dados[0] = (String) tabelaContratarProd.getValueAt(iLinha, 0);
            dados[1] = codClienteContrataProd.getText();
            dados[2] = codProdutoContrataProd.getText();
            dados[3] = dataContratacaoProd.getText();
            dados[4] = dataLiquidacaoContrataProd.getText();
            dados[5] = codContaContrataProd.getText();
            ctrlContratarProduto.atualizar(dados);
        }
    }

    private void novoCliente(){
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
    }
    
    private void novaConta(){
        controle = true;
        descricaoConta.setText("");
        agenciaConta.setText("");
        saldoConta.setText("");
        valorDepositoConta.setText("");
        codContaDeposito.setText("");
        valorSaqueConta.setText("");
        codContaSaque.setText("");
        cbInvestimento.setSelected(false);
        cbAtivo.setSelected(false);
    }
    
    private void novoTipoProduto(){
        controle = true;
        nomeTipoProduto.setText("");
        modalidadeTipoProduto.setText("");
        taxaRentabilidadeTipoProduto.setText("");
    }
    
    private void novoProduto(){
        controle = true;
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
    }
    
    private void novoContratarProduto(){
        controle = true;
        codContaContrataProd.setText("");
        codContaContrataProd.setText("");
        codProdutoContrataProd.setText("");
        dataContratacaoProd.setText("");
        dataLiquidacaoContrataProd.setText("");
    }
    
    private void gravaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaContaActionPerformed
        gravaConta();
        carregarTabelaConta();
    }//GEN-LAST:event_gravaContaActionPerformed

    private void novoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoContaActionPerformed
        novaConta();
    }//GEN-LAST:event_novoContaActionPerformed

    private void excluiContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiContaActionPerformed
        int linha = tabelaConta.getSelectedRow();
        ctrlConta.excluir(Integer.parseInt(String.valueOf(tabelaConta.getValueAt(linha, 0))));
        carregarTabelaConta();
    }//GEN-LAST:event_excluiContaActionPerformed

    private void tabelaContaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaContaMousePressed
        controle = false;
        
        int linha = tabelaConta.getSelectedRow();
        
        descricaoConta.setText((String) tabelaConta.getValueAt(linha, 1));
        agenciaConta.setText((String) tabelaConta.getValueAt(linha, 3));
        saldoConta.setText((String) tabelaConta.getValueAt(linha, 4));
        
        String cbInvest = (String) tabelaConta.getValueAt(linha, 5);
        String cbAtiv = (String) tabelaConta.getValueAt(linha, 6);
        if ("true".equals(cbInvest))
            cbInvestimento.setSelected(true);
        else
            cbInvestimento.setSelected(false);
        
        if ("true".equals(cbAtiv))
            cbAtivo.setSelected(true);
        else
            cbAtivo.setSelected(false); 
    }//GEN-LAST:event_tabelaContaMousePressed

    private void editaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaContaActionPerformed

    }//GEN-LAST:event_editaContaActionPerformed

    private void mostrarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarExtratoActionPerformed
        carregarTabelaExtrato();
    }//GEN-LAST:event_mostrarExtratoActionPerformed

    private void transferirTransfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirTransfActionPerformed
        int codContaOrigem = Integer.parseInt(codContaOrigemTransf.getText());
        int codContaDestino = Integer.parseInt(codContaDestinoTransf.getText());
        double valor = Double.parseDouble(valorTransf.getText());

        try {
            TransferenciaContas.transferir(codContaOrigem, codContaDestino, valor);
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar transferir - view " + ex);
        }

        carregarTabelaConta();
    }//GEN-LAST:event_transferirTransfActionPerformed

    private void novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoClienteActionPerformed
        novoCliente();
    }//GEN-LAST:event_novoClienteActionPerformed

    private void gravaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaClienteActionPerformed
        verificaObrigatoriedade();
        carregarTabelaCliente();
    }//GEN-LAST:event_gravaClienteActionPerformed

    private void editaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editaClienteActionPerformed

    private void excluiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiClienteActionPerformed
        int linha = tabelaCliente.getSelectedRow();
        ctrlClientes.excluir(Integer.parseInt(String.valueOf(tabelaCliente.getValueAt(linha, 0))));
        carregarTabelaCliente();
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
        novoProduto();
    }//GEN-LAST:event_novoProdutoActionPerformed

    private void gravaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaProdutoActionPerformed
        gravaProduto();
        carregarTabelaProduto();
    }//GEN-LAST:event_gravaProdutoActionPerformed

    private void editaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editaProdutoActionPerformed

    private void excluiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiProdutoActionPerformed
        int linha = tabelaProduto.getSelectedRow();
        ctrlProduto.excluir(Integer.parseInt(String.valueOf(tabelaProduto.getValueAt(linha, 0))));
        carregarTabelaProduto();
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
        novoContratarProduto();
    }//GEN-LAST:event_novoContratarProdActionPerformed

    private void gravaContrataProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaContrataProdActionPerformed
        gravaContrataProduto();
        carregarTabelaContrataProduto();
    }//GEN-LAST:event_gravaContrataProdActionPerformed

    private void editaContratarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaContratarProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editaContratarProdActionPerformed

    private void excluiContrataProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiContrataProdActionPerformed
        int linha = tabelaContratarProd.getSelectedRow();
        ctrlContratarProduto.excluir(Integer.parseInt(String.valueOf(tabelaContratarProd.getValueAt(linha, 0))));
        carregarTabelaContrataProduto();
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

    private void cbInvestimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInvestimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInvestimentoActionPerformed

    private void novoTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoTipoProdutoActionPerformed
        novoTipoProduto();
    }//GEN-LAST:event_novoTipoProdutoActionPerformed

    private void gravaTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaTipoProdutoActionPerformed
        gravaTipoProduto();
        carregarTabelaTipoProduto();
    }//GEN-LAST:event_gravaTipoProdutoActionPerformed

    private void editaTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editaTipoProdutoActionPerformed

    private void excluiTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiTipoProdutoActionPerformed
        int linha = tabelaTipoProduto.getSelectedRow();
        ctrlTipoProd.excluir(Integer.parseInt(String.valueOf(tabelaTipoProduto.getValueAt(linha, 0))));
        carregarTabelaTipoProduto();
    }//GEN-LAST:event_excluiTipoProdutoActionPerformed

    private void tabelaTipoProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTipoProdutoMousePressed
        controle = false;
        
        int linha = tabelaTipoProduto.getSelectedRow();
        
        nomeTipoProduto.setText((String) tabelaTipoProduto.getValueAt(linha, 1));
        modalidadeTipoProduto.setText((String) tabelaTipoProduto.getValueAt(linha, 2));
        taxaRentabilidadeTipoProduto.setText((String) tabelaTipoProduto.getValueAt(linha, 3));
    }//GEN-LAST:event_tabelaTipoProdutoMousePressed

    private void tipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPessoaActionPerformed
        if (tipoPessoa.getSelectedIndex() == 0) {
            cpfCliente.setEnabled(true);
            rgCliente.setEnabled(true);
            cnpjCliente.setEnabled(false);
            inscEstadualCliente.setEnabled(false);
            cnpjCliente.setText(null);
            inscEstadualCliente.setText(null);
        } else {
            cnpjCliente.setEnabled(true);
            inscEstadualCliente.setEnabled(true);
            cpfCliente.setEnabled(false);
            rgCliente.setEnabled(false);
            cpfCliente.setText(null);
            rgCliente.setText(null);
        }
    }//GEN-LAST:event_tipoPessoaActionPerformed

    private void depositarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarContaActionPerformed

        String[] dados = new String[7];
        dados[0] = codContaDeposito.getText();
        dados[1] = "SAD";
        dados[2] = "109395";
        dados[3] = "23";
        dados[4] = valorDepositoConta.getText();
        dados[5] = "1";
        dados[6] = "1";
        ctrlConta.atualizar(dados);
    }//GEN-LAST:event_depositarContaActionPerformed

    private void sacarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarContaActionPerformed

    }//GEN-LAST:event_sacarContaActionPerformed

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

        String[][] lista = ctrlExtrato.recuperarExtrato(codConta);

        for (String[] dado : lista) {
            model.addRow(dado);
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
    private javax.swing.JTextField cnpjCliente;
    private javax.swing.JTextField codClienteContrataProd;
    private javax.swing.JTextField codContaContrataProd;
    private javax.swing.JTextField codContaDeposito;
    private javax.swing.JTextField codContaDestinoTransf;
    private javax.swing.JTextField codContaOrigemTransf;
    private javax.swing.JTextField codContaSaque;
    private javax.swing.JTextField codProdutoContrataProd;
    private javax.swing.JTextField cpfCliente;
    private javax.swing.JTextField dataContratacaoProd;
    private javax.swing.JTextField dataInicioProduto;
    private javax.swing.JTextField dataLiquidacaoContrataProd;
    private javax.swing.JTextField dataTerminoProduto;
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
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JPanel painelExtrato;
    private javax.swing.JPanel painelProduto;
    private javax.swing.JPanel painelSaque;
    private javax.swing.JPanel painelTipoProduto;
    private javax.swing.JPanel painelTransferencia;
    private javax.swing.JTextField prazoVencimentoProduto;
    private javax.swing.JTextField rgCliente;
    private javax.swing.JButton sacarConta;
    private javax.swing.JTextField saldoConta;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTable tabelaConta;
    private javax.swing.JTable tabelaContratarProd;
    private javax.swing.JTable tabelaExtrato;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTable tabelaTipoProduto;
    private javax.swing.JTextField taxaFixaProduto;
    private javax.swing.JTextField taxaOperacionalProduto;
    private javax.swing.JTextField taxaRentabilidadeTipoProduto;
    private javax.swing.JTextField telefoneCliente;
    private javax.swing.JComboBox tipoPessoa;
    private javax.swing.JTextField tipoProduto;
    private javax.swing.JButton transferirTransf;
    private javax.swing.JTextField valorDepositoConta;
    private javax.swing.JTextField valorMinimoProduto;
    private javax.swing.JTextField valorSaqueConta;
    private javax.swing.JTextField valorTransf;
    // End of variables declaration//GEN-END:variables
}
