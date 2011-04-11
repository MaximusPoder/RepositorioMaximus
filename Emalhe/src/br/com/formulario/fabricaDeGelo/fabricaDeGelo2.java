package br.com.formulario.fabricaDeGelo;


import br.com.formulario.pescador.*;
import br.com.conexao.Conexao;
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
public class fabricaDeGelo2 extends javax.swing.JFrame {

    private Conexao conexao;
    private int inicia_combo = 0; //Evita a ativação inicial do cbPescador
    private Utilidade util = new Utilidade();

    public fabricaDeGelo2() {
        initComponents(); //Inicializa os componentes da tela
        //conexao = new Conexao();
        //conexao.conecta("emalhe");
              
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
        cbEmpresa = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAtividadeFamiliar = new javax.swing.JTable();
        btAdicionarRT = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEspeciesCapturadas = new javax.swing.JTable();
        btExcluirEspeciesCapturadas = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableComposicaoPescaria = new javax.swing.JTable();
        btExcluirCP = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        tfNumeroFuncionario = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tfSalarioFuncionario = new JMoneyField();
        jLabel32 = new javax.swing.JLabel();
        btExcluirRT = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        tfLatitudeCP = new javax.swing.JTextField();
        tfLongitudeCP = new javax.swing.JTextField();
        btAdicionarCP = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        tfEquipamentosEmprestimo = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        tfConstrucaoEmprestimo = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        tfMalha = new javax.swing.JTextField();
        btAddEspeciesCapturadas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        cbFuncaoFuncionario = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tfHorasTrabalhadasFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTempoPermanenciaFuncionarios = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfProblemasFabricaGelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfSolucionarProblemasFabrica = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfOrigemAguaFabrica = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        tfOutrosFabrica = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbPrincipaisClientes = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        tfIncentivosFiscaisFabrica = new javax.swing.JTextField();
        cbCustosAbatimento = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        tfAPartiAbatimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        cbTIpoEmprestimo = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        tfOutrosEmprestimo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Questionário Atravessador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar_janela(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        cbEmpresa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEmpresaItemStateChanged(evt);
            }
        });
        cbEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpresaActionPerformed(evt);
            }
        });

        jLabel24.setText("Empresa");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Questionário Fabrica de Gêlo 2");

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

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("9_Qual o número de funcionarios por setor ?");

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

        btAdicionarRT.setText("Adicionar");
        btAdicionarRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarRTActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("17_ A empresa recebe algum abatimento nos custos ?");

        jTableEspeciesCapturadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Emprestimo", "Construção", "Equipamento", "Cap. Giro", "Outros"
            }
        ));
        jScrollPane3.setViewportView(jTableEspeciesCapturadas);

        btExcluirEspeciesCapturadas.setText("Excluir");
        btExcluirEspeciesCapturadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirEspeciesCapturadasActionPerformed(evt);
            }
        });

        jTableComposicaoPescaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "cod", "Custo", "Valor", "Desconto", "A Parti de (Ano)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
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

        jLabel30.setText("Função");

        jLabel31.setText("Número :");

        jLabel32.setText("Salário");

        btExcluirRT.setText("Excluir");
        btExcluirRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirRTActionPerformed(evt);
            }
        });

        jLabel33.setText("Custos.:");

        btAdicionarCP.setText("Adicionar");
        btAdicionarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarCPActionPerformed(evt);
            }
        });

        jLabel34.setText("Desconto");

        jLabel35.setText("Valor.:");

        jLabel53.setText("Tipo Emprestimo:");

        jLabel54.setText("Equipamento");

        jLabel56.setText("Construção.:");

        jLabel57.setText("Cap. Giro.:");

        btAddEspeciesCapturadas.setText("Adicionar");
        btAddEspeciesCapturadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddEspeciesCapturadasActionPerformed(evt);
            }
        });

        cbFuncaoFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administralção", "Produção", "Vigilante", "Serviço Gerais ", " " }));

        jLabel1.setText("Horas Trabalhadas");

        jLabel2.setText("10_Qual a média do tempo de permanência dos funcionários da empresa em anos ?");

        jLabel3.setText("11_Quais os principais problemas que enfrenta com a fábrica de gelo ?");

        tfProblemasFabricaGelo.setText("1");

        jLabel4.setText("12_Como solucionar os problemas(gargalos ) ?");

        jLabel5.setText("13_Qual a origem da água utilizada para a fabricação do gelo ?");

        jLabel6.setText("14_A água passa por algum tipo  d tratamento ? Qual ?");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtragem", "Cloro", "Ozônio", "Outros" }));

        jLabel7.setText("Quais ?");

        tfOutrosFabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOutrosFabricaActionPerformed(evt);
            }
        });

        jLabel14.setText("15_ Quais os principais clientes ?");

        cbPrincipaisClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pescador", "Caminhão", "Marreteiro", "Outros" }));

        jLabel36.setText("Quais ?");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel37.setText("16_ A empresa recebeu incentivos fiscais ?");

        jCheckBox1.setText("Sim");

        jLabel38.setText("Qual ?");

        cbCustosAbatimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LUZ", "ICMS", "IPTU", "OUTROS" }));

        jLabel8.setText("A parti de (ano).:");

        jLabel9.setText("18_ Fez algum emprestimo para a mpresa ?");

        jCheckBox2.setText("Sim");

        jLabel10.setText("Relacionar :");

        cbTIpoEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banco", "Linha de Credito(FNO,Finame)", "valor do Emprestimo R$", "Data Emprestimo", "Carência", "Prestação", "Qtas Pagou", "Em dia/atrasado/Inadiplente" }));

        jLabel11.setText("Outros :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btExcluirCP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btAdicionarCP)
                                    .addGap(5, 5, 5))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfHorasTrabalhadasFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btExcluirRT)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btAdicionarRT)
                                    .addGap(6, 6, 6)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTempoPermanenciaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfOutrosFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel37)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel38)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfIncentivosFiscaisFabrica))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbPrincipaisClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfOrigemAguaFabrica, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSolucionarProblemasFabrica, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfProblemasFabricaGelo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(cbCustosAbatimento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(tfLatitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLongitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAPartiAbatimento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49)))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(516, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btAddEspeciesCapturadas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluirEspeciesCapturadas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfEquipamentosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTIpoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel56))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfConstrucaoEmprestimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMalha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfOutrosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cbFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(tfNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(tfSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfHorasTrabalhadasFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirRT)
                    .addComponent(btAdicionarRT))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTempoPermanenciaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProblemasFabricaGelo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSolucionarProblemasFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfOrigemAguaFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfOutrosFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPrincipaisClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel38)
                    .addComponent(tfIncentivosFiscaisFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(cbCustosAbatimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(tfLatitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLongitudeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(tfAPartiAbatimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirCP)
                    .addComponent(btAdicionarCP))
                .addGap(15, 15, 15)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(tfConstrucaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(cbTIpoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfOutrosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(tfEquipamentosEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(tfMalha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirEspeciesCapturadas)
                    .addComponent(btAddEspeciesCapturadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-841)/2, (screenSize.height-1206)/2, 841, 1206);
    }// </editor-fold>//GEN-END:initComponents

    private void fechar_janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar_janela
        conexao.desconecta();
    }//GEN-LAST:event_fechar_janela

    private void btAddEspeciesCapturadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddEspeciesCapturadasActionPerformed
        addBtEP();
}//GEN-LAST:event_btAddEspeciesCapturadasActionPerformed

    private void btAdicionarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarCPActionPerformed
        addBtCP();
}//GEN-LAST:event_btAdicionarCPActionPerformed

    private void btExcluirRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirRTActionPerformed
        excluirRT();
}//GEN-LAST:event_btExcluirRTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        atualizar_dados();
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        salvar_dados();
}//GEN-LAST:event_jButton2ActionPerformed

    private void btExcluirCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirCPActionPerformed
        excluirCP();
}//GEN-LAST:event_btExcluirCPActionPerformed

    private void btExcluirEspeciesCapturadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirEspeciesCapturadasActionPerformed
        excluirEP();
}//GEN-LAST:event_btExcluirEspeciesCapturadasActionPerformed

    private void btAdicionarRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarRTActionPerformed
        addBtRt();
}//GEN-LAST:event_btAdicionarRTActionPerformed

    private void cbEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpresaActionPerformed
        if (inicia_combo == 1){
            mostra_dados();
        }
        inicia_combo = 1;
}//GEN-LAST:event_cbEmpresaActionPerformed

    private void cbEmpresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEmpresaItemStateChanged
        //System.out.println("trocou");
}//GEN-LAST:event_cbEmpresaItemStateChanged

    private void tfOutrosFabricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOutrosFabricaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOutrosFabricaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fabricaDeGelo2().setVisible(true);
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
    private javax.swing.JComboBox cbCustosAbatimento;
    private javax.swing.JComboBox cbEmpresa;
    private javax.swing.JComboBox cbFuncaoFuncionario;
    private javax.swing.JComboBox cbPrincipaisClientes;
    private javax.swing.JComboBox cbTIpoEmprestimo;
    private javax.swing.ButtonGroup embarcacao;
    private javax.swing.ButtonGroup inssinss;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
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
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTableAtividadeFamiliar;
    private javax.swing.JTable jTableComposicaoPescaria;
    private javax.swing.JTable jTableEspeciesCapturadas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfAPartiAbatimento;
    private javax.swing.JTextField tfConstrucaoEmprestimo;
    private javax.swing.JTextField tfEquipamentosEmprestimo;
    private javax.swing.JTextField tfHorasTrabalhadasFuncionario;
    private javax.swing.JTextField tfIncentivosFiscaisFabrica;
    private javax.swing.JTextField tfLatitudeCP;
    private javax.swing.JTextField tfLongitudeCP;
    private javax.swing.JTextField tfMalha;
    private javax.swing.JTextField tfNumeroFuncionario;
    private javax.swing.JTextField tfOrigemAguaFabrica;
    private javax.swing.JTextField tfOutrosEmprestimo;
    private javax.swing.JTextField tfOutrosFabrica;
    private javax.swing.JTextField tfProblemasFabricaGelo;
    private javax.swing.JTextField tfSalarioFuncionario;
    private javax.swing.JTextField tfSolucionarProblemasFabrica;
    private javax.swing.JTextField tfTempoPermanenciaFuncionarios;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables


    private void salvar_dados(){
    String sqlinsert = new String();
    String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());
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
    String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());
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
        String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());
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
            tfConservacaoPescado.setText(conexao.resultSet.getString("conservacao_pescador"));

            System.out.println("Passou! embarcacao");

            attjTableAtividadeFamiliar();
            attjTableComposicaoPescaria();
            jTableEspeciesCapturadas();

            System.out.println("Passou! Tabelas");

            attCbs();

        }catch (SQLException ex) {           
                //JOptionPane.showMessageDialog(null,"Nenhum registro encontrado "+ ex );
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
            tfConservacaoPescado.setText("");

            //Tabelas
            tfParentescoRT.setText("");
            tfNumeroFuncionario.setText("");
            tfSalarioFuncionario.setText("");
            tfLocalCP.setText("");
            tfLatitudeCP.setText("");
            tfLongitudeCP.setText("");
            tfInicioSafra.setText("");
            tfEquipamentosEmprestimo.setText("");
            cbArtePesca.setSelectedIndex(0);
            tfMalha.setText("");
            tfConstrucaoEmprestimo.setText("");

    }

    //Trabalho com a tabela Renda FAMILIA

    private void addBtRt(){
    String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());
    System.out.println(codigo);

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into pescador_relacoes_trabalho_familia_renda "
                    + "(cod_pescador,parentesco,atividade,renda) values ("+
                    codigo+",'"+
                    tfParentescoRT.getText()+"','"+
                    tfNumeroFuncionario.getText()+"','"+
                    tfSalarioFuncionario.getText()+"')";

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
        String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());

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
    String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());
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
        String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());

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
    String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());
    System.out.println(codigo);

          //Tabela Locais da Especies Capturadas
          String sqlinsert = "insert into pescador_especies_capturadas "
                    + "(cod_pescador,especie,inicio_safra,fim_safra,"
                    + "arte_pesca,tamanho,malha) values ("+
                    codigo+",'"+
                    cbEspecie.getSelectedItem()+"','"+
                    tfInicioSafra.getText()+"','"+
                    tfEquipamentosEmprestimo.getText()+"','"+
                    cbArtePesca.getSelectedItem()+"','"+
                    tfConstrucaoEmprestimo.getText()+"','"+
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
        String codigo = util.separa(1,cbEmpresa.getSelectedItem().toString());

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
            cbEmpresa.removeAllItems();
            conexao.execute("select * from pescador");

            while (conexao.resultSet.next()){
                cbEmpresa.addItem(conexao.resultSet.getString("cod_pescador")+
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
            tfConstrucaoEmprestimo.setEditable(true);
            tfMalha.setEditable(true);
        }
        else{
            tfConstrucaoEmprestimo.setEditable(false);
            tfMalha.setEditable(false);
            tfConstrucaoEmprestimo.setText("");
            tfMalha.setText("");
        }

        } catch (Exception e) {
        }


    }

}
