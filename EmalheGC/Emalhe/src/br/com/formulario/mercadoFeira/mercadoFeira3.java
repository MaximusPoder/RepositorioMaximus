package br.com.formulario.mercadoFeira;

import br.com.conexao.Conexao;
import br.com.util.Utilidade;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Jhonathas
 */
public class mercadoFeira3 extends javax.swing.JFrame {

    private Utilidade util = new Utilidade();
    private int inicia_combo = 0;
    private Conexao conexao;

    public mercadoFeira3() {
        initComponents(); //Inicializa os componentes da tela
        conexao = new Conexao();
        conexao.conecta("emalhe");

        //Insere nome do pescador no cbPescador
        attCbAtravessador();
        mostra_dados();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_questao_1 = new javax.swing.ButtonGroup();
        grupo_questao_2 = new javax.swing.ButtonGroup();
        grupo_questao_3 = new javax.swing.ButtonGroup();
        grupo_questao_4 = new javax.swing.ButtonGroup();
        grupo_questao_5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        cbAtravessador = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taQuestao5 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        ckb2emprestimo = new javax.swing.JCheckBox();
        ckb2trocaPescadoGrude = new javax.swing.JCheckBox();
        ckb2DivisaoDespesas = new javax.swing.JCheckBox();
        ckb2Outros = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        ckb3Outros = new javax.swing.JCheckBox();
        ckb3PorClientes = new javax.swing.JCheckBox();
        ckb3PontoVenda = new javax.swing.JCheckBox();
        ckb3PorProdutos = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        taQuestao4 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        ckb6DeCrescimento = new javax.swing.JCheckBox();
        ckb6Estabilizacao = new javax.swing.JCheckBox();
        ckb6DeDiminuicao = new javax.swing.JCheckBox();
        btSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btAtualizar = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        taQuestao1 = new javax.swing.JTextArea();
        ckb2Sim = new javax.swing.JCheckBox();
        ckb3Sim = new javax.swing.JCheckBox();
        ckb5Sim = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Questionário Atravessador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar_janela(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        cbAtravessador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAtravessadorItemStateChanged(evt);
            }
        });
        cbAtravessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtravessadorActionPerformed(evt);
            }
        });

        jLabel24.setText("Mercado / Feira.:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel42.setText("Perspectiva Mercado / Feira");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel42)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel43.setText("Percepção e Perspectivas:");

        taQuestao5.setColumns(20);
        taQuestao5.setRows(5);
        jScrollPane5.setViewportView(taQuestao5);

        jLabel27.setText("2 - Existe alguma interação entre os atravessadores em relação à troca, cooperação dos produtos?");

        ckb2emprestimo.setText("Emprestimo de R$");

        ckb2trocaPescadoGrude.setText("Troca de pescado ou grude");
        ckb2trocaPescadoGrude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb2trocaPescadoGrudeActionPerformed(evt);
            }
        });

        ckb2DivisaoDespesas.setText("Divisão de despesas");

        ckb2Outros.setText("Outros");

        jLabel28.setText("3 - Existe alguma competitividade/rivalidade entre os atravessadores?");

        ckb3Outros.setText("Outros");

        ckb3PorClientes.setText("Por clientes");

        ckb3PontoVenda.setText("Por ponto de venda");

        ckb3PorProdutos.setText("Por produtos");

        jLabel29.setText("5 - Pretende continuar na atividade?");

        jLabel30.setText("4 - Existem conflitos com instituições (IBAMA, MPA, SEPAQ)? Quais instituições e descrever conflitos.");

        taQuestao4.setColumns(20);
        taQuestao4.setRows(5);
        jScrollPane6.setViewportView(taQuestao4);

        jLabel35.setText("6 - Que perspectivas você tem (vê) para os próximos anos?");

        ckb6DeCrescimento.setText("De crescimento");

        ckb6Estabilizacao.setText("Estabilização");

        ckb6DeDiminuicao.setText("De diminuição");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jLabel36.setText("1 - Quais dificuldades encontradas para manter a atividade da venda? Quais soluções para melhorar o trabalho?");

        taQuestao1.setColumns(20);
        taQuestao1.setRows(5);
        jScrollPane11.setViewportView(taQuestao1);

        ckb2Sim.setText("Sim");

        ckb3Sim.setText("Sim");

        ckb5Sim.setText("Sim Porque?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb2Sim))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckb2emprestimo)
                            .addComponent(ckb2trocaPescadoGrude)
                            .addComponent(ckb2DivisaoDespesas)
                            .addComponent(ckb2Outros))))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb3Sim))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckb3PorProdutos)
                            .addComponent(ckb3PorClientes)
                            .addComponent(ckb3PontoVenda)
                            .addComponent(ckb3Outros))))
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckb5Sim)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btAtualizar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btSalvar))
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ckb6DeCrescimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb6Estabilizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb6DeDiminuicao))
                    .addComponent(jLabel35))
                .addContainerGap(437, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbAtravessador, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAtravessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(ckb2Sim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb2emprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb2trocaPescadoGrude)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb2DivisaoDespesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb2Outros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(ckb3Sim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckb3PorClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb3PorProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb3PontoVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb3Outros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ckb5Sim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckb6DeCrescimento)
                    .addComponent(ckb6Estabilizacao)
                    .addComponent(ckb6DeDiminuicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btAtualizar))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-806)/2, (screenSize.height-516)/2, 806, 516);
    }// </editor-fold>//GEN-END:initComponents

    private void fechar_janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar_janela
        conexao.desconecta();
    }//GEN-LAST:event_fechar_janela

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        salvar_dados();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        atualizar_dados();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void cbAtravessadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAtravessadorItemStateChanged
        
    }//GEN-LAST:event_cbAtravessadorItemStateChanged

    private void cbAtravessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtravessadorActionPerformed
        if (inicia_combo == 1){
            mostra_dados();
        }
        inicia_combo = 1;
    }//GEN-LAST:event_cbAtravessadorActionPerformed

    private void ckb2trocaPescadoGrudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb2trocaPescadoGrudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckb2trocaPescadoGrudeActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mercadoFeira3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbAtravessador;
    private javax.swing.JCheckBox ckb2DivisaoDespesas;
    private javax.swing.JCheckBox ckb2Outros;
    private javax.swing.JCheckBox ckb2Sim;
    private javax.swing.JCheckBox ckb2emprestimo;
    private javax.swing.JCheckBox ckb2trocaPescadoGrude;
    private javax.swing.JCheckBox ckb3Outros;
    private javax.swing.JCheckBox ckb3PontoVenda;
    private javax.swing.JCheckBox ckb3PorClientes;
    private javax.swing.JCheckBox ckb3PorProdutos;
    private javax.swing.JCheckBox ckb3Sim;
    private javax.swing.JCheckBox ckb5Sim;
    private javax.swing.JCheckBox ckb6DeCrescimento;
    private javax.swing.JCheckBox ckb6DeDiminuicao;
    private javax.swing.JCheckBox ckb6Estabilizacao;
    private javax.swing.ButtonGroup grupo_questao_1;
    private javax.swing.ButtonGroup grupo_questao_2;
    private javax.swing.ButtonGroup grupo_questao_3;
    private javax.swing.ButtonGroup grupo_questao_4;
    private javax.swing.ButtonGroup grupo_questao_5;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea taQuestao1;
    private javax.swing.JTextArea taQuestao4;
    private javax.swing.JTextArea taQuestao5;
    // End of variables declaration//GEN-END:variables


    private void mostra_dados(){
        limpar_dados();
        String codigo = util.separa(1,cbAtravessador.getSelectedItem().toString());
        System.out.println(codigo);
        try {
            //Pescador Moradia
            conexao.execute("SELECT * FROM mercado_feira_perspectiva WHERE cod_mercado_feira = "+codigo);
            conexao.resultSet.first();

           taQuestao1.setText(conexao.resultSet.getString("questao1"));

           if (conexao.resultSet.getString("questao2").equals("1"))
                ckb2Sim.setSelected(true);

           if (conexao.resultSet.getString("questao2_1").equals("1"))
                ckb2emprestimo.setSelected(true);

           if (conexao.resultSet.getString("questao2_2").equals("1"))
                ckb2trocaPescadoGrude.setSelected(true);

           if (conexao.resultSet.getString("questao2_3").equals("1"))
                ckb2DivisaoDespesas.setSelected(true);

           if (conexao.resultSet.getString("questao2_4").equals("1"))
                ckb2Outros.setSelected(true);

           if (conexao.resultSet.getString("questao3").equals("1"))
                ckb3Sim.setSelected(true);

           if (conexao.resultSet.getString("questao3_1").equals("1"))
                ckb3PorClientes.setSelected(true);

           if (conexao.resultSet.getString("questao3_2").equals("1"))
                ckb3PorProdutos.setSelected(true);

           if (conexao.resultSet.getString("questao3_3").equals("1"))
                ckb3PontoVenda.setSelected(true);

           if (conexao.resultSet.getString("questao3_4").equals("1"))
                ckb3Outros.setSelected(true);

           taQuestao4.setText(conexao.resultSet.getString("questao4"));
           taQuestao5.setText(conexao.resultSet.getString("questao5"));

           if (conexao.resultSet.getString("questao5_1").equals("1"))
                ckb5Sim.setSelected(true);

           if (conexao.resultSet.getString("questao6").equals("1"))
                ckb6DeCrescimento.setSelected(true);

           if (conexao.resultSet.getString("questao6_1").equals("1"))
                ckb6Estabilizacao.setSelected(true);

           if (conexao.resultSet.getString("questao6_2").equals("1"))
                ckb6DeDiminuicao.setSelected(true);


        }catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null,"Nenhum registro encontrado "+ ex );
                System.out.println("Erro no mostrar dados");               
        }

    }

    private void attCbAtravessador() {
        try {
            cbAtravessador.removeAllItems();
            conexao.execute("select * from mercado_feira");

            while (conexao.resultSet.next()){
                cbAtravessador.addItem(conexao.resultSet.getString("cod_mercado_feira")+
                            " # "+ conexao.resultSet.getString("nome"));
            }

        }catch (SQLException ex) {
            System.out.println("Erro no mercado_feira "+ex);
        }
    }

    private void limpar_dados() {      
           taQuestao1.setText("");
           ckb2Sim.setSelected(false);
           ckb2emprestimo.setSelected(false);
           ckb2trocaPescadoGrude.setSelected(false);
           ckb2DivisaoDespesas.setSelected(false);
           ckb2Outros.setSelected(false);
           ckb3Sim.setSelected(false);
           ckb3PorClientes.setSelected(false);
           ckb3PorProdutos.setSelected(false);
           ckb3PontoVenda.setSelected(false);
           ckb3Outros.setSelected(false);
           taQuestao4.setText("");
           taQuestao5.setText("");
           ckb5Sim.setSelected(false);
           ckb6DeCrescimento.setSelected(false);
           ckb6Estabilizacao.setSelected(false);
           ckb6DeDiminuicao.setSelected(false);
    }

    private void salvar_dados() {
    String codigo = util.separa(1,cbAtravessador.getSelectedItem().toString());
    System.out.println(codigo);

            String sqlinsert = "insert into mercado_feira_perspectiva "
                    + "(cod_mercado_feira,questao1,questao2,questao2_1,questao2_2,"
                    + "questao2_3,questao2_4,questao3,questao3_1,questao3_2,"
                    + "questao3_3,questao3_4,questao4,questao5,questao5_1,"
                    + "questao6,questao6_1,questao6_2) values ("+
                    codigo+",'"+
                    taQuestao1.getText()+"','"+
                    util.checarCkb(ckb2Sim)+"','"+
                    util.checarCkb(ckb2emprestimo)+"','"+
                    util.checarCkb(ckb2trocaPescadoGrude)+"','"+
                    util.checarCkb(ckb2DivisaoDespesas)+"','"+
                    util.checarCkb(ckb2Outros)+"','"+
                    util.checarCkb(ckb3Sim)+"','"+
                    util.checarCkb(ckb3PorClientes)+"','"+
                    util.checarCkb(ckb3PorProdutos)+"','"+
                    util.checarCkb(ckb3PontoVenda)+"','"+
                    util.checarCkb(ckb3Outros)+"','"+
                    taQuestao4.getText()+"','"+
                    taQuestao5.getText()+"','"+
                    util.checarCkb(ckb5Sim)+"','"+
                    util.checarCkb(ckb6DeCrescimento)+"','"+
                    util.checarCkb(ckb6Estabilizacao)+"','"+
                    util.checarCkb(ckb6DeDiminuicao)+"')";

            //System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
                System.out.println("Cadastrado com sucesso");
                mostra_dados();
            }


    }

    private void atualizar_dados() {
    String codigo = util.separa(1,cbAtravessador.getSelectedItem().toString());
    System.out.println(codigo);

        String sqlupdate ="UPDATE mercado_feira_perspectiva SET "
                    +"questao1 = '"+taQuestao1.getText()+"',"
                    +"questao2 = '"+util.checarCkb(ckb2Sim)+"',"
                    +"questao2_1 = '"+util.checarCkb(ckb2emprestimo)+"',"
                    +"questao2_2 = '"+util.checarCkb(ckb2trocaPescadoGrude)+"',"
                    +"questao2_3 = '"+util.checarCkb(ckb2DivisaoDespesas)+"',"
                    +"questao2_4 = '"+util.checarCkb(ckb2Outros)+"',"
                    +"questao3 = '"+util.checarCkb(ckb3Sim)+"',"
                    +"questao3_1 = '"+util.checarCkb(ckb3PorClientes)+"',"
                    +"questao3_2 = '"+util.checarCkb(ckb3PorProdutos)+"',"
                    +"questao3_3 = '"+util.checarCkb(ckb3PontoVenda)+"',"
                    +"questao3_4 = '"+util.checarCkb(ckb3Outros)+"',"
                    +"questao4 = '"+taQuestao4.getText()+"',"
                    +"questao5 = '"+taQuestao5.getText()+"',"
                    +"questao5_1 = '"+util.checarCkb(ckb5Sim)+"',"
                    +"questao6 = '"+util.checarCkb(ckb6DeCrescimento)+"',"
                    +"questao6_1 = '"+util.checarCkb(ckb6Estabilizacao)+"',"
                    +"questao6_2 = '"+util.checarCkb(ckb6DeDiminuicao)+"' "+

                    "where cod_mercado_feira = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                JOptionPane.showMessageDialog(null,"Atualizado com sucesso");
                System.out.println("Atualizado com sucesso");
                mostra_dados();
            }

    }

}
