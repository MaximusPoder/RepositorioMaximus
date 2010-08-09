/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinImposto.java
 *
 * Created on 08/08/2010, 21:49:22
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOEmpresaImposto;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaImposto;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinImposto extends javax.swing.JPanel {

    private EmpresaImposto empresaImposto;
    private DefaultTableModel model;
    private List<Empresa> empresas;
    private List<EmpresaImposto> empresaImpostos;

    public WinImposto() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresaImposto);
        initAction();
    }

    private EmpresaImposto getEmpresaImpostoOfPanel() {

        String imposto = tfImposto.getText();
        String anterior = tfAnterior.getText();
        String ano = tfAno.getText();
        String anual = tfAtual.getText();

        if (empresaImposto != null) {
            empresaImposto.all(imposto, anterior, anual, ano,
                    empresas.get(cbEmpresaImposto.getSelectedIndex() - 1).getId());
            return empresaImposto;
        }

        EmpresaImposto b = new EmpresaImposto();
        b.all(imposto, anterior, anual, ano,
                empresas.get(cbEmpresaImposto.getSelectedIndex() - 1).getId());
        return b;

    }

    private void clearTable(JTable table) {
        /*Esvazia Campo*/
        model = (DefaultTableModel) table.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    private void actionImposto(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cmd.equalsIgnoreCase("Cadastrar")) {
            empresaImposto = getEmpresaImpostoOfPanel();
            new DAOEmpresaImposto().cadastrar(empresaImposto);
        } else if (cmd.equalsIgnoreCase("Excluir")) {
            empresaImposto = getEmpresaImpostoOfPanel();
            new DAOEmpresaImposto().excluir(empresaImposto);
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            empresaImposto = getEmpresaImpostoOfPanel();
            new DAOEmpresaImposto().atualizar(empresaImposto);
        }
        refreshEmpresaImposto();
        clearTab(tabEmpresaImposto);
        empresaImposto = null;
    }

    private void clearTab(JPanel jPanel) {
        MyUtil.FieldsClear(jPanel);
    }

    private ActionListener getActionListenerEmpresaImposto() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionImposto(e);
            }
        };
    }

    private void initAction() {


        btNovoImposto.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clearTab(tabEmpresaImposto);
                empresaImposto = null;
            }
        });
        btCadastrarImposto.addActionListener(getActionListenerEmpresaImposto());
        btAtualizarImposto.addActionListener(getActionListenerEmpresaImposto());
        btExcluirImposto.addActionListener(getActionListenerEmpresaImposto());
        tableImposto.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                empresaImposto = getEmpresaImpostofTable();
                setEmpresaImpostoOfPanel(empresaImposto);
            }
        });
        cbEmpresaImposto.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbEmpresaImposto.getSelectedIndex() > 0) {
                        refreshEmpresaImposto();
                    } else {
                        clearTable(tableImposto);
                        clearTab(tabEmpresaImposto);
                        empresaImposto = null;
                    }
                }
            }
        });
    }

    private void refreshEmpresaImposto() {
        empresaImpostos = new ArrayList<EmpresaImposto>();
        if (cbEmpresaImposto.getSelectedIndex() > 0) {
            empresaImpostos = new DAOEmpresaImposto().getListWithQuery("select * from " +
                    "EmpresaImposto where empresaId = " +
                    empresas.get(cbEmpresaImposto.getSelectedIndex() - 1).getId());
        }
        refreshTableImposto();
    }

    private void refreshTableImposto() {

        model = (DefaultTableModel) tableImposto.getModel();
        tableImposto.clearSelection();
        clearTable(tableImposto);
        for (int i = 0; i < empresaImpostos.size(); i++) {
            EmpresaImposto e = empresaImpostos.get(i);
            Object[] objeto = {e.getImposto(),
                e.getAnterior(), e.getAtual(), e.getAno()};

            model.addRow(objeto);
        }
    }

    private void setEmpresaImpostoOfPanel(EmpresaImposto e) {
        tfImposto.setText(e.getImposto());
        tfAnterior.setText(e.getAnterior());
        tfAtual.setText(e.getAtual());
        tfAno.setText(e.getAno());
    }

    private EmpresaImposto getEmpresaImpostofTable() {
        return empresaImpostos.get(tableImposto.getSelectedRow());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabEmpresaImposto = new javax.swing.JPanel();
        panelCrudEmpresa6 = new javax.swing.JPanel();
        btCadastrarImposto = new javax.swing.JButton();
        btAtualizarImposto = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        btExcluirImposto = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        btNovoImposto = new javax.swing.JButton();
        cbEmpresaImposto = new javax.swing.JComboBox();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tfImposto = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        tfAnterior = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableImposto = new javax.swing.JTable();
        tfAno = new javax.swing.JTextField();
        tfAtual = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(999, 999));

        panelCrudEmpresa6.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarImposto.setText("Cadastrar");
        btCadastrarImposto.setToolTipText("Realiza a Confirma��o do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarImposto.setFocusable(false);
        btCadastrarImposto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarImposto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizarImposto.setText("Atualizar");
        btAtualizarImposto.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btExcluirImposto.setText("Excluir");

        btNovoImposto.setText("Novo");

        cbEmpresaImposto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel63.setText("Empresa");

        javax.swing.GroupLayout panelCrudEmpresa6Layout = new javax.swing.GroupLayout(panelCrudEmpresa6);
        panelCrudEmpresa6.setLayout(panelCrudEmpresa6Layout);
        panelCrudEmpresa6Layout.setHorizontalGroup(
            panelCrudEmpresa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel60)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel62))
                    .addGroup(panelCrudEmpresa6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelCrudEmpresa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNovoImposto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrarImposto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizarImposto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluirImposto)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel63)
                                .addGap(26, 26, 26)
                                .addComponent(cbEmpresaImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel61))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        panelCrudEmpresa6Layout.setVerticalGroup(
            panelCrudEmpresa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addGroup(panelCrudEmpresa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel61)
                        .addComponent(jLabel62)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirImposto)
                    .addComponent(btAtualizarImposto)
                    .addComponent(btCadastrarImposto)
                    .addComponent(btNovoImposto)
                    .addComponent(cbEmpresaImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel64.setText("Imposto");

        jLabel65.setText("Anterior (%)");

        tableImposto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imposto", "Anterior (%)", "Atual (%)", "A partir de (Ano)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(tableImposto);

        jLabel66.setText("Atual (%)");

        jLabel67.setText("A partir de (Ano)");

        javax.swing.GroupLayout tabEmpresaImpostoLayout = new javax.swing.GroupLayout(tabEmpresaImposto);
        tabEmpresaImposto.setLayout(tabEmpresaImpostoLayout);
        tabEmpresaImpostoLayout.setHorizontalGroup(
            tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEmpresaImpostoLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(233, 233, 233))
            .addGroup(tabEmpresaImpostoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEmpresaImpostoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel64))
                        .addGap(18, 18, 18)
                        .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabEmpresaImpostoLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(tfAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabEmpresaImpostoLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        tabEmpresaImpostoLayout.setVerticalGroup(
            tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEmpresaImpostoLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEmpresaImpostoLayout.createSequentialGroup()
                        .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(tfImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(tfAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabEmpresaImpostoLayout.createSequentialGroup()
                        .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66)
                            .addComponent(tfAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabEmpresaImpostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1128, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEmpresaImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEmpresaImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarImposto;
    private javax.swing.JButton btCadastrarImposto;
    private javax.swing.JButton btExcluirImposto;
    private javax.swing.JButton btNovoImposto;
    private javax.swing.JComboBox cbEmpresaImposto;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JPanel panelCrudEmpresa6;
    private javax.swing.JPanel tabEmpresaImposto;
    private javax.swing.JTable tableImposto;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfAnterior;
    private javax.swing.JTextField tfAtual;
    private javax.swing.JTextField tfImposto;
    // End of variables declaration//GEN-END:variables
}