/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * winProduto.java
 *
 * Created on 16/07/2010, 15:50:37
 */

package br.com.formulario.emp;

import br.com.formulario.atravessador.*;
import br.com.conexao.Conexao;
import br.com.util.JIntField;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Jhonathas
 */
public class empresa extends javax.swing.JFrame {

     private int navega = 0; //variavel pra saber o  bot�o clicado;
     private Conexao conexao;

     // Inserir Data atual
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    // Inserir Data atual

    public empresa() {
        initComponents(); //Inicializa os componentes da tela
        conexao = new Conexao();
        conexao.conecta("emalhe");

        //Insere nomes do munic�pio no cbMunicipio
        AttCb();

        //inicia a conex�o com o bd do formul�rio
        conexao.execute("select * from atravessador");

        try {
            conexao.resultSet.first();
            mostra_dados_atravessador();


        }catch (SQLException ex) {
            Logger.getLogger(empresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        definicao = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpAtravessador = new javax.swing.JPanel();
        cbMunicipio = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Cadastrar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        botao_novo = new javax.swing.JButton();
        botao_primeiro = new javax.swing.JButton();
        botao_anterior = new javax.swing.JButton();
        botao_proximo = new javax.swing.JButton();
        botao_ultimo = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jp0 = new javax.swing.JPanel();
        tfColetor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDataColetor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfDigitador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfDataDigitador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        rbModificado = new javax.swing.JRadioButton();
        rbComprado = new javax.swing.JRadioButton();
        rbConstruido = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfTempoEmpresa = new JIntField();
        jLabel12 = new javax.swing.JLabel();
        tfFone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfNomeEmpresa = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfFuncao = new javax.swing.JTextField();
        tfPessoaEntrevistada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Question�rio Atravessador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fechar_janela(evt);
            }
        });
        getContentPane().setLayout(null);

        jpAtravessador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpAtravessador.setPreferredSize(new java.awt.Dimension(735, 400));

