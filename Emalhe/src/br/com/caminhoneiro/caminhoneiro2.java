
package br.com.caminhoneiro;

import br.com.conexao.Conexao;
import br.com.util.JDecimal2;
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

public class caminhoneiro2 extends javax.swing.JFrame {

    /** Creates new form frm_questionario_caminhoneiro */
    private Conexao conexao;
    int inicia_combo = 0;

    private Utilidade util = new Utilidade();

    public caminhoneiro2() {
        initComponents();
        conexao = new Conexao();
        conexao.conecta("emalhe");

        //Insere nome no cbNomecaminhoneiro
        attCbCaminhoneiro();

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
        cbNomeCaminhoneiro = new javax.swing.JComboBox();
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
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNumeroFornecedores = new JIntField();
        jLabel5 = new javax.swing.JLabel();
        ckbFornecedorAumentouSim = new javax.swing.JCheckBox();
        ckbSempreMesmoFornecedor1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        ckbSempreMesmoFornecedor2 = new javax.swing.JCheckBox();
        ckbMaisBarato3 = new javax.swing.JCheckBox();
        jLabel60 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        ckbSoPeixeiInteiro = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTableFormaComercializacao = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jtGrude = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfPrecoGrude = new JMoneyField();
        tfTipoGrude = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tfVolumeGrude = new JDecimal2();
        btAdicionarespeciesemana = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ckbCorCarnePeixe = new javax.swing.JCheckBox();
        ckbOdorCarnePeixe = new javax.swing.JCheckBox();
        ckbConsistenciaCarnePeixe = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        ckbOdorGrude = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        ckbTamanhoGrude = new javax.swing.JCheckBox();
        ckbSemManchaGrude = new javax.swing.JCheckBox();
        ckbOdorAba = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        ckbTamanhoAba = new javax.swing.JCheckBox();
        ckbSemManchaAba = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbMercado = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        cliente_pescado_empresa_municipio = new javax.swing.JCheckBox();
        cliente_pescado_empresa_capital = new javax.swing.JCheckBox();
        cliente_pescado_mercado_feira = new javax.swing.JCheckBox();
        cliente_pescado_supermercado_capital = new javax.swing.JCheckBox();
        cliente_pescado_supermercado_municipio = new javax.swing.JCheckBox();
        cliente_pescado_caminhao = new javax.swing.JCheckBox();
        cliente_pescado_outro_atravessador = new javax.swing.JCheckBox();
        cliente_grude_atravessador_municipio = new javax.swing.JCheckBox();
        cliente_grude_atravessador_outro_municipio = new javax.swing.JCheckBox();
        cliente_grude_empresa_belem = new javax.swing.JCheckBox();
        cliente_grude_outros = new javax.swing.JCheckBox();
        ckbSempreDosMesmos = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        jtForma = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        tfDestino = new javax.swing.JTextField();
        tfVolume = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        tfPreco = new JMoneyField();
        jLabel63 = new javax.swing.JLabel();
        btAddFormas = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        cbEspecie = new javax.swing.JComboBox();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        tfLocal = new javax.swing.JTextField();
        jScrollPane34 = new javax.swing.JScrollPane();
        jtGastos = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        tfCustoCusto = new JMoneyField();
        jLabel64 = new javax.swing.JLabel();
        tfOutroCusto = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        tfQuantidadeCusto = new JIntField();
        tfTipoGasto = new javax.swing.JTextField();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        cbGastos = new javax.swing.JComboBox();
        jLabel69 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        cbEspecieAquisicao = new javax.swing.JComboBox();
        ckbEvisceradoAq = new javax.swing.JCheckBox();
        ckbSalgadoAq = new javax.swing.JCheckBox();
        ckbPostaAq = new javax.swing.JCheckBox();
        ckbSemCabecaAq = new javax.swing.JCheckBox();
        ckbOutrosAq = new javax.swing.JCheckBox();
        ckbFileAq = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        ckbPescadorP = new javax.swing.JCheckBox();
        ckbEmpresaP = new javax.swing.JCheckBox();
        ckbOutroAtravessadorP = new javax.swing.JCheckBox();
        ckbDonoBarcoP = new javax.swing.JCheckBox();
        ckbMercadoFeiraP = new javax.swing.JCheckBox();
        ckbCooperativaP = new javax.swing.JCheckBox();
        ckbMercadoFeiraG = new javax.swing.JCheckBox();
        ckbCooperativaG = new javax.swing.JCheckBox();
        ckbPescadorG = new javax.swing.JCheckBox();
        ckbOutroAtravessadorG = new javax.swing.JCheckBox();
        ckbEmpresaG = new javax.swing.JCheckBox();
        ckbDonoBarcoG = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        cbEspecieGrude = new javax.swing.JComboBox();
        ckbGeloPescador = new javax.swing.JCheckBox();
        ckbFrigorificoPescador = new javax.swing.JCheckBox();
        ckbInNaturaPescador = new javax.swing.JCheckBox();
        ckbSalPescador = new javax.swing.JCheckBox();
        ckbSalGrude = new javax.swing.JCheckBox();
        ckbSolGrude = new javax.swing.JCheckBox();
        ckbEstufaGrude = new javax.swing.JCheckBox();
        ckbGeloGrude = new javax.swing.JCheckBox();
        ckbNaoSabeFornecedores = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMercadodeComercializacao = new javax.swing.JTable();
        btAdiconarJtMercadoCliente = new javax.swing.JToggleButton();
        btDeletarJtMercadoCliente = new javax.swing.JToggleButton();
        cbProduto = new javax.swing.JComboBox();
        tfProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfSempreDosMesmosPq = new javax.swing.JTextField();
        tfOutrosGastos = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        tfValor = new JMoneyField();
        jLabel74 = new javax.swing.JLabel();
        tfQtdFrete = new JIntField();
        cliente_pescado_consumidor_local = new javax.swing.JCheckBox();
        rbBarro = new javax.swing.JRadioButton();

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
        jLabel41.setText("Questionário Caminhoneiro");

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

        cbNomeCaminhoneiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeCaminhoneiroActionPerformed(evt);
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

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel58.setText("Como funciona o \"caminho da cadeia de comercialização\" do pescado ou da grude");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel59.setText("1 - Recepção dos produtos:");

        jLabel1.setText("De quem compra o produto, ou seja, quais seus fornecedores?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Pescado");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Grude");

        jLabel4.setText("Quantos fornecedores são?");

        jLabel5.setText("O n° de fornecedores aumntaram nos últimos 5 anos?");

        ckbFornecedorAumentouSim.setText("Sim");

        ckbSempreMesmoFornecedor1.setText("Sempre dos mesmo fornecedores");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("O produto você adquire:");

        ckbSempreMesmoFornecedor2.setText("Sempre dos mesmo fornecedores e de quem aparece");

        ckbMaisBarato3.setText("De quem vende mais barato");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel60.setText("2 - Aquisição (comercialização):");

        jLabel7.setText("Só vende o peixe inteiro?");

        ckbSoPeixeiInteiro.setText("Sim");

        jLabel9.setText("Quais outras formas de comercialização?");

        jTableFormaComercializacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Espécie Produto", "Eviscerado", "Salgado", "Filé", "Postas", "Sem cabeça", "Outros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane31.setViewportView(jTableFormaComercializacao);
        jTableFormaComercializacao.getColumnModel().getColumn(0).setResizable(false);
        jTableFormaComercializacao.getColumnModel().getColumn(7).setHeaderValue("Outros");

        jLabel10.setText("Espécie Produto.:");

        jToggleButton1.setText("Adicionar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Espécie Produto.:");

        jtGrude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod", "Espécies", "Volume (KG)", "Preço (R$)", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane32.setViewportView(jtGrude);
        jtGrude.getColumnModel().getColumn(0).setResizable(false);

        jLabel18.setText("A grude comercializada é de qual espécie? Por semana");

        jLabel19.setText("Tipo.:");

        jLabel21.setText("Preço R$.:");

        jLabel22.setText("Volume.:");

        btAdicionarespeciesemana.setText("Adicionar");
        btAdicionarespeciesemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarespeciesemanaActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Excluir");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Excluir");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel20.setText("Quais os critérios para definir a qualidade do produto?");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel23.setText("Carne do Peixe");

        ckbCorCarnePeixe.setText("Cor");

        ckbOdorCarnePeixe.setText("Odor");

        ckbConsistenciaCarnePeixe.setText("Consistência");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ckbOdorGrude.setText("Odor");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel24.setText("Grude");

        ckbTamanhoGrude.setText("Tamanho");

        ckbSemManchaGrude.setText("Sem mancha");

        ckbOdorAba.setText("Odor");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel26.setText("ABA");

        ckbTamanhoAba.setText("Tamanho");

