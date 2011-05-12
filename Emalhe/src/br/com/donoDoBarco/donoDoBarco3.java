package br.com.donoDoBarco;

import br.com.formulario.mercadoFeira.*;
import br.com.conexao.Conexao;
import br.com.util.Utilidade;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Jhonathas
 */
public class donoDoBarco3 extends javax.swing.JFrame {

    private Utilidade util = new Utilidade();
    private int inicia_combo = 0;
    private Conexao conexao;

    public donoDoBarco3() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        cbAtravessador = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taq7 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        taq4 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        ckb8DeCrescimento = new javax.swing.JCheckBox();
        ckb8Estabilizacao = new javax.swing.JCheckBox();
        ckb8DeDiminuicao = new javax.swing.JCheckBox();
        btSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btAtualizar = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        ckbq7 = new javax.swing.JCheckBox();
        rbq1_1 = new javax.swing.JRadioButton();
        rbq1_2 = new javax.swing.JRadioButton();
        rbq1_3 = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        taQ2 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        taQ3 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        taq6 = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        taq5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Questionário Dono do Barco");
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

        jLabel24.setText("Dono do Barco");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel42.setText("Perspectiva Dono do Barco");

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

        taq7.setColumns(20);
        taq7.setRows(5);
        jScrollPane5.setViewportView(taq7);

        jLabel27.setText("2 - Quais os motivos você acredita serem responsáveis pela diminuição?");

        jLabel28.setText("3 - Caso ocorra desaparecimento do pescado, como você sustentaria sua família?");

        jLabel29.setText("7 - Pretende continuar na atividade?");

        jLabel30.setText("4 - Quais as dificuldades (gargalos) encontradas pra manter a atividade da venda?");

        taq4.setColumns(20);
        taq4.setRows(5);
        jScrollPane6.setViewportView(taq4);

        jLabel35.setText("8 - Que perspectivas você tem (vê) para os próximos anos?");

        ckb8DeCrescimento.setText("De crescimento");

        ckb8Estabilizacao.setText("Estabilização");

        ckb8DeDiminuicao.setText("De diminuição");

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

        jLabel36.setText("1 - Você tem percebido mudança no tamanho e na quantidade do pescado?");

        ckbq7.setText("Sim Porque?");

        grupo_questao_1.add(rbq1_1);
        rbq1_1.setText("Aumentando");

        grupo_questao_1.add(rbq1_2);
        rbq1_2.setText("Diminuindo");

        grupo_questao_1.add(rbq1_3);
        rbq1_3.setText("Estável");

        taQ2.setColumns(20);
        taQ2.setRows(5);
        jScrollPane7.setViewportView(taQ2);

        taQ3.setColumns(20);
        taQ3.setRows(5);
        jScrollPane8.setViewportView(taQ3);

        jLabel31.setText("5 - Quais as possíveis soluções (demandas) pra melhorar o seu trabalho?");

        taq6.setColumns(20);
        taq6.setRows(5);
        jScrollPane9.setViewportView(taq6);

        jLabel32.setText("6 - Existem conflitos com instituições (IBAMA, MPA, SEPAQ)? Quais instituições e descrever os conflitos.");