        jLabel24.setText("Munic�pio");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarAction(evt);
            }
        });

        botao_excluir.setText("Excluir");
        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        botao_novo.setText("Limpar");
        botao_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_novoActionPerformed(evt);
            }
        });

        botao_primeiro.setText("<<");
        botao_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_primeiroActionPerformed(evt);
            }
        });

        botao_anterior.setText("<");
        botao_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_anteriorActionPerformed(evt);
            }
        });

        botao_proximo.setText(">");
        botao_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_proximoActionPerformed(evt);
            }
        });

        botao_ultimo.setText(">>");
        botao_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ultimoActionPerformed(evt);
            }
        });

        botao_alterar.setText("Alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(botao_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_excluir)
                        .addGap(7, 7, 7)
                        .addComponent(botao_alterar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(botao_primeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_proximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_ultimo)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_primeiro)
                    .addComponent(botao_anterior)
                    .addComponent(botao_proximo)
                    .addComponent(botao_ultimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_novo)
                    .addComponent(Cadastrar)
                    .addComponent(botao_excluir)
                    .addComponent(botao_alterar))
                .addContainerGap())
        );

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel25.setText("Dados");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel42.setText("Question�rio Empresa");

        jp0.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        jp0.add(tfColetor, gridBagConstraints);

        jLabel5.setText("Data.:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        jp0.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jp0.add(tfDataColetor, gridBagConstraints);

        jLabel2.setText("Coletor.:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        jp0.add(jLabel2, gridBagConstraints);

        jLabel6.setText("Digitador.:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        jp0.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        jp0.add(tfDigitador, gridBagConstraints);

        jLabel7.setText("Data.:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        jp0.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jp0.add(tfDataDigitador, gridBagConstraints);

        rbModificado.setText("Modificada");

        rbComprado.setText("Comprado");

        rbConstruido.setText("Constru�do");

        jLabel9.setText("Foi.:");

        jLabel8.setText("Pessoa entrevistada.:");

        jLabel10.setText("Endereco.:");

        jLabel11.setText("A quanto tempo a empresa existe?");

        jLabel12.setText("Fone/Fax.:");

        jLabel13.setText("Fun��o.:");

        jLabel14.setText("Nome da Empresa.:");

        javax.swing.GroupLayout jpAtravessadorLayout = new javax.swing.GroupLayout(jpAtravessador);
        jpAtravessador.setLayout(jpAtravessadorLayout);
        jpAtravessadorLayout.setHorizontalGroup(
            jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAtravessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtravessadorLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(375, 375, 375))
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(10, 10, 10)
                        .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(392, Short.MAX_VALUE))
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(rbComprado)
                                .addGap(2, 2, 2)
                                .addComponent(rbConstruido)
                                .addGap(2, 2, 2)
                                .addComponent(rbModificado))
                            .addComponent(jLabel25)
                            .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(4, 4, 4)
                                .addComponent(tfNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpAtravessadorLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpAtravessadorLayout.createSequentialGroup()
                                    .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(4, 4, 4)
                                            .addComponent(tfPessoaEntrevistada, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfTempoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(4, 4, 4)
                                            .addComponent(tfFone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(15, 15, 15)
                                            .addComponent(tfFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(194, Short.MAX_VALUE))
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jp0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jpAtravessadorLayout.setVerticalGroup(
            jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAtravessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel24))
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(12, 12, 12)
                .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(tfNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))
                            .addComponent(tfPessoaEntrevistada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfTempoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12))
                            .addComponent(tfFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAtravessadorLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13))
                            .addComponent(tfFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAtravessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAtravessadorLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(rbComprado)
                    .addComponent(rbConstruido)
                    .addComponent(rbModificado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
        );

        jScrollPane1.setViewportView(jpAtravessador);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 690, 719);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-595)/2, (screenSize.height-447)/2, 595, 447);
    }// </editor-fold>//GEN-END:initComponents

    private void fechar_janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fechar_janela
        conexao.desconecta();
    }//GEN-LAST:event_fechar_janela

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
//        try{
//            String sql ="UPDATE atravessador SET "+
//                    "definicao = '"+getDefinicao()+"',"+
//                    "municipio = '"+cbMunicipio.getSelectedItem()+"',"+
//                    "nome = '"+tfNome.getText()+"',"+
//                    "apelido = '"+ tfApelido.getText() +"',"+
//                    "naturalidade = '"+ tfNaturalidade.getText() +"',"+
//                    "local_moradia = '"+ cbLocalMoradia.getSelectedItem() +"',"+
//                    "sexo = '"+ cbSexo.getSelectedItem() +"',"+
//                    "idade = '"+ tfIdade.getText() +"',"+
//                    "atividade_principal = '"+ cbAtividadePrincipal.getSelectedItem() +"',"+
//                    "atividade_secundaria = '"+ tfAtividadeSecundaria.getText() +"',"+
//                    "estado_civil = '"+ cbEstadoCivil.getSelectedItem() +"',"+
//                    "composicao_familiar = '"+ tfComposicaoFamiliar.getText() +"',"+
//                    "escolaridade = '"+ cbEscolaridade.getSelectedItem() +"',"+
//                    "digitador = '"+ tfDigitador.getText()+"',"+
//                    "coletor = '"+ tfColetor.getText()+"',"+
//                    "data_digitador = '"+ tfDataDigitador.getText()+"',"+
//                    "data_coletor = '"+ tfDataColetor.getText()+"',"+
//                    "pq_parou = '"+ tfPqParou.getText() +"' "+
//
//
//                    "where cod_atravessador = "+conexao.resultSet.getString("cod_atravessador");
//
//            System.out.println(sql);
//            if (conexao.update(sql)){
//                JOptionPane.showMessageDialog(null,"Alterado com sucesso");
//                //Atualiza Resultset
//                conexao.execute("select * from atravessador");
//                conexao.resultSet.next();
//                mostra_dados_atravessador();
//            }
//
//
//        }catch (Exception e){
//            System.out.println(e + " Erro no bot�o alterar");
//        }
}//GEN-LAST:event_botao_alterarActionPerformed

    private void botao_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ultimoActionPerformed
        try {
            conexao.resultSet.last();
            mostra_dados_atravessador();
            navega = 2;

        }catch (SQLException ex) {
            Logger.getLogger(empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_botao_ultimoActionPerformed

    private void botao_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_proximoActionPerformed
            proximo();
            mostra_dados_atravessador();
            navega = 2;
}//GEN-LAST:event_botao_proximoActionPerformed

    private void botao_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_anteriorActionPerformed
            anterior();
            mostra_dados_atravessador();
            navega = 1;
}//GEN-LAST:event_botao_anteriorActionPerformed

    private void botao_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_primeiroActionPerformed
        try {
            conexao.resultSet.first();
            mostra_dados_atravessador();
            navega = 1;

        }catch (SQLException ex) {
            Logger.getLogger(empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_botao_primeiroActionPerformed

    private void botao_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_novoActionPerformed
        limpar();
}//GEN-LAST:event_botao_novoActionPerformed

    private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_excluirActionPerformed
        String sql;
        try {
            sql = "select * from atravessador Where cod_atravessador =" + conexao.resultSet.getString("cod_atravessador");
            conexao.execute(sql);
            conexao.resultSet.first();
            String nome = "Deletar o atravessador : "+conexao.resultSet.getString("nome")+" ?";
            int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome,"Exclus�o ",JOptionPane.YES_NO_OPTION);
            if (opcao_escolhida == JOptionPane.YES_OPTION) {
                sql = "DELETE FROM atravessador Where cod_atravessador ="+conexao.resultSet.getString("cod_atravessador");
                if (conexao.salvar(sql)) {
                    JOptionPane.showMessageDialog(null,"Exclus�o realizada com sucesso");
                    //atualiza o ResultSet
                    conexao.execute("select * from atravessador");
                    conexao.resultSet.first();
                    mostra_dados_atravessador();
                }
            } else{
                conexao.execute("select * from atravessador");
                conexao.resultSet.first();
                mostra_dados_atravessador();
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao tentar excluir "+ex);
        }
    }//GEN-LAST:event_botao_excluirActionPerformed

    private void CadastrarAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarAction
