/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addAtividades.java
 *
 * Created on 15/08/2010, 07:16:20
 */

package br.com.bean3;

import br.com.Persistencia.Conexao;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonathas
 */
public class addAtividades extends javax.swing.JFrame {
    private Conexao conexao;
    public String idd_atravessador;
    /** Creates new form addAtividades */
    public addAtividades(String id) {
        initComponents();
        conexao = new Conexao();
        conexao.conecta("mil_interface");
        System.out.println(id);
        idd_atravessador = id;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbNomeAtividade = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ckb1Jan = new javax.swing.JCheckBox();
        ckb1Fev = new javax.swing.JCheckBox();
        ckb1Jun = new javax.swing.JCheckBox();
        ckb1Jul = new javax.swing.JCheckBox();
        ckb1Ago = new javax.swing.JCheckBox();
        ckb1Set = new javax.swing.JCheckBox();
        ckb1Out = new javax.swing.JCheckBox();
        ckb1Nov = new javax.swing.JCheckBox();
        ckb1Dez = new javax.swing.JCheckBox();
        ckb1Mar = new javax.swing.JCheckBox();
        ckb1Mai = new javax.swing.JCheckBox();
        ckb1Abr = new javax.swing.JCheckBox();
        tfOutro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Atividades");

        cbNomeAtividade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Serra", "Pescada", "Gurijuba", "G�", "Tainha", "Broca e Queima", "Plantio", "Capina", "Colheita", "Produ��o da Farinha", "Outro" }));
        cbNomeAtividade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNomeAtividadeItemStateChanged(evt);
            }
        });

        jLabel2.setText("Nome da Atividade");

        jLabel3.setText("Outro:");

        ckb1Jan.setText("Jan");

        ckb1Fev.setText("Fev");

        ckb1Jun.setText("Jun");

        ckb1Jul.setText("Jul");

        ckb1Ago.setText("Ago");

        ckb1Set.setText("Set");

        ckb1Out.setText("Out");

        ckb1Nov.setText("Nov");

        ckb1Dez.setText("Dez");

        ckb1Mar.setText("Mar");

        ckb1Mai.setText("Mai");

        ckb1Abr.setText("Abr");

        tfOutro.setEditable(false);

        jButton1.setText("Add");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfOutro, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(cbNomeAtividade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ckb1Jan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Fev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Mar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Abr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Mai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Jun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Jul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Ago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Set)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Out)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Nov)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb1Dez)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbNomeAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckb1Jan)
                    .addComponent(ckb1Fev)
                    .addComponent(ckb1Mar)
                    .addComponent(ckb1Abr)
                    .addComponent(ckb1Mai)
                    .addComponent(ckb1Jun)
                    .addComponent(ckb1Jul)
                    .addComponent(ckb1Ago)
                    .addComponent(ckb1Set)
                    .addComponent(ckb1Out)
                    .addComponent(ckb1Nov)
                    .addComponent(ckb1Dez))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbNomeAtividadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNomeAtividadeItemStateChanged
        if (cbNomeAtividade.getSelectedItem().toString().equals("Outro"))
            tfOutro.setEditable(true);
        else
            tfOutro.setEditable(false);
    }//GEN-LAST:event_cbNomeAtividadeItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                    String sqlinsert = "insert into comunidade_addatividade "
                    + "(id_comunidade,tipo,"
                    + "jan,fev,mar,abr,mai,jun,jul,ago,sett,out,nov,dez) values ("+

                    idd_atravessador+",'"+
                    registro_que_vai()+"',"+
                    tachecado(ckb1Jan)+","+
                    tachecado(ckb1Fev)+","+
                    tachecado(ckb1Mar)+","+
                    tachecado(ckb1Abr)+","+
                    tachecado(ckb1Mai)+","+
                    tachecado(ckb1Jun)+","+
                    tachecado(ckb1Jul)+","+
                    tachecado(ckb1Ago)+","+
                    tachecado(ckb1Set)+","+
                    tachecado(ckb1Out)+","+
                    tachecado(ckb1Nov)+","+
                    tachecado(ckb1Dez)+")";

                    System.out.println(sqlinsert);
                    if (conexao.salvar(sqlinsert)){
                        JOptionPane.showMessageDialog(null,"Salvo com sucesso");
                        //limpar();
                    }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new addAtividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbNomeAtividade;
    private javax.swing.JCheckBox ckb1Abr;
    private javax.swing.JCheckBox ckb1Ago;
    private javax.swing.JCheckBox ckb1Dez;
    private javax.swing.JCheckBox ckb1Fev;
    private javax.swing.JCheckBox ckb1Jan;
    private javax.swing.JCheckBox ckb1Jul;
    private javax.swing.JCheckBox ckb1Jun;
    private javax.swing.JCheckBox ckb1Mai;
    private javax.swing.JCheckBox ckb1Mar;
    private javax.swing.JCheckBox ckb1Nov;
    private javax.swing.JCheckBox ckb1Out;
    private javax.swing.JCheckBox ckb1Set;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfOutro;
    // End of variables declaration//GEN-END:variables

    private String registro_que_vai() {
        if (cbNomeAtividade.getSelectedItem().toString().equals("Outro"))
            return tfOutro.getText();
        else
            return cbNomeAtividade.getSelectedItem().toString();
    }

    private int tachecado(JCheckBox ckb) {
        if (ckb.isSelected()){
            return 1;
        }else
            return 0;
    }
}
