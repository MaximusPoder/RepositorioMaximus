/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinEspecieProcessada.java
 *
 * Created on 08/08/2010, 21:29:40
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOEmpresaEB;
import br.com.dao.DaoEspecieProcessada;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaEB;
import br.com.pojo.EmpresaProblema;
import br.com.pojo.EspecieProcessada;
import br.com.util.JMoneyField;
import br.com.util.ToMoney;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinEspecieProcessada extends javax.swing.JPanel {

    private EspecieProcessada ep;
    private DefaultTableModel model;
    private List<Empresa> empresas;
    private List<EmpresaEB> empresasEBs;
    private List<EspecieProcessada> eps;

    /** Creates new form WinEspecieProcessada */
    public WinEspecieProcessada() {
        initComponents();
        init();
        initAction();
    }

    private ActionListener getActionListenerEspecieProcessada() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEspecieProcessada(e);
            }
        };
    }

    private void actionEspecieProcessada(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cmd.equalsIgnoreCase("Cadastrar")) {
            ep = getEmpresaEspecieProcessadaOfPanel();
            new DaoEspecieProcessada().cadastrar(ep);
        } else if (cmd.equalsIgnoreCase("Excluir")) {
            ep = getEmpresaEspecieProcessadaOfPanel();
            new DaoEspecieProcessada().excluir(ep);
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            ep = getEmpresaEspecieProcessadaOfPanel();
            new DaoEspecieProcessada().atualizar(ep);
        }
        refreshEspecieProcessada();
        clearTab(tabEspecieProcessada);
        ep = null;
    }

    private void clearTab(JPanel jPanel) {
        MyUtil.FieldsClear(jPanel);
    }

    private void clearTable(JTable table) {
        /*Esvazia Campo*/
        model = (DefaultTableModel) table.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    private EspecieProcessada getEmpresaEspecieProcessadaOfPanel() {

        String produto = cbProduto.getSelectedItem().toString();

        String quantidadeProduzida = tfQuantidade.getText();
        String precoVenda = tfVenda.getText();
        Integer empresaId = empresas.get(cbEmpresaEspecieProcessada.getSelectedIndex() - 1).getId();
        Integer especieId = empresasEBs.get(cbEspecie.getSelectedIndex() - 1).getId();

        if (ep != null) {
            ep.all(produto, quantidadeProduzida, precoVenda, especieId, empresaId);
            return ep;
        }

        EspecieProcessada ep = new EspecieProcessada();
        ep.all(produto, quantidadeProduzida, precoVenda, especieId, empresaId);
        return ep;
    }

    private void setEspecieProcessadaForPanel(EspecieProcessada ep) {

        cbProduto.setSelectedItem(ep.getProduto());
        tfQuantidade.setText(ep.getQuantidadeProduzida());
        tfVenda.setText(ep.getPrecoVenda());

    }

    private EspecieProcessada getEspecieProcessadaOfTable() {
        EspecieProcessada ep = eps.get(tableEspecieProcessada.getSelectedRow());
        cbProduto.setSelectedItem(ep.getProduto());
        tfQuantidade.setText(ep.getQuantidadeProduzida());
        tfVenda.setText(ep.getPrecoVenda());
        return ep;


    }

    private void initAction() {

        cbEmpresaEspecieProcessada.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbEmpresaEspecieProcessada.getSelectedIndex() > 0) {
                        empresasEBs = new DAOEmpresaEB().getListWithQuery("select * from" +
                                " EmpresaEB where empresaId = " +
                                empresas.get(cbEmpresaEspecieProcessada.getSelectedIndex() - 1).getId());
                        MyUtil.refresComboBox(empresasEBs, cbEspecie);
                        if (!empresasEBs.isEmpty()) {//Especie for nao nullo
                            refreshEspecieProcessada();
                        }else clearTable();
                    }

                }
            }
        });
        cbEspecie.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbEspecie.getSelectedIndex() > 0) {
                        clearTable();
                        refreshEspecieProcessada();
                    }
                }
            }
        });
        btNovoEspecieProcessada.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clearTab(tabEspecieProcessada);
                ep = null;
            }
        });
        btCadastrarEspecieProcessada.addActionListener(getActionListenerEspecieProcessada());
        btAtualizarEspecieProcessada.addActionListener(getActionListenerEspecieProcessada());
        btExcluirEspecieProcessada.addActionListener(getActionListenerEspecieProcessada());
        tableEspecieProcessada.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ep = getEspecieProcessadaOfTable();
                setEspecieProcessadaForPanel(ep);
            }
        });
    }

    private void refreshEspecieProcessada() {
        eps = new ArrayList<EspecieProcessada>();
        if (!empresasEBs.isEmpty()) {
            if (cbEmpresaEspecieProcessada.getSelectedIndex() > 0 &&
                    cbEspecie.getSelectedIndex() > 0) {
                eps = new DaoEspecieProcessada().getListWithQuery("select * from " +
                        "EspecieProcessada where empresaId = " +
                        empresas.get(cbEmpresaEspecieProcessada.getSelectedIndex() - 1).getId() +
                        " and especieId = " + empresasEBs.get(cbEspecie.getSelectedIndex() - 1).getId());
            }
        }
        refreshTableEspecieProcessada(eps);
    }

    private void refreshTableEspecieProcessada(List<EspecieProcessada> list) {

        clearTable();
        for (int i = 0; i < list.size(); i++) {
            EspecieProcessada e = list.get(i);
            Object[] objeto = {e.getProduto(),
                e.getQuantidadeProduzida(),
                "R$ " + ToMoney.StringtoMoney(e.getPrecoVenda())};

            model.addRow(objeto);
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

        tabEspecieProcessada = new javax.swing.JPanel();
        panelCrudEmpresa2 = new javax.swing.JPanel();
        btCadastrarEspecieProcessada = new javax.swing.JButton();
        btAtualizarEspecieProcessada = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        btExcluirEspecieProcessada = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btNovoEspecieProcessada = new javax.swing.JButton();
        cbEmpresaEspecieProcessada = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cbEspecie = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEspecieProcessada = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        tfVenda = new JMoneyField();
        cbProduto = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(900, 1300));

        panelCrudEmpresa2.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarEspecieProcessada.setText("Cadastrar");
        btCadastrarEspecieProcessada.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarEspecieProcessada.setFocusable(false);
        btCadastrarEspecieProcessada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarEspecieProcessada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizarEspecieProcessada.setText("Atualizar");
        btAtualizarEspecieProcessada.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btExcluirEspecieProcessada.setText("Excluir");

        btNovoEspecieProcessada.setText("Novo");

        cbEmpresaEspecieProcessada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setText("Empresa");

        jLabel23.setText("Espécie");

        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelCrudEmpresa2Layout = new javax.swing.GroupLayout(panelCrudEmpresa2);
        panelCrudEmpresa2.setLayout(panelCrudEmpresa2Layout);
        panelCrudEmpresa2Layout.setHorizontalGroup(
            panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel21)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel18))
                    .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNovoEspecieProcessada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrarEspecieProcessada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizarEspecieProcessada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluirEspecieProcessada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEmpresaEspecieProcessada, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        panelCrudEmpresa2Layout.setVerticalGroup(
            panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel48)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirEspecieProcessada)
                    .addComponent(btAtualizarEspecieProcessada)
                    .addComponent(btCadastrarEspecieProcessada)
                    .addComponent(btNovoEspecieProcessada)
                    .addComponent(jLabel22)
                    .addComponent(cbEmpresaEspecieProcessada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setText("Produto");

        tableEspecieProcessada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço de Venda (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableEspecieProcessada);

        jLabel26.setText("Preço de Venda");

        jLabel27.setText("Quantidade (%)");

        cbProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filé Congelado", "Filé Resfriado", "Posta", "Inteiro", "Outros" }));

        javax.swing.GroupLayout tabEspecieProcessadaLayout = new javax.swing.GroupLayout(tabEspecieProcessada);
        tabEspecieProcessada.setLayout(tabEspecieProcessadaLayout);
        tabEspecieProcessadaLayout.setHorizontalGroup(
            tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrudEmpresa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        tabEspecieProcessadaLayout.setVerticalGroup(
            tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tfVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(tabEspecieProcessada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEspecieProcessada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarEspecieProcessada;
    private javax.swing.JButton btCadastrarEspecieProcessada;
    private javax.swing.JButton btExcluirEspecieProcessada;
    private javax.swing.JButton btNovoEspecieProcessada;
    private javax.swing.JComboBox cbEmpresaEspecieProcessada;
    private javax.swing.JComboBox cbEspecie;
    private javax.swing.JComboBox cbProduto;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCrudEmpresa2;
    private javax.swing.JPanel tabEspecieProcessada;
    private javax.swing.JTable tableEspecieProcessada;
    private javax.swing.JTextField tfQuantidade;
    public static javax.swing.JTextField tfVenda;
    // End of variables declaration//GEN-END:variables

    private void init() {
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresaEspecieProcessada);
        empresasEBs = new ArrayList<EmpresaEB>();
        MyUtil.refresComboBox(empresasEBs, cbEspecie);
    }

    private void clearTable() {
         model = (DefaultTableModel) tableEspecieProcessada.getModel();
        tableEspecieProcessada.clearSelection();
        clearTable(tableEspecieProcessada);
    }
}