//         try {
//            String sqlinsert = "insert into atravessador "
//                    + "(definicao,municipio,nome,apelido,naturalidade,"
//                    + "sexo,idade,atividade_principal,atividade_secundaria,"
//                    + "estado_civil,composicao_familiar,escolaridade,pq_parou,"
//                    + "local_moradia,"
//                    + "digitador,coletor,data_digitador,data_coletor) values ('"+
//                    getDefinicao()+"','"+
//                    cbMunicipio.getSelectedItem()+"','"+
//                    tfNome.getText()+"','"+
//                    tfApelido.getText()+"','"+
//                    tfNaturalidade.getText()+"','"+
//                    cbSexo.getSelectedItem()+"',"+
//                    tfIdade.getText()+",'"+
//                    cbAtividadePrincipal.getSelectedItem()+"','"+
//                    tfAtividadeSecundaria.getText()+"','"+
//                    cbEstadoCivil.getSelectedItem()+"','"+
//                    tfComposicaoFamiliar.getText()+"','"+
//                    cbEscolaridade.getSelectedItem()+"','"+
//                    tfPqParou.getText()+"','"+
//                    cbLocalMoradia.getSelectedItem()+"','"+
//                    tfDigitador.getText()+"','"+
//                    tfColetor.getText()+"','"+
//                    tfDataDigitador.getText()+"','"+
//                    tfDataColetor.getText()+"')";
//
//            //System.out.println(sqlinsert);
//            if (conexao.salvar(sqlinsert)) {
//                JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
//                //agora � hora de atualizar o resultset
//                conexao.execute("select * from atravessador");
//                conexao.resultSet.first(); //1� registro
//                mostra_dados_atravessador();
//            }
//
//
//        }catch (SQLException erro){
//            System.out.println(erro);
//        }
}//GEN-LAST:event_CadastrarAction

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frm_atravessador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_anterior;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_novo;
    private javax.swing.JButton botao_primeiro;
    private javax.swing.JButton botao_proximo;
    private javax.swing.JButton botao_ultimo;
    private javax.swing.JComboBox cbMunicipio;
    private javax.swing.ButtonGroup definicao;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jp0;
    private javax.swing.JPanel jpAtravessador;
    private javax.swing.JRadioButton rbComprado;
    private javax.swing.JRadioButton rbConstruido;
    private javax.swing.JRadioButton rbModificado;
    private javax.swing.JTextField tfColetor;
    private javax.swing.JTextField tfDataColetor;
    private javax.swing.JTextField tfDataDigitador;
    private javax.swing.JTextField tfDigitador;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfFone;
    private javax.swing.JTextField tfFuncao;
    private javax.swing.JTextField tfNomeEmpresa;
    private javax.swing.JTextField tfPessoaEntrevistada;
    private javax.swing.JTextField tfTempoEmpresa;
    // End of variables declaration//GEN-END:variables


    private void mostra_dados_atravessador(){
//       String teste = new String();
//        try {
//            teste = conexao.resultSet.getString("definicao");
//            if (teste.equals(chbAtravessador.getText()))
//                chbAtravessador.setSelected(true);
//            else if (teste.equals(chbBalanceiro.getText()))
//                chbBalanceiro.setSelected(true);
//            else if (teste.equals(chbMarreteiro.getText()))
//                chbMarreteiro.setSelected(true);
//
//            tfNome.setText(conexao.resultSet.getString("nome"));
//            tfApelido.setText(conexao.resultSet.getString("apelido"));
//            tfNaturalidade.setText(conexao.resultSet.getString("naturalidade"));
//            tfIdade.setText(conexao.resultSet.getString("idade"));
//            cbAtividadePrincipal.setSelectedItem(conexao.resultSet.getString("atividade_principal"));
//            tfAtividadeSecundaria.setText(conexao.resultSet.getString("atividade_secundaria"));
//            cbEstadoCivil.setSelectedItem(conexao.resultSet.getString("estado_civil"));
//            tfComposicaoFamiliar.setText(conexao.resultSet.getString("composicao_familiar"));
//            cbEscolaridade.setSelectedItem(conexao.resultSet.getString("escolaridade"));
//            tfPqParou.setText(conexao.resultSet.getString("pq_parou"));
//            cbMunicipio.setSelectedItem(conexao.resultSet.getString("municipio"));
//            cbSexo.setSelectedItem(conexao.resultSet.getString("sexo"));
//            cbLocalMoradia.setSelectedItem(conexao.resultSet.getString("local_moradia"));
//
//            tfDigitador.setText(conexao.resultSet.getString("digitador"));
//            tfColetor.setText(conexao.resultSet.getString("coletor"));
//            tfDataDigitador.setText(conexao.resultSet.getString("data_digitador"));
//            tfDataColetor.setText(conexao.resultSet.getString("data_coletor"));
//
//        }catch (SQLException ex) {
//            if (navega == 1){
//                JOptionPane.showMessageDialog(null,"Voc� j� esta no primeiro registro");
//                proximo();
//            }
//            else if (navega == 2){
//                JOptionPane.showMessageDialog(null,"Voc� j� esta no ultimo registro");
//                anterior();
//            }
//            else
//                JOptionPane.showMessageDialog(null,"Nenhum registro encontrado "+ ex );
//            navega = 0;
//            //Logger.getLogger(pescador.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       //Insere data no digitador, caso n�o tenha nada
//        if (tfDataDigitador.getText().equals(""))
//            tfDataDigitador.setText(formatador.format(data));
    }

    private void anterior() {
         try {
                    conexao.resultSet.previous();
                } catch (SQLException ex1) {
                    Logger.getLogger(empresa.class.getName()).log(Level.SEVERE, null, ex1);
                }
    }

    private void proximo() {
        try {
                    conexao.resultSet.next();
                } catch (SQLException ex1) {
                    Logger.getLogger(empresa.class.getName()).log(Level.SEVERE, null, ex1);
                }
    }

