package br.com.formulario.pescador;

import br.com.conexao.Conexao;
import br.com.util.JMoneyField;
import br.com.util.Utilidade;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jhonathas
 */
public class pescador_2 extends javax.swing.JFrame {

    private Conexao conexao;
    private int inicia_combo = 0; //Evita a ativação inicial do cbPescador
    private Utilidade util = new Utilidade();

    public pescador_2() {
        initComponents(); //Inicializa os componentes da tela
        conexao = new Conexao();
        conexao.conecta("emalhe");
              
        //Insere nome do pescador no cbPescador
        attCbPescador();
        //Insere nome da Espécie no cbEspecie
        attCbEspecie();

        mostra_dados();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casacasa = new javax.swing.ButtonGroup();
        banheirobanheiro = new javax.swing.ButtonGroup();
        inssinss = new javax.swing.ButtonGroup();
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
        tfDesdeQuandoPescador = new javax.swing.JTextField();
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
        tfPescariaPrincipal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfSafra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfArtePesca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfQuantidadeArtePesca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfTamanhoEMalha = new javax.swing.JTextField();
        tfTempoArteAgua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ckbTempoArteAguaDia = new javax.swing.JCheckBox();
        ckbTempoArteAguaNoite = new javax.swing.JCheckBox();
        tfTempoChegarPesqueiro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfDiasdePesca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfQuantasViagensMes = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfProducaoViagem = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfRendaMediaPescador = new javax.swing.JTextField();
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
        ckbEmbarcacaoPropria = new javax.swing.JCheckBox();
        ckbEmbarcacaoPatrao = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        ckbTipoCAM = new javax.swing.JCheckBox();
        ckbTipoBPP = new javax.swing.JCheckBox();
        ckbTipoBMP = new javax.swing.JCheckBox();
        ckbTipoOutros = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        tfPeriodo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tfNomeBarco = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tfPortoOrigem = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfTempoTrabalhandoBarco = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tfConservacaoPescado = new javax.swing.JTextField();
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
        jLabel54 = new javax.swing.JLabel();
        tfInicioSafra = new javax.swing.JTextField();
        tfFimSafra = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        tfArteDePesca = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        tfTamanho = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        tfMalha = new javax.swing.JTextField();
        btAddEspeciesCapturadas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Questionário Atravessador");
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

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Questionário Pescador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel42)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addContainerGap())
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

        btAdicionarRT.setText("Adicionar");
        btAdicionarRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarRTActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Composição da Pescaria");

        jLabel8.setText("Pescaria Principal (espécie).:");

        tfPescariaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPescariaPrincipalActionPerformed(evt);
            }
        });

        jLabel9.setText("Safra.:");

        tfSafra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSafraActionPerformed(evt);
            }
        });

        jLabel10.setText("Arte de pesca.:");

        tfArtePesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfArtePescaActionPerformed(evt);
            }
        });

        jLabel11.setText("Quantidade.:");

        tfQuantidadeArtePesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeArtePescaActionPerformed(evt);
            }
        });

        jLabel12.setText("Tamanho e malha.:");

        tfTamanhoEMalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTamanhoEMalhaActionPerformed(evt);
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

        jLabel18.setText("Produção por viagem (KG).:");

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

        jLabel20.setText("Além da pesca outra pescaria.:");

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

        ckbEmbarcacaoPropria.setText("Própria");

        ckbEmbarcacaoPatrao.setText("Patrão (Dono do Barco)");

        jLabel23.setText("Tipo.:");

        ckbTipoCAM.setText("CAM");

        ckbTipoBPP.setText("BPP");

        ckbTipoBMP.setText("BMP");

        ckbTipoOutros.setText("Outros.");

        jLabel25.setText("Qual.:");

        tfPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPeriodoActionPerformed(evt);
            }
        });

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

        tfConservacaoPescado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConservacaoPescadoActionPerformed(evt);
            }
        });

        inssinss.add(rbInssSim);
        rbInssSim.setText("Sim");

        inssinss.add(rbInssNao);
        rbInssNao.setText("Não (autônomo)");

        inssinss.add(rbInssEmpregado);
        rbInssEmpregado.setText("Empregado");

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

        jLabel33.setText("Local");

        btAdicionarCP.setText("Adicionar");
        btAdicionarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarCPActionPerformed(evt);
            }
        });

        jLabel34.setText("Longitude");

        jLabel35.setText("Latitude");

        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel52.setText("Espécie.:");

        jLabel53.setText("Inicio Safra.:");

        jLabel54.setText("Fim Safra.:");

        jLabel55.setText("Arte de Pesca.:");

        jLabel56.setText("Tamanho.:");

        jLabel57.setText("Malha.:");

        btAddEspeciesCapturadas.setText("Adicionar");
        btAddEspeciesCapturadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddEspeciesCapturadasActionPerformed(evt);
            }
        });

        jButton1.setText("Nova Espécie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPescador, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel43)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDesdeQuandoPescador, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbPossuiRgp))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ckbIbamaSim)))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNomeBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPortoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTempoTrabalhandoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfConservacaoPescado, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ckbTipoCAM)
                                        .addGap(14, 14, 14)
                                        .addComponent(ckbTipoBPP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ckbTipoBMP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ckbTipoOutros)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfOutroTipoQual, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ckbEmbarcacaoPropria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ckbEmbarcacaoPatrao)))))
                        .addGap(65, 65, 65))
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
                            .addComponent(rbMadeira)
                            .addComponent(ckbDrenagemSim)
                            .addComponent(ckbAguaSim)
                            .addComponent(ckbFossaSim)
                            .addComponent(ckbLuzSim)
                            .addComponent(rbBanheiroDentro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbBanheiroFora)
                            .addComponent(rbAlvenaria))
                        .addGap(116, 116, 116))
                    .addComponent(jLabel51)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbRecebeBeneficioGovernoSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQualBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAlemPescaOutraPescaria))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfQuantasViagensMes)
                                    .addComponent(tfTempoChegarPesqueiro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfRendaMediaPescador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfProducaoViagem, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(tfPeriodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(tfDiasdePesca, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ckbAssalariado)
                        .addComponent(jLabel48)
                        .addComponent(ckbParceria)
                        .addComponent(ckbFamiliar)
                        .addComponent(ckbArmadorPescador)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfParentescoRT, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfAtividadeRT, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfRendaRT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(121, 121, 121)
                            .addComponent(btAdicionarRT)))
                    .addComponent(btExcluirRT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btExcluirCP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfTamanhoEMalha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                            .addComponent(tfPescariaPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                            .addComponent(tfArtePesca, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTempoArteAgua, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(tfSafra)
                                    .addComponent(tfQuantidadeArtePesca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ckbTempoArteAguaDia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLocalCP, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLatitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLongitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAdicionarCP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbTempoArteAguaNoite, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEspecie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfInicioSafra))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)
                                .addComponent(tfFimSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTamanho)
                            .addComponent(tfArteDePesca, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMalha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                                .addComponent(btAddEspeciesCapturadas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btExcluirEspeciesCapturadas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMadeira)
                            .addComponent(rbAlvenaria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbLuzSim, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
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
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
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
                    .addComponent(tfDesdeQuandoPescador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbFamiliar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbParceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbAssalariado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbArmadorPescador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                            .addComponent(tfPescariaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfArtePesca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuantidadeArtePesca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(tfTamanhoEMalha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTempoArteAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ckbTempoArteAguaDia)
                        .addComponent(ckbTempoArteAguaNoite)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(tfLocalCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35)
                        .addComponent(tfLatitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(tfLongitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAdicionarCP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTempoChegarPesqueiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(tfDiasdePesca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuantasViagensMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(tfProducaoViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tfRendaMediaPescador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tfAlemPescaOutraPescaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(tfInicioSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(tfArteDePesca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)
                            .addComponent(tfMalha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(tfFimSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(btAddEspeciesCapturadas)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirEspeciesCapturadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(ckbEmbarcacaoPropria)
                    .addComponent(ckbEmbarcacaoPatrao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(ckbTipoCAM)
                    .addComponent(ckbTipoBPP)
                    .addComponent(ckbTipoBMP)
                    .addComponent(ckbTipoOutros)
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
                    .addComponent(tfTempoTrabalhandoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tfConservacaoPescado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-917)/2, (screenSize.height-516)/2, 917, 516);
    }// </editor-fold>//GEN-END:initComponents

    private void fechar_janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar_janela
        conexao.desconecta();
    }//GEN-LAST:event_fechar_janela

    private void tfConservacaoPescadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConservacaoPescadoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfConservacaoPescadoActionPerformed

    private void tfTempoTrabalhandoBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTempoTrabalhandoBarcoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfTempoTrabalhandoBarcoActionPerformed

    private void tfPortoOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPortoOrigemActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfPortoOrigemActionPerformed

    private void tfNomeBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeBarcoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfNomeBarcoActionPerformed

    private void tfPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfPeriodoActionPerformed

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

    private void tfTamanhoEMalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTamanhoEMalhaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfTamanhoEMalhaActionPerformed

    private void tfQuantidadeArtePescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeArtePescaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfQuantidadeArtePescaActionPerformed

    private void tfArtePescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfArtePescaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfArtePescaActionPerformed

    private void tfSafraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSafraActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfSafraActionPerformed

    private void tfPescariaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPescariaPrincipalActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfPescariaPrincipalActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
        new pescadorAddEspecie(codigo).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pescador_2().setVisible(true);
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
    private javax.swing.JComboBox cbEspecie;
    private javax.swing.JComboBox cbPescador;
    private javax.swing.JCheckBox ckbAguaSim;
    private javax.swing.JCheckBox ckbArmadorPescador;
    private javax.swing.JCheckBox ckbAssalariado;
    private javax.swing.JCheckBox ckbAssociacaoSim;
    private javax.swing.JCheckBox ckbColoniaSim;
    private javax.swing.JCheckBox ckbCooperativaSim;
    private javax.swing.JCheckBox ckbDrenagemSim;
    private javax.swing.JCheckBox ckbEmbarcacaoPatrao;
    private javax.swing.JCheckBox ckbEmbarcacaoPropria;
    private javax.swing.JCheckBox ckbFamiliar;
    private javax.swing.JCheckBox ckbFossaSim;
    private javax.swing.JCheckBox ckbIbamaSim;
    private javax.swing.JCheckBox ckbLuzSim;
    private javax.swing.JCheckBox ckbParceria;
    private javax.swing.JCheckBox ckbPossuiRgp;
    private javax.swing.JCheckBox ckbRecebeBeneficioGovernoSim;
    private javax.swing.JCheckBox ckbTempoArteAguaDia;
    private javax.swing.JCheckBox ckbTempoArteAguaNoite;
    private javax.swing.JCheckBox ckbTipoBMP;
    private javax.swing.JCheckBox ckbTipoBPP;
    private javax.swing.JCheckBox ckbTipoCAM;
    private javax.swing.JCheckBox ckbTipoOutros;
    private javax.swing.ButtonGroup inssinss;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JRadioButton rbInssEmpregado;
    private javax.swing.JRadioButton rbInssNao;
    private javax.swing.JRadioButton rbInssSim;
    private javax.swing.JRadioButton rbMadeira;
    private javax.swing.JTextField tfAlemPescaOutraPescaria;
    private javax.swing.JTextField tfArteDePesca;
    private javax.swing.JTextField tfArtePesca;
    private javax.swing.JTextField tfAtividadeRT;
    private javax.swing.JTextField tfConservacaoPescado;
    private javax.swing.JTextField tfDesdeQuandoPescador;
    private javax.swing.JTextField tfDiasdePesca;
    private javax.swing.JTextField tfFimSafra;
    private javax.swing.JTextField tfInicioSafra;
    private javax.swing.JTextField tfLatitudeCP;
    private javax.swing.JTextField tfLocalCP;
    private javax.swing.JTextField tfLongitudeCP;
    private javax.swing.JTextField tfMalha;
    private javax.swing.JTextField tfNomeBarco;
    private javax.swing.JTextField tfOutroTipoQual;
    private javax.swing.JTextField tfParentescoRT;
    private javax.swing.JTextField tfPeriodo;
    private javax.swing.JTextField tfPescariaPrincipal;
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
    private javax.swing.JTextField tfSafra;
    private javax.swing.JTextField tfTamanho;
    private javax.swing.JTextField tfTamanhoEMalha;
    private javax.swing.JTextField tfTempoArteAgua;
    private javax.swing.JTextField tfTempoChegarPesqueiro;
    private javax.swing.JTextField tfTempoTrabalhandoBarco;
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


            sqlinsert = "insert into pescador_modaria "
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
                    + "(cod_pescador,pescaria_principal,safra,arte_pesca,"
                    + "quantidade_arte_pesca,tamanho_malha,tempo_arte_agua,"
                    + "dia,noite,tempo_chegada,dias_efetivos_pesca,viagens_mes,"
                    + "producao_viagem,renda_media_pecador,outra_pescaria,"
                    + "periodo) values ("+
                    codigo+",'"+
                    tfPescariaPrincipal.getText()+"','"+
                    tfSafra.getText()+"','"+
                    tfArtePesca.getText()+"','"+
                    tfQuantidadeArtePesca.getText()+"','"+
                    tfTamanhoEMalha.getText()+"','"+
                    tfTempoArteAgua.getText()+"','"+
                    util.checarCkb(ckbTempoArteAguaDia)+"','"+
                    util.checarCkb(ckbTempoArteAguaNoite)+"','"+
                    tfTempoChegarPesqueiro.getText()+"','"+
                    tfDiasdePesca.getText()+"','"+
                    tfQuantasViagensMes.getText()+"','"+
                    tfProducaoViagem.getText()+"','"+
                    tfRendaMediaPescador.getText()+"','"+
                    tfAlemPescaOutraPescaria.getText()+"','"+
                    tfPeriodo.getText()+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Composição da Pescaria - Cadastrado com sucesso");
            }
        
        
        //Dados da Embarcação

           String tdono = "";

           if (ckbEmbarcacaoPropria.isSelected())
                   tdono = "Própria";
            else if (ckbEmbarcacaoPatrao.isSelected())
                   tdono = "Patrão";

           String TtipoEmbarcacao = "";

           if (ckbTipoCAM.isSelected())
                   TtipoEmbarcacao = "CAM";
           else if (ckbTipoBPP.isSelected())
                   TtipoEmbarcacao = "BPP";
           else if (ckbTipoBMP.isSelected())
                   TtipoEmbarcacao = "BMP";
           else if (ckbTipoOutros.isSelected())
                   TtipoEmbarcacao = tfOutroTipoQual.getText();

            
           sqlinsert = "insert into pescador_dados_embarcacao "
                    + "(cod_pescador,dono_embarcacao,tipo_embarcacao,nome_barco,"
                    + "porto_origem,tempo_no_barco,conservacao_pescador) values ("+
                    codigo+",'"+
                    tdono+"','"+
                    TtipoEmbarcacao+"','"+
                    tfNomeBarco.getText()+"','"+
                    tfPortoOrigem.getText()+"','"+
                    tfTempoTrabalhandoBarco.getText()+"','"+
                    tfConservacaoPescado.getText()+"')";

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

            sqlupdate ="UPDATE pescador_modaria SET "
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
                    +"pescaria_principal = '"+tfPescariaPrincipal.getText()+"',"
                    +"safra = '"+tfSafra.getText()+"',"
                    +"arte_pesca = '"+tfArtePesca.getText()+"',"
                    +"quantidade_arte_pesca = '"+tfQuantidadeArtePesca.getText()+"',"
                    +"tamanho_malha = '"+tfTamanhoEMalha.getText()+"',"
                    +"tempo_arte_agua = '"+tfTempoArteAgua.getText()+"',"
                    +"dia = '"+util.checarCkb(ckbTempoArteAguaDia)+"',"
                    +"noite = '"+util.checarCkb(ckbTempoArteAguaNoite)+"',"
                    +"tempo_chegada = '"+tfTempoChegarPesqueiro.getText()+"',"
                    +"dias_efetivos_pesca = '"+tfDiasdePesca.getText()+"',"
                    +"viagens_mes = '"+tfQuantasViagensMes.getText()+"',"
                    +"producao_viagem = '"+tfProducaoViagem.getText()+"',"
                    +"renda_media_pecador = '"+tfRendaMediaPescador.getText()+"',"
                    +"outra_pescaria = '"+tfAlemPescaOutraPescaria.getText()+"',"
                    +"periodo = '"+tfPeriodo.getText()+"' "+

                    "where cod_pescador = "+codigo;

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlupdate)) {
                System.out.println("Composição da Pescaria - Alterado com sucesso");
            }


        //Dados da Embarcação

           String tdono = "";

           if (ckbEmbarcacaoPropria.isSelected())
                   tdono = "Própria";
            else if (ckbEmbarcacaoPatrao.isSelected())
                   tdono = "Patrão";

           String TtipoEmbarcacao = "";

           if (ckbTipoCAM.isSelected())
                   TtipoEmbarcacao = "CAM";
           else if (ckbTipoBPP.isSelected())
                   TtipoEmbarcacao = "BPP";
           else if (ckbTipoBMP.isSelected())
                   TtipoEmbarcacao = "BMP";
           else if (ckbTipoOutros.isSelected())
                   TtipoEmbarcacao = tfOutroTipoQual.getText();


           sqlupdate = "UPDATE pescador_dados_embarcacao SET "
                    +"dono_embarcacao = '"+tdono+"',"
                    +"tipo_embarcacao = '"+TtipoEmbarcacao+"',"
                    +"nome_barco = '"+tfNomeBarco.getText()+"',"
                    +"porto_origem = '"+tfPortoOrigem.getText()+"',"
                    +"tempo_no_barco = '"+tfTempoTrabalhandoBarco.getText()+"',"
                    +"conservacao_pescador = '"+tfConservacaoPescado.getText()+"' "+

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
        limpar_dados();
        String codigo = util.separa(1,cbPescador.getSelectedItem().toString());
        System.out.println(codigo);
        try {
            //Pescador Moradia
            conexao.execute("SELECT * FROM pescador_modaria WHERE cod_pescador = "+codigo);
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

            tfPescariaPrincipal.setText(conexao.resultSet.getString("pescaria_principal"));
            tfSafra.setText(conexao.resultSet.getString("safra"));
            tfArtePesca.setText(conexao.resultSet.getString("arte_pesca"));
            tfQuantidadeArtePesca.setText(conexao.resultSet.getString("quantidade_arte_pesca"));
            tfTamanhoEMalha.setText(conexao.resultSet.getString("tamanho_malha"));
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
            tfPeriodo.setText(conexao.resultSet.getString("periodo"));
            tfAlemPescaOutraPescaria.setText(conexao.resultSet.getString("outra_pescaria"));

            System.out.println("Passou! pescaria");


//          Dados da Embarcação
            conexao.execute("SELECT * FROM pescador_dados_embarcacao WHERE cod_pescador = "+codigo);
            conexao.resultSet.first();

            testador = conexao.resultSet.getString("dono_embarcacao");
            if (testador.equals("Própria"))
                   ckbEmbarcacaoPropria.setSelected(true);
            else if (testador.equals("Patrão"))
                   ckbEmbarcacaoPatrao.setSelected(true);

            testador = conexao.resultSet.getString("tipo_embarcacao");
            if (testador.equals("CAM"))
                   ckbTipoCAM.setSelected(true);
            else if (testador.equals("BPP"))
                   ckbTipoBPP.setSelected(true);
            else if (testador.equals("BMP"))
                   ckbTipoBMP.setSelected(true);
            else {
                   ckbTipoOutros.setSelected(true);
                   tfOutroTipoQual.setText(testador);
                 }

            tfNomeBarco.setText(conexao.resultSet.getString("nome_barco"));
            tfPortoOrigem.setText(conexao.resultSet.getString("porto_origem"));
            tfTempoTrabalhandoBarco.setText(conexao.resultSet.getString("tempo_no_barco"));
            tfConservacaoPescado.setText(conexao.resultSet.getString("conservacao_pescador"));

            System.out.println("Passou! embarcacao");

            attjTableAtividadeFamiliar();
            attjTableComposicaoPescaria();
            jTableEspeciesCapturadas();

            System.out.println("Passou! Tabelas");

            attCbEspecie();

        }catch (SQLException ex) {           
                JOptionPane.showMessageDialog(null,"Nenhum registro encontrado "+ ex );
                System.out.println("Erro no mostrar dados");
        }
    }


    private void limpar_dados() {

            rbMadeira.setSelected(false);
            rbAlvenaria.setSelected(false);
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
            tfPescariaPrincipal.setText("");
            tfSafra.setText("");
            tfArtePesca.setText("");
            tfQuantidadeArtePesca.setText("");
            tfTamanhoEMalha.setText("");
            tfTempoArteAgua.setText("");
            ckbTempoArteAguaDia.setSelected(false);
            ckbTempoArteAguaNoite.setSelected(false);
            tfTempoChegarPesqueiro.setText("");
            tfDiasdePesca.setText("");
            tfQuantasViagensMes.setText("");
            tfProducaoViagem.setText("");
            tfRendaMediaPescador.setText("");
            tfPeriodo.setText("");
            tfAlemPescaOutraPescaria.setText("");

            //Dados da Embarcação
            ckbEmbarcacaoPropria.setSelected(false);
            ckbEmbarcacaoPatrao.setSelected(false);
            ckbTipoCAM.setSelected(false);
            ckbTipoBPP.setSelected(false);
            ckbTipoBMP.setSelected(false);
            ckbTipoOutros.setSelected(false);
            tfOutroTipoQual.setText("");
            tfNomeBarco.setText("");
            tfPortoOrigem.setText("");
            tfTempoTrabalhandoBarco.setText("");
            tfConservacaoPescado.setText("");

            //Tabelas
            tfParentescoRT.setText("");
            tfAtividadeRT.setText("");
            tfRendaRT.setText("");
            tfLocalCP.setText("");
            tfLatitudeCP.setText("");
            tfLongitudeCP.setText("");
            tfInicioSafra.setText("");
            tfFimSafra.setText("");
            tfArteDePesca.setText("");
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
            attjTableComposicaoPescaria();
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
                    + "(cod_pescador,especie,inicio_safra,fim_safra,"
                    + "arte_pesca,tamanho,malha) values ("+
                    codigo+",'"+
                    cbEspecie.getSelectedItem()+"','"+
                    tfInicioSafra.getText()+"','"+
                    tfFimSafra.getText()+"','"+
                    tfArteDePesca.getText()+"','"+
                    tfTamanho.getText()+"','"+
                    tfMalha.getText()+"')";

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
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_pescador_especies_capturadas"),
                                           conexao.resultSet.getString("especie"),
                                           conexao.resultSet.getString("inicio_safra"),
                                           conexao.resultSet.getString("fim_safra"),
                                           conexao.resultSet.getString("arte_pesca"),
                                           conexao.resultSet.getString("tamanho"),
                                           conexao.resultSet.getString("malha"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + "Tabela Espécies Capturadas");
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

    public void attCbEspecie() {
        try {
            cbEspecie.removeAllItems();
            conexao.execute("select * from especie");

            while (conexao.resultSet.next()){
                cbEspecie.addItem(conexao.resultSet.getString("especie"));
            }

        }catch (SQLException ex) {
            System.out.println("Erro no cbEspécie "+ex);
        }
    }

}
