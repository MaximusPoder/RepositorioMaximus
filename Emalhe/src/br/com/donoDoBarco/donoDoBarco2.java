package br.com.donoDoBarco;

import br.com.conexao.Conexao;
import br.com.util.JDecimal2;
import br.com.util.JIntField;
import br.com.util.JMoneyField;
import br.com.util.Utilidade;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jhonathas
 */
public class donoDoBarco2 extends javax.swing.JFrame {

    private Conexao conexao;
    private int inicia_combo = 0; //Evita a ativação inicial do cbPescador
    private Utilidade util = new Utilidade();

    public donoDoBarco2() {
        initComponents(); //Inicializa os componentes da tela
        conexao = new Conexao();
        conexao.conecta("emalhe");
              
        //Insere nome do dono_barco no cbdono_barco
        attCbdono_barco();
        //Insere nome da Espécie no cbEspecie
        attCbs();
        mudar_estadoCB();

        mostra_dados();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casacasa = new javax.swing.ButtonGroup();
        banheirobanheiro = new javax.swing.ButtonGroup();
        inssinss = new javax.swing.ButtonGroup();
        embarcacao = new javax.swing.ButtonGroup();
        tipo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        ckbArmadorPescador = new javax.swing.JCheckBox();
        ckbAssalariado = new javax.swing.JCheckBox();
        cbDonoBarco = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        ckbAguaSim = new javax.swing.JCheckBox();
        ckbDrenagemSim = new javax.swing.JCheckBox();
        ckbFossaSim = new javax.swing.JCheckBox();
        jLabel41 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ckbIbamaSim = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        ckbPossuiRgp = new javax.swing.JCheckBox();
        jLabel37 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        ckbFamiliar = new javax.swing.JCheckBox();
        ckbParceria = new javax.swing.JCheckBox();
        ckbLuzSim = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tfQualAssociacao = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        ckbAssociacaoSim = new javax.swing.JCheckBox();
        tfDesdeQuandoDonoBarco = new br.com.util.JIntField();
        tfQualCooperativa = new javax.swing.JTextField();
        ckbCooperativaSim = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfQualColonia = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ckbColoniaSim = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAtividadeFamiliar = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        ckbRecebeBeneficioGovernoSim = new javax.swing.JCheckBox();
        btAdicionarRT = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfQuantidadeArtePesca = new JIntField();
        jLabel12 = new javax.swing.JLabel();
        tfTamanhoComposicaoPescaria = new javax.swing.JTextField();
        tfOutroTipoQual = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfNomeEmbarcacao = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tfComprimento = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        rbInssSim = new javax.swing.JRadioButton();
        rbInssNao = new javax.swing.JRadioButton();
        rbInssEmpregado = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtPrecoPescado = new javax.swing.JTable();
        btExcluirCP = new javax.swing.JButton();
        rbMadeira = new javax.swing.JRadioButton();
        rbAlvenaria = new javax.swing.JRadioButton();
        rbBanheiroDentro = new javax.swing.JRadioButton();
        rbBanheiroFora = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        tfQualBeneficio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        tfParentescoRT = new javax.swing.JTextField();
        tfAtividadeRT = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tfRendaRT = new JMoneyField();
        jLabel32 = new javax.swing.JLabel();
        btExcluirRT = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        tfValorPrecoEspecie = new JMoneyField();
        btAdicionarCP = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        cbEspecieComposicaoPescaria = new javax.swing.JComboBox();
        jLabel58 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ckbJanS = new javax.swing.JCheckBox();
        ckbFevS = new javax.swing.JCheckBox();
        ckbMarS = new javax.swing.JCheckBox();
        ckbAbrS = new javax.swing.JCheckBox();
        ckbMaiS = new javax.swing.JCheckBox();
        ckbJunS = new javax.swing.JCheckBox();
        ckbJulS = new javax.swing.JCheckBox();
        ckbSetS = new javax.swing.JCheckBox();
        ckbAgoS = new javax.swing.JCheckBox();
        ckbNovS = new javax.swing.JCheckBox();
        ckbOutS = new javax.swing.JCheckBox();
        ckbDezS = new javax.swing.JCheckBox();
        cbArtePescaComposicaoPescaria = new javax.swing.JComboBox();
        tfMalhaComposicaoPescaria = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        ckbGelo = new javax.swing.JCheckBox();
        ckbSal = new javax.swing.JCheckBox();
        ckbFrigorifico = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        ckbPretrchosPropriosSim = new javax.swing.JCheckBox();
        tfSePretrochosProprios = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfLocalCompPescaria = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfPqCompPescaria = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        tfCustoChumboCompPescaria = new JMoneyField();
        tfCustoEntralhamentoCompPescaria = new JMoneyField();
        tfCustoBoiasCompPescaria = new JMoneyField();
        tfViagemMesCompPescaria = new JIntField();
        tfProducaoViagemCompPescaria = new JDecimal2();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        cbEspecieVendaPescado = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        tfRendaMediaPescaria = new JMoneyField();
        jToggleButton7 = new javax.swing.JToggleButton();
        tfTipoGasto = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        cbGastosViagem = new javax.swing.JComboBox();
        jToggleButton8 = new javax.swing.JToggleButton();
        tfOutroCusto = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        tfQuantidadeCusto = new JIntField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jtGastosPorViagem = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        tfCustoCusto = new JMoneyField();
        tfOutrosGastos = new javax.swing.JTextField();
        jToggleButton9 = new javax.swing.JToggleButton();
        tfTipoGasto1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        tfCustoCusto1 = new JMoneyField();
        tfOutrosGastos1 = new javax.swing.JTextField();
        jScrollPane35 = new javax.swing.JScrollPane();
        jtGastosPorAno = new javax.swing.JTable();
        tfQuantidadeCusto1 = new JIntField();
        jLabel72 = new javax.swing.JLabel();
        cbGastosANO = new javax.swing.JComboBox();
        jToggleButton10 = new javax.swing.JToggleButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        tfOutroCusto1 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel77 = new javax.swing.JLabel();
        tfDestinoOutro = new javax.swing.JTextField();
        ckbDestinoAtravessador = new javax.swing.JCheckBox();
        ckbDestinoEmpresa = new javax.swing.JCheckBox();
        ckbDestinoCaminhao = new javax.swing.JCheckBox();
        ckbDestinoSupermercado = new javax.swing.JCheckBox();
        ckbDestinoOutro = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        ckbSimFinanciada = new javax.swing.JCheckBox();
        jLabel55 = new javax.swing.JLabel();
        tfQualInstituicao = new javax.swing.JTextField();
        tfFormaFinanciamento = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        tfTonBruta = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        tfTonLiq = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        cbMaterialCasco = new javax.swing.JComboBox();
        jLabel80 = new javax.swing.JLabel();
        cbPropulsao = new javax.swing.JComboBox();
        jLabel81 = new javax.swing.JLabel();
        tfNumeroCilindros = new JIntField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        tfTripulacao = new JIntField();
        jLabel85 = new javax.swing.JLabel();
        tfAnoConstrucao = new JIntField();
        jLabel86 = new javax.swing.JLabel();
        cbSitucao = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        ckbPossuiInscricaoSim = new javax.swing.JCheckBox();
        jLabel87 = new javax.swing.JLabel();
        ckbSimDependencia = new javax.swing.JCheckBox();
        ckbTipoCAM = new javax.swing.JCheckBox();
        ckbTipoBPP = new javax.swing.JCheckBox();
        ckbTipoBMP = new javax.swing.JCheckBox();
        ckbTipoOutros = new javax.swing.JCheckBox();
        btDadoEmbarcacao = new javax.swing.JToggleButton();
        btEcluirDadoEmbarcacao = new javax.swing.JToggleButton();
        jScrollPane39 = new javax.swing.JScrollPane();
        jtDadosEmbarcacao = new javax.swing.JTable();
        rbBarro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Questionário Dono do Barco");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar_janela(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        jLabel39.setText("Água encanada.:");

        ckbArmadorPescador.setText("Armador e pescador (arma o barco e vai pescar)");
        ckbArmadorPescador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbArmadorPescadorActionPerformed(evt);
            }
        });

        ckbAssalariado.setText("Assalariado (carteira assinada)");
        ckbAssalariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbAssalariadoActionPerformed(evt);
            }
        });

        cbDonoBarco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDonoBarcoItemStateChanged(evt);
            }
        });
        cbDonoBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDonoBarcoActionPerformed(evt);
            }
        });

        jLabel24.setText("Dono do Barco");

        jLabel40.setText("Drenagem pluvial.:");

        ckbAguaSim.setText("Sim");

        ckbDrenagemSim.setText("Sim");

        ckbFossaSim.setText("Sim");

        jLabel41.setText("Fossa seca ou sépica.:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel42.setText("Questionário Dono do Barco");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel42)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel43.setText("MORADIA");

        jLabel47.setText("Desde quando é pescador.:");

        jLabel5.setText("Possui carteira IBAMA.:");

        ckbIbamaSim.setText("Sim");

        jLabel6.setText("Possui Registro Feral de Pescador (RGP-MPA).:");

        ckbPossuiRgp.setText("Sim");

        jLabel37.setText("Banheiro.:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel48.setText("Relações de Trabalho");

        ckbFamiliar.setText("Familiar (o lucro fica em casa)");
        ckbFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbFamiliarActionPerformed(evt);
            }
        });

        ckbParceria.setText("Parceria, com vizinhos, amigos etc. (o lucro é dividido)");
        ckbParceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbParceriaActionPerformed(evt);
            }
        });

        ckbLuzSim.setText("Sim");

        jLabel38.setText("Casa.:");

        jLabel36.setText("Luz elétrica.:");

        jLabel45.setText("Qual.:");

        ckbAssociacaoSim.setText("Sim");

        ckbCooperativaSim.setText("Sim");

        jLabel4.setText("Cooperativa.:");

        jLabel46.setText("Qual.:");

        jLabel1.setText("Paga INSS.:");

        jLabel44.setText("Qual.:");

        jLabel3.setText("Em alguma associação.:");

        jLabel2.setText("Na colônia.:");

        ckbColoniaSim.setText("Sim");

        jTableAtividadeFamiliar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod", "Parentesco", "Atividade", "Renda"
            }
        ));
        jScrollPane2.setViewportView(jTableAtividadeFamiliar);

        jLabel7.setText("Recebe algum benefício do governo.:");

        ckbRecebeBeneficioGovernoSim.setText("Sim");
        ckbRecebeBeneficioGovernoSim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckbRecebeBeneficioGovernoSimStateChanged(evt);
            }
        });

        btAdicionarRT.setText("Adicionar");
        btAdicionarRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarRTActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel49.setText("Composição da Pescaria");

        jLabel8.setText("Pescaria Principal (espécie).:");

        jLabel9.setText("Safra.:");

        jLabel10.setText("Arte de pesca.:");

        jLabel11.setText("Quantidade.:");

        tfQuantidadeArtePesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeArtePescaActionPerformed(evt);
            }
        });

        jLabel12.setText("Tamanho.:");

        tfTamanhoComposicaoPescaria.setEditable(false);
        tfTamanhoComposicaoPescaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTamanhoComposicaoPescariaActionPerformed(evt);
            }
        });

        tfOutroTipoQual.setEditable(false);
        tfOutroTipoQual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOutroTipoQualActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel51.setText("Dados da Embarcação");

        jLabel22.setText("A embarcação foi financiada.:");

        jLabel23.setText("Tipo.:");

        jLabel25.setText("Qual.:");

        jLabel26.setText("Nome da embarcação:");

        tfNomeEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeEmbarcacaoActionPerformed(evt);
            }
        });

        jLabel27.setText("Comprimento.:");

        tfComprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfComprimentoActionPerformed(evt);
            }
        });

        jLabel29.setText("Como se faz a conservação do pescado.:");

        inssinss.add(rbInssSim);
        rbInssSim.setText("Sim autônomo");

        inssinss.add(rbInssNao);
        rbInssNao.setText("Sim empregado");

        inssinss.add(rbInssEmpregado);
        rbInssEmpregado.setText("Não");

        jtPrecoPescado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "cod", "Espécie", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtPrecoPescado);
        jtPrecoPescado.getColumnModel().getColumn(0).setResizable(false);

        btExcluirCP.setText("Excluir");
        btExcluirCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirCPActionPerformed(evt);
            }
        });

        casacasa.add(rbMadeira);
        rbMadeira.setText("Madeira");

        casacasa.add(rbAlvenaria);
        rbAlvenaria.setText("Alvenaria");

        banheirobanheiro.add(rbBanheiroDentro);
        rbBanheiroDentro.setText("Dentro");

        banheirobanheiro.add(rbBanheiroFora);
        rbBanheiroFora.setText("Fora");

        jLabel14.setText("Qual.:");

        tfQualBeneficio.setEditable(false);

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel30.setText("Parentesco:");

        jLabel31.setText("Atividade");

        jLabel32.setText("Renda");

        btExcluirRT.setText("Excluir");
        btExcluirRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirRTActionPerformed(evt);
            }
        });

        jLabel33.setText("Espécie.:");

        btAdicionarCP.setText("Adicionar");
        btAdicionarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarCPActionPerformed(evt);
            }
        });

        jLabel35.setText("Valor.:");

        cbEspecieComposicaoPescaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel58.setText("Anos");

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        ckbJanS.setText("jan");

        ckbFevS.setText("fev");

        ckbMarS.setText("mar");

        ckbAbrS.setText("abr");

        ckbMaiS.setText("mai");

        ckbJunS.setText("jun");

        ckbJulS.setText("jul");

        ckbSetS.setText("set");

        ckbAgoS.setText("ago");

        ckbNovS.setText("nov");

        ckbOutS.setText("out");

        ckbDezS.setText("dez");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ckbJulS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbJanS, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ckbFevS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbMarS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbAbrS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbMaiS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbJunS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ckbAgoS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbSetS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOutS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbNovS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDezS)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbJanS)
                    .addComponent(ckbFevS)
                    .addComponent(ckbMarS)
                    .addComponent(ckbAbrS)
                    .addComponent(ckbMaiS)
                    .addComponent(ckbJunS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbJulS)
                    .addComponent(ckbAgoS)
                    .addComponent(ckbSetS)
                    .addComponent(ckbOutS)
                    .addComponent(ckbNovS)
                    .addComponent(ckbDezS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbArtePescaComposicaoPescaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbArtePescaComposicaoPescaria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbArtePescaComposicaoPescariaItemStateChanged(evt);
            }
        });
        cbArtePescaComposicaoPescaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArtePescaComposicaoPescariaActionPerformed(evt);
            }
        });

        tfMalhaComposicaoPescaria.setEditable(false);
        tfMalhaComposicaoPescaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMalhaComposicaoPescariaActionPerformed(evt);
            }
        });

        jLabel59.setText("Malha.:");

        jLabel60.setText("metros");

        jLabel61.setText("milímetros");

        ckbGelo.setText("Gelo");

        ckbSal.setText("Sal");

        ckbFrigorifico.setText("Frigorífico");

        jLabel13.setText("Os petrechos são próprios?");

        ckbPretrchosPropriosSim.setText("Sim");
        ckbPretrchosPropriosSim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckbPretrchosPropriosSimStateChanged(evt);
            }
        });

        jLabel15.setText("Se não, de quem são.:");

        jLabel16.setText("Onde adquire as panagens ou redes prontas:");

        jLabel17.setText("Local.:");

        jLabel18.setText("Por quê.:");

        jLabel19.setText("Qual o custo do entalhamento.:");

        jLabel20.setText("Qual o custo com chumbos.:");

        jLabel21.setText("Qual o custo com bóias.:");

        jLabel62.setText("Quantas viagens por mês.:");

        jLabel63.setText("Produção por viagem.:");

        jLabel64.setText("kg");

        jLabel65.setText("A quanto vende o Kg do Pescado.:");

        cbEspecieVendaPescado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel34.setText("Qual a renda média por pescaria.:");

        jToggleButton7.setText("Adicionar");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jLabel69.setText("Quais os gastos com material utilizado na atividade (POR VIAGEM).");

        cbGastosViagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Combustível", "Lubrificante", "Gelo", "Rancho", "Pagamento de pescador - Vale", "Frete", "Carregador do pescado", "Gelo para transporte", "Outro" }));
        cbGastosViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGastosViagemActionPerformed(evt);
            }
        });

        jToggleButton8.setText("Excluir");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jLabel66.setText("Outros.:");

        jLabel67.setText("Custo/Unidade.:");

        jLabel70.setText("Tipo.:");

        tfQuantidadeCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeCustoActionPerformed(evt);
            }
        });

        jLabel71.setText("Quantidade.:");

        jtGastosPorViagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Gastos", "Tipo", "Quantidade", "Custo", "Outros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane34.setViewportView(jtGastosPorViagem);

        jLabel52.setText("Gastos:");

        tfOutrosGastos.setEditable(false);

        jToggleButton9.setText("Adicionar");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jLabel53.setText("Gastos:");

        tfOutrosGastos1.setEditable(false);

        jtGastosPorAno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Gastos", "Tipo", "Quantidade", "Custo", "Outros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane35.setViewportView(jtGastosPorAno);

        tfQuantidadeCusto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeCusto1ActionPerformed(evt);
            }
        });

        jLabel72.setText("Quantidade.:");

        cbGastosANO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manutenção Da Rede", "Manutenção Do Barco", "Outro" }));
        cbGastosANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGastosANOActionPerformed(evt);
            }
        });

        jToggleButton10.setText("Excluir");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jLabel73.setText("Quais os gastos com material utilizado na atividade (POR ANO).");

        jLabel74.setText("Custo/Unidade.:");

        jLabel75.setText("Tipo.:");

        jLabel76.setText("Outros.:");

        jLabel77.setText("Qual o destino da produção (pra onde você comercializa).");

        tfDestinoOutro.setEditable(false);

        ckbDestinoAtravessador.setText("Atravessador (balanceiro)");

        ckbDestinoEmpresa.setText("Empresa");

        ckbDestinoCaminhao.setText("Caminhão");

        ckbDestinoSupermercado.setText("Supermercado");

        ckbDestinoOutro.setText("Outro");
        ckbDestinoOutro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckbDestinoOutroStateChanged(evt);
            }
        });

        jLabel54.setText("Forma do financiamento.:");

        ckbSimFinanciada.setText("Sim.");

        jLabel55.setText("(De qual instituição?)");

        jLabel78.setText("(metros)");

        jLabel56.setText("Ton. Bruta.:");

        tfTonBruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTonBrutaActionPerformed(evt);
            }
        });

        jLabel57.setText("Ton. Liq.:");

        tfTonLiq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTonLiqActionPerformed(evt);
            }
        });

        jLabel79.setText("Material do casco.:");

        cbMaterialCasco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Madeira", "Aço", "Fibra", "Outro" }));

        jLabel80.setText("Propulsão.:");

        cbPropulsao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Motor", "Remo", "Vela", "Remo e Vela", "Outro" }));

        jLabel81.setText("Cilindros/HP.:");

        tfNumeroCilindros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroCilindrosActionPerformed(evt);
            }
        });

        jLabel82.setText("(N°)");

        jLabel83.setText(" Marca.:");

        tfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMarcaActionPerformed(evt);
            }
        });

        jLabel84.setText("Tripulação.:");

        tfTripulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTripulacaoActionPerformed(evt);
            }
        });

        jLabel85.setText("Ano de construção.:");

        tfAnoConstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoConstrucaoActionPerformed(evt);
            }
        });

        jLabel86.setText("Situação.:");

        cbSitucao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Bom", "Regular", "Ruim" }));

        jLabel28.setText("Possui inscrição (IBAMA/CAPITANIA).:");

        ckbPossuiInscricaoSim.setText("Sim");

        jLabel87.setText("Existe algum grau de dependência com um atravessador?");

        ckbSimDependencia.setText("Sim");

        ckbTipoCAM.setText("cam");

        ckbTipoBPP.setText("bpp");

        ckbTipoBMP.setText("bmp");

        ckbTipoOutros.setText("Outro");
        ckbTipoOutros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckbTipoOutrosStateChanged(evt);
            }
        });

        btDadoEmbarcacao.setText("Adicionar");
        btDadoEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDadoEmbarcacaoActionPerformed(evt);
            }
        });

        btEcluirDadoEmbarcacao.setText("Excluir");
        btEcluirDadoEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEcluirDadoEmbarcacaoActionPerformed(evt);
            }
        });

        jtDadosEmbarcacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Financiada", "Forma", "Nome", "Comprimento", "Ton Bruta", "Ton Líquida", "Material", "Propulsão", "Cilindros", "Marca", "Tripulação", "Ano", "Situação", "Inscrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane39.setViewportView(jtDadosEmbarcacao);

        casacasa.add(rbBarro);
        rbBarro.setText("Barro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ckbArmadorPescador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ckbAssalariado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ckbParceria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ckbFamiliar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDonoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDesdeQuandoDonoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ckbColoniaSim)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(ckbAssociacaoSim)
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel45))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ckbCooperativaSim)
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel46)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfQualCooperativa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfQualAssociacao)
                                    .addComponent(tfQualColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbInssSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbInssNao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbInssEmpregado))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbPossuiRgp))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ckbIbamaSim))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbMadeira)
                                .addGap(18, 18, 18)
                                .addComponent(rbAlvenaria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbBarro))
                            .addComponent(ckbLuzSim)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbRecebeBeneficioGovernoSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQualBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel59)
                                            .addComponent(jLabel12)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbEspecieComposicaoPescaria, 0, 156, Short.MAX_VALUE)
                                        .addComponent(cbArtePescaComposicaoPescaria, 0, 156, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tfTamanhoComposicaoPescaria, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                                .addComponent(tfMalhaComposicaoPescaria))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel60)
                                                .addComponent(jLabel61))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfQuantidadeArtePesca, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfParentescoRT, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfAtividadeRT, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfRendaRT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btAdicionarRT))
                                    .addComponent(btExcluirRT))
                                .addGap(58, 58, 58))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel37)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbDrenagemSim)
                                    .addComponent(ckbAguaSim)
                                    .addComponent(rbBanheiroDentro))
                                .addGap(18, 18, 18)
                                .addComponent(rbBanheiroFora))
                            .addComponent(ckbFossaSim)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(ckbSimFinanciada)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQualInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(296, 296, 296))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbPretrchosPropriosSim)
                    .addComponent(tfSePretrochosProprios, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(665, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(754, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLocalCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPqCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfViagemMesCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfCustoBoiasCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfCustoChumboCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCustoEntralhamentoCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProducaoViagemCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel64)
                .addContainerGap(558, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRendaMediaPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(728, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton8)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(jToggleButton7)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfQuantidadeCusto)
                            .addComponent(tfTipoGasto)
                            .addComponent(cbGastosViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCustoCusto)
                                    .addComponent(tfOutroCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfOutrosGastos))))
                .addGap(216, 216, 216))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(3, 3, 3)
                                .addComponent(cbEspecieVendaPescado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValorPrecoEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                                .addComponent(btAdicionarCP))
                            .addComponent(btExcluirCP))
                        .addGap(288, 288, 288)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton10)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(jToggleButton9)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel75)
                            .addComponent(jLabel72))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfQuantidadeCusto1)
                            .addComponent(tfTipoGasto1)
                            .addComponent(cbGastosANO, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel76)
                                    .addComponent(jLabel74))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCustoCusto1)
                                    .addComponent(tfOutroCusto1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfOutrosGastos1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)))
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(829, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFormaFinanciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(685, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(tfNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(678, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMaterialCasco, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPropulsao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(668, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumeroCilindros, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTripulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(542, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSitucao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(624, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbGelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbSal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbFrigorifico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbPossuiInscricaoSim)))
                .addContainerGap(615, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ckbDestinoAtravessador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDestinoEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDestinoCaminhao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDestinoSupermercado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDestinoOutro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDestinoOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbSimDependencia)
                .addContainerGap(656, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTonBruta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTonLiq, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbTipoCAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbTipoBPP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbTipoBMP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbTipoOutros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addGap(4, 4, 4)
                        .addComponent(tfOutroTipoQual, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(507, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEcluirDadoEmbarcacao)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(btDadoEmbarcacao))
                .addGap(216, 216, 216))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDonoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(ckbLuzSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbMadeira)
                        .addComponent(rbAlvenaria)
                        .addComponent(rbBarro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBanheiroDentro)
                    .addComponent(jLabel37)
                    .addComponent(rbBanheiroFora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckbAguaSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckbDrenagemSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbFossaSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbInssSim)
                    .addComponent(rbInssNao)
                    .addComponent(rbInssEmpregado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbColoniaSim)
                    .addComponent(jLabel44)
                    .addComponent(tfQualColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQualAssociacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbAssociacaoSim)
                    .addComponent(jLabel45)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbCooperativaSim)
                    .addComponent(jLabel46)
                    .addComponent(tfQualCooperativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(tfDesdeQuandoDonoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbIbamaSim)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbPossuiRgp)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addGap(5, 5, 5)
                .addComponent(ckbFamiliar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbParceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbAssalariado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbArmadorPescador)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tfParentescoRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(tfAtividadeRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(tfRendaRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarRT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirRT)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbRecebeBeneficioGovernoSim)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(tfQualBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(cbEspecieComposicaoPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbArtePescaComposicaoPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTamanhoComposicaoPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel60)
                            .addComponent(tfQuantidadeArtePesca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(tfMalhaComposicaoPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(ckbPretrchosPropriosSim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tfSePretrochosProprios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(tfPqCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLocalCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(tfCustoEntralhamentoCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(tfCustoChumboCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tfCustoBoiasCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(tfViagemMesCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)
                            .addComponent(tfProducaoViagemCompPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(cbEspecieVendaPescado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(tfValorPrecoEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAdicionarCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tfRendaMediaPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jLabel69)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(cbGastosViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOutrosGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(tfTipoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCustoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(tfQuantidadeCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(tfOutroCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton7)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton8)
                .addGap(2, 2, 2)
                .addComponent(jLabel73)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(cbGastosANO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOutrosGastos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(tfTipoGasto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCustoCusto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(tfQuantidadeCusto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76)
                    .addComponent(tfOutroCusto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton9)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton10)
                .addGap(12, 12, 12)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbDestinoAtravessador)
                    .addComponent(ckbDestinoEmpresa)
                    .addComponent(ckbDestinoCaminhao)
                    .addComponent(ckbDestinoSupermercado)
                    .addComponent(ckbDestinoOutro)
                    .addComponent(tfDestinoOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(ckbSimDependencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(ckbSimFinanciada)
                    .addComponent(jLabel55)
                    .addComponent(tfQualInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(tfFormaFinanciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(ckbTipoCAM)
                    .addComponent(ckbTipoBPP)
                    .addComponent(ckbTipoBMP)
                    .addComponent(ckbTipoOutros)
                    .addComponent(jLabel25)
                    .addComponent(tfOutroTipoQual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel56)
                    .addComponent(tfTonBruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(tfTonLiq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(cbMaterialCasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(cbPropulsao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(tfNumeroCilindros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(tfTripulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(tfAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(cbSitucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ckbGelo)
                    .addComponent(ckbSal)
                    .addComponent(ckbFrigorifico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(ckbPossuiInscricaoSim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDadoEmbarcacao)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEcluirDadoEmbarcacao)
                .addGap(34, 34, 34)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-917)/2, (screenSize.height-516)/2, 917, 516);
    }// </editor-fold>//GEN-END:initComponents

    private void fechar_janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar_janela
        conexao.desconecta();
    }//GEN-LAST:event_fechar_janela

    private void tfComprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfComprimentoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfComprimentoActionPerformed

    private void tfNomeEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeEmbarcacaoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfNomeEmbarcacaoActionPerformed

    private void tfOutroTipoQualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOutroTipoQualActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfOutroTipoQualActionPerformed

    private void tfTamanhoComposicaoPescariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTamanhoComposicaoPescariaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfTamanhoComposicaoPescariaActionPerformed

    private void tfQuantidadeArtePescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeArtePescaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfQuantidadeArtePescaActionPerformed

    private void ckbParceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbParceriaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ckbParceriaActionPerformed

    private void ckbFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbFamiliarActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ckbFamiliarActionPerformed

    private void cbDonoBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDonoBarcoActionPerformed
        if (inicia_combo == 1){
            mostra_dados();
        }
        inicia_combo = 1;
    }//GEN-LAST:event_cbDonoBarcoActionPerformed

    private void cbDonoBarcoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDonoBarcoItemStateChanged
        //System.out.println("trocou");
}//GEN-LAST:event_cbDonoBarcoItemStateChanged

    private void ckbAssalariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbAssalariadoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ckbAssalariadoActionPerformed

    private void ckbArmadorPescadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbArmadorPescadorActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ckbArmadorPescadorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        salvar_dados();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        atualizar_dados();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btAdicionarRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarRTActionPerformed
        addBtRt();
    }//GEN-LAST:event_btAdicionarRTActionPerformed

    private void btAdicionarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarCPActionPerformed
        addBtCP();
    }//GEN-LAST:event_btAdicionarCPActionPerformed

    private void btExcluirRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRTActionPerformed
        excluirRT();
    }//GEN-LAST:event_btExcluirRTActionPerformed

    private void btExcluirCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirCPActionPerformed
        excluirCP();
    }//GEN-LAST:event_btExcluirCPActionPerformed

    private void ckbRecebeBeneficioGovernoSimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbRecebeBeneficioGovernoSimStateChanged
       if (ckbRecebeBeneficioGovernoSim.isSelected()){ // Marcar outros e deixar o TF ser editado
            tfQualBeneficio.setEditable(true);
        }
        else{
            tfQualBeneficio.setEditable(false);
            tfQualBeneficio.setText("");
        }
    }//GEN-LAST:event_ckbRecebeBeneficioGovernoSimStateChanged

    private void tfMalhaComposicaoPescariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMalhaComposicaoPescariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMalhaComposicaoPescariaActionPerformed

    private void cbArtePescaComposicaoPescariaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbArtePescaComposicaoPescariaItemStateChanged
        
    }//GEN-LAST:event_cbArtePescaComposicaoPescariaItemStateChanged

    private void cbArtePescaComposicaoPescariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArtePescaComposicaoPescariaActionPerformed
        if (inicia_combo == 1){
             mudar_estadoCB();
        }
        inicia_combo = 1;
    }//GEN-LAST:event_cbArtePescaComposicaoPescariaActionPerformed

    private void ckbPretrchosPropriosSimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbPretrchosPropriosSimStateChanged
        if (ckbPretrchosPropriosSim.isSelected()) {
            tfSePretrochosProprios.setEditable(false);
            tfSePretrochosProprios.setText("");
        } else {
            tfSePretrochosProprios.setEditable(true);
        }
    }//GEN-LAST:event_ckbPretrchosPropriosSimStateChanged

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
    AddjtGastosPorViagem();
}//GEN-LAST:event_jToggleButton7ActionPerformed

    private void cbGastosViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGastosViagemActionPerformed
    mudar_estadoCB();
}//GEN-LAST:event_cbGastosViagemActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
    DeljtGastosPorViagem();
}//GEN-LAST:event_jToggleButton8ActionPerformed

    private void tfQuantidadeCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeCustoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfQuantidadeCustoActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        AddjtGastosPorAno();
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void tfQuantidadeCusto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeCusto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeCusto1ActionPerformed

    private void cbGastosANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGastosANOActionPerformed
        mudar_estadoCB();
    }//GEN-LAST:event_cbGastosANOActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        DeljtGastosPorAno();
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void ckbDestinoOutroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbDestinoOutroStateChanged
        if (ckbDestinoOutro.isSelected()) {
            tfDestinoOutro.setEditable(true);
        } else {
            tfDestinoOutro.setEditable(false);
            tfDestinoOutro.setText("");
        }
    }//GEN-LAST:event_ckbDestinoOutroStateChanged

    private void tfTonBrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTonBrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTonBrutaActionPerformed

    private void tfTonLiqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTonLiqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTonLiqActionPerformed

    private void tfNumeroCilindrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroCilindrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroCilindrosActionPerformed

    private void tfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMarcaActionPerformed

    private void tfTripulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTripulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTripulacaoActionPerformed

    private void tfAnoConstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoConstrucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoConstrucaoActionPerformed

    private void ckbTipoOutrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbTipoOutrosStateChanged
        if (ckbTipoOutros.isSelected()) {
            tfOutroTipoQual.setEditable(true);
        } else {
            tfOutroTipoQual.setEditable(false);
            tfOutroTipoQual.setText("");
        }
    }//GEN-LAST:event_ckbTipoOutrosStateChanged

    private void btEcluirDadoEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEcluirDadoEmbarcacaoActionPerformed
       DeljtDadosEmbarcacao();
}//GEN-LAST:event_btEcluirDadoEmbarcacaoActionPerformed

    private void btDadoEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDadoEmbarcacaoActionPerformed
        AddDadosEmbarcacao();
}//GEN-LAST:event_btDadoEmbarcacaoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new donoDoBarco2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup banheirobanheiro;
    private javax.swing.JButton btAdicionarCP;
    private javax.swing.JButton btAdicionarRT;
    private javax.swing.JToggleButton btDadoEmbarcacao;
    private javax.swing.JToggleButton btEcluirDadoEmbarcacao;
    private javax.swing.JButton btExcluirCP;
    private javax.swing.JButton btExcluirRT;
    private javax.swing.ButtonGroup casacasa;
    private javax.swing.JComboBox cbArtePescaComposicaoPescaria;
    private javax.swing.JComboBox cbDonoBarco;
    private javax.swing.JComboBox cbEspecieComposicaoPescaria;
    private javax.swing.JComboBox cbEspecieVendaPescado;
    private javax.swing.JComboBox cbGastosANO;
    private javax.swing.JComboBox cbGastosViagem;
    private javax.swing.JComboBox cbMaterialCasco;
    private javax.swing.JComboBox cbPropulsao;
    private javax.swing.JComboBox cbSitucao;
    private javax.swing.JCheckBox ckbAbrS;
    private javax.swing.JCheckBox ckbAgoS;
    private javax.swing.JCheckBox ckbAguaSim;
    private javax.swing.JCheckBox ckbArmadorPescador;
    private javax.swing.JCheckBox ckbAssalariado;
    private javax.swing.JCheckBox ckbAssociacaoSim;
    private javax.swing.JCheckBox ckbColoniaSim;
    private javax.swing.JCheckBox ckbCooperativaSim;
    private javax.swing.JCheckBox ckbDestinoAtravessador;
    private javax.swing.JCheckBox ckbDestinoCaminhao;
    private javax.swing.JCheckBox ckbDestinoEmpresa;
    private javax.swing.JCheckBox ckbDestinoOutro;
    private javax.swing.JCheckBox ckbDestinoSupermercado;
    private javax.swing.JCheckBox ckbDezS;
    private javax.swing.JCheckBox ckbDrenagemSim;
    private javax.swing.JCheckBox ckbFamiliar;
    private javax.swing.JCheckBox ckbFevS;
    private javax.swing.JCheckBox ckbFossaSim;
    private javax.swing.JCheckBox ckbFrigorifico;
    private javax.swing.JCheckBox ckbGelo;
    private javax.swing.JCheckBox ckbIbamaSim;
    private javax.swing.JCheckBox ckbJanS;
    private javax.swing.JCheckBox ckbJulS;
    private javax.swing.JCheckBox ckbJunS;
    private javax.swing.JCheckBox ckbLuzSim;
    private javax.swing.JCheckBox ckbMaiS;
    private javax.swing.JCheckBox ckbMarS;
    private javax.swing.JCheckBox ckbNovS;
    private javax.swing.JCheckBox ckbOutS;
    private javax.swing.JCheckBox ckbParceria;
    private javax.swing.JCheckBox ckbPossuiInscricaoSim;
    private javax.swing.JCheckBox ckbPossuiRgp;
    private javax.swing.JCheckBox ckbPretrchosPropriosSim;
    private javax.swing.JCheckBox ckbRecebeBeneficioGovernoSim;
    private javax.swing.JCheckBox ckbSal;
    private javax.swing.JCheckBox ckbSetS;
    private javax.swing.JCheckBox ckbSimDependencia;
    private javax.swing.JCheckBox ckbSimFinanciada;
    private javax.swing.JCheckBox ckbTipoBMP;
    private javax.swing.JCheckBox ckbTipoBPP;
    private javax.swing.JCheckBox ckbTipoCAM;
    private javax.swing.JCheckBox ckbTipoOutros;
    private javax.swing.ButtonGroup embarcacao;
    private javax.swing.ButtonGroup inssinss;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTableAtividadeFamiliar;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JTable jtDadosEmbarcacao;
    private javax.swing.JTable jtGastosPorAno;
    private javax.swing.JTable jtGastosPorViagem;
    private javax.swing.JTable jtPrecoPescado;
    private javax.swing.JRadioButton rbAlvenaria;
    private javax.swing.JRadioButton rbBanheiroDentro;
    private javax.swing.JRadioButton rbBanheiroFora;
    private javax.swing.JRadioButton rbBarro;
    private javax.swing.JRadioButton rbInssEmpregado;
    private javax.swing.JRadioButton rbInssNao;
    private javax.swing.JRadioButton rbInssSim;
    private javax.swing.JRadioButton rbMadeira;
    private javax.swing.JTextField tfAnoConstrucao;
    private javax.swing.JTextField tfAtividadeRT;
    private javax.swing.JTextField tfComprimento;
    private javax.swing.JTextField tfCustoBoiasCompPescaria;
    private javax.swing.JTextField tfCustoChumboCompPescaria;
    private javax.swing.JTextField tfCustoCusto;
    private javax.swing.JTextField tfCustoCusto1;
    private javax.swing.JTextField tfCustoEntralhamentoCompPescaria;
    private javax.swing.JTextField tfDesdeQuandoDonoBarco;
    private javax.swing.JTextField tfDestinoOutro;
    private javax.swing.JTextField tfFormaFinanciamento;
    private javax.swing.JTextField tfLocalCompPescaria;
    private javax.swing.JTextField tfMalhaComposicaoPescaria;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNomeEmbarcacao;
    private javax.swing.JTextField tfNumeroCilindros;
    private javax.swing.JTextField tfOutroCusto;
    private javax.swing.JTextField tfOutroCusto1;
    private javax.swing.JTextField tfOutroTipoQual;
    private javax.swing.JTextField tfOutrosGastos;
    private javax.swing.JTextField tfOutrosGastos1;
    private javax.swing.JTextField tfParentescoRT;
    private javax.swing.JTextField tfPqCompPescaria;
    private javax.swing.JTextField tfProducaoViagemCompPescaria;
    private javax.swing.JTextField tfQualAssociacao;
    private javax.swing.JTextField tfQualBeneficio;
    private javax.swing.JTextField tfQualColonia;
    private javax.swing.JTextField tfQualCooperativa;
    private javax.swing.JTextField tfQualInstituicao;
    private javax.swing.JTextField tfQuantidadeArtePesca;
    private javax.swing.JTextField tfQuantidadeCusto;
    private javax.swing.JTextField tfQuantidadeCusto1;
    private javax.swing.JTextField tfRendaMediaPescaria;
    private javax.swing.JTextField tfRendaRT;
    private javax.swing.JTextField tfSePretrochosProprios;
    private javax.swing.JTextField tfTamanhoComposicaoPescaria;
    private javax.swing.JTextField tfTipoGasto;
    private javax.swing.JTextField tfTipoGasto1;
    private javax.swing.JTextField tfTonBruta;
    private javax.swing.JTextField tfTonLiq;
    private javax.swing.JTextField tfTripulacao;
    private javax.swing.JTextField tfValorPrecoEspecie;
    private javax.swing.JTextField tfViagemMesCompPescaria;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables


    private void salvar_dados(){
    String sqlinsert = new String();
    String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());
    System.out.println(codigo);

        //Pescador Moradia
            //Pegando ites do CB
            String tcasa = new String();

            if (rbMadeira.isSelected())
                   tcasa = "Madeira";
            else if (rbAlvenaria.isSelected())
                   tcasa = "Alvenaria";
            else if (rbBarro.isSelected())
                   tcasa = "Barro";

            String tbanheiro = new String();

            if (rbBanheiroDentro.isSelected())
                   tbanheiro = "Dentro";
            else if (rbBanheiroFora.isSelected())
                   tbanheiro = "Fora";

            String tinss = new String();

            if (rbInssSim.isSelected())
                   tinss = "Sim";
            else if (rbInssNao.isSelected())
                   tinss = "Não";
            else if (rbInssEmpregado.isSelected())
                   tinss = "Empregado";


            sqlinsert = "insert into dono_barco_moradia "
                    + "(cod_dono_barco,casa,luz,banheiro,agua_encanada,"
                    + "drenagem_pluvial,fossa,paga_inss,colonia,colonia_qual,"
                    + "associacao,associacao_qual,cooperativa,cooperativa_qual,"
                    + "tempo_pescador,possui_carteira_ibama,"
                    + "possui_rgp) values ("+
                    codigo+",'"+
                    tcasa+"','"+
                    util.checarCkb(ckbLuzSim)+"','"+
                    tbanheiro+"','"+
                    util.checarCkb(ckbAguaSim)+"','"+
                    util.checarCkb(ckbDrenagemSim)+"','"+
                    util.checarCkb(ckbFossaSim)+"','"+
                    tinss+"','"+
                    util.checarCkb(ckbColoniaSim)+"','"+
                    tfQualColonia.getText()+"','"+
                    util.checarCkb(ckbAssociacaoSim)+"','"+
                    tfQualAssociacao.getText()+"','"+
                    util.checarCkb(ckbCooperativaSim)+"','"+
                    tfQualCooperativa.getText()+"','"+
                    tfDesdeQuandoDonoBarco.getText()+"','"+
                    util.checarCkb(ckbIbamaSim)+"','"+
                    util.checarCkb(ckbPossuiRgp)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("1 dono_barco_moradia - Cadastrado com sucesso");
            }
        
  
        //Relações de Trabalho
        
            sqlinsert = "insert into dono_barco_relacoes_trabalho "
                    + "(cod_dono_barco,familiar,parceria,assalariado,"
                    + "armador_pescador,recebe_beneficio,beneficio) values ("+
                    codigo+",'"+
                    util.checarCkb(ckbFamiliar)+"','"+
                    util.checarCkb(ckbParceria)+"','"+
                    util.checarCkb(ckbAssalariado)+"','"+
                    util.checarCkb(ckbArmadorPescador)+"','"+
                    util.checarCkb(ckbRecebeBeneficioGovernoSim)+"','"+
                    tfQualBeneficio.getText()+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("2 dono_barco_relacoes_trabalho - Cadastrado com sucesso");
            }
        
            sqlinsert = "insert into dono_barco_composicao_pescaria "
                    + "(cod_dono_barco,pescaria_principal,arte_pesca,"
                    + "quantidade_arte_pesca,tamanho,malha,petrechos_proprios,"
                    + "de_quem_petrecho,onde_adquire_panagens_local,onde_adquire_panagens_pq,"
                    + "custo_entalhamento,custo_chumbo,custo_boias,qtd_viagem_mes,producao_viagem,"
                    + "renda_media_por_pescaria,destino_atravessador,destino_empresa,"
                    + "destino_caminhao,destino_supermercado,destino_outros,"
                    + "destino_outros_quais,existe_dependencia,"
                    + "safra_jan,safra_fev,safra_mar,safra_abr,safra_mai,safra_jun,"
                    + "safra_jul,safra_ago,safra_set,safra_out,safra_nov,safra_dez) values ("+
                    codigo+",'"+
                    cbEspecieComposicaoPescaria.getSelectedItem()+"','"+
                    cbArtePescaComposicaoPescaria.getSelectedItem()+"','"+
                    tfQuantidadeArtePesca.getText()+"','"+
                    tfTamanhoComposicaoPescaria.getText()+"','"+
                    tfMalhaComposicaoPescaria.getText()+"','"+

                    util.checarCkb(ckbPretrchosPropriosSim)+"','"+
                    tfSePretrochosProprios.getText()+"','"+
                    tfLocalCompPescaria.getText()+"','"+
                    tfPqCompPescaria.getText()+"','"+
                    tfCustoEntralhamentoCompPescaria.getText()+"','"+
                    tfCustoChumboCompPescaria.getText()+"','"+
                    tfCustoBoiasCompPescaria.getText()+"','"+
                    tfViagemMesCompPescaria.getText()+"','"+
                    tfProducaoViagemCompPescaria.getText()+"','"+
                    tfRendaMediaPescaria.getText()+"','"+
                    util.checarCkb(ckbDestinoAtravessador)+"','"+
                    util.checarCkb(ckbDestinoEmpresa)+"','"+
                    util.checarCkb(ckbDestinoCaminhao)+"','"+
                    util.checarCkb(ckbDestinoSupermercado)+"','"+
                    util.checarCkb(ckbDestinoOutro)+"','"+
                    tfDestinoOutro.getText()+"','"+
                    util.checarCkb(ckbSimDependencia)+"','"+

                    util.checarCkb(ckbJanS)+"','"+
                    util.checarCkb(ckbFevS)+"','"+
                    util.checarCkb(ckbMarS)+"','"+
                    util.checarCkb(ckbAbrS)+"','"+
                    util.checarCkb(ckbMaiS)+"','"+
                    util.checarCkb(ckbJunS)+"','"+
                    util.checarCkb(ckbJulS)+"','"+
                    util.checarCkb(ckbAgoS)+"','"+
                    util.checarCkb(ckbSetS)+"','"+
                    util.checarCkb(ckbOutS)+"','"+
                    util.checarCkb(ckbNovS)+"','"+
                    util.checarCkb(ckbDezS)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("3 dono_barco_composicao_pescaria - Cadastrado com sucesso");
                JOptionPane.showMessageDialog(null,"Salvo com sucesso");
                //agora é hora de atualizar o resultset
                mostra_dados();
            }


    }

    private void atualizar_dados(){
    String sqlupdate = new String();
    String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());
    System.out.println(codigo);

    //Pescador Moradia
            //</Pegando ites do CB
            String tcasa = new String();

            if (rbMadeira.isSelected())
                   tcasa = "Madeira";
            else if (rbAlvenaria.isSelected())
                   tcasa = "Alvenaria";
            else if (rbBarro.isSelected())
                   tcasa = "Barro";

            String tbanheiro = new String();

            if (rbBanheiroDentro.isSelected())
                   tbanheiro = "Dentro";
            else if (rbBanheiroFora.isSelected())
                   tbanheiro = "Fora";

            String tinss = new String();

            if (rbInssSim.isSelected())
                   tinss = "Sim";
            else if (rbInssNao.isSelected())
                   tinss = "Não";
            else if (rbInssEmpregado.isSelected())
                   tinss = "Empregado";
            //Pegando ites do CB/>

            sqlupdate ="UPDATE dono_barco_moradia SET "
                    +"casa = '"+tcasa+"',"
                    +"luz = '"+util.checarCkb(ckbLuzSim)+"',"
                    +"banheiro = '"+tbanheiro+"',"
                    +"agua_encanada = '"+util.checarCkb(ckbAguaSim)+"',"
                    +"drenagem_pluvial = '"+util.checarCkb(ckbDrenagemSim)+"',"
                    +"fossa = '"+util.checarCkb(ckbFossaSim)+"',"
                    +"paga_inss = '"+tinss+"',"
                    +"colonia = '"+util.checarCkb(ckbColoniaSim)+"',"
                    +"colonia_qual = '"+tfQualColonia.getText()+"',"
                    +"associacao = '"+util.checarCkb(ckbAssociacaoSim)+"',"
                    +"associacao_qual = '"+tfQualAssociacao.getText()+"',"
                    +"cooperativa = '"+util.checarCkb(ckbCooperativaSim)+"',"
                    +"cooperativa_qual = '"+tfQualCooperativa.getText()+"',"
                    +"tempo_pescador = '"+tfDesdeQuandoDonoBarco.getText()+"',"
                    +"possui_carteira_ibama = '"+util.checarCkb(ckbIbamaSim)+"',"
                    +"possui_rgp = '"+util.checarCkb(ckbPossuiRgp)+"' "+

                    "where cod_dono_barco = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                System.out.println("1 Pescador Moradia - Atualizado com sucesso");
                //Atualiza Resultset
            }

        //Relações de Trabalho

            sqlupdate ="UPDATE dono_barco_relacoes_trabalho SET "
                    +"familiar = '"+util.checarCkb(ckbFamiliar)+"',"
                    +"parceria = '"+util.checarCkb(ckbParceria)+"',"
                    +"assalariado = '"+util.checarCkb(ckbAssalariado)+"',"
                    +"armador_pescador = '"+util.checarCkb(ckbArmadorPescador)+"',"
                    +"recebe_beneficio = '"+util.checarCkb(ckbRecebeBeneficioGovernoSim)+"',"
                    +"beneficio = '"+tfQualBeneficio.getText()+"' "+

                    "where cod_dono_barco = "+codigo;


            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlupdate)) {
                System.out.println("2 Relações de Trabalho - Atualizado com sucesso");
            }


        //Composição da Pescaria

            sqlupdate ="UPDATE dono_barco_composicao_pescaria SET "
                    +"pescaria_principal = '"+cbEspecieComposicaoPescaria.getSelectedItem()+"',"
                    +"safra_jan = '"+util.checarCkb(ckbJanS)+"',"
                    +"safra_fev = '"+util.checarCkb(ckbFevS)+"',"
                    +"safra_mar = '"+util.checarCkb(ckbMarS)+"',"
                    +"safra_abr = '"+util.checarCkb(ckbAbrS)+"',"
                    +"safra_mai = '"+util.checarCkb(ckbMaiS)+"',"
                    +"safra_jun = '"+ util.checarCkb(ckbJunS)+"',"
                    +"safra_jul = '"+util.checarCkb(ckbJulS)+"',"
                    +"safra_ago = '"+util.checarCkb(ckbAgoS)+"',"
                    +"safra_set = '"+util.checarCkb(ckbSetS)+"',"
                    +"safra_out = '"+util.checarCkb(ckbOutS)+"',"
                    +"safra_nov = '"+util.checarCkb(ckbNovS)+"',"
                    +"safra_dez = '"+util.checarCkb(ckbDezS)+"',"
                    +"arte_pesca = '"+cbArtePescaComposicaoPescaria.getSelectedItem()+"',"
                    +"quantidade_arte_pesca = '"+tfQuantidadeArtePesca.getText()+"',"
                    +"tamanho = '"+tfTamanhoComposicaoPescaria.getText()+"',"
                    +"malha = '"+tfMalhaComposicaoPescaria.getText()+"',"
                   
                    +"petrechos_proprios = '"+util.checarCkb(ckbPretrchosPropriosSim)+"',"
                    +"de_quem_petrecho = '"+tfSePretrochosProprios.getText()+"',"
                    +"onde_adquire_panagens_local = '"+tfLocalCompPescaria.getText()+"',"
                    +"onde_adquire_panagens_pq = '"+tfPqCompPescaria.getText()+"',"
                    +"custo_entalhamento = '"+tfCustoEntralhamentoCompPescaria.getText()+"',"
                    +"custo_chumbo = '"+tfCustoChumboCompPescaria.getText()+"',"
                    +"custo_boias = '"+tfCustoBoiasCompPescaria.getText()+"',"
                    +"qtd_viagem_mes = '"+tfViagemMesCompPescaria.getText()+"',"
                    +"producao_viagem = '"+tfProducaoViagemCompPescaria.getText()+"',"
                    +"renda_media_por_pescaria = '"+tfRendaMediaPescaria.getText()+"',"
                    +"destino_atravessador = '"+util.checarCkb(ckbDestinoAtravessador)+"',"
                    +"destino_empresa = '"+util.checarCkb(ckbDestinoEmpresa)+"',"
                    +"destino_caminhao = '"+util.checarCkb(ckbDestinoCaminhao)+"',"
                    +"destino_supermercado = '"+util.checarCkb(ckbDestinoSupermercado)+"',"
                    +"destino_outros = '"+util.checarCkb(ckbDestinoOutro)+"',"
                    +"destino_outros_quais = '"+tfDestinoOutro.getText()+"',"
                    +"existe_dependencia = '"+util.checarCkb(ckbSimDependencia)+"' "+

                    "where cod_dono_barco = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.salvar(sqlupdate)) {
                System.out.println("3 Composição da Pescaria - Alterado com sucesso");
                JOptionPane.showMessageDialog(null,"Alterado com sucesso");
                //agora é hora de atualizar o resultset
                mostra_dados();
            }


    }

    private void mostra_dados(){
        limpar_dados();

        attjtGastosPorViagem();
        attjtPrecoPescado();
        attjtGastosPorAno();
        attjtDadosEmbarcacao();

        String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());
        System.out.println(codigo);
        try {
            //dono_barco Moradia
            conexao.execute("SELECT * FROM dono_barco_moradia WHERE cod_dono_barco = "+codigo);
            conexao.resultSet.first();

            //Selecionar os check boxes conforme o BD
            String testador;

            testador = conexao.resultSet.getString("casa");
            if (testador.equals("Madeira"))
                   rbMadeira.setSelected(true);
            else
                   rbMadeira.setSelected(false);

            if (testador.equals("Alvenaria"))
                   rbAlvenaria.setSelected(true);
            else
                   rbAlvenaria.setSelected(false);

            if (testador.equals("Barro"))
                   rbBarro.setSelected(true);
            else
                   rbBarro.setSelected(false);

            if (conexao.resultSet.getString("luz").equals("1"))
                   ckbLuzSim.setSelected(true);
            else
                   ckbLuzSim.setSelected(false);

            testador = conexao.resultSet.getString("banheiro");
            if (testador.equals("Dentro"))
                   rbBanheiroDentro.setSelected(true);
            else
                   rbBanheiroDentro.setSelected(false);

            if (testador.equals("Fora"))
                   rbBanheiroFora.setSelected(true);
            else
                   rbBanheiroFora.setSelected(false);
            
            if (conexao.resultSet.getString("agua_encanada").equals("1"))
                   ckbAguaSim.setSelected(true);
            else
                   ckbAguaSim.setSelected(false);

            if (conexao.resultSet.getString("drenagem_pluvial").equals("1"))
                   ckbDrenagemSim.setSelected(true);
            else
                   ckbDrenagemSim.setSelected(false);

            if (conexao.resultSet.getString("fossa").equals("1"))
                   ckbFossaSim.setSelected(true);
            else
                   ckbFossaSim.setSelected(false);

            testador = conexao.resultSet.getString("paga_inss");
            if (testador.equals("Sim"))
                   rbInssSim.setSelected(true);
            else
                   rbInssSim.setSelected(false);

            if (testador.equals("Não"))
                   rbInssNao.setSelected(true);
            else
                   rbInssNao.setSelected(false);

            if (testador.equals("Empregado"))
                   rbInssEmpregado.setSelected(true);
            else
                   rbInssEmpregado.setSelected(false);

            if (conexao.resultSet.getString("colonia").equals("1"))
                   ckbColoniaSim.setSelected(true);
            else
                   ckbColoniaSim.setSelected(false);

            tfQualColonia.setText(conexao.resultSet.getString("colonia_qual"));

            if (conexao.resultSet.getString("associacao").equals("1"))
                   ckbAssociacaoSim.setSelected(true);
            else
                   ckbAssociacaoSim.setSelected(false);

            tfQualAssociacao.setText(conexao.resultSet.getString("associacao_qual"));

            if (conexao.resultSet.getString("cooperativa").equals("1"))
                   ckbCooperativaSim.setSelected(true);
            else
                   ckbCooperativaSim.setSelected(false);

            tfQualCooperativa.setText(conexao.resultSet.getString("cooperativa_qual"));

            tfDesdeQuandoDonoBarco.setText(conexao.resultSet.getString("tempo_pescador"));

            if (conexao.resultSet.getString("possui_carteira_ibama").equals("1"))
                   ckbIbamaSim.setSelected(true);
            else
                   ckbIbamaSim.setSelected(false);

            if (conexao.resultSet.getString("possui_rgp").equals("1"))
                   ckbPossuiRgp.setSelected(true);
            else
                   ckbPossuiRgp.setSelected(false);

            System.out.println("Passou! Moradia");

//            Relações de Trabalho
            conexao.execute("SELECT * FROM dono_barco_relacoes_trabalho WHERE cod_dono_barco = "+codigo);
            conexao.resultSet.first();

            if (conexao.resultSet.getString("familiar").equals("1"))
                   ckbFamiliar.setSelected(true);
            else
                   ckbFamiliar.setSelected(false);

            if (conexao.resultSet.getString("parceria").equals("1"))
                   ckbParceria.setSelected(true);
            else
                   ckbParceria.setSelected(false);

            if (conexao.resultSet.getString("assalariado").equals("1"))
                   ckbAssalariado.setSelected(true);
            else
                   ckbAssalariado.setSelected(false);

            if (conexao.resultSet.getString("armador_pescador").equals("1"))
                   ckbArmadorPescador.setSelected(true);
            else
                   ckbArmadorPescador.setSelected(false);

            if (conexao.resultSet.getString("recebe_beneficio").equals("1"))
                   ckbRecebeBeneficioGovernoSim.setSelected(true);
            else
                   ckbRecebeBeneficioGovernoSim.setSelected(false);

            tfQualBeneficio.setText(conexao.resultSet.getString("beneficio"));

            System.out.println("Passou! Relações de Trabalho");

             //Composição da Pescaria
            conexao.execute("SELECT * FROM dono_barco_composicao_pescaria WHERE cod_dono_barco = "+codigo);
            conexao.resultSet.first();

            cbEspecieComposicaoPescaria.setSelectedItem(conexao.resultSet.getString("pescaria_principal"));
            
            if (conexao.resultSet.getString("safra_jan").equals("1"))
                   ckbJanS.setSelected(true);
            
            if (conexao.resultSet.getString("safra_fev").equals("1"))
                   ckbFevS.setSelected(true);

            if (conexao.resultSet.getString("safra_mar").equals("1"))
                   ckbMarS.setSelected(true);

            if (conexao.resultSet.getString("safra_abr").equals("1"))
                   ckbAbrS.setSelected(true);

            if (conexao.resultSet.getString("safra_mai").equals("1"))
                   ckbMaiS.setSelected(true);

            if (conexao.resultSet.getString("safra_jun").equals("1"))
                   ckbJunS.setSelected(true);

            if (conexao.resultSet.getString("safra_jul").equals("1"))
                   ckbJulS.setSelected(true);

            if (conexao.resultSet.getString("safra_ago").equals("1"))
                   ckbAgoS.setSelected(true);

            if (conexao.resultSet.getString("safra_set").equals("1"))
                   ckbSetS.setSelected(true);

            if (conexao.resultSet.getString("safra_out").equals("1"))
                   ckbOutS.setSelected(true);

            if (conexao.resultSet.getString("safra_nov").equals("1"))
                   ckbNovS.setSelected(true);

            if (conexao.resultSet.getString("safra_dez").equals("1"))
                   ckbDezS.setSelected(true);
            
            cbEspecieComposicaoPescaria.setSelectedItem(conexao.resultSet.getString("arte_pesca"));
            
            tfQuantidadeArtePesca.setText(conexao.resultSet.getString("quantidade_arte_pesca"));
            
            tfTamanhoComposicaoPescaria.setText(conexao.resultSet.getString("tamanho"));
            
            tfMalhaComposicaoPescaria.setText(conexao.resultSet.getString("malha"));
            
            if (conexao.resultSet.getString("petrechos_proprios").equals("1"))
                   ckbPretrchosPropriosSim.setSelected(true);
            
            tfSePretrochosProprios.setText(conexao.resultSet.getString("de_quem_petrecho"));
            
            tfLocalCompPescaria.setText(conexao.resultSet.getString("onde_adquire_panagens_local"));
            
            tfPqCompPescaria.setText(conexao.resultSet.getString("onde_adquire_panagens_pq"));
            
            tfCustoEntralhamentoCompPescaria.setText(conexao.resultSet.getString("custo_entalhamento"));
            
            tfCustoChumboCompPescaria.setText(conexao.resultSet.getString("custo_chumbo"));
            
            tfCustoBoiasCompPescaria.setText(conexao.resultSet.getString("custo_boias"));
            
            tfViagemMesCompPescaria.setText(conexao.resultSet.getString("qtd_viagem_mes"));
            
            tfProducaoViagemCompPescaria.setText(conexao.resultSet.getString("producao_viagem"));
            
            tfRendaMediaPescaria.setText(conexao.resultSet.getString("renda_media_por_pescaria"));
            
            if (conexao.resultSet.getString("destino_atravessador").equals("1"))
                   ckbDestinoAtravessador.setSelected(true);
            
            if (conexao.resultSet.getString("destino_empresa").equals("1"))
                   ckbDestinoEmpresa.setSelected(true);
            
            if (conexao.resultSet.getString("destino_caminhao").equals("1"))
                   ckbDestinoCaminhao.setSelected(true);
            
            if (conexao.resultSet.getString("destino_supermercado").equals("1"))
                   ckbDestinoSupermercado.setSelected(true);
            
            if (conexao.resultSet.getString("destino_outros").equals("1"))
                   ckbDestinoOutro.setSelected(true);
            
            tfDestinoOutro.setText(conexao.resultSet.getString("destino_outros_quais"));
            
            if (conexao.resultSet.getString("existe_dependencia").equals("1"))
                   ckbSimDependencia.setSelected(true);

            System.out.println("Passou! Composição da Pescaria");
            
//        //Dados da Embarcação
//            conexao.execute("SELECT * FROM dono_barco_dados_embarcacao WHERE cod_dono_barco = "+codigo);
//            conexao.resultSet.first();
//
//            if (conexao.resultSet.getString("embarcacao_foi_financiada").equals("1"))
//                   ckbSimFinanciada.setSelected(true);
//
//            tfQualInstituicao.setText(conexao.resultSet.getString("qual_instituicao_financiou"));
//
//            tfFormaFinanciamento.setText(conexao.resultSet.getString("forma_financiamento"));
//
//            if (conexao.resultSet.getString("cam").equals("1"))
//                   ckbTipoCAM.setSelected(true);
//
//            if (conexao.resultSet.getString("bpp").equals("1"))
//                   ckbTipoBPP.setSelected(true);
//
//            if (conexao.resultSet.getString("bmp").equals("1"))
//                   ckbTipoBMP.setSelected(true);
//
//            if (conexao.resultSet.getString("outro").equals("1"))
//                   ckbTipoOutros.setSelected(true);
//
//            tfOutroTipoQual.setText(conexao.resultSet.getString("outro_tipo"));
//
//            tfNomeEmbarcacao.setText(conexao.resultSet.getString("nome_embarcacao"));
//
//            tfComprimento.setText(conexao.resultSet.getString("comprimento"));
//
//            tfTonBruta.setText(conexao.resultSet.getString("ton_bruta"));
//
//            tfTonLiq.setText(conexao.resultSet.getString("ton_liquida"));
//
//            cbMaterialCasco.setSelectedItem(conexao.resultSet.getString("material_casco"));
//
//            cbPropulsao.setSelectedItem(conexao.resultSet.getString("propulsao"));
//
//            tfNumeroCilindros.setText(conexao.resultSet.getString("cilindros"));
//
//            tfMarca.setText(conexao.resultSet.getString("marca"));
//
//            tfTripulacao.setText(conexao.resultSet.getString("tripulacao"));
//
//            tfAnoConstrucao.setText(conexao.resultSet.getString("ano_construcao"));
//
//            cbSitucao.setSelectedItem(conexao.resultSet.getString("situacao_atual"));
//
//            if (conexao.resultSet.getString("conservacao_gelo").equals("1"))
//                   ckbGelo.setSelected(true);
//
//            if (conexao.resultSet.getString("conservacao_sal").equals("1"))
//                   ckbSal.setSelected(true);
//
//            if (conexao.resultSet.getString("conservacao_frigorifico").equals("1"))
//                   ckbFrigorifico.setSelected(true);
//
//            if (conexao.resultSet.getString("possui_inscricao").equals("1"))
//                   ckbPossuiInscricaoSim.setSelected(true);
//
//            System.out.println("Passou! Dados Embarcação");

            attCbs();

        }catch (SQLException ex) {           
                //JOptionPane.showMessageDialog(null,"Nenhum registro encontrado "+ ex );
                System.out.println("Erro no mostrar dados");
        }
    }


    private void limpar_dados() {
                rbMadeira.setSelected(false);
                rbAlvenaria.setSelected(false);
                rbBarro.setSelected(false);
                ckbLuzSim.setSelected(false);
                rbBanheiroDentro.setSelected(false);
                rbBanheiroFora.setSelected(false);
                ckbAguaSim.setSelected(false);
                ckbDrenagemSim.setSelected(false);
                ckbFossaSim.setSelected(false);
                rbInssSim.setSelected(false);
                rbInssSim.setSelected(false);
                rbInssNao.setSelected(false);
                rbInssEmpregado.setSelected(false);
                ckbColoniaSim.setSelected(false);
                tfQualColonia.setText("");
                ckbAssociacaoSim.setSelected(false);
                tfQualAssociacao.setText("");
                ckbCooperativaSim.setSelected(false);
                tfQualCooperativa.setText("");
                tfDesdeQuandoDonoBarco.setText("");
                ckbIbamaSim.setSelected(false);
                ckbPossuiRgp.setSelected(false);
                ckbFamiliar.setSelected(false);
                ckbParceria.setSelected(false);
                ckbAssalariado.setSelected(false);
                ckbArmadorPescador.setSelected(false);
                ckbRecebeBeneficioGovernoSim.setSelected(false);
                tfQualBeneficio.setText("");
                cbEspecieComposicaoPescaria.setSelectedItem("");
                ckbJanS.setSelected(false);
                ckbFevS.setSelected(false);
                ckbMarS.setSelected(false);
                ckbAbrS.setSelected(false);
                ckbMaiS.setSelected(false);
                ckbJunS.setSelected(false);
                ckbJulS.setSelected(false);
                ckbAgoS.setSelected(false);
                ckbSetS.setSelected(false);
                ckbOutS.setSelected(false);
                ckbNovS.setSelected(false);
                ckbDezS.setSelected(false);
                cbEspecieComposicaoPescaria.setSelectedIndex(0);
                tfQuantidadeArtePesca.setText("");
                tfTamanhoComposicaoPescaria.setText("");
                tfMalhaComposicaoPescaria.setText("");
                ckbPretrchosPropriosSim.setSelected(false);
                tfSePretrochosProprios.setText("");
                tfLocalCompPescaria.setText("");
                tfPqCompPescaria.setText("");
                tfCustoEntralhamentoCompPescaria.setText("");
                tfCustoChumboCompPescaria.setText("");
                tfCustoBoiasCompPescaria.setText("");
                tfViagemMesCompPescaria.setText("");
                tfProducaoViagemCompPescaria.setText("");
                tfRendaMediaPescaria.setText("");
                ckbDestinoAtravessador.setSelected(false);
                ckbDestinoEmpresa.setSelected(false);
                ckbDestinoCaminhao.setSelected(false);
                ckbDestinoSupermercado.setSelected(false);
                ckbDestinoOutro.setSelected(false);
                tfDestinoOutro.setText("");
                ckbSimDependencia.setSelected(false);
                ckbSimFinanciada.setSelected(false);
                tfQualInstituicao.setText("");
                tfFormaFinanciamento.setText("");
                ckbTipoCAM.setSelected(false);
                ckbTipoBPP.setSelected(false);
                ckbTipoBMP.setSelected(false);
                ckbTipoOutros.setSelected(false);
                tfOutroTipoQual.setText("");
                tfNomeEmbarcacao.setText("");
                tfComprimento.setText("");
                tfTonBruta.setText("");
                tfTonLiq.setText("");
                cbMaterialCasco.setSelectedIndex(0);
                cbPropulsao.setSelectedIndex(0);
                tfNumeroCilindros.setText("");
                tfMarca.setText("");
                tfTripulacao.setText("");
                tfAnoConstrucao.setText("");
                cbSitucao.setSelectedIndex(0);
                ckbGelo.setSelected(false);
                ckbSal.setSelected(false);
                ckbFrigorifico.setSelected(false);
                ckbPossuiInscricaoSim.setSelected(false);


    }

    //Trabalho com a tabela Renda FAMILIA

    private void addBtRt(){
    String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());
    System.out.println(codigo);

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into dono_barco_relacoes_trabalho_familia_renda "
                    + "(cod_dono_barco,parentesco,atividade,renda) values ("+
                    codigo+",'"+
                    tfParentescoRT.getText()+"','"+
                    tfAtividadeRT.getText()+"','"+
                    tfRendaRT.getText()+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Jtable RT - Cadastrado com sucesso");
                attjTableAtividadeFamiliar();
            }
    }

    private void excluirRT() {
        //System.out.println(jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0));
        String sql;

        sql = "delete from dono_barco_relacoes_trabalho_familia_renda "
            + "Where cod_dono_barco_relacoes_trabalho_familia_renda = "
            + jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjTableAtividadeFamiliar();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");

    }

    private void attjTableAtividadeFamiliar(){
        String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());

        conexao.execute("select * from dono_barco_relacoes_trabalho_familia_renda"
                        + " where cod_dono_barco = " + codigo);

        jTableAtividadeFamiliar.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableAtividadeFamiliar.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableAtividadeFamiliar.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTableAtividadeFamiliar.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTableAtividadeFamiliar.getColumnModel().getColumn(3).setPreferredWidth(10);

        DefaultTableModel modelo = (DefaultTableModel)jTableAtividadeFamiliar.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_dono_barco_relacoes_trabalho_familia_renda"),
                                           conexao.resultSet.getString("parentesco"),
                                           conexao.resultSet.getString("atividade"),
                                           conexao.resultSet.getString("renda"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + "Tabela Familia Renda Trabalho");
            //attjTableComposicaoPescaria();
        }

    } // FIM Trabalho com a tabela Renda Familia

    //Trabalho com a tabela Composição Pescaria
    private void addBtCP() {
    String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());
    System.out.println(codigo);

          //Tabela Locais da composição pescaria
          String sqlinsert = "insert into dono_barco_composicao_pescaria_precos "
                    + "(cod_dono_barco,especie,valor) values ("+
                    codigo+",'"+
                    cbEspecieVendaPescado.getSelectedItem()+"','"+
                    tfValorPrecoEspecie.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("dono_barco_composicao_pescaria_precos - Cadastrado com sucesso");
                attjtPrecoPescado();
            }

    }

    private void excluirCP() {
        //System.out.println(jTableComposicaoPescaria.getValueAt(jTableComposicaoPescaria.getSelectedRow(),0));
        String sql;

        sql = "delete from dono_barco_composicao_pescaria_precos "
            + "Where cod_dono_barco_composicao_pescaria_precos = "
            + jtPrecoPescado.getValueAt(jtPrecoPescado.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtPrecoPescado();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void attjtPrecoPescado(){
        String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());

        conexao.execute("select * from dono_barco_composicao_pescaria_precos"
                        + " where cod_dono_barco = " + codigo);

        jtPrecoPescado.getColumnModel().getColumn(0).setMaxWidth(0);
        jtPrecoPescado.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtPrecoPescado.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtPrecoPescado.getColumnModel().getColumn(2).setPreferredWidth(10);


        DefaultTableModel modelo = (DefaultTableModel)jtPrecoPescado.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_dono_barco_composicao_pescaria_precos"),
                                           conexao.resultSet.getString("especie"),
                                           conexao.resultSet.getString("valor"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + "Tabela dono_barco_composicao_pescaria_precos");
        }

    }// FIM Trabalho dono_barco_composicao_pescaria_precos"


    private void attCbdono_barco() {
        try {
            cbDonoBarco.removeAllItems();
            conexao.execute("select * from dono_barco");

            while (conexao.resultSet.next()){
                cbDonoBarco.addItem(conexao.resultSet.getString("cod_dono_barco")+
                            " # "+ conexao.resultSet.getString("nome"));
            }

        }catch (SQLException ex) {
            System.out.println("Erro no cbdono_barco "+ex);
        }
    }

    private void attCbs() {
        String item = new String();
        try {
            cbEspecieComposicaoPescaria.removeAllItems();
            cbEspecieVendaPescado.removeAllItems();
            conexao.execute("select * from especie");

            while (conexao.resultSet.next()){
                item = conexao.resultSet.getString("especie");
                cbEspecieComposicaoPescaria.addItem(item);
                cbEspecieVendaPescado.addItem(item);
            }

        }catch (SQLException ex) {
            System.out.println("attCbs() Com erro 1 "+ex);
        }

         try {
            cbArtePescaComposicaoPescaria.removeAllItems();
            conexao.execute("select * from arte_de_pesca");

            while (conexao.resultSet.next()){
                item = conexao.resultSet.getString("arte_de_pesca");
                cbArtePescaComposicaoPescaria.addItem(item);
            }

        }catch (SQLException ex) {
            System.out.println("attCbs() Com erro 2 "+ex);
        }
    }
    
    private void mudar_estadoCB(){
        try {
            if (cbArtePescaComposicaoPescaria.getSelectedItem().toString().toLowerCase().equals("rede de emalhar")){
            tfTamanhoComposicaoPescaria.setEditable(true);
            tfMalhaComposicaoPescaria.setEditable(true);
        }
        else{
            tfTamanhoComposicaoPescaria.setEditable(false);
            tfMalhaComposicaoPescaria.setEditable(false);
            tfTamanhoComposicaoPescaria.setText("");
            tfMalhaComposicaoPescaria.setText("");
        }
                

        } catch (Exception e) {
        }

        try {
            if (cbGastosViagem.getSelectedItem().equals("Outro"))
                tfOutrosGastos.setEditable(true);
            else {
                tfOutrosGastos.setEditable(false);
                tfOutrosGastos.setText("");
            }
        } catch (Exception e) {
        }

        try {
            if (cbGastosANO.getSelectedItem().equals("Outro"))
                tfOutrosGastos1.setEditable(true);
            else {
                tfOutrosGastos1.setEditable(false);
                tfOutrosGastos1.setText("");
            }
        } catch (Exception e) {
        }

    }

    private void AddjtGastosPorViagem() {
    String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());
    System.out.println(codigo);

        String gastot = new String();
            gastot = cbGastosViagem.getSelectedItem().toString();
            if (gastot.equals("Outro"))
                gastot = tfOutrosGastos.getText();

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into dono_barco_composicao_gasto_por_viagem "
                    + "(cod_dono_barco,gasto,tipo,quantidade,"
                    + "custo,outros) values ("+
                    codigo+",'"+
                    gastot+"','"+
                    tfTipoGasto.getText()+"','"+
                    tfQuantidadeCusto.getText()+"','"+
                    tfCustoCusto.getText()+"','"+
                    tfOutroCusto.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("dono_barco_composicao_gasto_por_viagem - Cadastrado com sucesso");
                attjtGastosPorViagem();
            }
    }

    private void attjtGastosPorViagem() {
        String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());

        conexao.execute("select * from dono_barco_composicao_gasto_por_viagem"
                        + " where cod_dono_barco = " + codigo);

        jtGastosPorViagem.getColumnModel().getColumn(0).setMaxWidth(0);
        jtGastosPorViagem.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtGastosPorViagem.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtGastosPorViagem.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtGastosPorViagem.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtGastosPorViagem.getColumnModel().getColumn(4).setPreferredWidth(10);
        jtGastosPorViagem.getColumnModel().getColumn(5).setPreferredWidth(10);




        DefaultTableModel modelo = (DefaultTableModel)jtGastosPorViagem.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_dono_barco_composicao_gasto_por_viagem"),
                                           conexao.resultSet.getString("gasto"),
                                           conexao.resultSet.getString("tipo"),
                                           conexao.resultSet.getString("quantidade"),
                                           conexao.resultSet.getString("custo"),
                                           conexao.resultSet.getString("outros"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela gastos");
        }
    }

    private void DeljtGastosPorViagem() {
        String sql;

        sql = "delete from dono_barco_composicao_gasto_por_viagem "
            + "Where cod_dono_barco_composicao_gasto_por_viagem = "
            + jtGastosPorViagem.getValueAt(jtGastosPorViagem.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtGastosPorViagem();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void AddjtGastosPorAno() {
    String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());
    System.out.println(codigo);

        String gastot = new String();
            gastot = cbGastosANO.getSelectedItem().toString();
            if (gastot.equals("Outro"))
                gastot = tfOutrosGastos1.getText();

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into dono_barco_composicao_gasto_por_ano "
                    + "(cod_dono_barco,gasto,tipo,quantidade,"
                    + "custo,outros) values ("+
                    codigo+",'"+
                    gastot+"','"+
                    tfTipoGasto1.getText()+"','"+
                    tfQuantidadeCusto1.getText()+"','"+
                    tfCustoCusto1.getText()+"','"+
                    tfOutroCusto1.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("dono_barco_composicao_gasto_por_ano - Cadastrado com sucesso");
                attjtGastosPorAno();
            }
    }

    private void attjtGastosPorAno() {
        String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());

        conexao.execute("select * from dono_barco_composicao_gasto_por_ano"
                        + " where cod_dono_barco = " + codigo);

        jtGastosPorAno.getColumnModel().getColumn(0).setMaxWidth(0);
        jtGastosPorAno.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtGastosPorAno.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtGastosPorAno.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtGastosPorAno.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtGastosPorAno.getColumnModel().getColumn(4).setPreferredWidth(10);
        jtGastosPorAno.getColumnModel().getColumn(5).setPreferredWidth(10);




        DefaultTableModel modelo = (DefaultTableModel)jtGastosPorAno.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_dono_barco_composicao_gasto_por_ano"),
                                           conexao.resultSet.getString("gasto"),
                                           conexao.resultSet.getString("tipo"),
                                           conexao.resultSet.getString("quantidade"),
                                           conexao.resultSet.getString("custo"),
                                           conexao.resultSet.getString("outros"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela gastos");
        }
    }

    private void DeljtGastosPorAno() {
        String sql;

        sql = "delete from dono_barco_composicao_gasto_por_ano "
            + "Where cod_dono_barco_composicao_gasto_por_ano = "
            + jtGastosPorAno.getValueAt(jtGastosPorAno.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtGastosPorAno();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void AddDadosEmbarcacao() {
    String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());
    System.out.println(codigo);

        //Dados embarcação
        String sqlinsert = "insert into dono_barco_dados_embarcacao "
                    + "(cod_dono_barco,embarcacao_foi_financiada,qual_instituicao_financiou,"
                    + "forma_financiamento,cam,bpp,bmp,outro,outro_tipo,nome_embarcacao,"
                    + "comprimento,ton_bruta,ton_liquida,material_casco,propulsao,cilindros,"
                    + "marca,tripulacao,ano_construcao,situacao_atual,"
                    + "conservacao_gelo,conservacao_sal,conservacao_frigorifico,possui_inscricao) values ("+
                    codigo+",'"+
                    util.checarCkb(ckbSimFinanciada)+"','"+
                    tfQualInstituicao.getText()+"','"+
                    tfFormaFinanciamento.getText()+"','"+
                    util.checarCkb(ckbTipoCAM)+"','"+
                    util.checarCkb(ckbTipoBPP)+"','"+
                    util.checarCkb(ckbTipoBMP)+"','"+
                    util.checarCkb(ckbTipoOutros)+"','"+
                    tfOutroTipoQual.getText()+"','"+
                    tfNomeEmbarcacao.getText()+"','"+
                    tfComprimento.getText()+"','"+
                    tfTonBruta.getText()+"','"+
                    tfTonLiq.getText()+"','"+
                    cbMaterialCasco.getSelectedItem()+"','"+
                    cbPropulsao.getSelectedItem()+"','"+
                    tfNumeroCilindros.getText()+"','"+
                    tfMarca.getText()+"','"+
                    tfTripulacao.getText()+"','"+
                    tfAnoConstrucao.getText()+"','"+
                    cbSitucao.getSelectedItem()+"','"+
                    util.checarCkb(ckbGelo)+"','"+
                    util.checarCkb(ckbSal)+"','"+
                    util.checarCkb(ckbFrigorifico)+"','"+
                    util.checarCkb(ckbPossuiInscricaoSim)+"')";


            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
               System.out.println("Dados Embarcação");
               attjtDadosEmbarcacao();
            }
    }

    private void attjtDadosEmbarcacao() {
    String codigo = util.separa(1,cbDonoBarco.getSelectedItem().toString());

        conexao.execute("select * from dono_barco_dados_embarcacao"
                        + " where cod_dono_barco = " + codigo);

        jtDadosEmbarcacao.getColumnModel().getColumn(0).setMaxWidth(0);
        jtDadosEmbarcacao.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtDadosEmbarcacao.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(4).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(5).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(6).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(7).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(8).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(9).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(10).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(11).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(12).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(13).setPreferredWidth(10);
        jtDadosEmbarcacao.getColumnModel().getColumn(14).setPreferredWidth(10);




        DefaultTableModel modelo = (DefaultTableModel)jtDadosEmbarcacao.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_dono_barco_dados_embarcacao"),
                                           conexao.resultSet.getString("embarcacao_foi_financiada"),
                                           conexao.resultSet.getString("forma_financiamento"),
                                           conexao.resultSet.getString("nome_embarcacao"),
                                           conexao.resultSet.getString("comprimento"),
                                           conexao.resultSet.getString("ton_bruta"),
                                           conexao.resultSet.getString("ton_liquida"),
                                           conexao.resultSet.getString("material_casco"),
                                           conexao.resultSet.getString("propulsao"),
                                           conexao.resultSet.getString("cilindros"),
                                           conexao.resultSet.getString("marca"),
                                           conexao.resultSet.getString("tripulacao"),
                                           conexao.resultSet.getString("ano_construcao"),
                                           conexao.resultSet.getString("situacao_atual"),
                                           conexao.resultSet.getString("possui_inscricao"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela gastos");
        }

    }

    private void DeljtDadosEmbarcacao() {
        String sql;

        sql = "delete from dono_barco_dados_embarcacao "
            + "Where cod_dono_barco_dados_embarcacao = "
            + jtDadosEmbarcacao.getValueAt(jtDadosEmbarcacao.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtDadosEmbarcacao();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

}
