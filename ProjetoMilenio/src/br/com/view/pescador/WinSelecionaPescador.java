/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinSelecionaPescador.java
 *
 * Created on 16/08/2010, 12:43:46
 */
package br.com.view.pescador;

import br.com.dao.DAOPescador;
import br.com.pojo.Pescador;
import br.com.util.MyUtil;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Elton
 */
public class WinSelecionaPescador extends javax.swing.JPanel {

    protected static List<Pescador> pescadors;


    /** Creates new form WinSelecionaPescador */
    public WinSelecionaPescador() {
       
        initComponents();
        pescadors = new DAOPescador().getListWithQuery("select * from Pescador");
        
        MyUtil.refresComboBox(pescadors, cbPescador);
        initiAction();
        cbPescador.setSelectedIndex(0);
        WinQuestionarioPescador.btProximo.setEnabled(false);
    }
     

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCrudEmpresa3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1033, 807));

        panelCrudEmpresa3.setBackground(new java.awt.Color(255, 255, 255));

        cbPescador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("Pescador");

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel36.setText("Selecione o Pescador");

        javax.swing.GroupLayout panelCrudEmpresa3Layout = new javax.swing.GroupLayout(panelCrudEmpresa3);
        panelCrudEmpresa3.setLayout(panelCrudEmpresa3Layout);
        panelCrudEmpresa3Layout.setHorizontalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel22)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel14))
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel49))))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel19)
                        .addGap(26, 26, 26)
                        .addComponent(cbPescador, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel36)))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        panelCrudEmpresa3Layout.setVerticalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel49)
                        .addComponent(jLabel14)))
                .addGap(94, 94, 94)
                .addComponent(jLabel36)
                .addGap(57, 57, 57)
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPescador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static final javax.swing.JComboBox cbPescador = new javax.swing.JComboBox();
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel panelCrudEmpresa3;
    // End of variables declaration//GEN-END:variables

    private void initiAction() {
       cbPescador.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if(e.SELECTED == ItemEvent.SELECTED)
                {
                    if(cbPescador.getSelectedIndex() == 0)
                    {
                        WinQuestionarioPescador.btProximo.setEnabled(false);
                    }else
                    {

                        WinQuestionarioPescador.btProximo.setEnabled(true);
                    }
                }
            }
        });
    }
}