//    private String getDefinicao() {
////        String tdefinicao = new String();
////        if (chbAtravessador.isSelected())
////            tdefinicao = chbAtravessador.getText();
////        else if (chbBalanceiro.isSelected())
////            tdefinicao = chbBalanceiro.getText();
////        else if (chbMarreteiro.isSelected())
////            tdefinicao = chbMarreteiro.getText();
////
////        return tdefinicao;
//    }

    private void limpar() {
//        tfNome.setText("");
//        tfApelido.setText("");
//        tfNaturalidade.setText("");
//        tfIdade.setText("0");
//        cbAtividadePrincipal.setSelectedIndex(0);
//        tfAtividadeSecundaria.setText("");
//        cbEstadoCivil.setSelectedIndex(0);
//        tfComposicaoFamiliar.setText("");
//        cbEscolaridade.setSelectedIndex(0);
//        tfPqParou.setText("");
//        cbMunicipio.setSelectedIndex(0);
//        cbSexo.setSelectedIndex(0);
//        cbLocalMoradia.setSelectedIndex(0);
//        cbEscolaridade.setSelectedIndex(0);
//        chbAtravessador.setSelected(false);
//        chbBalanceiro.setSelected(false);
//        chbMarreteiro.setSelected(false);
    }

    private void AttCb() {
//        try {
//            cbMunicipio.removeAllItems();
//            conexao.execute("select * FROM municipios where pai='Par�' or pai='Maranh�o' or pai='Amap�' ");
//            while (conexao.resultSet.next()){
//                cbMunicipio.addItem(conexao.resultSet.getString("nome"));
//            }
//        }catch (SQLException ex) {
//            Logger.getLogger(empresa.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            cbAtividadePrincipal.removeAllItems();
//            conexao.execute("select * FROM atividade ");
//            while (conexao.resultSet.next()){
//                cbAtividadePrincipal.addItem(conexao.resultSet.getString("atividade"));
//            }
//        }catch (SQLException ex) {
//            Logger.getLogger(empresa.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    



}