        ckbSemManchaAba.setText("Sem mancha");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel61.setText("3 - Armazenamento");

        jLabel27.setText("Onde fica armazenado o produto?!");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel29.setText("Pescado");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel30.setText("Grude");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel62.setText("4 - Comercialização");

        jLabel28.setText("Qual o mercado que você comercializa?");

        cbMercado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mercado local no mesmo município", "Mercado Estadual", "Mercado Nacional", "Mercado Internacional" }));

        jLabel31.setText("Quais os seus clientes?");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel32.setText("Pescado");

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel33.setText("Grude");

        cliente_pescado_empresa_municipio.setText("1 Empresa de pesca do município");

        cliente_pescado_empresa_capital.setText("2 Empresa de pesca da capital");

        cliente_pescado_mercado_feira.setText("3 Mercado e feira municipal local");

        cliente_pescado_supermercado_capital.setText("4 Supermercado da capital");

        cliente_pescado_supermercado_municipio.setText("5 Supermercado do município");

        cliente_pescado_caminhao.setText("6 Caminhão");

        cliente_pescado_outro_atravessador.setText("8 Outro Atravessdor");

        cliente_grude_atravessador_municipio.setText("1 Atravessador do município");

        cliente_grude_atravessador_outro_municipio.setText("2 Atravessador de outro munucípio");

        cliente_grude_empresa_belem.setText("3 Empresa de Belém");

        cliente_grude_outros.setText("4 Outros");

        ckbSempreDosMesmos.setText("SIM");

        jLabel34.setText("Sempre vende para os mesmos compradores?");

        jLabel35.setText("Espécie.:");

        jtForma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Espécie", "Produto", "Cliente", "Destino", "Volume", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane33.setViewportView(jtForma);
        jtForma.getColumnModel().getColumn(0).setResizable(false);

        jLabel36.setText("Volume (semana).:");

        jLabel38.setText("Destino.:");

        jLabel39.setText("Produto.:");

        tfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteActionPerformed(evt);
            }
        });

        jLabel40.setText("Cliente.:");

        jLabel63.setText("Preço (R$).:");

        btAddFormas.setText("Adicionar");
        btAddFormas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddFormasActionPerformed(evt);
            }
        });

        jToggleButton6.setText("Excluir");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel71.setText("Qual o valor cobrado pelo frete (por rota de venda)?");

        jLabel72.setText("Local.:");

        jtGastos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane34.setViewportView(jtGastos);
        jtGastos.getColumnModel().getColumn(0).setResizable(false);

        jLabel37.setText("Gastos:");

        jLabel64.setText("Outros.:");

        jLabel65.setText("Tipo.:");

        jLabel66.setText("Custo.:");

        jLabel67.setText("Quantidade.:");

        tfQuantidadeCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeCustoActionPerformed(evt);
            }
        });

        jToggleButton7.setText("Adicionar");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setText("Excluir");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        cbGastos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Combustível", "Lubrificante", "Gelo", "Carregador do pescado", "Manutenção do veículo", "Outro" }));
        cbGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGastosActionPerformed(evt);
            }
        });

        jLabel69.setText("Quais os gastos você tem com cada barco por pescaria?");

        cbEspecieAquisicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ckbEvisceradoAq.setText("Eviscerado");

        ckbSalgadoAq.setText("Salgado");

        ckbPostaAq.setText("Posta");

        ckbSemCabecaAq.setText("Sem Cabeça");

        ckbOutrosAq.setText("Outros");

        ckbFileAq.setText("File");

        jLabel11.setText("Ano (Ex: 1998)");

        ckbPescadorP.setText("Pescador");

        ckbEmpresaP.setText("Empresa");

        ckbOutroAtravessadorP.setText("Outro Atravessador");

        ckbDonoBarcoP.setText("Dono do Barco");

        ckbMercadoFeiraP.setText("Mercado ou Feira");

        ckbCooperativaP.setText("Cooperativa");

        ckbMercadoFeiraG.setText("Mercado ou Feira");

        ckbCooperativaG.setText("Cooperativa");

        ckbPescadorG.setText("Pescador");

        ckbOutroAtravessadorG.setText("Outro Atravessador");

        ckbEmpresaG.setText("Empresa");

        ckbDonoBarcoG.setText("Dono do Barco");

        jLabel12.setText("KG");

        cbEspecieGrude.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ckbGeloPescador.setText("Gelo");

        ckbFrigorificoPescador.setText("Caminhão frigorífico");

        ckbInNaturaPescador.setText("In natura");

        ckbSalPescador.setText("Sal");
        ckbSalPescador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSalPescadorActionPerformed(evt);
            }
        });

        ckbSalGrude.setText("Sal");

        ckbSolGrude.setText("Sol");

        ckbEstufaGrude.setText("Estufa");

        ckbGeloGrude.setText("Gelo");
        ckbGeloGrude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbGeloGrudeActionPerformed(evt);
            }
        });

        ckbNaoSabeFornecedores.setText("Não sabe");
        ckbNaoSabeFornecedores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckbNaoSabeFornecedoresStateChanged(evt);
            }
        });

        jtMercadodeComercializacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "cod", "Mercado", "Pescado", "Grude"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtMercadodeComercializacao);
        jtMercadodeComercializacao.getColumnModel().getColumn(0).setResizable(false);

        btAdiconarJtMercadoCliente.setText("Adicionar");
        btAdiconarJtMercadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdiconarJtMercadoClienteActionPerformed(evt);
            }
        });

        btDeletarJtMercadoCliente.setText("Excluir");
        btDeletarJtMercadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarJtMercadoClienteActionPerformed(evt);
            }
        });

        cbProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carne", "Grude seca", "Grude fresca", "Aba", "Outro" }));
        cbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoActionPerformed(evt);
            }
        });

        tfProduto.setEditable(false);

        jLabel13.setText("Por que?");

        tfOutrosGastos.setEditable(false);

        jLabel73.setText("Valor R$.:");

        jLabel74.setText("Quantos fretes faz por semana?");

        cliente_pescado_consumidor_local.setText("7 Consumidor Local");

        casa.add(rbBarro);
        rbBarro.setText("Barro");

        javax.swing.GroupLayout jpPescadoSubprodutoLayout = new javax.swing.GroupLayout(jpPescadoSubproduto);
        jpPescadoSubproduto.setLayout(jpPescadoSubprodutoLayout);
        jpPescadoSubprodutoLayout.setHorizontalGroup(
            jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNomeCaminhoneiro, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                                .addComponent(rbAlvenaria)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rbBarro))))
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
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTempoAtividadeMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel49)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ckbEmpresaP)
                                                    .addComponent(ckbPescadorP)
                                                    .addComponent(ckbOutroAtravessadorP)
                                                    .addComponent(ckbDonoBarcoP)
                                                    .addComponent(ckbMercadoFeiraP)
                                                    .addComponent(ckbCooperativaP))))
                                        .addGap(30, 30, 30)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ckbEmpresaG)
                                                    .addComponent(ckbPescadorG)
                                                    .addComponent(ckbOutroAtravessadorG)
                                                    .addComponent(ckbDonoBarcoG)
                                                    .addComponent(ckbMercadoFeiraG)
                                                    .addComponent(ckbCooperativaG)))
                                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addComponent(jLabel3))))
                                    .addComponent(ckbSempreMesmoFornecedor1)
                                    .addComponent(jLabel6)
                                    .addComponent(ckbSempreMesmoFornecedor2)
                                    .addComponent(ckbMaisBarato3)
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ckbNaoSabeFornecedores))
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ckbFornecedorAumentouSim))))))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel59))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel60))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbSoPeixeiInteiro))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEspecieAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(ckbEvisceradoAq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbSalgadoAq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbFileAq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbPostaAq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbSemCabecaAq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOutrosAq)))
                .addContainerGap(291, Short.MAX_VALUE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addComponent(tfVolumeGrude, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(56, 56, 56))
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addComponent(cbEspecieGrude, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfTipoGrude, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPrecoGrude, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
                        .addGap(3, 3, 3))
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap(608, Short.MAX_VALUE)
                .addComponent(jToggleButton4)
                .addContainerGap())
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(412, Short.MAX_VALUE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbConsistenciaCarnePeixe)
                    .addComponent(ckbOdorCarnePeixe)
                    .addComponent(ckbCorCarnePeixe)
                    .addComponent(jLabel23))
                .addGap(25, 25, 25)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbSemManchaGrude)
                    .addComponent(ckbTamanhoGrude)
                    .addComponent(ckbOdorGrude)
                    .addComponent(jLabel24))
                .addGap(20, 20, 20)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbSemManchaAba)
                    .addComponent(ckbTamanhoAba)
                    .addComponent(ckbOdorAba)
                    .addComponent(jLabel26))
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckbGeloPescador)
                                            .addComponent(ckbFrigorificoPescador)
                                            .addComponent(ckbInNaturaPescador)
                                            .addComponent(ckbSalPescador))))
                                .addGap(83, 83, 83)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckbSalGrude)
                                            .addComponent(ckbEstufaGrude)
                                            .addComponent(ckbSolGrude)
                                            .addComponent(ckbGeloGrude)))
                                    .addComponent(jLabel30)))
                            .addComponent(jLabel27)
                            .addComponent(jLabel62)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cliente_pescado_empresa_capital)
                                    .addComponent(cliente_pescado_empresa_municipio)
                                    .addComponent(jLabel32)
                                    .addComponent(cliente_pescado_supermercado_municipio)
                                    .addComponent(cliente_pescado_supermercado_capital)
                                    .addComponent(cliente_pescado_mercado_feira)
                                    .addComponent(cliente_pescado_caminhao)
                                    .addComponent(cliente_pescado_consumidor_local)
                                    .addComponent(cliente_pescado_outro_atravessador))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(cliente_grude_empresa_belem)
                                    .addComponent(cliente_grude_atravessador_outro_municipio)
                                    .addComponent(cliente_grude_atravessador_municipio)
                                    .addComponent(cliente_grude_outros))))
                        .addGap(35, 35, 35))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap(594, Short.MAX_VALUE)
                .addComponent(btAdiconarJtMercadoCliente)
                .addContainerGap())
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                            .addComponent(cbEspecie, 0, 346, Short.MAX_VALUE)
                            .addComponent(tfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAddFormas)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPreco)
                                    .addComponent(tfVolume)
                                    .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap(608, Short.MAX_VALUE)
                .addComponent(jToggleButton6)
                .addContainerGap())
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap(608, Short.MAX_VALUE)
                .addComponent(btDeletarJtMercadoCliente)
                .addContainerGap())
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSempreDosMesmosPq))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbSempreDosMesmos)))
                .addContainerGap(409, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1)
                    .addComponent(btAdicionarespeciesemana)
                    .addComponent(jToggleButton3)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfQtdFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton7)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(botao_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_salvar_questionario))
                    .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton8)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel65)
                            .addComponent(jLabel67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfQuantidadeCusto)
                            .addComponent(tfTipoGasto)
                            .addComponent(cbGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel66))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCustoCusto)
                                    .addComponent(tfOutroCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfOutrosGastos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jpPescadoSubprodutoLayout.setVerticalGroup(
            jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbNomeCaminhoneiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel46))
                    .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbAlvenaria)
                        .addComponent(rbMadeira)
                        .addComponent(rbBarro)))
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
                .addGap(6, 6, 6)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tfTempoAtividadeMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbPescadorP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbEmpresaP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOutroAtravessadorP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDonoBarcoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbMercadoFeiraP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbCooperativaP))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbPescadorG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbEmpresaG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOutroAtravessadorG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbDonoBarcoG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbMercadoFeiraG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbCooperativaG))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNumeroFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbNaoSabeFornecedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ckbFornecedorAumentouSim))
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbSempreMesmoFornecedor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbSempreMesmoFornecedor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbMaisBarato3)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ckbSoPeixeiInteiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbEspecieAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbEvisceradoAq)
                    .addComponent(ckbSalgadoAq)
                    .addComponent(ckbFileAq)
                    .addComponent(ckbPostaAq)
                    .addComponent(ckbSemCabecaAq)
                    .addComponent(ckbOutrosAq))
                .addGap(53, 53, 53)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3)
                .addGap(6, 6, 6)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(tfPrecoGrude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEspecieGrude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tfVolumeGrude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(tfTipoGrude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAdicionarespeciesemana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton4))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbCorCarnePeixe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbOdorCarnePeixe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbConsistenciaCarnePeixe))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOdorGrude)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbTamanhoGrude)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbSemManchaGrude))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbOdorAba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbTamanhoAba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbSemManchaAba))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbGeloPescador)
                        .addGap(1, 1, 1)
                        .addComponent(ckbFrigorificoPescador)
                        .addGap(4, 4, 4)
                        .addComponent(ckbInNaturaPescador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbSalPescador))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(5, 5, 5)
                        .addComponent(ckbSalGrude)
                        .addGap(1, 1, 1)
                        .addComponent(ckbEstufaGrude)
                        .addGap(4, 4, 4)
                        .addComponent(ckbSolGrude)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbGeloGrude))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cbMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliente_grude_atravessador_municipio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cliente_grude_atravessador_outro_municipio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cliente_grude_empresa_belem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliente_grude_outros))
                            .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addComponent(btAdiconarJtMercadoCliente))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliente_pescado_empresa_municipio)
                        .addGap(5, 5, 5)
                        .addComponent(cliente_pescado_empresa_capital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliente_pescado_mercado_feira)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliente_pescado_supermercado_capital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliente_pescado_supermercado_municipio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliente_pescado_caminhao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliente_pescado_consumidor_local, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliente_pescado_outro_atravessador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDeletarJtMercadoCliente)
                .addGap(17, 17, 17)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(ckbSempreDosMesmos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfSempreDosMesmosPq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpPescadoSubprodutoLayout.createSequentialGroup()
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(tfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAddFormas)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton6)
                .addGap(9, 9, 9)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(tfLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(tfQtdFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addGap(12, 12, 12)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(cbGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOutrosGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(tfTipoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCustoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPescadoSubprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(tfQuantidadeCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(tfOutroCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton7)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-716)/2, (screenSize.height-788)/2, 716, 788);
    }// </editor-fold>//GEN-END:initComponents

    private void cbNomeCaminhoneiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeCaminhoneiroActionPerformed
       
        //Pesquisa automática do Combo Box Nome do caminhoneiro
        
        if (inicia_combo == 1){
         mostra_dados();
        }inicia_combo = 1;
         
    }//GEN-LAST:event_cbNomeCaminhoneiroActionPerformed

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

    private void tfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClienteActionPerformed

    private void tfQuantidadeCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeCustoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        AddAquisicaoFormasComercilizacao();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        DelAttAquisicaoFormasComercilizacao();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void ckbRecebeBeneficioGovernoSimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbRecebeBeneficioGovernoSimStateChanged
        if (ckbRecebeBeneficioGovernoSim.isSelected()){
            tfQualBeneficio.setEditable(true);
        }else{
            tfQualBeneficio.setEditable(false);
            tfQualBeneficio.setText("");
        }
    }//GEN-LAST:event_ckbRecebeBeneficioGovernoSimStateChanged

    private void btAdicionarespeciesemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarespeciesemanaActionPerformed
        AttComercializacaoGrude();
    }//GEN-LAST:event_btAdicionarespeciesemanaActionPerformed

    private void ckbSalPescadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSalPescadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbSalPescadorActionPerformed

    private void ckbGeloGrudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbGeloGrudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbGeloGrudeActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        DeljtGrude();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void cbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoActionPerformed
        if (cbProduto.getSelectedItem().equals("Outro"))
            tfProduto.setEditable(true);
        else {
            tfProduto.setEditable(false);
            tfProduto.setText("");
        }
    }//GEN-LAST:event_cbProdutoActionPerformed

    private void cbGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGastosActionPerformed
         if (cbGastos.getSelectedItem().equals("Outro"))
            tfOutrosGastos.setEditable(true);
        else {
            tfOutrosGastos.setEditable(false);
            tfOutrosGastos.setText("");
        }
    }//GEN-LAST:event_cbGastosActionPerformed

    private void btAddFormasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddFormasActionPerformed
        AddJtFormas();
    }//GEN-LAST:event_btAddFormasActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        DelJtFormas();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        AddJtGastos();
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
       DelJtGastos();
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void ckbNaoSabeFornecedoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbNaoSabeFornecedoresStateChanged
       if (ckbNaoSabeFornecedores.isSelected()) {
           tfNumeroFornecedores.setEditable(false);
        }else{
            tfNumeroFornecedores.setEditable(true);
            tfNumeroFornecedores.setText("");
       }
    }//GEN-LAST:event_ckbNaoSabeFornecedoresStateChanged

    private void btAdiconarJtMercadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdiconarJtMercadoClienteActionPerformed
        AddjtMercadodeComercializacao();
    }//GEN-LAST:event_btAdiconarJtMercadoClienteActionPerformed

    private void btDeletarJtMercadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarJtMercadoClienteActionPerformed
        DeljtMercadodeComercializacao();
    }//GEN-LAST:event_btDeletarJtMercadoClienteActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caminhoneiro2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup banheiro;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_salvar_questionario;
    private javax.swing.JToggleButton btAddFormas;
    private javax.swing.JButton btAdicionarRendaFamilia;
    private javax.swing.JToggleButton btAdicionarespeciesemana;
    private javax.swing.JToggleButton btAdiconarJtMercadoCliente;
    private javax.swing.JToggleButton btDeletarJtMercadoCliente;
    private javax.swing.JButton btExcluirRendaFamilia;
    private javax.swing.ButtonGroup casa;
    private javax.swing.JComboBox cbEspecie;
    private javax.swing.JComboBox cbEspecieAquisicao;
    private javax.swing.JComboBox cbEspecieGrude;
    private javax.swing.JComboBox cbGastos;
    private javax.swing.JComboBox cbMercado;
    private javax.swing.JComboBox cbNomeCaminhoneiro;
    private javax.swing.JComboBox cbProduto;
    private javax.swing.JCheckBox ckbAguaSim;
    private javax.swing.JCheckBox ckbConsistenciaCarnePeixe;
    private javax.swing.JCheckBox ckbCooperativaG;
    private javax.swing.JCheckBox ckbCooperativaP;
    private javax.swing.JCheckBox ckbCorCarnePeixe;
    private javax.swing.JCheckBox ckbDonoBarcoG;
    private javax.swing.JCheckBox ckbDonoBarcoP;
    private javax.swing.JCheckBox ckbDrenagemSim;
    private javax.swing.JCheckBox ckbEmpresaG;
    private javax.swing.JCheckBox ckbEmpresaP;
    private javax.swing.JCheckBox ckbEstufaGrude;
    private javax.swing.JCheckBox ckbEvisceradoAq;
    private javax.swing.JCheckBox ckbFileAq;
    private javax.swing.JCheckBox ckbFornecedorAumentouSim;
    private javax.swing.JCheckBox ckbFossaSim;
    private javax.swing.JCheckBox ckbFrigorificoPescador;
    private javax.swing.JCheckBox ckbGeloGrude;
    private javax.swing.JCheckBox ckbGeloPescador;
    private javax.swing.JCheckBox ckbInNaturaPescador;
    private javax.swing.JCheckBox ckbLuzSim;
    private javax.swing.JCheckBox ckbMaisBarato3;
    private javax.swing.JCheckBox ckbMercadoFeiraG;
    private javax.swing.JCheckBox ckbMercadoFeiraP;
    private javax.swing.JCheckBox ckbNaoSabeFornecedores;
    private javax.swing.JCheckBox ckbOdorAba;
    private javax.swing.JCheckBox ckbOdorCarnePeixe;
    private javax.swing.JCheckBox ckbOdorGrude;
    private javax.swing.JCheckBox ckbOutroAtravessadorG;
    private javax.swing.JCheckBox ckbOutroAtravessadorP;
    private javax.swing.JCheckBox ckbOutrosAq;
    private javax.swing.JCheckBox ckbPescadorG;
    private javax.swing.JCheckBox ckbPescadorP;
    private javax.swing.JCheckBox ckbPostaAq;
    private javax.swing.JCheckBox ckbRecebeBeneficioGovernoSim;
    private javax.swing.JCheckBox ckbSalGrude;
    private javax.swing.JCheckBox ckbSalPescador;
    private javax.swing.JCheckBox ckbSalgadoAq;
    private javax.swing.JCheckBox ckbSemCabecaAq;
    private javax.swing.JCheckBox ckbSemManchaAba;
    private javax.swing.JCheckBox ckbSemManchaGrude;
    private javax.swing.JCheckBox ckbSempreDosMesmos;
    private javax.swing.JCheckBox ckbSempreMesmoFornecedor1;
    private javax.swing.JCheckBox ckbSempreMesmoFornecedor2;
    private javax.swing.JCheckBox ckbSoPeixeiInteiro;
    private javax.swing.JCheckBox ckbSolGrude;
    private javax.swing.JCheckBox ckbTamanhoAba;
    private javax.swing.JCheckBox ckbTamanhoGrude;
    private javax.swing.JCheckBox ckbTemRegistroEntidade;
    private javax.swing.JCheckBox cliente_grude_atravessador_municipio;
    private javax.swing.JCheckBox cliente_grude_atravessador_outro_municipio;
    private javax.swing.JCheckBox cliente_grude_empresa_belem;
    private javax.swing.JCheckBox cliente_grude_outros;
    private javax.swing.JCheckBox cliente_pescado_caminhao;
    private javax.swing.JCheckBox cliente_pescado_consumidor_local;
    private javax.swing.JCheckBox cliente_pescado_empresa_capital;
    private javax.swing.JCheckBox cliente_pescado_empresa_municipio;
    private javax.swing.JCheckBox cliente_pescado_mercado_feira;
    private javax.swing.JCheckBox cliente_pescado_outro_atravessador;
    private javax.swing.JCheckBox cliente_pescado_supermercado_capital;
    private javax.swing.JCheckBox cliente_pescado_supermercado_municipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTableAtividadeFamiliar;
    private javax.swing.JTable jTableFormaComercializacao;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JPanel jpPescadoSubproduto;
    private javax.swing.JTable jtForma;
    private javax.swing.JTable jtGastos;
    private javax.swing.JTable jtGrude;
    private javax.swing.JTable jtMercadodeComercializacao;
    private javax.swing.JRadioButton rbAlvenaria;
    private javax.swing.JRadioButton rbBanheiroDentro;
    private javax.swing.JRadioButton rbBanheiroFora;
    private javax.swing.JRadioButton rbBarro;
    private javax.swing.JRadioButton rbMadeira;
    private javax.swing.JTextField tfAtividade;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfCustoCusto;
    private javax.swing.JTextField tfDesdeQuando;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextField tfLocal;
    private javax.swing.JTextField tfNumeroFornecedores;
    private javax.swing.JTextField tfOutroCusto;
    private javax.swing.JTextField tfOutrosGastos;
    private javax.swing.JTextField tfParentesco;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfPrecoGrude;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfQtdFrete;
    private javax.swing.JTextField tfQualBeneficio;
    private javax.swing.JTextField tfQualEntidade;
    private javax.swing.JTextField tfQuantidadeCusto;
    private javax.swing.JTextField tfRenda;
    private javax.swing.JTextField tfSempreDosMesmosPq;
    private javax.swing.JTextField tfTempoAtividadeMoradia;
    private javax.swing.JTextField tfTipoGasto;
    private javax.swing.JTextField tfTipoGrude;
    private javax.swing.JTextField tfValor;
    private javax.swing.JTextField tfVolume;
    private javax.swing.JTextField tfVolumeGrude;
    // End of variables declaration//GEN-END:variables


    private void mostra_dados(){
        limpar_dados();

        //tabelas 1:N
        attjtGasto();
        attjtForma();
        attjtGrudeEspecie();
        AttAquisicaoFormasComercilizacao();
        attjTableAtividadeFamiliar();
        AttjtMercadodeComercializacao();

        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
        System.out.println(codigo);
        try {
            //caminhoneiro Moradia
            conexao.execute("SELECT * FROM caminhoneiro_moradia WHERE cod_caminhoneiro = "+codigo);
            conexao.resultSet.first();

            //Moaradia
            String testador;

            testador = conexao.resultSet.getString("casa");
            if (testador.equals("Madeira"))
                   rbMadeira.setSelected(true);

            if (testador.equals("Alvenaria"))
                   rbAlvenaria.setSelected(true);

            if (testador.equals("Barro"))
                   rbBarro.setSelected(true);

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

            //caminhoneiro Recepção
            conexao.execute("SELECT * FROM caminhoneiro_recepcao_produtos WHERE cod_caminhoneiro = "+codigo);
            conexao.resultSet.first();

           if (conexao.resultSet.getString("pescador_fornece_pescado").equals("1"))
                   ckbPescadorP.setSelected(true);

           if (conexao.resultSet.getString("empresa_fornece_pescado").equals("1"))
                   ckbEmpresaP.setSelected(true);

            if (conexao.resultSet.getString("outro_caminhoneiro_fornece_pescado").equals("1"))
                   ckbOutroAtravessadorP.setSelected(true);

            if (conexao.resultSet.getString("dono_do_barco_fornece_pescado").equals("1"))
                   ckbDonoBarcoP.setSelected(true);

            if (conexao.resultSet.getString("mercado_ou_feira_fornece_pescado").equals("1"))
                   ckbMercadoFeiraP.setSelected(true);

            if (conexao.resultSet.getString("cooperativa_fornece_pescado").equals("1"))
                   ckbCooperativaP.setSelected(true);
            //
            if (conexao.resultSet.getString("pescador_fornece_grude").equals("1"))
                   ckbPescadorG.setSelected(true);

            if (conexao.resultSet.getString("empresa_fornece_grude").equals("1"))
                   ckbEmpresaG.setSelected(true);

            if (conexao.resultSet.getString("outro_caminhoneiro_fornece_grude").equals("1"))
                   ckbOutroAtravessadorG.setSelected(true);

            if (conexao.resultSet.getString("dono_do_barco_fornece_grude").equals("1"))
                   ckbDonoBarcoG.setSelected(true);

            if (conexao.resultSet.getString("mercado_ou_feira_fornece_grude").equals("1"))
                   ckbMercadoFeiraG.setSelected(true);

            if (conexao.resultSet.getString("cooperativa_fornece_grude").equals("1"))
                   ckbCooperativaG.setSelected(true);

            //
            String nr = conexao.resultSet.getString("numero_fornecedores");
            if (nr.equals("N/S")){
                    ckbNaoSabeFornecedores.setSelected(true);
            } else {
                        tfNumeroFornecedores.setText(nr);
                    }
            //

            if (conexao.resultSet.getString("numero_aumentou").equals("1"))
                   ckbFornecedorAumentouSim.setSelected(true);

            if (conexao.resultSet.getString("produto_sempre_dos_mesmos").equals("1"))
                   ckbSempreMesmoFornecedor1.setSelected(true);

            if (conexao.resultSet.getString("produto_sempre_dos_mesmos_quem_aparece").equals("1"))
                   ckbSempreMesmoFornecedor2.setSelected(true);

            if (conexao.resultSet.getString("produto_sempre_mais_barato").equals("1"))
                   ckbMaisBarato3.setSelected(true);

            System.out.println("2 Recepção - Passou ");
 
             //Aquisicao
            conexao.execute("SELECT * FROM caminhoneiro_aquisicao WHERE cod_caminhoneiro = "+codigo);
            conexao.resultSet.first();

            if (conexao.resultSet.getString("peixe_inteiro").equals("1"))
                   ckbSoPeixeiInteiro.setSelected(true);

            if (conexao.resultSet.getString("cor_carne_peixe").equals("1"))
                   ckbCorCarnePeixe.setSelected(true);

            if (conexao.resultSet.getString("odor_carne_peixe").equals("1"))
                   ckbOdorCarnePeixe.setSelected(true);

            if (conexao.resultSet.getString("consitencia_carne_peixe").equals("1"))
                   ckbConsistenciaCarnePeixe.setSelected(true);

            if (conexao.resultSet.getString("odor_grude").equals("1"))
                   ckbOdorGrude.setSelected(true);

            if (conexao.resultSet.getString("tamanho_grude").equals("1"))
                   ckbTamanhoGrude.setSelected(true);

            if (conexao.resultSet.getString("sem_mancha_grude").equals("1"))
                   ckbSemManchaGrude.setSelected(true);

            if (conexao.resultSet.getString("odor_aba").equals("1"))
                   ckbOdorAba.setSelected(true);

            if (conexao.resultSet.getString("tamanho_aba").equals("1"))
                   ckbTamanhoAba.setSelected(true);

            if (conexao.resultSet.getString("sem_mancha_aba").equals("1"))
                   ckbSemManchaAba.setSelected(true);
             
            System.out.println("3 Aquisição - Passou");
              

            //Armazenamento
            conexao.execute("SELECT * FROM caminhoneiro_armazenamento WHERE cod_caminhoneiro = "+codigo);
            conexao.resultSet.first();

            if (conexao.resultSet.getString("pescado_gelo").equals("1"))
                   ckbGeloPescador.setSelected(true);

            if (conexao.resultSet.getString("pescado_frigorifico").equals("1"))
                   ckbFrigorificoPescador.setSelected(true);

            if (conexao.resultSet.getString("pescado_innatura").equals("1"))
                   ckbInNaturaPescador.setSelected(true);

            if (conexao.resultSet.getString("pescado_sal").equals("1"))
                   ckbSalPescador.setSelected(true);

            if (conexao.resultSet.getString("grude_sal").equals("1"))
                   ckbSalGrude.setSelected(true);

            if (conexao.resultSet.getString("grude_estufa").equals("1"))
                   ckbEstufaGrude.setSelected(true);

            if (conexao.resultSet.getString("grude_sol").equals("1"))
                   ckbSolGrude.setSelected(true);

            if (conexao.resultSet.getString("grude_gelo").equals("1"))
                   ckbGeloGrude.setSelected(true);
             
            System.out.println("4 Armazenamento - Passou");
            
            //Comercialização
            conexao.execute("SELECT * FROM caminhoneiro_comercializacao WHERE cod_caminhoneiro = "+codigo);
            conexao.resultSet.first();

            if (conexao.resultSet.getString("sempre_mesmo_comprador").equals("1"))
                   ckbSempreDosMesmos.setSelected(true);

            tfSempreDosMesmosPq.setText(conexao.resultSet.getString("pq_sempre_o_mesmo"));

            tfLocal.setText(conexao.resultSet.getString("local_frete"));
            tfValor.setText(conexao.resultSet.getString("valor_frete"));
            tfQtdFrete.setText(conexao.resultSet.getString("quantidade_frete_semana"));

            System.out.println("5 Comércio - Passou");
             

        } catch (Exception e) {
            System.out.println(e + " metodo mostrar dados");
        }
    }

        public void limpar_dados(){
            rbMadeira.setSelected(false);
            rbAlvenaria.setSelected(false);
            rbBarro.setSelected(false);
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
            ckbPescadorP.setSelected(false);
            ckbEmpresaP.setSelected(false);
            ckbOutroAtravessadorP.setSelected(false);
            ckbDonoBarcoP.setSelected(false);
            ckbMercadoFeiraP.setSelected(false);
            ckbCooperativaP.setSelected(false);
            ckbPescadorG.setSelected(false);
            ckbEmpresaG.setSelected(false);
            ckbOutroAtravessadorG.setSelected(false);
            ckbDonoBarcoG.setSelected(false);
            ckbMercadoFeiraG.setSelected(false);
            ckbCooperativaG.setSelected(false);
            ckbNaoSabeFornecedores.setSelected(false);
            tfNumeroFornecedores.setText("");
            ckbFornecedorAumentouSim.setSelected(false);
            ckbSempreMesmoFornecedor1.setSelected(false);
            ckbSempreMesmoFornecedor2.setSelected(false);
            ckbMaisBarato3.setSelected(false);
            ckbSoPeixeiInteiro.setSelected(false);
            ckbCorCarnePeixe.setSelected(false);
            ckbOdorCarnePeixe.setSelected(false);
            ckbConsistenciaCarnePeixe.setSelected(false);
            ckbOdorGrude.setSelected(false);
            ckbTamanhoGrude.setSelected(false);
            ckbSemManchaGrude.setSelected(false);
            ckbOdorAba.setSelected(false);
            ckbTamanhoAba.setSelected(false);
            ckbSemManchaAba.setSelected(false);
            ckbGeloPescador.setSelected(false);
            ckbFrigorificoPescador.setSelected(false);
            ckbInNaturaPescador.setSelected(false);
            ckbSalPescador.setSelected(false);
            ckbSalGrude.setSelected(false);
            ckbEstufaGrude.setSelected(false);
            ckbSolGrude.setSelected(false);
            ckbGeloGrude.setSelected(false);
            ckbSempreDosMesmos.setSelected(false);
            tfSempreDosMesmosPq.setText("");
            tfLocal.setText("");
            tfValor.setText("");
            tfQtdFrete.setText("");

    }


    private void excluirRT() {
         //System.out.println(jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0));
        String sql;

        sql = "delete from caminhoneiro_moradia_familia_renda "
            + "Where cod_caminhoneiro_moradia_familia_renda = "
            + jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjTableAtividadeFamiliar();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void addBtRt() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
        System.out.println(codigo);

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into caminhoneiro_moradia_familia_renda "
                    + "(cod_caminhoneiro,parentesco,atividade,renda) values ("+
                    codigo+",'"+
                    tfParentesco.getText()+"','"+
                    tfAtividade.getText()+"','"+
                    tfRenda.getText()+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Jtable RT - Cadastrado com sucesso");
                attjTableAtividadeFamiliar();
            }
    }

    private void attCbCaminhoneiro() {
         try {
                    cbNomeCaminhoneiro.removeAllItems();
                    conexao.execute("select * from caminhoneiro");

                    while (conexao.resultSet.next()){
                        cbNomeCaminhoneiro.addItem(conexao.resultSet.getString("cod_caminhoneiro")+
                                                       " # "+ conexao.resultSet.getString("nome"));
                        
                    }
                }catch (SQLException ex) {
                    System.out.println(ex);
                }
    }

    private void attjTableAtividadeFamiliar() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());

        conexao.execute("select * from caminhoneiro_moradia_familia_renda"
                        + " where cod_caminhoneiro = " + codigo);

        jTableAtividadeFamiliar.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableAtividadeFamiliar.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableAtividadeFamiliar.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTableAtividadeFamiliar.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTableAtividadeFamiliar.getColumnModel().getColumn(3).setPreferredWidth(10);

        DefaultTableModel modelo = (DefaultTableModel)jTableAtividadeFamiliar.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_caminhoneiro_moradia_familia_renda"),
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
    String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
    System.out.println(codigo);

        //Moradia
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

            sqlinsert = "insert into caminhoneiro_moradia "
                    + "(cod_caminhoneiro,casa,luz,banheiro,agua_encanada,"
                    + "drenagem_pluvial,fossa,tem_registro,qual_entidade,"
                    + "tempo_registro,recebe_beneficio,beneficio,"
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
                    tfTempoAtividadeMoradia.getText()+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("1 Moradia - Cadastrado com sucesso");
            }

       //Recepção caminhoneiro
            sqlinsert = "insert into caminhoneiro_recepcao_produtos "
                    + "(cod_caminhoneiro,pescador_fornece_pescado,"
                    + "empresa_fornece_pescado,outro_caminhoneiro_fornece_pescado,"
                    + "dono_do_barco_fornece_pescado,mercado_ou_feira_fornece_pescado,"
                    + "cooperativa_fornece_pescado,pescador_fornece_grude,"
                    + "empresa_fornece_grude,outro_caminhoneiro_fornece_grude,"
                    + "dono_do_barco_fornece_grude,mercado_ou_feira_fornece_grude,"
                    + "cooperativa_fornece_grude,numero_fornecedores,numero_aumentou,"
                    + "produto_sempre_dos_mesmos,produto_sempre_dos_mesmos_quem_aparece,"
                    + "produto_sempre_mais_barato) values ("+
                    codigo+",'"+
                    util.checarCkb(ckbPescadorP)+"','"+
                    util.checarCkb(ckbEmpresaP)+"','"+
                    util.checarCkb(ckbOutroAtravessadorP)+"','"+
                    util.checarCkb(ckbDonoBarcoP)+"','"+
                    util.checarCkb(ckbMercadoFeiraP)+"','"+
                    util.checarCkb(ckbCooperativaP)+"','"+
                    util.checarCkb(ckbPescadorG)+"','"+
                    util.checarCkb(ckbEmpresaG)+"','"+
                    util.checarCkb(ckbOutroAtravessadorG)+"','"+
                    util.checarCkb(ckbDonoBarcoG)+"','"+
                    util.checarCkb(ckbMercadoFeiraG)+"','"+
                    util.checarCkb(ckbCooperativaG)+"','"+
                    getNumeroFornecedores()+"','"+
                    util.checarCkb(ckbFornecedorAumentouSim)+"','"+
                    util.checarCkb(ckbSempreMesmoFornecedor1)+"','"+
                    util.checarCkb(ckbSempreMesmoFornecedor2)+"','"+
                    util.checarCkb(ckbMaisBarato3)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("2 Recepção - Cadastrado com sucesso");
            }

            //Aquisicao
            sqlinsert = "insert into caminhoneiro_aquisicao "
                    + "(cod_caminhoneiro,peixe_inteiro,cor_carne_peixe,"
                    + "odor_carne_peixe,consitencia_carne_peixe,odor_grude,"
                    + "tamanho_grude,sem_mancha_grude,odor_aba,"
                    + "tamanho_aba,sem_mancha_aba) values ("+
                    codigo+",'"+
                    util.checarCkb(ckbSoPeixeiInteiro)+"','"+
                    util.checarCkb(ckbCorCarnePeixe)+"','"+
                    util.checarCkb(ckbOdorCarnePeixe)+"','"+
                    util.checarCkb(ckbConsistenciaCarnePeixe)+"','"+
                    util.checarCkb(ckbOdorGrude)+"','"+
                    util.checarCkb(ckbTamanhoGrude)+"','"+
                    util.checarCkb(ckbSemManchaGrude)+"','"+
                    util.checarCkb(ckbOdorAba)+"','"+
                    util.checarCkb(ckbTamanhoAba)+"','"+
                    util.checarCkb(ckbSemManchaAba)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("3 Aquisicao - Cadastrado com sucesso");
            }

            //Armazenamento
            sqlinsert = "insert into caminhoneiro_armazenamento "
                    + "(cod_caminhoneiro,pescado_gelo,pescado_frigorifico,"
                    + "pescado_innatura,pescado_sal,grude_sal,"
                    + "grude_estufa,grude_sol,grude_gelo) values ("+
                    codigo+",'"+
                    util.checarCkb(ckbGeloPescador)+"','"+
                    util.checarCkb(ckbFrigorificoPescador)+"','"+
                    util.checarCkb(ckbInNaturaPescador)+"','"+
                    util.checarCkb(ckbSalPescador)+"','"+
                    util.checarCkb(ckbSalGrude)+"','"+
                    util.checarCkb(ckbEstufaGrude)+"','"+
                    util.checarCkb(ckbSolGrude)+"','"+
                    util.checarCkb(ckbGeloGrude)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("4 Armazenamento - Cadastrado com sucesso");
            }

            //Comercialização
            sqlinsert = "insert into caminhoneiro_comercializacao "
                    + "(cod_caminhoneiro,sempre_mesmo_comprador,"
                    + "pq_sempre_o_mesmo,local_frete,valor_frete,"
                    + "quantidade_frete_semana) values ("+
                    codigo+",'"+
                    util.checarCkb(ckbSempreDosMesmos)+"','"+
                    tfSempreDosMesmosPq.getText()+"','"+
                    tfLocal.getText()+"','"+
                    tfValor.getText()+"','"+
                    tfQtdFrete.getText()+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                JOptionPane.showMessageDialog(null,"Salvo sucesso" );
                System.out.println("5 Comercialização - Cadastrado com sucesso");
                mostra_dados();
            }


    }

    private void atualizar_dados() {
    String sqlupdate = new String();
    String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
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

            //Pegando ites do CB/>

            sqlupdate ="UPDATE caminhoneiro_moradia SET "
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
                    +"tempo_atividade ='"+tfTempoAtividadeMoradia.getText()+"' "+

                    
                    "where cod_caminhoneiro = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                System.out.println("Moradia - Atualizado com sucesso");
                //Atualiza Resultset
            }

            //Recepção Produtos
            sqlupdate ="UPDATE caminhoneiro_recepcao_produtos SET "
                    +"pescador_fornece_pescado = '"+util.checarCkb(ckbPescadorP)+"',"
                    +"empresa_fornece_pescado = '"+util.checarCkb(ckbEmpresaP)+"',"
                    +"outro_caminhoneiro_fornece_pescado = '"+util.checarCkb(ckbOutroAtravessadorP)+"',"
                    +"dono_do_barco_fornece_pescado = '"+util.checarCkb(ckbDonoBarcoP)+"',"
                    +"mercado_ou_feira_fornece_pescado = '"+util.checarCkb(ckbMercadoFeiraP)+"',"
                    +"cooperativa_fornece_pescado = '"+ util.checarCkb(ckbCooperativaP)+"',"

                    +"pescador_fornece_grude = '"+util.checarCkb(ckbPescadorG)+"',"
                    +"empresa_fornece_grude = '"+util.checarCkb(ckbEmpresaG)+"',"
                    +"outro_caminhoneiro_fornece_grude = '"+util.checarCkb(ckbOutroAtravessadorG)+"',"
                    +"dono_do_barco_fornece_grude = '"+util.checarCkb(ckbDonoBarcoG)+"',"
                    +"mercado_ou_feira_fornece_grude = '"+util.checarCkb(ckbMercadoFeiraG)+"',"
                    +"cooperativa_fornece_grude = '"+util.checarCkb(ckbCooperativaG)+"',"

                    +"numero_fornecedores = '"+getNumeroFornecedores()+"',"
                    +"numero_aumentou = '"+util.checarCkb(ckbFornecedorAumentouSim)+"',"
                    +"produto_sempre_dos_mesmos = '"+util.checarCkb(ckbSempreMesmoFornecedor1)+"',"
                    +"produto_sempre_dos_mesmos_quem_aparece = '"+util.checarCkb(ckbSempreMesmoFornecedor2)+"',"
                    +"produto_sempre_mais_barato = '"+util.checarCkb(ckbMaisBarato3)+"' "+

                    "where cod_caminhoneiro = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                System.out.println("Recepção - Atualizado com sucesso");
                //Atualiza Resultset
            }

             //Aquisicao
            sqlupdate ="UPDATE caminhoneiro_aquisicao SET "
                    +"peixe_inteiro = '"+util.checarCkb(ckbSoPeixeiInteiro)+"',"
                    +"cor_carne_peixe = '"+util.checarCkb(ckbCorCarnePeixe)+"',"
                    +"odor_carne_peixe = '"+util.checarCkb(ckbOdorCarnePeixe)+"',"
                    +"consitencia_carne_peixe = '"+util.checarCkb(ckbConsistenciaCarnePeixe)+"',"
                    +"odor_grude = '"+util.checarCkb(ckbOdorGrude)+"',"
                    +"tamanho_grude = '"+ util.checarCkb(ckbTamanhoGrude)+"',"
                    +"sem_mancha_grude = '"+ util.checarCkb(ckbSemManchaGrude)+"',"
                    +"odor_aba = '"+ util.checarCkb(ckbOdorAba)+"',"
                    +"tamanho_aba = '"+ util.checarCkb(ckbTamanhoAba)+"',"
                    +"sem_mancha_aba = '"+ util.checarCkb(ckbSemManchaAba)+"' "+

                    "where cod_caminhoneiro = "+codigo;


            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                System.out.println("Aquisição - Atualizado com sucesso");
                //Atualiza Resultset
            }

            //Armazenamento

            sqlupdate ="UPDATE caminhoneiro_armazenamento SET "
                    +"pescado_gelo = '"+util.checarCkb(ckbGeloPescador)+"',"
                    +"pescado_frigorifico = '"+util.checarCkb(ckbFrigorificoPescador)+"',"
                    +"pescado_innatura = '"+util.checarCkb(ckbInNaturaPescador)+"',"
                    +"pescado_sal = '"+util.checarCkb(ckbSalPescador)+"',"
                    +"grude_sal = '"+util.checarCkb(ckbSalGrude)+"',"
                    +"grude_estufa = '"+util.checarCkb(ckbEstufaGrude)+"',"
                    +"grude_sol = '"+ util.checarCkb(ckbSolGrude)+"',"
                    +"grude_gelo = '"+util.checarCkb(ckbGeloGrude)+"' "+

                    "where cod_caminhoneiro = "+codigo;
            
            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                System.out.println("Armazenamento - Atualizado com sucesso");
                //Atualiza Resultset
            }

            //Comercialização
             sqlupdate ="UPDATE caminhoneiro_comercializacao SET "
                    +"sempre_mesmo_comprador = '"+util.checarCkb(ckbSempreDosMesmos)+"',"
                    +"pq_sempre_o_mesmo = '"+tfSempreDosMesmosPq.getText()+"',"
                    +"local_frete = '"+tfLocal.getText()+"',"
                    +"valor_frete = '"+tfValor.getText()+"',"
                    +"quantidade_frete_semana = '"+tfQtdFrete.getText()+"' "+


                    "where cod_caminhoneiro = "+codigo;


            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                JOptionPane.showMessageDialog(null,"Atualizado com sucesso" );
                System.out.println("Comércio - Atualizado com sucesso");
                //Atualiza Resultset
                mostra_dados();
            }
    }

    private void AddAquisicaoFormasComercilizacao() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
        System.out.println(codigo);

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into caminhoneiro_aquisicao_forma_comercializacao "
                    + "(cod_caminhoneiro,especie,eviscerado,salgado,file,"
                    + "postas,sem_cabeca,outros) values ("+
                    codigo+",'"+
                    cbEspecieAquisicao.getSelectedItem()+"','"+
                    util.checarCkb(ckbEvisceradoAq)+"','"+
                    util.checarCkb(ckbSalgadoAq)+"','"+
                    util.checarCkb(ckbFileAq)+"','"+
                    util.checarCkb(ckbPostaAq)+"','"+
                    util.checarCkb(ckbSemCabecaAq)+"','"+
                    util.checarCkb(ckbOutrosAq)+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Jtable RT - Cadastrado com sucesso");
                AttAquisicaoFormasComercilizacao();
            }
    }

    private void AttAquisicaoFormasComercilizacao() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());

        conexao.execute("select * from caminhoneiro_aquisicao_forma_comercializacao"
                        + " where cod_caminhoneiro = " + codigo);

        jTableFormaComercializacao.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableFormaComercializacao.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableFormaComercializacao.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTableFormaComercializacao.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTableFormaComercializacao.getColumnModel().getColumn(3).setPreferredWidth(10);
        jTableFormaComercializacao.getColumnModel().getColumn(4).setPreferredWidth(10);
        jTableFormaComercializacao.getColumnModel().getColumn(5).setPreferredWidth(10);
        jTableFormaComercializacao.getColumnModel().getColumn(6).setPreferredWidth(10);
        jTableFormaComercializacao.getColumnModel().getColumn(7).setPreferredWidth(10);

        DefaultTableModel modelo = (DefaultTableModel)jTableFormaComercializacao.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_caminhoneiro_aquisicao_forma_comercializacao"),
                                           conexao.resultSet.getString("especie"),
                                           conexao.resultSet.getString("eviscerado"),
                                           conexao.resultSet.getString("salgado"),
                                           conexao.resultSet.getString("file"),
                                           conexao.resultSet.getString("postas"),
                                           conexao.resultSet.getString("sem_cabeca"),
                                           conexao.resultSet.getString("outros"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " jTableFormaComercializacao");
            //attjTableComposicaoPescaria();
        }
    }

    private void DelAttAquisicaoFormasComercilizacao() {
        //System.out.println(jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0));
        String sql;

        sql = "delete from caminhoneiro_aquisicao_forma_comercializacao "
            + "Where cod_caminhoneiro_aquisicao_forma_comercializacao = "
            + jTableFormaComercializacao.getValueAt(jTableFormaComercializacao.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                AttAquisicaoFormasComercilizacao();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void AttComercializacaoGrude() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
        System.out.println(codigo);

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into caminhoneiro_aquisicao_grude_especie "
                    + "(cod_caminhoneiro,especie,volume,preco,tipo) values ("+
                    codigo+",'"+
                    cbEspecieGrude.getSelectedItem()+"','"+
                    tfVolumeGrude.getText()+"','"+
                    tfPrecoGrude.getText()+"','"+
                    tfTipoGrude.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Jtable RT - Cadastrado com sucesso");
                attjtGrudeEspecie();
            }
    }

    private void attCbs() {
        String item = new String();
                try {
                    cbEspecieAquisicao.removeAllItems();
                    cbEspecieGrude.removeAllItems();
                    cbEspecie.removeAllItems();
                    conexao.execute("select * from especie");

                    while (conexao.resultSet.next()){
                        item = conexao.resultSet.getString("especie");
                        cbEspecieAquisicao.addItem(item);
                        cbEspecieGrude.addItem(item);
                        cbEspecie.addItem(item);

                    }
                }catch (SQLException ex) {
                    System.out.println(ex);
                }
    }

    private void attjtGrudeEspecie() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());

        conexao.execute("select * from caminhoneiro_aquisicao_grude_especie"
                        + " where cod_caminhoneiro = " + codigo);

        jtGrude.getColumnModel().getColumn(0).setMaxWidth(0);
        jtGrude.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtGrude.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtGrude.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtGrude.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtGrude.getColumnModel().getColumn(4).setPreferredWidth(10);
 


        DefaultTableModel modelo = (DefaultTableModel)jtGrude.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_caminhoneiro_aquisicao_grude_especie"),
                                           conexao.resultSet.getString("especie"),
                                           conexao.resultSet.getString("volume"),
                                           conexao.resultSet.getString("preco"),
                                           conexao.resultSet.getString("tipo"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela GRUDE");
            //attjTableComposicaoPescaria();
        }
    }

    private void DeljtGrude() {
        //System.out.println(jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0));
        String sql;

        sql = "delete from caminhoneiro_aquisicao_grude_especie "
            + "Where cod_caminhoneiro_aquisicao_grude_especie = "
            + jtGrude.getValueAt(jtGrude.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtGrudeEspecie();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void AddJtFormas() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
        System.out.println(codigo);

        String produtot = new String();
            produtot = cbProduto.getSelectedItem().toString();
            if (produtot.equals("Outro"))
                produtot = tfProduto.getText();

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into caminhoneiro_comercializacao_formas "
                    + "(cod_caminhoneiro,especie,produto,cliente,destino,"
                    + "volume,preco) values ("+
                    codigo+",'"+
                    cbEspecie.getSelectedItem()+"','"+
                    produtot+"','"+
                    tfCliente.getText()+"','"+
                    tfDestino.getText()+"','"+
                    tfVolume.getText()+"','"+
                    tfPreco.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Jtable - Cadastrado com sucesso");
                attjtForma();
            }
    }

    private void attjtForma() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());

        conexao.execute("select * from caminhoneiro_comercializacao_formas"
                        + " where cod_caminhoneiro = " + codigo);

        jtForma.getColumnModel().getColumn(0).setMaxWidth(0);
        jtForma.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtForma.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtForma.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtForma.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtForma.getColumnModel().getColumn(4).setPreferredWidth(10);
        jtForma.getColumnModel().getColumn(5).setPreferredWidth(10);
        jtForma.getColumnModel().getColumn(6).setPreferredWidth(10);



        DefaultTableModel modelo = (DefaultTableModel)jtForma.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_caminhoneiro_comercializacao_formas"),
                                           conexao.resultSet.getString("especie"),
                                           conexao.resultSet.getString("produto"),
                                           conexao.resultSet.getString("cliente"),
                                           conexao.resultSet.getString("destino"),
                                           conexao.resultSet.getString("volume"),
                                           conexao.resultSet.getString("preco"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela Forma");
            //attjTableComposicaoPescaria();
        }
    }

    private void DelJtFormas() {
        //System.out.println(jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0));
        String sql;

        sql = "delete from caminhoneiro_comercializacao_formas "
            + "Where cod_caminhoneiro_comercializacao_formas = "
            + jtForma.getValueAt(jtForma.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtForma();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private void AddJtGastos() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
        System.out.println(codigo);

        String gastot = new String();
            gastot = cbGastos.getSelectedItem().toString();
            if (gastot.equals("Outro"))
                gastot = tfOutrosGastos.getText();

          //Relações de Trabalho - Tabela Renda Familia
          String sqlinsert = "insert into caminhoneiro_comercializacao_gastos "
                    + "(cod_caminhoneiro,gasto,tipo,quantidade,"
                    + "custo,outros) values ("+
                    codigo+",'"+
                    gastot+"','"+
                    tfTipoGasto.getText()+"','"+
                    tfQuantidadeCusto.getText()+"','"+
                    tfCustoCusto.getText()+"','"+
                    tfOutroCusto.getText()+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Jtable - Cadastrado com sucesso");
                attjtGasto();
            }
    }

    private void attjtGasto() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());

        conexao.execute("select * from caminhoneiro_comercializacao_gastos"
                        + " where cod_caminhoneiro = " + codigo);

        jtGastos.getColumnModel().getColumn(0).setMaxWidth(0);
        jtGastos.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtGastos.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtGastos.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtGastos.getColumnModel().getColumn(3).setPreferredWidth(10);
        jtGastos.getColumnModel().getColumn(4).setPreferredWidth(10);
        jtGastos.getColumnModel().getColumn(5).setPreferredWidth(10);




        DefaultTableModel modelo = (DefaultTableModel)jtGastos.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_caminhoneiro_comercializacao_gastos"),
                                           conexao.resultSet.getString("gasto"),
                                           conexao.resultSet.getString("tipo"),
                                           conexao.resultSet.getString("quantidade"),
                                           conexao.resultSet.getString("custo"),
                                           conexao.resultSet.getString("outros"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela gastos");
            //attjTableComposicaoPescaria();
        }
    }

    private void DelJtGastos() {
        //System.out.println(jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0));
        String sql;

        sql = "delete from caminhoneiro_comercializacao_gastos "
            + "Where cod_caminhoneiro_comercializacao_gastos = "
            + jtGastos.getValueAt(jtGastos.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjtGasto();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }

    private String getNumeroFornecedores() {
        if (ckbNaoSabeFornecedores.isSelected()) {
           return "N/S";
        }else{
           return tfNumeroFornecedores.getText();
       }
    }

    private void AddjtMercadodeComercializacao() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
        System.out.println(codigo);

        //
        String sqlinsert = "insert into caminhoneiro_comercializacao_mercado_cliente "
                    + "(cod_caminhoneiro,mercado,cliente_pescado_empresa_municipio,"
                    + "cliente_pescado_empresa_capital,cliente_pescado_mercado_feira,"
                    + "cliente_pescado_supermercado_capital,cliente_pescado_supermercado_municipio,"
                    + "cliente_pescado_caminhao,cliente_pescado_outro_caminhoneiro,"
                    + "cliente_grude_caminhoneiro_municipio,cliente_grude_caminhoneiro_outro_municipio,"
                    + "cliente_grude_empresa_belem,cliente_grude_outros,cliente_pescado_consumidor_local) values ("+
                    codigo+",'"+
                    cbMercado.getSelectedItem()+"','"+
                    util.checarCkb(cliente_pescado_empresa_municipio)+"','"+
                    util.checarCkb(cliente_pescado_empresa_capital)+"','"+
                    util.checarCkb(cliente_pescado_mercado_feira)+"','"+
                    util.checarCkb(cliente_pescado_supermercado_capital)+"','"+
                    util.checarCkb(cliente_pescado_supermercado_municipio)+"','"+
                    util.checarCkb(cliente_pescado_caminhao)+"','"+
                    util.checarCkb(cliente_pescado_outro_atravessador)+"','"+
                    util.checarCkb(cliente_grude_atravessador_municipio)+"','"+
                    util.checarCkb(cliente_grude_atravessador_outro_municipio)+"','"+
                    util.checarCkb(cliente_grude_empresa_belem)+"','"+
                    util.checarCkb(cliente_grude_outros)+"','"+
                    util.checarCkb(cliente_pescado_consumidor_local)+"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("AddjtMercadodeComercializacao() - Cadastrado com sucesso");
                AttjtMercadodeComercializacao();
            }
    }

    private void AttjtMercadodeComercializacao() {
        String codigo = util.separa(1,cbNomeCaminhoneiro.getSelectedItem().toString());
        String pescado,grude = new String();

        conexao.execute("select * from caminhoneiro_comercializacao_mercado_cliente"
                        + " where cod_caminhoneiro = " + codigo);

        jtMercadodeComercializacao.getColumnModel().getColumn(0).setMaxWidth(0);
        jtMercadodeComercializacao.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtMercadodeComercializacao.getColumnModel().getColumn(1).setPreferredWidth(10);
        jtMercadodeComercializacao.getColumnModel().getColumn(2).setPreferredWidth(10);
        jtMercadodeComercializacao.getColumnModel().getColumn(3).setPreferredWidth(10);
       

        DefaultTableModel modelo = (DefaultTableModel)jtMercadodeComercializacao.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next()){
            pescado = "";

            if (conexao.resultSet.getString("cliente_pescado_empresa_municipio").equals("1"))
                pescado = pescado + "1,";

            if (conexao.resultSet.getString("cliente_pescado_empresa_capital").equals("1"))
                pescado = pescado + "2,";

            if (conexao.resultSet.getString("cliente_pescado_mercado_feira").equals("1"))
                pescado = pescado + "3,";

            if (conexao.resultSet.getString("cliente_pescado_supermercado_capital").equals("1"))
                pescado = pescado + "4,";

            if (conexao.resultSet.getString("cliente_pescado_supermercado_municipio").equals("1"))
                pescado = pescado + "5,";

            if (conexao.resultSet.getString("cliente_pescado_caminhao").equals("1"))
                pescado = pescado + "6,";

            if (conexao.resultSet.getString("cliente_pescado_consumidor_local").equals("1"))
                pescado = pescado + "7,";

            if (conexao.resultSet.getString("cliente_pescado_outro_caminhoneiro").equals("1"))
                pescado = pescado + "8,";

            grude = "";

            if (conexao.resultSet.getString("cliente_grude_caminhoneiro_municipio").equals("1"))
                grude = grude + "1,";

            if (conexao.resultSet.getString("cliente_grude_caminhoneiro_outro_municipio").equals("1"))
                grude = grude + "2,";

            if (conexao.resultSet.getString("cliente_grude_empresa_belem").equals("1"))
                grude = grude + "3,";

            if (conexao.resultSet.getString("cliente_grude_outros").equals("1"))
                grude = grude + "4,";


            modelo.addRow(new Object[]{conexao.resultSet.getString("cod_caminhoneiro_comercializacao_mercado_cliente"),
                                           conexao.resultSet.getString("mercado"),
                                           pescado,
                                           grude,
                                       });
            }
            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " tabela gastos");
        }
    }

    private void DeljtMercadodeComercializacao() {
        //System.out.println(jTableAtividadeFamiliar.getValueAt(jTableAtividadeFamiliar.getSelectedRow(),0));
        String sql;

        sql = "delete from caminhoneiro_comercializacao_mercado_cliente "
            + "Where cod_caminhoneiro_comercializacao_mercado_cliente = "
            + jtMercadodeComercializacao.getValueAt(jtMercadodeComercializacao.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                AttjtMercadodeComercializacao();
            }   else
                    JOptionPane.showMessageDialog(null,"Erro na exclusão");
    }





}
