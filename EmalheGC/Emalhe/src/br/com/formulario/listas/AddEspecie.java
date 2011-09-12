
package br.com.formulario.listas;

import br.com.conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddEspecie extends javax.swing.JFrame {

    /** Creates new form winProduto */
    private Conexao conexao;

    public AddEspecie() {
        
        initComponents();
        conexao = new Conexao();
        conexao.conecta("emalhe");
    
        //atualiza tabela;
        attjTableEspecie();


    }

 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAddEspecie = new javax.swing.JButton();
        tfEspecie = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEspecie = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btAddEspecie.setText("Add");
        btAddEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Action(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Nova Espécie");

        jLabel1.setText("Espécie.:");

        jTableEspecie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "cod", "Espécie"
            }
        ));
        jScrollPane1.setViewportView(jTableEspecie);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAddEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btExcluir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAddEspecie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Action
       btAdd();
    }//GEN-LAST:event_Action

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       excluirEspecie();
    }//GEN-LAST:event_btExcluirActionPerformed

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
    private javax.swing.JButton btAddEspecie;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEspecie;
    private javax.swing.JTextField tfEspecie;
    // End of variables declaration//GEN-END:variables

    private void btAdd() {
          String sqlinsert = "insert into especie (especie) values ('" +
                              tfEspecie.getText() +"')";

            System.out.println(sqlinsert);
            if (conexao.salvar(sqlinsert)) {
                System.out.println("Espécie Cadastrada");
                attjTableEspecie();
            }

    }

    private void excluirEspecie() {
        String sql;

        sql = "delete from especie "
            + "Where cod_especie = "
            + jTableEspecie.getValueAt(jTableEspecie.getSelectedRow(),0);

            if (conexao.salvar(sql)) {
                System.out.println("Exclusão realizada com sucesso");
                attjTableEspecie();
            }   else
                    JOptionPane.showMessageDialog(null," Erro na exclusão");
    }

    private void attjTableEspecie(){
        conexao.execute("select * from especie");

        jTableEspecie.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableEspecie.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableEspecie.getColumnModel().getColumn(1).setPreferredWidth(10);

        DefaultTableModel modelo = (DefaultTableModel)jTableEspecie.getModel();
        modelo.setNumRows(0);//limpa o JTable;

        try{
            while (conexao.resultSet.next())
                modelo.addRow(new Object[]{conexao.resultSet.getString("cod_especie"),
                                           conexao.resultSet.getString("especie"),
                                          });

            conexao.resultSet.first();

        }catch (SQLException erro){
            System.out.println(erro + " Tabela Especie");
        }

    }


}
