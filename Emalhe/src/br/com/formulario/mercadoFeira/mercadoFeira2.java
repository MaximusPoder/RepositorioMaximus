
package br.com.formulario.mercadoFeira;

import br.com.conexao.Conexao;
import br.com.util.JIntField;
import br.com.util.JMoneyField;
import br.com.util.Utilidade;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MPA
 */

public class mercadoFeira2 extends javax.swing.JFrame {

    /** Creates new form frm_questionario_caminhoneiro */
    private Conexao conexao;
    int inicia_combo = 0;

    private Utilidade util = new Utilidade();

    public mercadoFeira2() {
        initComponents();
        conexao = new Conexao();
        conexao.conecta("emalhe");

        //Insere nome no cbmercadofeira
        attCbMercadoFeira();

        attCbs();

        mostra_dados();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casa = new javax.swing.ButtonGroup();
        banheiro = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpPescadoSubproduto = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        cbNomeMercadoFeira = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        botao_salvar_questionario = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        ckbTemRegistroEntidade = new javax.swing.JCheckBox();
        tfDesdeQuando = new JIntField();
        tfQualEntidade = new javax.swing.JTextField();
        tfTempoAtividadeMoradia = new JIntField();
        rbMadeira = new javax.swing.JRadioButton();
        rbBanheiroDentro = new javax.swing.JRadioButton();
        rbAlvenaria = new javax.swing.JRadioButton();
        rbBanheiroFora = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        ckbLuzSim = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        ckbFossaSim = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        ckbDrenagemSim = new javax.swing.JCheckBox();
        ckbAguaSim = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        tfRenda = new JMoneyField();
        jLabel55 = new javax.swing.JLabel();
        tfAtividade = new javax.swing.JTextField();
        btExcluirRendaFamilia = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        tfParentesco = new javax.swing.JTextField();
        btAdicionarRendaFamilia = new javax.swing.JButton();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTableAtividadeFamiliar = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        tfQualBeneficio = new javax.swing.JTextField();
        ckbRecebeBeneficioGovernoSim = new javax.swing.JCheckBox();
        jLabel57 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        tfTempoTrabalhando = new JIntField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel69 = new javax.swing.JLabel();
        cbGastosViagem = new javax.swing.JComboBox();
        tfOutrosGastos = new javax.swing.JTextField();
        tfCustoCusto = new JMoneyField();
        tfQuantidadeCusto = new JIntField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jtGastosPorSemana = new javax.swing.JTable();
        jToggleButton8 = new javax.swing.JToggleButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane35 = new javax.swing.JScrollPane();
        jtOrigemProduto = new javax.swing.JTable();
        ckbPescadores = new javax.swing.JCheckBox();
        ckbEmpresa = new javax.swing.JCheckBox();
        ckbOutro = new javax.swing.JCheckBox();
        ckbCooperativa = new javax.swing.JCheckBox();
        jLabel60 = new javax.swing.JLabel();
        tfOutroProduto = new javax.swing.JTextField();
        cbProduto = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtEspeciesComercializadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbEspecie = new javax.swing.JComboBox();
        tfQtdFresco = new JIntField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfQtdSalgado = new JIntField();
        jLabel9 = new javax.swing.JLabel();
        tfPrecoFresco = new JMoneyField();
        jLabel12 = new javax.swing.JLabel();
        tfPrecoSalgado = new JMoneyField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar_janela(evt);
            }
        });

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel41.setForeground(new java.awt.Color(0, 102, 102));
        jLabel41.setText("Questionário Mercado/Feira");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel41)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        cbNomeMercadoFeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeMercadoFeiraActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome.:");

        botao_salvar_questionario.setText("Salvar");
        botao_salvar_questionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_salvar_questionarioActionPerformed(evt);
            }
        });

        botao_alterar.setText("Alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        jLabel43.setText("Quando tempo está na atividade?");

        jLabel44.setText("Qual?");

        jLabel45.setText("Desde quando?");

        jLabel47.setText("Tem registro em alguma entidade de classe (colônia, associação, cooperativa)?");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel49.setText("Quem de sua família trabalha? E com qual atividade?:");

        ckbTemRegistroEntidade.setText("Sim");
        ckbTemRegistroEntidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckbTemRegistroEntidadeStateChanged(evt);
            }
        });
        ckbTemRegistroEntidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTemRegistroEntidadeActionPerformed(evt);
            }
        });

        tfQualEntidade.setEditable(false);

        tfTempoAtividadeMoradia.setText("0");

        casa.add(rbMadeira);
        rbMadeira.setText("Madeira");

        banheiro.add(rbBanheiroDentro);
        rbBanheiroDentro.setText("Dentro");

        casa.add(rbAlvenaria);
        rbAlvenaria.setText("Alvenaria");

        banheiro.add(rbBanheiroFora);
        rbBanheiroFora.setText("Fora");
        rbBanheiroFora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBanheiroForaActionPerformed(evt);
            }
        });

        jLabel42.setText("Banheiro.:");

        jLabel46.setText("Casa.:");

        ckbLuzSim.setText("Sim");

        jLabel48.setText("Luz elétrica.:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel50.setText("MORADIA");

        jLabel51.setText("Fossa seca ou sépica.:");

        ckbFossaSim.setText("Sim");
        ckbFossaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbFossaSimActionPerformed(evt);
            }
        });

        jLabel52.setText("Água encanada.:");

        ckbDrenagemSim.setText("Sim");

        ckbAguaSim.setText("Sim");

        jLabel53.setText("Drenagem pluvial.:");

        jLabel54.setText("Renda");

        jLabel55.setText("Atividade");

        btExcluirRendaFamilia.setText("Excluir");
        btExcluirRendaFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirRendaFamiliaActionPerformed(evt);
            }
        });

        jLabel56.setText("Parentesco:");

        btAdicionarRendaFamilia.setText("Adicionar");
        btAdicionarRendaFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarRendaFamiliaActionPerformed(evt);
            }
        });

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
        jScrollPane30.setViewportView(jTableAtividadeFamiliar);

        jLabel25.setText("Qual.:");

        tfQualBeneficio.setEditable(false);

        ckbRecebeBeneficioGovernoSim.setText("Sim");
        ckbRecebeBeneficioGovernoSim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckbRecebeBeneficioGovernoSimStateChanged(evt);
            }
        });

        jLabel57.setText("Recebe algum benefício do governo.:");

        jLabel11.setText("Ano (Ex: 1998)");

        jLabel58.setText("Quando tempo diário que passa trabalhando?");

        tfTempoTrabalhando.setText("0");

        jLabel14.setText("Horas");

        jLabel15.setText("Anos");

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

        tfOutrosGastos.setEditable(false);

        tfQuantidadeCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeCustoActionPerformed(evt);
            }
        });

        jLabel71.setText("Quantidade.:");

        jtGastosPorSemana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod", "Gastos", "Quantidade", "Custo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane34.setViewportView(jtGastosPorSemana);
        jtGastosPorSemana.getColumnModel().getColumn(0).setResizable(false);

        jToggleButton8.setText("Excluir");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jLabel67.setText("Custo.:");

        jLabel59.setText("Gastos:");

        jtOrigemProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Produto", "Empresa", "Pescadores", "Cooperativa", "Outros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane35.setViewportView(jtOrigemProduto);
        jtOrigemProduto.getColumnModel().getColumn(0).setResizable(false);
        jtOrigemProduto.getColumnModel().getColumn(4).setResizable(false);

        ckbPescadores.setText("Pescadores");

        ckbEmpresa.setText("Empresa");

        ckbOutro.setText("Outros");

        ckbCooperativa.setText("Cooperativa");

        jLabel60.setText("Produto.:");

        tfOutroProduto.setEditable(false);

        cbProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Peixe fresco", "Peixe em filé", "Peixe salgado", "Ovas de peixe", "Outro" }));
        cbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtEspeciesComercializadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "cod", "especie", "Qtd Fresco", "Qtd Salgado", "Preço Fresco", "Preço Salgado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtEspeciesComercializadas);
        jtEspeciesComercializadas.getColumnModel().getColumn(0).setResizable(false);

        jLabel1.setText("Espécie.:");

        jLabel2.setText("Quantidade Fresco.:");

        jLabel3.setText("Origem dos produtos (Local de origem)");

        jLabel4.setText("Dados das espécies comercializadas por dia");

        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("kg");

        jLabel6.setText("Quantidade Salgado.:");

        jLabel7.setText("kg");

        jLabel9.setText("Preço Fresco R$.:");

        jLabel12.setText("Preço Salgado R$.:");

        jButton3.setText("Adicionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPescadoSubprodutoLayout = new javax.swing.GroupLayout(jpPescadoSubproduto);
        jpPescadoSubproduto.setLayout(jpPescadoSubprodutoLayout);
        jpPescadoSubprodutoLayout.setHorizontalGroup(
            jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNomeMercadoFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel50)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbLuzSim)
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbBanheiroDentro)
                                            .addComponent(rbMadeira))
                                        .addGap(8, 8, 8)
                                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbBanheiroFora)
                                            .addComponent(rbAlvenaria)))
                                    .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ckbDrenagemSim)
                                        .addComponent(ckbFossaSim)
                                        .addComponent(ckbAguaSim))))
                            .addComponent(jLabel53)
                            .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPescadoSubprodutoLayout.createSequentialGroup()
                                    .addComponent(jLabel56)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel55)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel54)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAdicionarRendaFamilia))
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                                .addComponent(btExcluirRendaFamilia))
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbRecebeBeneficioGovernoSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQualBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQualEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDesdeQuando, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbTemRegistroEntidade))
                            .addComponent(jLabel49)))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTempoTrabalhando, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTempoAtividadeMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addComponent(jLabel59)
                                        .addGap(36, 36, 36)
                                        .addComponent(cbGastosViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addComponent(jLabel71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuantidadeCusto)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addComponent(jLabel67)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCustoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfOutrosGastos)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jToggleButton7)
                                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton8))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfOutroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(ckbEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbPescadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbCooperativa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOutro))
                    .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(34, 34, 34))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(402, Short.MAX_VALUE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(376, Short.MAX_VALUE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQtdSalgado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfQtdFresco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfPrecoFresco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecoSalgado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap(129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addComponent(botao_alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_salvar_questionario)
                .addGap(30, 30, 30))
        );
        jpPescadoSubprodutoLayout.setVerticalGroup(
            jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbNomeMercadoFeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel46))
                    .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbAlvenaria)
                        .addComponent(rbMadeira)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(ckbLuzSim))
                .addGap(7, 7, 7)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(rbBanheiroFora)
                    .addComponent(rbBanheiroDentro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(ckbAguaSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(ckbDrenagemSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(ckbFossaSim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(ckbTemRegistroEntidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(tfQualEntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(tfDesdeQuando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(16, 16, 16)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(tfParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(tfAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(tfRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarRendaFamilia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirRendaFamilia)
                .addGap(12, 12, 12)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbRecebeBeneficioGovernoSim)
                    .addComponent(jLabel57)
                    .addComponent(jLabel25)
                    .addComponent(tfQualBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(tfTempoTrabalhando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tfTempoAtividadeMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addGap(12, 12, 12)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(cbGastosViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOutrosGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(tfQuantidadeCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(tfCustoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jToggleButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOutroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbEmpresa)
                    .addComponent(ckbPescadores)
                    .addComponent(ckbCooperativa)
                    .addComponent(ckbOutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(tfQtdFresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecoFresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfQtdSalgado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(tfPrecoSalgado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_salvar_questionario)
                    .addComponent(botao_alterar))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jpPescadoSubproduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-716)/2, (screenSize.height-788)/2, 716, 788);
    }// </editor-fold>//GEN-END:initComponents

    private void cbNomeMercadoFeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeMercadoFeiraActionPerformed
       
        //Pesquisa automática do Combo Box
        
        if (inicia_combo == 1){
         mostra_dados();
        }inicia_combo = 1;
         
    }//GEN-LAST:event_cbNomeMercadoFeiraActionPerformed

    private void fechar_janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar_janela
        conexao.desconecta();
    }//GEN-LAST:event_fechar_janela

    private void botao_salvar_questionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_salvar_questionarioActionPerformed
        salvar_dados();
    }//GEN-LAST:event_botao_salvar_questionarioActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
        atualizar_dados();
    }//GEN-LAST:event_botao_alterarActionPerformed

    private void ckbTemRegistroEntidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbTemRegistroEntidadeStateChanged
        if (ckbTemRegistroEntidade.isSelected()){
            tfQualEntidade.setEditable(true);
        }else{
            tfQualEntidade.setEditable(false);
            tfQualEntidade.setText("");
        }
}//GEN-LAST:event_ckbTemRegistroEntidadeStateChanged

    private void ckbTemRegistroEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTemRegistroEntidadeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ckbTemRegistroEntidadeActionPerformed

    private void btExcluirRendaFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRendaFamiliaActionPerformed
        excluirRT();
}//GEN-LAST:event_btExcluirRendaFamiliaActionPerformed

    private void btAdicionarRendaFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarRendaFamiliaActionPerformed
        addBtRt();
}//GEN-LAST:event_btAdicionarRendaFamiliaActionPerformed

    private void rbBanheiroForaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBanheiroForaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBanheiroForaActionPerformed

    private void ckbFossaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbFossaSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbFossaSimActionPerformed

    private void ckbRecebeBeneficioGovernoSimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbRecebeBeneficioGovernoSimStateChanged
        if (ckbRecebeBeneficioGovernoSim.isSelected()){
            tfQualBeneficio.setEditable(true);
        }else{
            tfQualBeneficio.setEditable(false);
            tfQualBeneficio.setText("");
        }
    }//GEN-LAST:event_ckbRecebeBeneficioGovernoSimStateChanged

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        AddjtGastosPorSemana();
}//GEN-LAST:event_jToggleButton7ActionPerformed

    private void cbGastosViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGastosViagemActionPerformed
        mudar_estadoCB();
}//GEN-LAST:event_cbGastosViagemActionPerformed

    private void tfQuantidadeCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeCustoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfQuantidadeCustoActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        DeljtGastosPorSemana();
}//GEN-LAST:event_jToggleButton8ActionPerformed

    private void cbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoActionPerformed
        mudar_estadoCB();
    }//GEN-LAST:event_cbProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddjtOrigemProduto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DeljtOrigemProduto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddjtEspeciesComercializadas();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DeljtEspeciesComercializadas();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mercadoFeira2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup banheiro;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_salvar_questionario;
    private javax.swing.JButton btAdicionarRendaFamilia;
    private javax.swing.JButton btExcluirRendaFamilia;
    private javax.swing.ButtonGroup casa;
    private javax.swing.JComboBox cbEspecie;
    private javax.swing.JComboBox cbGastosViagem;
    private javax.swing.JComboBox cbNomeMercadoFeira;
    private javax.swing.JComboBox cbProduto;
    private javax.swing.JCheckBox ckbAguaSim;
    private javax.swing.JCheckBox ckbCooperativa;
    private javax.swing.JCheckBox ckbDrenagemSim;
    private javax.swing.JCheckBox ckbEmpresa;
    private javax.swing.JCheckBox ckbFossaSim;
    private javax.swing.JCheckBox ckbLuzSim;
    private javax.swing.JCheckBox ckbOutro;
    private javax.swing.JCheckBox ckbPescadores;
    private javax.swing.JCheckBox ckbRecebeBeneficioGovernoSim;
    private javax.swing.JCheckBox ckbTemRegistroEntidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTableAtividadeFamiliar;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JPanel jpPescadoSubproduto;
    private javax.swing.JTable jtEspeciesComercializadas;
    private javax.swing.JTable jtGastosPorSemana;
    private javax.swing.JTable jtOrigemProduto;
    private javax.swing.JRadioButton rbAlvenaria;
    private javax.swing.JRadioButton rbBanheiroDentro;
    private javax.swing.JRadioButton rbBanheiroFora;
    private javax.swing.JRadioButton rbMadeira;
    private javax.swing.JTextField tfAtividade;
    private javax.swing.JTextField tfCustoCusto;
    private javax.swing.JTextField tfDesdeQuando;
    private javax.swing.JTextField tfOutroProduto;
    private javax.swing.JTextField tfOutrosGastos;
    private javax.swing.JTextField tfParentesco;
    private javax.swing.JTextField tfPrecoFresco;
    private javax.swing.JTextField tfPrecoSalgado;
    private javax.swing.JTextField tfQtdFresco;
    private javax.swing.JTextField tfQtdSalgado;
    private javax.swing.JTextField tfQualBeneficio;
    private javax.swing.JTextField tfQualEntidade;
    private javax.swing.JTextField tfQuantidadeCusto;
    private javax.swing.JTextField tfRenda;
    private javax.swing.JTextField tfTempoAtividadeMoradia;
    private javax.swing.JTextField tfTempoTrabalhando;
    // End of variables declaration//GEN-END:variables


    private void mostra_dados(){
        limpar_dados();

        //tabelas 1:N
        attjTableAtividadeFamiliar();
        attjtGastosPorSemana();
        attjtOrigemProduto();
        attjtEspeciesComercializadas();


        String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());
        System.out.println(codigo);
        try {
            //caminhoneiro Moradia
            conexao.execute("SELECT * FROM mercado_feira_moradia WHERE cod_mercado_feira = "+codigo);
            conexao.resultSet.first();

            //Moaradia
            String testador;

            testador = conexao.resultSet.getString("casa");
            if (testador.equals("Madeira"))
                   rbMadeira.setSelected(true);

            if (testador.equals("Alvenaria"))
                   rbAlvenaria.setSelected(true);

            if (conexao.resultSet.getString("luz").equals("1"))
                   ckbLuzSim.setSelected(true);

            testador = conexao.resultSet.getString("banheiro");
            if (testador.equals("Dentro"))
                   rbBanheiroDentro.setSelected(true);

            if (testador.equals("Fora"))
                   rbBanheiroFora.setSelected(true);

            if (conexao.resultSet.getString("agua_encanada").equals("1"))
                   ckbAguaSim.setSelected(true);

            if (conexao.resultSet.getString("drenagem_pluvial").equals("1"))
                   ckbDrenagemSim.setSelected(true);

            if (conexao.resultSet.getString("fossa").equals("1"))
                   ckbFossaSim.setSelected(true);

            if (conexao.resultSet.getString("tem_registro").equals("1"))
                   ckbTemRegistroEntidade.setSelected(true);

            tfQualEntidade.setText(conexao.resultSet.getString("qual_entidade"));
            tfDesdeQuando.setText(conexao.resultSet.getString("tempo_registro"));
       
            if (conexao.resultSet.getString("recebe_beneficio").equals("1"))
                   ckbRecebeBeneficioGovernoSim.setSelected(true);

            tfQualBeneficio.setText(conexao.resultSet.getString("beneficio"));
            tfTempoAtividadeMoradia.setText(conexao.resultSet.getString("tempo_atividade"));

            System.out.println("1 Moradia - Passou");

           
             

        } catch (Exception e) {
            System.out.println(e + " metodo mostrar dados");
        }
    }

        public void limpar_dados(){
            rbMadeira.setSelected(false);
            rbAlvenaria.setSelected(false);
            rbBanheiroDentro.setSelected(false);
            rbBanheiroFora.setSelected(false);
            ckbLuzSim.setSelected(false);
            ckbAguaSim.setSelected(false);
            ckbDrenagemSim.setSelected(false);
            ckbFossaSim.setSelected(false);
            ckbTemRegistroEntidade.setSelected(false);
            tfQualEntidade.setText("");
            tfDesdeQuando.setText("");
            ckbRecebeBeneficioGovernoSim.setSelected(false);
            tfQualBeneficio.setText("");
            tfTempoAtividadeMoradia.setText("");
            
            

    }


    private void excluirRT() {
         //System.out.println(jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0));
        String sql;

        sql = "delete from mercado_feira_moradia_familia_renda "
            + "Where cod_mercado_feira_moradia_familia_renda = "
            + jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjTableAtividadeFamiliar();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void addBtRt() {
        String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());
        System.out.println(codigo);

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into mercado_feira_moradia_familia_renda "
                    + "(cod_mercado_feira,parentesco,atividade,renda) values ("+
                    codigo+",'"+
                    tfParentesco.getText()+"','"+
                    tfAtividade.getText()+"','"+
                    tfRenda.getText()+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("mercado_feira_moradia_familia_renda - Cadastrado com sucesso");
                attjTableAtividadeFamiliar();
            }
    }

    private void attCbMercadoFeira() {
         try {
                    cbNomeMercadoFeira.removeAllItems();
                    conexao.execute("select * from mercado_feira");

                    while (conexao.resultSet.next()){
                        cbNomeMercadoFeira.addItem(conexao.resultSet.getString("cod_mercado_feira")+
                                                       " # "+ conexao.resultSet.getString("nome"));
                        
                    }
                }catch (SQLException ex) {
                    System.out.println(ex);
                }
    }

    private void attjTableAtividadeFamiliar() {
        String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());

        conexao.execute("select * from mercado_feira_moradia_familia_renda"
                        + " where cod_mercado_feira = " + codigo);

        jTableAtividadeFamiliar.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableAtividadeFamiliar.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableAtividadeFamiliar.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTableAtividadeFamiliar.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTableAtividadeFamiliar.getColumnModel().getColumn(3).setPreferredWidth(10);

        DefaultTableModel modelo = (DefaultTableModel)jTableAtividadeFamiliar.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_mercado_feira_moradia_familia_renda"),
                                           conexao.resultSet.getString("parentesco"),
                                           conexao.resultSet.getString("atividade"),
                                           conexao.resultSet.getString("renda"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + "Tabela Familia Renda Trabalho");
            //attjTableComposicaoPescaria();
        }
    }

    private void salvar_dados() {
    String sqlinsert = new String();
    String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());
    System.out.println(codigo);

        //Moradia
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

            sqlinsert = "insert into mercado_feira_moradia "
                    + "(cod_mercado_feira,casa,luz,banheiro,agua_encanada,"
                    + "drenagem_pluvial,fossa,tem_registro,qual_entidade,"
                    + "tempo_registro,recebe_beneficio,beneficio,tempo_trabalhando,"
                    + "tempo_atividade) values ("+
                    codigo+",'"+
                    tcasa+"','"+
                    util.checarCkb(ckbLuzSim)+"','"+
                    tbanheiro+"','"+
                    util.checarCkb(ckbAguaSim)+"','"+
                    util.checarCkb(ckbDrenagemSim)+"','"+
                    util.checarCkb(ckbFossaSim)+"','"+
                    util.checarCkb(ckbTemRegistroEntidade)+"','"+
                    tfQualEntidade.getText()+"','"+
                    tfDesdeQuando.getText()+"','"+
                    util.checarCkb(ckbRecebeBeneficioGovernoSim)+"','"+
                    tfQualBeneficio.getText()+"','"+
                    tfTempoTrabalhando.getText()+"','"+
                    tfTempoAtividadeMoradia.getText()+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                JOptionPane.showMessageDialog(null,"Salvo sucesso" );
                System.out.println("Cadastrado com sucesso");
                mostra_dados();
            }


    }

    private void atualizar_dados() {
    String sqlupdate = new String();
    String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());
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

            //Pegando ites do CB/>

            sqlupdate ="UPDATE mercado_feira_moradia SET "
                    +"casa = '"+tcasa+"',"
                    +"luz = '"+util.checarCkb(ckbLuzSim)+"',"
                    +"banheiro = '"+tbanheiro+"',"
                    +"agua_encanada = '"+util.checarCkb(ckbAguaSim)+"',"
                    +"drenagem_pluvial = '"+util.checarCkb(ckbDrenagemSim)+"',"
                    +"fossa = '"+util.checarCkb(ckbFossaSim)+"',"
                    +"tem_registro = '"+util.checarCkb(ckbTemRegistroEntidade)+"',"
                    +"qual_entidade = '"+tfQualEntidade.getText()+"',"
                    +"tempo_registro = '"+tfDesdeQuando.getText()+"',"
                    +"recebe_beneficio = '"+util.checarCkb(ckbRecebeBeneficioGovernoSim)+"',"
                    +"beneficio = '"+tfQualBeneficio.getText()+"',"
                    +"tempo_trabalhando = '"+tfTempoTrabalhando.getText()+"',"
                    +"tempo_atividade ='"+tfTempoAtividadeMoradia.getText()+"' "+

                    
                    "where cod_mercado_feira = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                JOptionPane.showMessageDialog(null,"Atualizado com sucesso" );
                System.out.println("Atualizado com sucesso");
                //Atualiza Resultset
                mostra_dados();
            }
    }

    private void AddjtGastosPorSemana() {
    String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());
    System.out.println(codigo);

        String gastot = new String();
            gastot = cbGastosViagem.getSelectedItem().toString();
            if (gastot.equals("Outro"))
                gastot = tfOutrosGastos.getText();

          //Gastos
          String sqlinsert = "insert into mercado_feira_gastos_semana "
                    + "(cod_mercado_feira,gasto,quantidade,custo) values ("+
                    codigo+",'"+
                    gastot+"','"+
                    tfQuantidadeCusto.getText()+"','"+
                    tfCustoCusto.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("dono_barco_composicao_gasto_por_viagem - Cadastrado com sucesso");
                attjtGastosPorSemana();
            }
    }

    private void attjtGastosPorSemana() {
        String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());

        conexao.execute("select * from mercado_feira_gastos_semana"
                        + " where cod_mercado_feira = " + codigo);

        jtGastosPorSemana.getColumnModel().getColumn(0).setMaxWidth(0);
        jtGastosPorSemana.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtGastosPorSemana.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtGastosPorSemana.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtGastosPorSemana.getColumnModel().getColumn(3).setPreferredWidth(10);


        DefaultTableModel modelo = (DefaultTableModel)jtGastosPorSemana.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_mercado_feira_gastos_semana"),
                                           conexao.resultSet.getString("gasto"),
                                           conexao.resultSet.getString("quantidade"),
                                           conexao.resultSet.getString("custo"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela gastos");
        }
    }

    private void DeljtGastosPorSemana() {
        String sql;

        sql = "delete from mercado_feira_gastos_semana "
            + "Where cod_mercado_feira_gastos_semana = "
            + jtGastosPorSemana.getValueAt(jtGastosPorSemana.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtGastosPorSemana();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void mudar_estadoCB() {
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
            if (cbProduto.getSelectedItem().equals("Outro"))
                tfOutroProduto.setEditable(true);
            else {
                tfOutroProduto.setEditable(false);
                tfOutroProduto.setText("");
            }
        } catch (Exception e) {
        }




    }

    private void AddjtOrigemProduto() {
    String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());
    System.out.println(codigo);

        String produtot = new String();
            produtot = cbProduto.getSelectedItem().toString();
            if (produtot.equals("Outro"))
                produtot = tfOutroProduto.getText();

          //Gastos
          String sqlinsert = "insert into mercado_feira_origem_produto "
                    + "(cod_mercado_feira,produto,empresa,pescadores,cooperativa,"
                    + "outros) values ("+
                    codigo+",'"+
                    produtot+"','"+
                    util.checarCkb(ckbEmpresa)+"','"+
                    util.checarCkb(ckbPescadores)+"','"+
                    util.checarCkb(ckbCooperativa)+"','"+
                    util.checarCkb(ckbOutro)+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("mercado_feira_origem_produto - Cadastrado com sucesso");
                attjtOrigemProduto();
            }
    }

    private void attjtOrigemProduto() {
        String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());

        conexao.execute("select * from mercado_feira_origem_produto"
                        + " where cod_mercado_feira = " + codigo);

        jtOrigemProduto.getColumnModel().getColumn(0).setMaxWidth(0);
        jtOrigemProduto.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtOrigemProduto.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtOrigemProduto.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtOrigemProduto.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtOrigemProduto.getColumnModel().getColumn(4).setPreferredWidth(10);
        jtOrigemProduto.getColumnModel().getColumn(5).setPreferredWidth(10);


        DefaultTableModel modelo = (DefaultTableModel)jtOrigemProduto.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_mercado_feira_origem_produto"),
                                           conexao.resultSet.getString("produto"),
                                           conexao.resultSet.getString("empresa"),
                                           conexao.resultSet.getString("pescadores"),
                                           conexao.resultSet.getString("cooperativa"),
                                           conexao.resultSet.getString("outros"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela jtOrigemProduto");
        }
    }

    private void DeljtOrigemProduto() {
        String sql;

        sql = "delete from mercado_feira_origem_produto "
            + "Where cod_mercado_feira_origem_produto = "
            + jtOrigemProduto.getValueAt(jtOrigemProduto.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtOrigemProduto();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void attCbs() {
        String item = new String();
                try {

                    cbEspecie.removeAllItems();
                    conexao.execute("select * from especie");

                    while (conexao.resultSet.next()){
                        item = conexao.resultSet.getString("especie");
                        cbEspecie.addItem(item);

                    }
                }catch (SQLException ex) {
                    System.out.println(ex);
                }
    }

    private void AddjtEspeciesComercializadas() {
    String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());
    System.out.println(codigo);

          //Gastos
          String sqlinsert = "insert into mercado_feira_especies_comercializadas "
                    + "(cod_mercado_feira,especie,qtd_fresco,qtd_salgado,preco_fresco,"
                    + "preco_salgado) values ("+
                    codigo+",'"+
                    cbEspecie.getSelectedItem()+"','"+
                    tfQtdFresco.getText()+"','"+
                    tfQtdSalgado.getText()+"','"+
                    tfPrecoFresco.getText()+"','"+
                    tfPrecoSalgado.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("mercado_feira_especies_comercializadas - Cadastrado com sucesso");
                attjtEspeciesComercializadas();
            }
    }

    private void attjtEspeciesComercializadas() {
        String codigo = util.separa(1,cbNomeMercadoFeira.getSelectedItem().toString());

        conexao.execute("select * from mercado_feira_especies_comercializadas"
                        + " where cod_mercado_feira = " + codigo);

        jtEspeciesComercializadas.getColumnModel().getColumn(0).setMaxWidth(0);
        jtEspeciesComercializadas.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtEspeciesComercializadas.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtEspeciesComercializadas.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtEspeciesComercializadas.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtEspeciesComercializadas.getColumnModel().getColumn(4).setPreferredWidth(10);
        jtEspeciesComercializadas.getColumnModel().getColumn(5).setPreferredWidth(10);


        DefaultTableModel modelo = (DefaultTableModel)jtEspeciesComercializadas.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_mercado_feira_especies_comercializadas"),
                                           conexao.resultSet.getString("especie"),
                                           conexao.resultSet.getString("qtd_fresco"),
                                           conexao.resultSet.getString("qtd_salgado"),
                                           conexao.resultSet.getString("preco_fresco"),
                                           conexao.resultSet.getString("preco_salgado"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela jtEspeciesComercializadas");
        }
    }

    private void DeljtEspeciesComercializadas() {
        String sql;

        sql = "delete from mercado_feira_especies_comercializadas "
            + "Where cod_mercado_feira_especies_comercializadas = "
            + jtEspeciesComercializadas.getValueAt(jtEspeciesComercializadas.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtEspeciesComercializadas();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

}
