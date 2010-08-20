/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frm_atravessador.java
 *
 * Created on 26/07/2010, 09:30:35
 */

package br.com.bean;

import br.com.Persistencia.Conexao;
import br.com.bean.view.colonia.*;
import br.com.bean2.*;
import br.com.bean4.*;
import br.com.bean3.*;
import br.com.view.WinQuestionarioEmpresa;
import br.com.view.pescador.WinQuestionarioPescador;

/**
 *
 * @author MPA
 */
public class frm_atravessador extends javax.swing.JFrame {
    Conexao conexao;
    /** Creates new form frm_atravessador */
    public frm_atravessador() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botao_cadastrar_atravessador = new javax.swing.JButton();
        botao_questionario_atravessador = new javax.swing.JButton();
        botao_sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botao_cadastrar_caminhoneiro = new javax.swing.JButton();
        botao_questionario_caminhoneiro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botao_cadastrar_comunidade = new javax.swing.JButton();
        botao_questionario_comunidade = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botao_cadastrar_comunidade1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botao_cadastrar_pescador = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        botao_cadastrar_economia = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        botao_cadastrar_colonia = new javax.swing.JButton();
        botao_questionario_colonia = new javax.swing.JButton();
        botao_entrevista_colonia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Formulário Atravessador ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botao_cadastrar_atravessador.setText("Cadastrar Atravessador");
        botao_cadastrar_atravessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrar_atravessadorActionPerformed(evt);
            }
        });

        botao_questionario_atravessador.setText("Questionário atravessador");
        botao_questionario_atravessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_questionario_atravessadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(botao_cadastrar_atravessador))
                    .addComponent(botao_questionario_atravessador))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_cadastrar_atravessador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_questionario_atravessador)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        botao_sair.setText("Sair");
        botao_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_sairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Formulário Caminhoneiro");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        botao_cadastrar_caminhoneiro.setText("Cadastrar Caminhoneiro");
        botao_cadastrar_caminhoneiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrar_caminhoneiroActionPerformed(evt);
            }
        });

        botao_questionario_caminhoneiro.setText("Questionário Caminhoneiro");
        botao_questionario_caminhoneiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_questionario_caminhoneiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(botao_cadastrar_caminhoneiro))
                    .addComponent(botao_questionario_caminhoneiro))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_cadastrar_caminhoneiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_questionario_caminhoneiro)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(153, 0, 102));
        jLabel3.setText("Formulário Comunidade ");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        botao_cadastrar_comunidade.setText("Cadastrar Comunidade");
        botao_cadastrar_comunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrar_comunidadeActionPerformed(evt);
            }
        });

        botao_questionario_comunidade.setText("Questionário Comunidade");
        botao_questionario_comunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_questionario_comunidadeActionPerformed(evt);
            }
        });

        jButton1.setText("Entrevista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(botao_cadastrar_comunidade))
                            .addComponent(botao_questionario_comunidade)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_cadastrar_comunidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_questionario_comunidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Formulário Mercado Feira ");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        botao_cadastrar_comunidade1.setText("Cadastrar Comunidade");
        botao_cadastrar_comunidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrar_comunidade1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(botao_cadastrar_comunidade1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botao_cadastrar_comunidade1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(153, 153, 0));
        jLabel5.setText("Formulário pescador principal ");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        botao_cadastrar_pescador.setText("Questionário  Pescador");
        botao_cadastrar_pescador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrar_pescadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botao_cadastrar_pescador)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(botao_cadastrar_pescador)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Formulário Empresa");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        botao_cadastrar_economia.setText("Questionário  Empresa");
        botao_cadastrar_economia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrar_economiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(botao_cadastrar_economia)
                .addGap(51, 51, 51))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(botao_cadastrar_economia)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(153, 0, 102));
        jLabel7.setText("Formulário Colônia");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        botao_cadastrar_colonia.setText("Cadastrar Colônia");
        botao_cadastrar_colonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrar_coloniaActionPerformed(evt);
            }
        });

        botao_questionario_colonia.setText("Questionário Colônia");
        botao_questionario_colonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_questionario_coloniaActionPerformed(evt);
            }
        });

        botao_entrevista_colonia.setText("Entrevista");
        botao_entrevista_colonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_entrevista_coloniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(botao_cadastrar_colonia)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(botao_questionario_colonia)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(botao_entrevista_colonia)
                        .addGap(90, 90, 90))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_cadastrar_colonia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_questionario_colonia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_entrevista_colonia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(71, 71, 71))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(botao_sair)))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel7)
                .addContainerGap(411, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botao_sair)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_cadastrar_atravessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrar_atravessadorActionPerformed
        new frm_cad_atravessador().setVisible(true);
    }//GEN-LAST:event_botao_cadastrar_atravessadorActionPerformed

    private void botao_questionario_atravessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_questionario_atravessadorActionPerformed
        new frm_questionario_atravessador().setVisible(true);
    }//GEN-LAST:event_botao_questionario_atravessadorActionPerformed

    private void botao_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_sairActionPerformed
       System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_botao_sairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void botao_cadastrar_caminhoneiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrar_caminhoneiroActionPerformed
        new frm_cad_caminhoneiro().setVisible(true);
    }//GEN-LAST:event_botao_cadastrar_caminhoneiroActionPerformed

    private void botao_questionario_caminhoneiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_questionario_caminhoneiroActionPerformed
        new frm_questionario_caminhoneiro().setVisible(true);
    }//GEN-LAST:event_botao_questionario_caminhoneiroActionPerformed

    private void botao_cadastrar_comunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrar_comunidadeActionPerformed
        new comunidade_cadastro().setVisible(true);
    }//GEN-LAST:event_botao_cadastrar_comunidadeActionPerformed

    private void botao_questionario_comunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_questionario_comunidadeActionPerformed
        new comunidade_questionario().setVisible(true);
    }//GEN-LAST:event_botao_questionario_comunidadeActionPerformed

    private void botao_cadastrar_comunidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrar_comunidade1ActionPerformed
        new comunidade_questionariomercadofeira().setVisible(true);
    }//GEN-LAST:event_botao_cadastrar_comunidade1ActionPerformed

    private void botao_cadastrar_pescadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrar_pescadorActionPerformed
        // TODO add your handling code here:
         new WinQuestionarioPescador().setVisible(true);
    }//GEN-LAST:event_botao_cadastrar_pescadorActionPerformed

    private void botao_cadastrar_economiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrar_economiaActionPerformed
        // TODO add your handling code here:
       
          new WinQuestionarioEmpresa().setVisible(true);
    }//GEN-LAST:event_botao_cadastrar_economiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new comunidade_historia().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botao_cadastrar_coloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrar_coloniaActionPerformed
        new colonia_cadastro().setVisible(true);
    }//GEN-LAST:event_botao_cadastrar_coloniaActionPerformed

    private void botao_questionario_coloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_questionario_coloniaActionPerformed
        new colonia_questionario().setVisible(true);
    }//GEN-LAST:event_botao_questionario_coloniaActionPerformed

    private void botao_entrevista_coloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_entrevista_coloniaActionPerformed
        new colonia_historia().setVisible(true);
    }//GEN-LAST:event_botao_entrevista_coloniaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_atravessador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cadastrar_atravessador;
    private javax.swing.JButton botao_cadastrar_caminhoneiro;
    private javax.swing.JButton botao_cadastrar_colonia;
    private javax.swing.JButton botao_cadastrar_comunidade;
    private javax.swing.JButton botao_cadastrar_comunidade1;
    private javax.swing.JButton botao_cadastrar_economia;
    private javax.swing.JButton botao_cadastrar_pescador;
    private javax.swing.JButton botao_entrevista_colonia;
    private javax.swing.JButton botao_questionario_atravessador;
    private javax.swing.JButton botao_questionario_caminhoneiro;
    private javax.swing.JButton botao_questionario_colonia;
    private javax.swing.JButton botao_questionario_comunidade;
    private javax.swing.JButton botao_sair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables

}