        taq5.setColumns(20);
        taq5.setRows(5);
        jScrollPane10.setViewportView(taq5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(437, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(390, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
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
                        .addComponent(jLabel36)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(rbq1_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbq1_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbq1_3)
                .addContainerGap(531, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ckbq7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ckb8DeCrescimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ckb8Estabilizacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ckb8DeDiminuicao))
                        .addComponent(jLabel35)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbq1_1)
                    .addComponent(rbq1_2)
                    .addComponent(rbq1_3))
                .addGap(59, 59, 59)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ckbq7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckb8DeCrescimento)
                    .addComponent(ckb8Estabilizacao)
                    .addComponent(ckb8DeDiminuicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btAtualizar))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
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

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new donoDoBarco3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbAtravessador;
    private javax.swing.JCheckBox ckb8DeCrescimento;
    private javax.swing.JCheckBox ckb8DeDiminuicao;
    private javax.swing.JCheckBox ckb8Estabilizacao;
    private javax.swing.JCheckBox ckbq7;
    private javax.swing.ButtonGroup grupo_questao_1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbq1_1;
    private javax.swing.JRadioButton rbq1_2;
    private javax.swing.JRadioButton rbq1_3;
    private javax.swing.JTextArea taQ2;
    private javax.swing.JTextArea taQ3;
    private javax.swing.JTextArea taq4;
    private javax.swing.JTextArea taq5;
    private javax.swing.JTextArea taq6;
    private javax.swing.JTextArea taq7;
    // End of variables declaration//GEN-END:variables


    private void mostra_dados(){
        limpar_dados();
        String codigo = util.separa(1,cbAtravessador.getSelectedItem().toString());
        System.out.println(codigo);
        try {
            //Pescador Moradia
            conexao.execute("SELECT * FROM dono_barco_perspectiva WHERE cod_dono_barco = "+codigo);
            conexao.resultSet.first();

            if (conexao.resultSet.getString("questao1_1").equals("1"))
                    rbq1_1.setSelected(true);

            if (conexao.resultSet.getString("questao1_2").equals("1"))
                    rbq1_2.setSelected(true);

            if (conexao.resultSet.getString("questao1_3").equals("1"))
                    rbq1_3.setSelected(true);

            taQ2.setText(conexao.resultSet.getString("questao2"));
            taQ3.setText(conexao.resultSet.getString("questao3"));
            taq4.setText(conexao.resultSet.getString("questao4"));
            taq5.setText(conexao.resultSet.getString("questao5"));
            taq6.setText(conexao.resultSet.getString("questao6"));
            taq7.setText(conexao.resultSet.getString("questao7"));

           if (conexao.resultSet.getString("questao7_1").equals("1"))
                ckbq7.setSelected(true);
            
           if (conexao.resultSet.getString("questao8_1").equals("1"))
                ckb8DeCrescimento.setSelected(true);

           if (conexao.resultSet.getString("questao8_2").equals("1"))
                ckb8Estabilizacao.setSelected(true);

           if (conexao.resultSet.getString("questao8_3").equals("1"))
                ckb8DeDiminuicao.setSelected(true);


        }catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null,"Nenhum registro encontrado "+ ex );
                System.out.println("Erro no mostrar dados");               
        }

    }

    private void attCbAtravessador() {
        try {
            cbAtravessador.removeAllItems();
            conexao.execute("select * from dono_barco");

            while (conexao.resultSet.next()){
                cbAtravessador.addItem(conexao.resultSet.getString("cod_dono_barco")+
                            " # "+ conexao.resultSet.getString("nome"));
            }

        }catch (SQLException ex) {
            System.out.println("Erro no dono_barco "+ex);
        }
    }

    private void limpar_dados() {      
           
            rbq1_1.setSelected(false);
            rbq1_2.setSelected(false);
            rbq1_3.setSelected(false);
            taQ2.setText("");
            taQ3.setText("");
            taq4.setText("");
            taq5.setText("");
            taq6.setText("");
            taq7.setText("");
            ckbq7.setSelected(false);
            ckb8DeCrescimento.setSelected(false);
            ckb8Estabilizacao.setSelected(false);
            ckb8DeDiminuicao.setSelected(false);
    }

    private void salvar_dados() {
    String codigo = util.separa(1,cbAtravessador.getSelectedItem().toString());
    System.out.println(codigo);

            String sqlinsert = "insert into dono_barco_perspectiva "
                    + "(cod_dono_barco,questao1_1,questao1_2,questao1_3,"
                    + "questao2,questao3,questao4,questao5,questao6,"
                    + "questao7,questao7_1,questao8_1,questao8_2,"
                    + "questao8_3) values ("+
                    codigo+",'"+
                    util.checarChb(rbq1_1)+"','"+
                    util.checarChb(rbq1_2)+"','"+
                    util.checarChb(rbq1_3)+"','"+
                    taQ2.getText()+"','"+
                    taQ3.getText()+"','"+
                    taq4.getText()+"','"+
                    taq5.getText()+"','"+
                    taq6.getText()+"','"+
                    taq7.getText()+"','"+
                    util.checarCkb(ckbq7)+"','"+
                    util.checarCkb(ckb8DeCrescimento)+"','"+
                    util.checarCkb(ckb8Estabilizacao)+"','"+
                    util.checarCkb(ckb8DeDiminuicao)+"')";

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


        String sqlupdate ="UPDATE dono_barco_perspectiva SET "
                    +"questao1_1 = '"+util.checarChb(rbq1_1)+"',"
                    +"questao1_2 = '"+util.checarChb(rbq1_2)+"',"
                    +"questao1_3 = '"+util.checarChb(rbq1_3)+"',"
                    +"questao2 = '"+taQ2.getText()+"',"
                    +"questao3 = '"+taQ3.getText()+"',"
                    +"questao4 = '"+taq4.getText()+"',"
                    +"questao5 = '"+taq5.getText()+"',"
                    +"questao6 = '"+taq6.getText()+"',"
                    +"questao7 = '"+taq7.getText()+"',"
                    +"questao7_1 = '"+util.checarCkb(ckbq7)+"',"
                    +"questao8_1 = '"+util.checarCkb(ckb8DeCrescimento)+"',"
                    +"questao8_2 = '"+util.checarCkb(ckb8Estabilizacao)+"',"
                    +"questao8_3 = '"+util.checarCkb(ckb8DeDiminuicao)+"' "+

                    "where cod_dono_barco = "+codigo;

            //System.out.println(sqlupdate);
            if (conexao.update(sqlupdate)){
                JOptionPane.showMessageDialog(null,"Atualizado com sucesso");
                System.out.println("Atualizado com sucesso");
                mostra_dados();
            }

    }

}
