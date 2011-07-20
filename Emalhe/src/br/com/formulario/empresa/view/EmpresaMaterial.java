/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmpresaMaterial.java
 *
 * Created on 09/08/2010, 01:33:03
 */
package br.com.formulario.empresa.view;

import br.com.formulario.empresa.dao.DAOEmpresaMaterial;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class EmpresaMaterial extends javax.swing.JPanel {

    /** Creates new form EmpresaMaterial */
  
    private List<br.com.formulario.empresa.pojo.EmpresaMaterial> ems;
    private br.com.formulario.empresa.pojo.EmpresaMaterial em;

    public EmpresaMaterial() {
        initComponents();
        initAction();
        refresh();
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
        panelCrudEmpresa7 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 1700));

        panelCrudEmpresa7.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Cadastrar");
        btCadastrar.setToolTipText("Realiza a Confirma��o do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel12.setText("Gastos com material");

        javax.swing.GroupLayout panelCrudEmpresa7Layout = new javax.swing.GroupLayout(panelCrudEmpresa7);
        panelCrudEmpresa7.setLayout(panelCrudEmpresa7Layout);
        panelCrudEmpresa7Layout.setHorizontalGroup(
            panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel68)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel70))
                            .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel69))))
                    .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir))
                    .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel12)))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        panelCrudEmpresa7Layout.setVerticalGroup(
            panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel69)
                        .addComponent(jLabel70)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btExcluir))
                .addContainerGap())
        );

        jLabel2.setText("Quais s�o os gastos com material utilizado na atividade (Estimar frequencia dos gastos - 1x Por semana, por viagem, por mes)");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Tipo", "Quantidade", "Custo", "Outros", "Frequencia"
            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(286, Short.MAX_VALUE))
            .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1057, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCrudEmpresa7;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void initAction() {

        btCadastrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
                    addMaterial m =
                            new addMaterial(WinSelecionaEmpresa.empresas.
                            get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId(),
                            EmpresaMaterial.class);
                    m.addWindowListener(new WindowAdapter() {

                        @Override
                        public void windowClosed(WindowEvent e) {
                            super.windowClosed(e);
                            refresh();
                     
                        }
                    });
                }

            }
        });
        btExcluir.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new DAOEmpresaMaterial().excluir(getEMofTable());
                refresh();
              
            }
        });      
        table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                em = getEMofTable();

            }
        });
        WinSelecionaEmpresa.cbEmpresa.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
                        refresh();
                    } else {
                        clear();
                        em = null;
                    }
                }
            }
        });
    }

    private void clear() {
        MyUtil.clearTable(table);
         
    }

    private void refresh() {
        ems = new ArrayList<br.com.formulario.empresa.pojo.EmpresaMaterial>();
        ems = new DAOEmpresaMaterial().getListWithQuery("select * from " +
                "EmpresaMaterial where empresaId = " +
                WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
               
        refreshTable(ems);
    }

    private void refreshTable(List<br.com.formulario.empresa.pojo.EmpresaMaterial> list) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.clearSelection();
        MyUtil.clearTable(table);
        for (int i = 0; i < list.size(); i++) {
            br.com.formulario.empresa.pojo.EmpresaMaterial e = list.get(i);
            Object[] objeto = {e.getMaterial(), e.getTipo(), e.getQuantidade(),e.getCusto(),
                 e.getOutros(),
                e.getFrequencia()};
            model.addRow(objeto);
        }
    }

    private br.com.formulario.empresa.pojo.EmpresaMaterial getEMofTable() {
        return ems.get(table.getSelectedRow());
    }
}