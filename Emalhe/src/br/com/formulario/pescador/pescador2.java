package br.com.formulario.pescador;

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
public class pescador2 extends javax.swing.JFrame {

    private Conexao conexao;
    private int inicia_combo = 0; //Evita a ativação inicial do cbPescador
    private Utilidade util = new Utilidade();

    public pescador2() {
        initComponents(); //Inicializa os componentes da tela
        conexao = new Conexao();
        conexao.conecta("emalhe");
              
        //Insere nome do pescador no cbPescador
        attCbPescador();
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
        cbPescador = new javax.swing.JComboBox();
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
        tfDesdeQuandoPescador = new br.com.util.JIntField();
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
        tfTempoArteAgua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ckbTempoArteAguaDia = new javax.swing.JCheckBox();
        ckbTempoArteAguaNoite = new javax.swing.JCheckBox();
        tfTempoChegarPesqueiro = new JIntField();
        jLabel15 = new javax.swing.JLabel();
        tfDiasdePesca = new JIntField();
        jLabel16 = new javax.swing.JLabel();
        tfQuantasViagensMes = new JIntField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfProducaoViagem = new JDecimal2();
        jLabel19 = new javax.swing.JLabel();
        tfRendaMediaPescador = new JMoneyField();
        tfAlemPescaOutraPescaria = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfOutroTipoQual = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEspeciesCapturadas = new javax.swing.JTable();
        btExcluirEspeciesCapturadas = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfNomeBarco = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tfPortoOrigem = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfTempoTrabalhandoBarco = new JIntField();
        jLabel29 = new javax.swing.JLabel();
        rbInssSim = new javax.swing.JRadioButton();
        rbInssNao = new javax.swing.JRadioButton();
        rbInssEmpregado = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableComposicaoPescaria = new javax.swing.JTable();
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
        tfLocalCP = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tfLatitudeCP = new javax.swing.JTextField();
        tfLongitudeCP = new javax.swing.JTextField();
        btAdicionarCP = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cbEspecie = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        tfTamanho = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        tfMalha = new javax.swing.JTextField();
        btAddEspeciesCapturadas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
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
        jLabel62 = new javax.swing.JLabel();
        cbArtePesca = new javax.swing.JComboBox();
        jLabel63 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ckbJanP = new javax.swing.JCheckBox();
        ckbFevP = new javax.swing.JCheckBox();
        ckbMarP = new javax.swing.JCheckBox();
        ckbAbrP = new javax.swing.JCheckBox();
        ckbMaiP = new javax.swing.JCheckBox();
        ckbJunP = new javax.swing.JCheckBox();
        ckbJulP = new javax.swing.JCheckBox();
        ckbSetP = new javax.swing.JCheckBox();
        ckbAgoP = new javax.swing.JCheckBox();
        ckbNovP = new javax.swing.JCheckBox();
        ckbOutP = new javax.swing.JCheckBox();
        ckbDezP = new javax.swing.JCheckBox();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        chbEmbarcacaoPropria = new javax.swing.JRadioButton();
        chbEmbarcacaoPatrao = new javax.swing.JRadioButton();
        chbTipoCAM = new javax.swing.JRadioButton();
        chbTipoBPP = new javax.swing.JRadioButton();
        chbTipoBMP = new javax.swing.JRadioButton();
        chbTipoOutros = new javax.swing.JRadioButton();
        jLabel68 = new javax.swing.JLabel();
        ckbGelo = new javax.swing.JCheckBox();
        ckbSal = new javax.swing.JCheckBox();
        ckbFrigorifico = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        ckbJanEC = new javax.swing.JCheckBox();
        ckbFevEC = new javax.swing.JCheckBox();
        ckbMarEC = new javax.swing.JCheckBox();
        ckbAbrEC = new javax.swing.JCheckBox();
        ckbMaiEC = new javax.swing.JCheckBox();
        ckbJunEC = new javax.swing.JCheckBox();
        ckbJulEC = new javax.swing.JCheckBox();
        ckbSetEC = new javax.swing.JCheckBox();
        ckbAgoEC = new javax.swing.JCheckBox();
        ckbNovEC = new javax.swing.JCheckBox();
        ckbOutEC = new javax.swing.JCheckBox();
        ckbDezEC = new javax.swing.JCheckBox();
        rbBarro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Questionário Pescador");
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

        cbPescador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPescadorItemStateChanged(evt);
            }
        });
        cbPescador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPescadorActionPerformed(evt);
            }
        });

        jLabel24.setText("Pescador");

        jLabel40.setText("Drenagem pluvial.:");

        ckbAguaSim.setText("Sim");

        ckbDrenagemSim.setText("Sim");

        ckbFossaSim.setText("Sim");

        jLabel41.setText("Fossa seca ou sépica.:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel42.setText("Questionário Pescador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel42)
                .addContainerGap(290, Short.MAX_VALUE))
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

        jLabel6.setText("Possui Registro Geral de Pescador (RGP-MPA).:");

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

        tfTempoArteAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTempoArteAguaActionPerformed(evt);
            }
        });

        jLabel13.setText("Tempo da arte na água.:");

        ckbTempoArteAguaDia.setText("Dia");

        ckbTempoArteAguaNoite.setText("Noite");

        tfTempoChegarPesqueiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTempoChegarPesqueiroActionPerformed(evt);
            }
        });

        jLabel15.setText("Tempo para chegar no pesqueiro.:");

        tfDiasdePesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiasdePescaActionPerformed(evt);
            }
        });

        jLabel16.setText("Dias efetivos de pesca.:");

        tfQuantasViagensMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantasViagensMesActionPerformed(evt);
            }
        });

        jLabel17.setText("Quantas viagens por mês.:");

        jLabel18.setText("Produção por viagem.:");

        tfProducaoViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProducaoViagemActionPerformed(evt);
            }
        });

        jLabel19.setText("Renda média do pescador (por viagem) R$.:");

        tfRendaMediaPescador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRendaMediaPescadorActionPerformed(evt);
            }
        });

        tfAlemPescaOutraPescaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlemPescaOutraPescariaActionPerformed(evt);
            }
        });

        jLabel20.setText("Outra pescaria.:");

        tfOutroTipoQual.setEditable(false);
        tfOutroTipoQual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOutroTipoQualActionPerformed(evt);
            }
        });

        jLabel21.setText("Período.:");

        jTableEspeciesCapturadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Espécie", "Inicio da Safra", "Fim da Safra", "Arte de Pesca", "Tamanho", "Malha"
            }
        ));
        jScrollPane3.setViewportView(jTableEspeciesCapturadas);

        btExcluirEspeciesCapturadas.setText("Excluir");
        btExcluirEspeciesCapturadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirEspeciesCapturadasActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel50.setText("Dados de outras espécies também capturadas");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel51.setText("Dados da Embarcação");

        jLabel22.setText("Embarcação.:");

        jLabel23.setText("Tipo.:");

        jLabel25.setText("Qual.:");

        jLabel26.setText("Nome do barco:");

        tfNomeBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeBarcoActionPerformed(evt);
            }
        });

        jLabel27.setText("Porto de Origem:");

        tfPortoOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPortoOrigemActionPerformed(evt);
            }
        });

        jLabel28.setText("A quanto tempo ele esta trabalhando nesse barco.:");

        tfTempoTrabalhandoBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTempoTrabalhandoBarcoActionPerformed(evt);
            }
        });

        jLabel29.setText("Como se faz a conservação do pescado.:");

        inssinss.add(rbInssSim);
        rbInssSim.setText("Sim autônomo");

        inssinss.add(rbInssNao);
        rbInssNao.setText("Sim empregado");

        inssinss.add(rbInssEmpregado);
        rbInssEmpregado.setText("Não");

        jTableComposicaoPescaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "cod", "Local", "Latitude", "Longitude"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableComposicaoPescaria);
        jTableComposicaoPescaria.getColumnModel().getColumn(0).setResizable(false);

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

        jLabel33.setText("Local.:");

        btAdicionarCP.setText("Adicionar");
        btAdicionarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarCPActionPerformed(evt);
            }
        });

        jLabel34.setText("Longitude.:");

        jLabel35.setText("Latitude.:");

        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel52.setText("Espécie.:");

        jLabel53.setText("Inicio Safra.:");

        jLabel55.setText("Arte de Pesca.:");

        jLabel56.setText("Tamanho.:");

        tfTamanho.setEditable(false);

        jLabel57.setText("Malha.:");

        tfMalha.setEditable(false);

        btAddEspeciesCapturadas.setText("Adicionar");
        btAddEspeciesCapturadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddEspeciesCapturadasActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel62.setText("horas");

        cbArtePesca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbArtePesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArtePescaActionPerformed(evt);
            }
        });

        jLabel63.setText("horas");

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));

        ckbJanP.setText("jan");

        ckbFevP.setText("fev");

        ckbMarP.setText("mar");

        ckbAbrP.setText("abr");

        ckbMaiP.setText("mai");

        ckbJunP.setText("jun");

        ckbJulP.setText("jul");

        ckbSetP.setText("set");

        ckbAgoP.setText("ago");

        ckbNovP.setText("nov");

        ckbOutP.setText("out");

        ckbDezP.setText("dez");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ckbJulP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbJanP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ckbFevP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbMarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbAbrP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbMaiP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbJunP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ckbAgoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbSetP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOutP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbNovP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDezP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbJanP)
                    .addComponent(ckbFevP)
                    .addComponent(ckbMarP)
                    .addComponent(ckbAbrP)
                    .addComponent(ckbMaiP)
                    .addComponent(ckbJunP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbJulP)
                    .addComponent(ckbAgoP)
                    .addComponent(ckbSetP)
                    .addComponent(ckbOutP)
                    .addComponent(ckbNovP)
                    .addComponent(ckbDezP))
                .addContainerGap())
        );

        jLabel64.setText("Dias");

        jLabel65.setText("KG");

        jLabel66.setText("metros");

        jLabel67.setText("milímetros");

        embarcacao.add(chbEmbarcacaoPropria);
        chbEmbarcacaoPropria.setText("Própria");

        embarcacao.add(chbEmbarcacaoPatrao);
        chbEmbarcacaoPatrao.setText("Patrão (Dono do Barco)");

        tipo.add(chbTipoCAM);
        chbTipoCAM.setText("CAM");

        tipo.add(chbTipoBPP);
        chbTipoBPP.setText("BPP");

        tipo.add(chbTipoBMP);
        chbTipoBMP.setText("BMP");

        tipo.add(chbTipoOutros);
        chbTipoOutros.setText("Outros");
        chbTipoOutros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbTipoOutrosStateChanged(evt);
            }
        });

        jLabel68.setText("Anos");

        ckbGelo.setText("Gelo");

        ckbSal.setText("Sal");

        ckbFrigorifico.setText("Frigorífico");

        jPanel6.setBackground(new java.awt.Color(230, 230, 230));

        ckbJanEC.setText("jan");

        ckbFevEC.setText("fev");

        ckbMarEC.setText("mar");

        ckbAbrEC.setText("abr");

        ckbMaiEC.setText("mai");

        ckbJunEC.setText("jun");

        ckbJulEC.setText("jul");

        ckbSetEC.setText("set");

        ckbAgoEC.setText("ago");

        ckbNovEC.setText("nov");

        ckbOutEC.setText("out");

        ckbDezEC.setText("dez");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ckbJulEC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbJanEC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ckbFevEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbMarEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbAbrEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbMaiEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbJunEC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ckbAgoEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbSetEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOutEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbNovEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDezEC)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbJanEC)
                    .addComponent(ckbFevEC)
                    .addComponent(ckbMarEC)
                    .addComponent(ckbAbrEC)
                    .addComponent(ckbMaiEC)
                    .addComponent(ckbJunEC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbJulEC)
                    .addComponent(ckbAgoEC)
                    .addComponent(ckbSetEC)
                    .addComponent(ckbOutEC)
                    .addComponent(ckbNovEC)
                    .addComponent(ckbDezEC))
                .addContainerGap())
        );

        casacasa.add(rbBarro);
        rbBarro.setText("Barro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbArmadorPescador)
                            .addComponent(ckbAssalariado)
                            .addComponent(ckbParceria)
                            .addComponent(ckbFamiliar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPescador, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel43)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDesdeQuandoPescador, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel58))
                            .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ckbPossuiRgp))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ckbIbamaSim)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNomeBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPortoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfTempoTrabalhandoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel68))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ckbGelo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ckbSal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ckbFrigorifico))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbEmbarcacaoPropria)
                                    .addComponent(chbTipoCAM))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chbTipoBPP)
                                        .addGap(4, 4, 4)
                                        .addComponent(chbTipoBMP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbTipoOutros)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel25)
                                        .addGap(5, 5, 5)
                                        .addComponent(tfOutroTipoQual, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chbEmbarcacaoPatrao)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbMadeira)
                                            .addComponent(rbBanheiroDentro))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbBanheiroFora)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbAlvenaria)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbBarro))))
                                    .addComponent(ckbDrenagemSim)
                                    .addComponent(ckbAguaSim)
                                    .addComponent(ckbFossaSim)
                                    .addComponent(ckbLuzSim)))
                            .addComponent(jLabel51)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbRecebeBeneficioGovernoSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQualBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel48)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btExcluirEspeciesCapturadas)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel53)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbEspecie, 0, 128, Short.MAX_VALUE)))
                                        .addComponent(jLabel52))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel55)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbArtePesca, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel57)
                                                .addComponent(jLabel56))
                                            .addGap(33, 33, 33)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfTamanho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfMalha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel66)
                                                    .addGap(48, 48, 48)
                                                    .addComponent(btAddEspeciesCapturadas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel67)))))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfLocalCP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfLatitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfLongitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btAdicionarCP))
                                    .addComponent(btExcluirCP)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel19))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(tfTempoChegarPesqueiro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel63))
                                                    .addComponent(tfQuantasViagensMes, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfRendaMediaPescador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfAlemPescaOutraPescaria, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(tfDiasdePesca, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel18)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(tfProducaoViagem, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel65)
                                                    .addComponent(jLabel64))
                                                .addGap(88, 88, 88)))))
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
                                    .addComponent(btAdicionarRT)
                                    .addGap(58, 58, 58))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel59)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbEspecieComposicaoPescaria, 0, 156, Short.MAX_VALUE)
                                            .addComponent(cbArtePescaComposicaoPescaria, 0, 156, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(tfMalhaComposicaoPescaria, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfTamanhoComposicaoPescaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel61)
                                                    .addComponent(jLabel60))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addGap(11, 11, 11))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addGap(18, 18, 18)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ckbTempoArteAguaDia)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ckbTempoArteAguaNoite))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(tfQuantidadeArtePesca, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(tfTempoArteAgua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel62))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(btExcluirRT)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPescador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMadeira)
                            .addComponent(rbAlvenaria)
                            .addComponent(rbBarro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbLuzSim, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBanheiroDentro)
                    .addComponent(jLabel37)
                    .addComponent(rbBanheiroFora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addComponent(ckbFossaSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
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
                    .addComponent(tfDesdeQuandoPescador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTamanhoComposicaoPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMalhaComposicaoPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59)
                            .addComponent(jLabel61))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQuantidadeArtePesca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbTempoArteAguaDia)
                                    .addComponent(ckbTempoArteAguaNoite)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfTempoArteAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel62)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tfLocalCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(tfLatitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(tfLongitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarCP))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTempoChegarPesqueiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfQuantasViagensMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel65)
                                    .addComponent(tfProducaoViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfRendaMediaPescador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel21))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel20)
                                            .addComponent(tfAlemPescaOutraPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(tfDiasdePesca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64)))
                .addGap(166, 166, 166)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(cbArtePesca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel67))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel57)
                                    .addComponent(tfMalha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66)))))
                    .addComponent(btAddEspeciesCapturadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirEspeciesCapturadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(chbEmbarcacaoPropria)
                    .addComponent(chbEmbarcacaoPatrao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(chbTipoCAM)
                    .addComponent(chbTipoBPP)
                    .addComponent(chbTipoBMP)
                    .addComponent(chbTipoOutros)
                    .addComponent(jLabel25)
                    .addComponent(tfOutroTipoQual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tfNomeBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfPortoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tfTempoTrabalhandoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ckbGelo)
                    .addComponent(ckbSal)
                    .addComponent(ckbFrigorifico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void tfTempoTrabalhandoBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTempoTrabalhandoBarcoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfTempoTrabalhandoBarcoActionPerformed

    private void tfPortoOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPortoOrigemActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfPortoOrigemActionPerformed

    private void tfNomeBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeBarcoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfNomeBarcoActionPerformed

    private void tfOutroTipoQualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOutroTipoQualActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfOutroTipoQualActionPerformed

    private void tfAlemPescaOutraPescariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlemPescaOutraPescariaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfAlemPescaOutraPescariaActionPerformed

    private void tfRendaMediaPescadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRendaMediaPescadorActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfRendaMediaPescadorActionPerformed

    private void tfProducaoViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProducaoViagemActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfProducaoViagemActionPerformed

    private void tfQuantasViagensMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantasViagensMesActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfQuantasViagensMesActionPerformed

    private void tfDiasdePescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiasdePescaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfDiasdePescaActionPerformed

    private void tfTempoChegarPesqueiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTempoChegarPesqueiroActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfTempoChegarPesqueiroActionPerformed

    private void tfTempoArteAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTempoArteAguaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfTempoArteAguaActionPerformed

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

    private void cbPescadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPescadorActionPerformed
        if (inicia_combo == 1){
            mostra_dados();
        }
        inicia_combo = 1;
    }//GEN-LAST:event_cbPescadorActionPerformed

    private void cbPescadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPescadorItemStateChanged
        //System.out.println("trocou");
}//GEN-LAST:event_cbPescadorItemStateChanged

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

    private void btAddEspeciesCapturadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddEspeciesCapturadasActionPerformed
        addBtEP();
    }//GEN-LAST:event_btAddEspeciesCapturadasActionPerformed

    private void btExcluirEspeciesCapturadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirEspeciesCapturadasActionPerformed
        excluirEP();
    }//GEN-LAST:event_btExcluirEspeciesCapturadasActionPerformed

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

    private void cbArtePescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArtePescaActionPerformed
        if (inicia_combo == 1){
             mudar_estadoCB();
        }
        inicia_combo = 1;
    }//GEN-LAST:event_cbArtePescaActionPerformed

    private void chbTipoOutrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbTipoOutrosStateChanged
       if (chbTipoOutros.isSelected()) {
            tfOutroTipoQual.setEditable(true);
        } else {
            tfOutroTipoQual.setEditable(false);
            tfOutroTipoQual.setText("");
        }
    }//GEN-LAST:event_chbTipoOutrosStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pescador2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup banheirobanheiro;
    private javax.swing.JButton btAddEspeciesCapturadas;
    private javax.swing.JButton btAdicionarCP;
    private javax.swing.JButton btAdicionarRT;
    private javax.swing.JButton btExcluirCP;
    private javax.swing.JButton btExcluirEspeciesCapturadas;
    private javax.swing.JButton btExcluirRT;
    private javax.swing.ButtonGroup casacasa;
    private javax.swing.JComboBox cbArtePesca;
    private javax.swing.JComboBox cbArtePescaComposicaoPescaria;
    private javax.swing.JComboBox cbEspecie;
    private javax.swing.JComboBox cbEspecieComposicaoPescaria;
    private javax.swing.JComboBox cbPescador;
    private javax.swing.JRadioButton chbEmbarcacaoPatrao;
    private javax.swing.JRadioButton chbEmbarcacaoPropria;
    private javax.swing.JRadioButton chbTipoBMP;
    private javax.swing.JRadioButton chbTipoBPP;
    private javax.swing.JRadioButton chbTipoCAM;
    private javax.swing.JRadioButton chbTipoOutros;
    private javax.swing.JCheckBox ckbAbrEC;
    private javax.swing.JCheckBox ckbAbrP;
    private javax.swing.JCheckBox ckbAbrS;
    private javax.swing.JCheckBox ckbAgoEC;
    private javax.swing.JCheckBox ckbAgoP;
    private javax.swing.JCheckBox ckbAgoS;
    private javax.swing.JCheckBox ckbAguaSim;
    private javax.swing.JCheckBox ckbArmadorPescador;
    private javax.swing.JCheckBox ckbAssalariado;
    private javax.swing.JCheckBox ckbAssociacaoSim;
    private javax.swing.JCheckBox ckbColoniaSim;
    private javax.swing.JCheckBox ckbCooperativaSim;
    private javax.swing.JCheckBox ckbDezEC;
    private javax.swing.JCheckBox ckbDezP;
    private javax.swing.JCheckBox ckbDezS;
    private javax.swing.JCheckBox ckbDrenagemSim;
    private javax.swing.JCheckBox ckbFamiliar;
    private javax.swing.JCheckBox ckbFevEC;
    private javax.swing.JCheckBox ckbFevP;
    private javax.swing.JCheckBox ckbFevS;
    private javax.swing.JCheckBox ckbFossaSim;
    private javax.swing.JCheckBox ckbFrigorifico;
    private javax.swing.JCheckBox ckbGelo;
    private javax.swing.JCheckBox ckbIbamaSim;
    private javax.swing.JCheckBox ckbJanEC;
    private javax.swing.JCheckBox ckbJanP;
    private javax.swing.JCheckBox ckbJanS;
    private javax.swing.JCheckBox ckbJulEC;
    private javax.swing.JCheckBox ckbJulP;
    private javax.swing.JCheckBox ckbJulS;
    private javax.swing.JCheckBox ckbJunEC;
    private javax.swing.JCheckBox ckbJunP;
    private javax.swing.JCheckBox ckbJunS;
    private javax.swing.JCheckBox ckbLuzSim;
    private javax.swing.JCheckBox ckbMaiEC;
    private javax.swing.JCheckBox ckbMaiP;
    private javax.swing.JCheckBox ckbMaiS;
    private javax.swing.JCheckBox ckbMarEC;
    private javax.swing.JCheckBox ckbMarP;
    private javax.swing.JCheckBox ckbMarS;
    private javax.swing.JCheckBox ckbNovEC;
    private javax.swing.JCheckBox ckbNovP;
    private javax.swing.JCheckBox ckbNovS;
    private javax.swing.JCheckBox ckbOutEC;
    private javax.swing.JCheckBox ckbOutP;
    private javax.swing.JCheckBox ckbOutS;
    private javax.swing.JCheckBox ckbParceria;
    private javax.swing.JCheckBox ckbPossuiRgp;
    private javax.swing.JCheckBox ckbRecebeBeneficioGovernoSim;
    private javax.swing.JCheckBox ckbSal;
    private javax.swing.JCheckBox ckbSetEC;
    private javax.swing.JCheckBox ckbSetP;
    private javax.swing.JCheckBox ckbSetS;
    private javax.swing.JCheckBox ckbTempoArteAguaDia;
    private javax.swing.JCheckBox ckbTempoArteAguaNoite;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
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
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTableAtividadeFamiliar;
    private javax.swing.JTable jTableComposicaoPescaria;
    private javax.swing.JTable jTableEspeciesCapturadas;
    private javax.swing.JRadioButton rbAlvenaria;
    private javax.swing.JRadioButton rbBanheiroDentro;
    private javax.swing.JRadioButton rbBanheiroFora;
    private javax.swing.JRadioButton rbBarro;
    private javax.swing.JRadioButton rbInssEmpregado;
    private javax.swing.JRadioButton rbInssNao;
    private javax.swing.JRadioButton rbInssSim;
    private javax.swing.JRadioButton rbMadeira;
    private javax.swing.JTextField tfAlemPescaOutraPescaria;
    private javax.swing.JTextField tfAtividadeRT;
    private javax.swing.JTextField tfDesdeQuandoPescador;
    private javax.swing.JTextField tfDiasdePesca;
    private javax.swing.JTextField tfLatitudeCP;
    private javax.swing.JTextField tfLocalCP;
    private javax.swing.JTextField tfLongitudeCP;
    private javax.swing.JTextField tfMalha;
    private javax.swing.JTextField tfMalhaComposicaoPescaria;
    private javax.swing.JTextField tfNomeBarco;
    private javax.swing.JTextField tfOutroTipoQual;
    private javax.swing.JTextField tfParentescoRT;
    private javax.swing.JTextField tfPortoOrigem;
    private javax.swing.JTextField tfProducaoViagem;
    private javax.swing.JTextField tfQualAssociacao;
    private javax.swing.JTextField tfQualBeneficio;
    private javax.swing.JTextField tfQualColonia;
    private javax.swing.JTextField tfQualCooperativa;
    private javax.swing.JTextField tfQuantasViagensMes;
    private javax.swing.JTextField tfQuantidadeArtePesca;
    private javax.swing.JTextField tfRendaMediaPescador;
    private javax.swing.JTextField tfRendaRT;
    private javax.swing.JTextField tfTamanho;
    private javax.swing.JTextField tfTamanhoComposicaoPescaria;
    private javax.swing.JTextField tfTempoArteAgua;
    private javax.swing.JTextField tfTempoChegarPesqueiro;
    private javax.swing.JTextField tfTempoTrabalhandoBarco;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables


    private void salvar_dados(){
    String sqlinsert = new String();
    String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
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


            sqlinsert = "insert into pescador_moradia "
                    + "(cod_pescador,casa,luz,banheiro,agua_encanada,"
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
                    tfDesdeQuandoPescador.getText()+"','"+
                    util.checarCkb(ckbIbamaSim)+"','"+
                    util.checarCkb(ckbPossuiRgp)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Pescador Moradia - Cadastrado com sucesso");              
            }
        
  
        //Relações de Trabalho
        
            sqlinsert = "insert into pescador_relacoes_trabalho "
                    + "(cod_pescador,familiar,parceria,assalariado,"
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
                System.out.println("Relações de Trabalho - Cadastrado com sucesso");
            }
        
        
        //Composição da Pescaria


            sqlinsert = "insert into pescador_composicao_pescaria "
                    + "(cod_pescador,pescaria_principal,arte_pesca,"
                    + "quantidade_arte_pesca,tamanho,malha,tempo_arte_agua,"
                    + "dia,noite,tempo_chegada,dias_efetivos_pesca,viagens_mes,"
                    + "producao_viagem,renda_media_pecador,outra_pescaria,"
                    + "safra_jan,safra_fev,safra_mar,safra_abr,safra_mai,safra_jun,"
                    + "safra_jul,safra_ago,safra_set,safra_out,safra_nov,safra_dez,"
                    + "periodo_jan,periodo_fev,periodo_mar,periodo_abr,"
                    + "periodo_mai,periodo_jun,periodo_jul,periodo_ago,"
                    + "periodo_set,periodo_out,periodo_nov,periodo_dez) values ("+
                    codigo+",'"+
                    cbEspecieComposicaoPescaria.getSelectedItem()+"','"+
                    cbArtePescaComposicaoPescaria.getSelectedItem()+"','"+
                    tfQuantidadeArtePesca.getText()+"','"+
                    tfTamanhoComposicaoPescaria.getText()+"','"+
                    tfMalhaComposicaoPescaria.getText()+"','"+
                    tfTempoArteAgua.getText()+"','"+
                    util.checarCkb(ckbTempoArteAguaDia)+"','"+
                    util.checarCkb(ckbTempoArteAguaNoite)+"','"+
                    tfTempoChegarPesqueiro.getText()+"','"+
                    tfDiasdePesca.getText()+"','"+
                    tfQuantasViagensMes.getText()+"','"+
                    tfProducaoViagem.getText()+"','"+
                    tfRendaMediaPescador.getText()+"','"+
                    tfAlemPescaOutraPescaria.getText()+"','"+
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
                    util.checarCkb(ckbDezS)+"','"+
                    util.checarCkb(ckbJanP)+"','"+
                    util.checarCkb(ckbFevP)+"','"+
                    util.checarCkb(ckbMarP)+"','"+
                    util.checarCkb(ckbAbrP)+"','"+
                    util.checarCkb(ckbMaiP)+"','"+
                    util.checarCkb(ckbJunP)+"','"+
                    util.checarCkb(ckbJulP)+"','"+
                    util.checarCkb(ckbAgoP)+"','"+
                    util.checarCkb(ckbSetP)+"','"+
                    util.checarCkb(ckbOutP)+"','"+
                    util.checarCkb(ckbNovP)+"','"+
                    util.checarCkb(ckbDezP)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Composição da Pescaria - Cadastrado com sucesso");
            }
        
        
        //Dados da Embarcação

           String tdono = "";

           if (chbEmbarcacaoPropria.isSelected())
                   tdono = "Própria";
            else if (chbEmbarcacaoPatrao.isSelected())
                   tdono = "Patrão";

           String TtipoEmbarcacao = "";

           if (chbTipoCAM.isSelected())
                   TtipoEmbarcacao = "CAM";
           else if (chbTipoBPP.isSelected())
                   TtipoEmbarcacao = "BPP";
           else if (chbTipoBMP.isSelected())
                   TtipoEmbarcacao = "BMP";
           else if (chbTipoOutros.isSelected())
                   TtipoEmbarcacao = tfOutroTipoQual.getText();

            
           sqlinsert = "insert into pescador_dados_embarcacao "
                    + "(cod_pescador,dono_embarcacao,tipo_embarcacao,nome_barco,"
                    + "porto_origem,tempo_no_barco,conservacao_gelo,"
                    + "conservacao_sal,conservacao_frigorifico) values ("+
                    codigo+",'"+
                    tdono+"','"+
                    TtipoEmbarcacao+"','"+
                    tfNomeBarco.getText()+"','"+
                    tfPortoOrigem.getText()+"','"+
                    tfTempoTrabalhandoBarco.getText()+"','"+
                    util.checarCkb(ckbGelo)+"','"+
                    util.checarCkb(ckbSal)+"','"+
                    util.checarCkb(ckbFrigorifico)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Dados da Embarcação - Cadastrado com sucesso");
                JOptionPane.showMessageDialog(null,"Salvo com sucesso");
                //agora é hora de atualizar o resultset
                mostra_dados();
            }
   
    }

    private void atualizar_dados(){
    String sqlupdate = new String();
    String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
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

            sqlupdate ="UPDATE pescador_moradia SET "
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
                    +"tempo_pescador = '"+tfDesdeQuandoPescador.getText()+"',"
                    +"possui_carteira_ibama = '"+util.checarCkb(ckbIbamaSim)+"',"
                    +"possui_rgp = '"+util.checarCkb(ckbPossuiRgp)+"' "+

                    "where cod_pescador = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                System.out.println("Pescador Moradia - Atualizado com sucesso");
                //Atualiza Resultset
            }

        //Relações de Trabalho

            sqlupdate ="UPDATE pescador_relacoes_trabalho SET "
                    +"familiar = '"+util.checarCkb(ckbFamiliar)+"',"
                    +"parceria = '"+util.checarCkb(ckbParceria)+"',"
                    +"assalariado = '"+util.checarCkb(ckbAssalariado)+"',"
                    +"armador_pescador = '"+util.checarCkb(ckbArmadorPescador)+"',"
                    +"recebe_beneficio = '"+util.checarCkb(ckbRecebeBeneficioGovernoSim)+"',"
                    +"beneficio = '"+tfQualBeneficio.getText()+"' "+

                    "where cod_pescador = "+codigo;


            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlupdate)) {
                System.out.println("Relações de Trabalho - Atualizado com sucesso");
            }


        //Composição da Pescaria

            sqlupdate ="UPDATE pescador_composicao_pescaria SET "
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
                    +"tempo_arte_agua = '"+tfTempoArteAgua.getText()+"',"
                    +"dia = '"+util.checarCkb(ckbTempoArteAguaDia)+"',"
                    +"noite = '"+util.checarCkb(ckbTempoArteAguaNoite)+"',"
                    +"tempo_chegada = '"+tfTempoChegarPesqueiro.getText()+"',"
                    +"dias_efetivos_pesca = '"+tfDiasdePesca.getText()+"',"
                    +"viagens_mes = '"+tfQuantasViagensMes.getText()+"',"
                    +"producao_viagem = '"+tfProducaoViagem.getText()+"',"
                    +"renda_media_pecador = '"+tfRendaMediaPescador.getText()+"',"
                    +"outra_pescaria = '"+tfAlemPescaOutraPescaria.getText()+"',"
                    +"periodo_jan = '"+util.checarCkb(ckbJanP)+"',"
                    +"periodo_fev = '"+util.checarCkb(ckbFevP)+"',"
                    +"periodo_mar = '"+util.checarCkb(ckbMarP)+"',"
                    +"periodo_abr = '"+util.checarCkb(ckbAbrP)+"',"
                    +"periodo_mai = '"+util.checarCkb(ckbMaiP)+"',"
                    +"periodo_jun = '"+ util.checarCkb(ckbJunP)+"',"
                    +"periodo_jul = '"+util.checarCkb(ckbJulP)+"',"
                    +"periodo_ago = '"+util.checarCkb(ckbAgoP)+"',"
                    +"periodo_set = '"+util.checarCkb(ckbSetP)+"',"
                    +"periodo_out = '"+util.checarCkb(ckbOutP)+"',"
                    +"periodo_nov = '"+util.checarCkb(ckbNovP)+"',"
                    +"periodo_dez = '"+util.checarCkb(ckbDezP)+"' "+

                    "where cod_pescador = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.salvar(sqlupdate)) {
                System.out.println("Composição da Pescaria - Alterado com sucesso");
            }


        //Dados da Embarcação

           String tdono = "";

           if (chbEmbarcacaoPropria.isSelected())
                   tdono = "Própria";
            else if (chbEmbarcacaoPatrao.isSelected())
                   tdono = "Patrão";

           String TtipoEmbarcacao = "";

           if (chbTipoCAM.isSelected())
                   TtipoEmbarcacao = "CAM";
           else if (chbTipoBPP.isSelected())
                   TtipoEmbarcacao = "BPP";
           else if (chbTipoBMP.isSelected())
                   TtipoEmbarcacao = "BMP";
           else if (chbTipoOutros.isSelected())
                   TtipoEmbarcacao = tfOutroTipoQual.getText();


           sqlupdate = "UPDATE pescador_dados_embarcacao SET "
                    +"dono_embarcacao = '"+tdono+"',"
                    +"tipo_embarcacao = '"+TtipoEmbarcacao+"',"
                    +"nome_barco = '"+tfNomeBarco.getText()+"',"
                    +"porto_origem = '"+tfPortoOrigem.getText()+"',"
                    +"tempo_no_barco = '"+tfTempoTrabalhandoBarco.getText()+"',"
                    +"conservacao_gelo = '"+util.checarCkb(ckbGelo)+"',"
                    +"conservacao_sal = '"+util.checarCkb(ckbSal)+"',"
                    +"conservacao_frigorifico = '"+util.checarCkb(ckbFrigorifico)+"' "+

                    "where cod_pescador = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.salvar(sqlupdate)) {
                System.out.println("Dados da Embarcação - Atualização com sucesso");
                JOptionPane.showMessageDialog(null,"Alterado com sucesso");
                //agora é hora de atualizar o resultset
                mostra_dados();
            }

    }

    private void mostra_dados(){
        attCbs();
        limpar_dados();
        String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
        System.out.println(codigo);
        try {
            //Pescador Moradia
            conexao.execute("SELECT * FROM pescador_moradia WHERE cod_pescador = "+codigo);
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

            tfDesdeQuandoPescador.setText(conexao.resultSet.getString("tempo_pescador"));

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
            conexao.execute("SELECT * FROM pescador_relacoes_trabalho WHERE cod_pescador = "+codigo);
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

//            Composição da Pescaria
            conexao.execute("SELECT * FROM pescador_composicao_pescaria WHERE cod_pescador = "+codigo);
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

            if (conexao.resultSet.getString("periodo_jan").equals("1"))
                   ckbJanP.setSelected(true);

            if (conexao.resultSet.getString("periodo_fev").equals("1"))
                   ckbFevP.setSelected(true);

            if (conexao.resultSet.getString("periodo_mar").equals("1"))
                   ckbMarP.setSelected(true);

            if (conexao.resultSet.getString("periodo_abr").equals("1"))
                   ckbAbrP.setSelected(true);

            if (conexao.resultSet.getString("periodo_mai").equals("1"))
                   ckbMaiP.setSelected(true);

            if (conexao.resultSet.getString("periodo_jun").equals("1"))
                   ckbJunP.setSelected(true);

            if (conexao.resultSet.getString("periodo_jul").equals("1"))
                   ckbJulP.setSelected(true);

            if (conexao.resultSet.getString("periodo_ago").equals("1"))
                   ckbAgoP.setSelected(true);

            if (conexao.resultSet.getString("periodo_set").equals("1"))
                   ckbSetP.setSelected(true);

            if (conexao.resultSet.getString("periodo_out").equals("1"))
                   ckbOutP.setSelected(true);

            if (conexao.resultSet.getString("periodo_nov").equals("1"))
                   ckbNovP.setSelected(true);

            if (conexao.resultSet.getString("periodo_dez").equals("1"))
                   ckbDezP.setSelected(true);

            cbArtePescaComposicaoPescaria.setSelectedItem(conexao.resultSet.getString("arte_pesca"));
            tfQuantidadeArtePesca.setText(conexao.resultSet.getString("quantidade_arte_pesca"));
            tfTamanhoComposicaoPescaria.setText(conexao.resultSet.getString("tamanho"));
            tfMalhaComposicaoPescaria.setText(conexao.resultSet.getString("malha"));
            tfTempoArteAgua.setText(conexao.resultSet.getString("tempo_arte_agua"));


            if (conexao.resultSet.getString("dia").equals("1"))
                   ckbTempoArteAguaDia.setSelected(true);
            else
                   ckbTempoArteAguaDia.setSelected(false);

            if (conexao.resultSet.getString("noite").equals("1"))
                   ckbTempoArteAguaNoite.setSelected(true);
            else
                   ckbTempoArteAguaNoite.setSelected(false);

            tfTempoChegarPesqueiro.setText(conexao.resultSet.getString("tempo_chegada"));
            tfDiasdePesca.setText(conexao.resultSet.getString("dias_efetivos_pesca"));
            tfQuantasViagensMes.setText(conexao.resultSet.getString("viagens_mes"));
            tfProducaoViagem.setText(conexao.resultSet.getString("producao_viagem"));
            tfRendaMediaPescador.setText(conexao.resultSet.getString("renda_media_pecador"));
            tfAlemPescaOutraPescaria.setText(conexao.resultSet.getString("outra_pescaria"));

            System.out.println("Passou! pescaria");


//          Dados da Embarcação
            conexao.execute("SELECT * FROM pescador_dados_embarcacao WHERE cod_pescador = "+codigo);
            conexao.resultSet.first();

            testador = conexao.resultSet.getString("dono_embarcacao");
            if (testador.equals("Própria"))
                   chbEmbarcacaoPropria.setSelected(true);
            else if (testador.equals("Patrão"))
                   chbEmbarcacaoPatrao.setSelected(true);

            testador = conexao.resultSet.getString("tipo_embarcacao");
            if (testador.equals("CAM"))
                   chbTipoCAM.setSelected(true);
            else if (testador.equals("BPP"))
                   chbTipoBPP.setSelected(true);
            else if (testador.equals("BMP"))
                   chbTipoBMP.setSelected(true);
            else {
                   chbTipoOutros.setSelected(true);
                   tfOutroTipoQual.setText(testador);
                 }

            tfNomeBarco.setText(conexao.resultSet.getString("nome_barco"));
            tfPortoOrigem.setText(conexao.resultSet.getString("porto_origem"));
            tfTempoTrabalhandoBarco.setText(conexao.resultSet.getString("tempo_no_barco"));
            

            if (conexao.resultSet.getString("conservacao_gelo").equals("1"))
                    ckbGelo.setSelected(true);

            if (conexao.resultSet.getString("conservacao_sal").equals("1"))
                    ckbSal.setSelected(true);

            if (conexao.resultSet.getString("conservacao_frigorifico").equals("1"))
                    ckbFrigorifico.setSelected(true);

            System.out.println("Passou! embarcacao");

            attjTableAtividadeFamiliar();
            attjTableComposicaoPescaria();
            jTableEspeciesCapturadas();

            System.out.println("Passou! Tabelas");

            

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
            rbInssNao.setSelected(false);
            rbInssEmpregado.setSelected(false);
            ckbColoniaSim.setSelected(false);
            tfQualColonia.setText("");
            ckbAssociacaoSim.setSelected(false);
            tfQualAssociacao.setText("");
            ckbCooperativaSim.setSelected(false);
            tfQualCooperativa.setText("");
            tfDesdeQuandoPescador.setText("");
            ckbIbamaSim.setSelected(false);
            ckbPossuiRgp.setSelected(false);

            //relações trabalho
            ckbFamiliar.setSelected(false);
            ckbParceria.setSelected(false);
            ckbAssalariado.setSelected(false);
            ckbArmadorPescador.setSelected(false);
            ckbRecebeBeneficioGovernoSim.setSelected(false);
            tfQualBeneficio.setText("");

            //Composição da Pescaria
            cbEspecieComposicaoPescaria.setSelectedIndex(0);
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
            cbArtePescaComposicaoPescaria.setSelectedIndex(0);
            tfQuantidadeArtePesca.setText("");
            tfTamanhoComposicaoPescaria.setText("");
            tfMalhaComposicaoPescaria.setText("");
            tfTempoArteAgua.setText("");
            ckbTempoArteAguaDia.setSelected(false);
            ckbTempoArteAguaNoite.setSelected(false);
            tfTempoChegarPesqueiro.setText("");
            tfDiasdePesca.setText("");
            tfQuantasViagensMes.setText("");
            tfProducaoViagem.setText("");
            tfRendaMediaPescador.setText("");
            ckbJanP.setSelected(false);
            ckbFevP.setSelected(false);
            ckbMarP.setSelected(false);
            ckbAbrP.setSelected(false);
            ckbMaiP.setSelected(false);
            ckbJunP.setSelected(false);
            ckbJulP.setSelected(false);
            ckbAgoP.setSelected(false);
            ckbSetP.setSelected(false);
            ckbOutP.setSelected(false);
            ckbNovP.setSelected(false);
            ckbDezP.setSelected(false);
            tfAlemPescaOutraPescaria.setText("");

            //Dados da Embarcação
            chbEmbarcacaoPropria.setSelected(false);
            chbEmbarcacaoPatrao.setSelected(false);
            chbTipoCAM.setSelected(false);
            chbTipoBPP.setSelected(false);
            chbTipoBMP.setSelected(false);
            chbTipoOutros.setSelected(false);
            tfOutroTipoQual.setText("");
            tfNomeBarco.setText("");
            tfPortoOrigem.setText("");
            tfTempoTrabalhandoBarco.setText("");
            ckbFrigorifico.setSelected(false);
            ckbGelo.setSelected(false);
            ckbSal.setSelected(false);

            //Tabelas
            tfParentescoRT.setText("");
            tfAtividadeRT.setText("");
            tfRendaRT.setText("");
            tfLocalCP.setText("");
            tfLatitudeCP.setText("");
            tfLongitudeCP.setText("");
            ckbJanEC.setSelected(false);
            ckbFevEC.setSelected(false);
            ckbMarEC.setSelected(false);
            ckbAbrEC.setSelected(false);
            ckbMaiEC.setSelected(false);
            ckbJunEC.setSelected(false);
            ckbJulEC.setSelected(false);
            ckbAgoEC.setSelected(false);
            ckbSetEC.setSelected(false);
            ckbOutEC.setSelected(false);
            ckbNovEC.setSelected(false);
            ckbDezEC.setSelected(false);
            cbArtePesca.setSelectedIndex(0);
            tfMalha.setText("");
            tfTamanho.setText("");

    }

    //Trabalho com a tabela Renda FAMILIA

    private void addBtRt(){
    String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
    System.out.println(codigo);

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into pescador_relacoes_trabalho_familia_renda "
                    + "(cod_pescador,parentesco,atividade,renda) values ("+
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

        sql = "delete from pescador_relacoes_trabalho_familia_renda "
            + "Where cod_pescador_relacoes_trabalho_familia_renda = "
            + jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjTableAtividadeFamiliar();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");

    }

    private void attjTableAtividadeFamiliar(){
        String codigo = util.separa(1,cbPescador.getSelectedItem().toString());

        conexao.execute("select * from pescador_relacoes_trabalho_familia_renda"
                        + " where cod_pescador = " + codigo);

        jTableAtividadeFamiliar.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableAtividadeFamiliar.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableAtividadeFamiliar.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTableAtividadeFamiliar.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTableAtividadeFamiliar.getColumnModel().getColumn(3).setPreferredWidth(10);

        DefaultTableModel modelo = (DefaultTableModel)jTableAtividadeFamiliar.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_pescador_relacoes_trabalho_familia_renda"),
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
    String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
    System.out.println(codigo);

          //Tabela Locais da composição pescaria
          String sqlinsert = "insert into pescador_composicao_pescaria_locais "
                    + "(cod_pescador,local,latitude,longitude) values ("+
                    codigo+",'"+
                    tfLocalCP.getText()+"','"+
                    tfLatitudeCP.getText()+"','"+
                    tfLongitudeCP.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Jtable CP - Cadastrado com sucesso");
                attjTableComposicaoPescaria();
            }

    }

    private void excluirCP() {
        //System.out.println(jTableComposicaoPescaria.getValueAt(jTableComposicaoPescaria.getSelectedRow(),0));
        String sql;

        sql = "delete from pescador_composicao_pescaria_locais "
            + "Where cod_pescaria_composicao_pescaria_locais = "
            + jTableComposicaoPescaria.getValueAt(jTableComposicaoPescaria.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjTableComposicaoPescaria();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void attjTableComposicaoPescaria(){
        String codigo = util.separa(1,cbPescador.getSelectedItem().toString());

        conexao.execute("select * from pescador_composicao_pescaria_locais"
                        + " where cod_pescador = " + codigo);

        jTableComposicaoPescaria.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableComposicaoPescaria.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableComposicaoPescaria.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTableComposicaoPescaria.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTableComposicaoPescaria.getColumnModel().getColumn(3).setPreferredWidth(10);

        DefaultTableModel modelo = (DefaultTableModel)jTableComposicaoPescaria.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_pescaria_composicao_pescaria_locais"),
                                           conexao.resultSet.getString("local"),
                                           conexao.resultSet.getString("latitude"),
                                           conexao.resultSet.getString("longitude"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + "Tabela Composição Pescaria");
        }

    }// FIM Trabalho com a tabela Composição Pescaria

    //Trabalho com a tabela Especies Capturadas
    private void addBtEP() {
    String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
    System.out.println(codigo);

          //Tabela Locais da Especies Capturadas
          String sqlinsert = "insert into pescador_especies_capturadas "
                    + "(cod_pescador,especie,arte_pesca,tamanho,malha,"
                    + "jan,fev,mar,abr,mai,jun,jul,ago,sett,out,nov,dez) values ("+
                    codigo+",'"+
                    cbEspecie.getSelectedItem()+"','"+
                    cbArtePesca.getSelectedItem()+"','"+
                    tfTamanho.getText()+"','"+
                    tfMalha.getText()+"','"+
                    util.checarCkb(ckbJanEC)+"','"+
                    util.checarCkb(ckbFevEC)+"','"+
                    util.checarCkb(ckbMarEC)+"','"+
                    util.checarCkb(ckbAbrEC)+"','"+
                    util.checarCkb(ckbMaiEC)+"','"+
                    util.checarCkb(ckbJunEC)+"','"+
                    util.checarCkb(ckbJulEC)+"','"+
                    util.checarCkb(ckbAgoEC)+"','"+
                    util.checarCkb(ckbSetEC)+"','"+
                    util.checarCkb(ckbOutEC)+"','"+
                    util.checarCkb(ckbNovEC)+"','"+
                    util.checarCkb(ckbDezEC)+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Jtable CP - Cadastrado com sucesso");
                jTableEspeciesCapturadas();
            }

    }

    private void excluirEP() {
        String sql;

        sql = "delete from pescador_especies_capturadas "
            + "Where cod_pescador_especies_capturadas = "
            + jTableEspeciesCapturadas.getValueAt(jTableEspeciesCapturadas.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                jTableEspeciesCapturadas();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void jTableEspeciesCapturadas(){
        String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
        String safrai,safraf = new String();
        conexao.execute("select * from pescador_especies_capturadas "
                      + "where cod_pescador = " + codigo);

        jTableEspeciesCapturadas.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableEspeciesCapturadas.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableEspeciesCapturadas.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTableEspeciesCapturadas.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTableEspeciesCapturadas.getColumnModel().getColumn(3).setPreferredWidth(10);
        jTableEspeciesCapturadas.getColumnModel().getColumn(4).setPreferredWidth(10);
        jTableEspeciesCapturadas.getColumnModel().getColumn(5).setPreferredWidth(10);
        jTableEspeciesCapturadas.getColumnModel().getColumn(6).setPreferredWidth(10);

        DefaultTableModel modelo = (DefaultTableModel)jTableEspeciesCapturadas.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
                                   
            while (conexao.resultSet.next()) {
            safrai = "";

            if (conexao.resultSet.getString("jan").equals("1")){
                if (safrai.equals(""))
                    safrai = "jan";
                else
                    safraf = "jan";
            }

            if (conexao.resultSet.getString("fev").equals("1")){
                if (safrai.equals(""))
                    safrai = "fev";
                else
                    safraf = "fev";
            }

            if (conexao.resultSet.getString("mar").equals("1")){
                if (safrai.equals(""))
                    safrai = "mar";
                else
                    safraf = "mar";
            }

            if (conexao.resultSet.getString("abr").equals("1")){
                if (safrai.equals(""))
                    safrai = "abr";
                else
                    safraf = "abr";
            }

            if (conexao.resultSet.getString("mai").equals("1")){
                if (safrai.equals(""))
                    safrai = "mai";
                else
                    safraf = "mai";
            }

            if (conexao.resultSet.getString("jun").equals("1")){
                if (safrai.equals(""))
                    safrai = "jun";
                else
                    safraf = "jun";
            }

            if (conexao.resultSet.getString("jul").equals("1")){
                if (safrai.equals(""))
                    safrai = "jul";
                else
                    safraf = "jul";
            }

            if (conexao.resultSet.getString("ago").equals("1")){
                if (safrai.equals(""))
                    safrai = "ago";
                else
                    safraf = "ago";
            }

            if (conexao.resultSet.getString("sett").equals("1")){
                if (safrai.equals(""))
                    safrai = "set";
                else
                    safraf = "set";
            }

            if (conexao.resultSet.getString("out").equals("1")){
                if (safrai.equals(""))
                    safrai = "out";
                else
                    safraf = "out";
            }

            if (conexao.resultSet.getString("nov").equals("1")){
                if (safrai.equals(""))
                    safrai = "nov";
                else
                    safraf = "nov";
            }

            if (conexao.resultSet.getString("dez").equals("1")){
                if (safrai.equals(""))
                    safrai = "dez";
                else
                    safraf = "dez";
            }

                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_pescador_especies_capturadas"),
                                           conexao.resultSet.getString("especie"),
                                           safrai,
                                           safraf,
                                           conexao.resultSet.getString("arte_pesca"),
                                           conexao.resultSet.getString("tamanho"),
                                           conexao.resultSet.getString("malha"),
                                          });
        }

            conexao.resultSet.first();

        

        }catch (SQLException erro){
            System.out.println(erro + " Tabela Espécies Capturadas");
        }

    }// FIM Trabalho com a tabela Espécies Capturadas

    private void attCbPescador() {
        try {
            cbPescador.removeAllItems();
            conexao.execute("select * from pescador");

            while (conexao.resultSet.next()){
                cbPescador.addItem(conexao.resultSet.getString("cod_pescador")+
                            " # "+ conexao.resultSet.getString("nome"));
            }

        }catch (SQLException ex) {
            System.out.println("Erro no cbPescador "+ex);
        }
    }

    private void attCbs() {
        String item = new String();
        try {
            cbEspecie.removeAllItems();
            cbEspecieComposicaoPescaria.removeAllItems();
            conexao.execute("select * from especie");

            while (conexao.resultSet.next()){
                item = conexao.resultSet.getString("especie");
                cbEspecie.addItem(item);
                cbEspecieComposicaoPescaria.addItem(item);
            }

        }catch (SQLException ex) {
            System.out.println("attCbs() Com erro 1 "+ex);
        }

         try {
            cbArtePesca.removeAllItems();
            cbArtePescaComposicaoPescaria.removeAllItems();
            conexao.execute("select * from arte_de_pesca");

            while (conexao.resultSet.next()){
                item = conexao.resultSet.getString("arte_de_pesca");
                cbArtePesca.addItem(item);
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
        
        if (cbArtePesca.getSelectedItem().toString().toLowerCase().equals("rede de emalhar")){
            tfTamanho.setEditable(true);
            tfMalha.setEditable(true);
        }
        else{
            tfTamanho.setEditable(false);
            tfMalha.setEditable(false);
            tfTamanho.setText("");
            tfMalha.setText("");
        }

        } catch (Exception e) {
        }


    }

}
