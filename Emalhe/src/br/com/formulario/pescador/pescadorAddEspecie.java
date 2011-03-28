
package br.com.formulario.pescador;

import br.com.conexao.Conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class pescadorAddEspecie extends javax.swing.JFrame {

    /** Creates new form winProduto */
    private Conexao conexao;
    public String idd_atravessador;
    public pescadorAddEspecie(String id_atravessador) {
        
        initComponents();
        conexao = new Conexao();
        conexao.conecta("emalhe");
        System.out.println(id_atravessador);
        idd_atravessador = id_atravessador;

        //Insere nomes das esp�cies cadastradas
        cbEspecie.removeAllItems();
        try {
            conexao.execute("SELECT DISTINCT especie FROM atravessador_addmercado where id_atravessador="+idd_atravessador);

            while (conexao.resultSet.next()){
                cbEspecie.addItem(conexao.resultSet.getString("especie"));

            }
        }catch (SQLException ex) {
           // Logger.getLogger(frm_cad_atravessador.class.getName()).log(Level.SEVERE, null, ex);
        }


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfEstimativaDaPerda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botao_add_especie = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfOutraCausa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDestinoPeixePerdido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbCaudaDaPerda = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cbEspecie = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfEstimativaDaPerda.setText("0");

        jLabel2.setText("Estimativa da Perda (%).:");

        botao_add_especie.setText("Add");
        botao_add_especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Action(evt);
            }
        });

        jLabel3.setText("Causa da Perda.:");

        tfOutraCausa.setEditable(false);

        jLabel4.setText("Destino do peixe perdido.:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Quais as perdas de pescado em fun��o da:");

        jLabel7.setText("Outro Causa.:");

        cbCaudaDaPerda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deteriora��o", "Falta de mercado", "M� Conserva��o", "Transporte", "Outro" }));
        cbCaudaDaPerda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCaudaDaPerdaItemStateChanged(evt);
            }
        });
        cbCaudaDaPerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCaudaDaPerdaActionPerformed(evt);
            }
        });

        jLabel1.setText("Esp�cie.:");

        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbEspecie, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCaudaDaPerda, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfOutraCausa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(botao_add_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDestinoPeixePerdido)
                            .addComponent(tfEstimativaDaPerda, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cbCaudaDaPerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfOutraCausa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEstimativaDaPerda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfDestinoPeixePerdido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botao_add_especie)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Action
        String causa_perda;
        if (tfOutraCausa.isEditable()){
             causa_perda = tfOutraCausa.getText();
        }
        else
             causa_perda = cbCaudaDaPerda.getSelectedItem().toString();


         String sqlinsert = "insert into atravessador_addespecie "
                    + "(id_atravessador,especie,causa_da_perda,"
                    + "estimativa_da_perda,destino_do_peixe_perdido) values ('"+
                    idd_atravessador+"','"+
                    cbEspecie.getSelectedItem()+"','"+
                    causa_perda+"',"+
                    tfEstimativaDaPerda.getText()+",'"+
                    tfDestinoPeixePerdido.getText()+"')";

                    System.out.println(sqlinsert);
                    if (conexao.salvar(sqlinsert)){
                        JOptionPane.showMessageDialog(null,"Salvo com sucesso");
                        //limpar();
                    }
                    //agora � hora de atualizar o resultset
                    pescadorAddEspecie.this.dispose();

    }//GEN-LAST:event_Action

    private void cbCaudaDaPerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCaudaDaPerdaActionPerformed
        
    }//GEN-LAST:event_cbCaudaDaPerdaActionPerformed

    private void cbCaudaDaPerdaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCaudaDaPerdaItemStateChanged
        if (cbCaudaDaPerda.getSelectedItem() == "Outro"){
            tfOutraCausa.setEditable(true);
        }
        else
            tfOutraCausa.setEditable(false);
    }//GEN-LAST:event_cbCaudaDaPerdaItemStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new addMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_add_especie;
    private javax.swing.JComboBox cbCaudaDaPerda;
    private javax.swing.JComboBox cbEspecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfDestinoPeixePerdido;
    private javax.swing.JTextField tfEstimativaDaPerda;
    private javax.swing.JTextField tfOutraCausa;
    // End of variables declaration//GEN-END:variables

    public Object registro_q_vai(){
                 if (tfOutraCausa.isEditable()){
                     return tfOutraCausa.getText();
                 }
                 else
                     return cbCaudaDaPerda.getSelectedItem();
         }

}
