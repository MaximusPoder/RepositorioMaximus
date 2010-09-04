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

import br.com.dao.DAOEmpresaEB;
import br.com.dao.DaoEspecieProcessada;
import br.com.pojo.EmpresaEB;
import br.com.pojo.EspecieProcessada;
import br.com.util.JMoneyField;
import br.com.util.Mensagens;
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
    private List<EmpresaEB> empresasEBs;
    private List<EspecieProcessada> eps;

    /** Creates new form WinEspecieProcessada */
    public WinEspecieProcessada() {
        initComponents();
        init();
        initAction();
        refresh();
    }

    private ActionListener getActionListener() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        };
    }

    private void action(ActionEvent e) {

        String cmd = e.getActionCommand();
if(cbEspecie.getSelectedIndex()>0){
        if (cmd.equalsIgnoreCase("Salvar")) {
            if (ep == null) {
                ep = getEmpresaEspecieProcessadaOfPanel();
                new DaoEspecieProcessada().cadastrar(ep);
            } else {
                ep = getEmpresaEspecieProcessadaOfPanel();
                new DaoEspecieProcessada().atualizar(ep);
            }
        } else if (cmd.equalsIgnoreCase("Excluir")) {
            ep = getEmpresaEspecieProcessadaOfPanel();
            new DaoEspecieProcessada().excluir(ep);
        } 
        ep = null;
        clearTable();
        clearTab(tabEspecieProcessada);
        refresh();
}else Mensagens.showMessageErroPreencherDados();

        
    }

    private void clearTab(JPanel jPanel) {
        MyUtil.FieldsClear(jPanel);
        tfOutro.setEnabled(false);    
        cbProduto.setSelectedIndex(0);
    }

    private void clearTable(JTable table) {
        /*Esvazia Campo*/
        model = (DefaultTableModel) table.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    private EspecieProcessada getEmpresaEspecieProcessadaOfPanel() {


        try {
            String produto;
            if (cbProduto.getSelectedIndex() != 4) {
                produto = cbProduto.getSelectedItem().toString();
            } else {
                produto = tfOutro.getText();
            }
            String quantidadeProduzida = tfQuantidade.getText();
            String precoVenda = tfVenda.getText();
            Integer empresaId = WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId();
            Integer especieId = empresasEBs.get(cbEspecie.getSelectedIndex() - 1).getId();
            String obs = tfObs.getText();
            if (ep != null) {
                ep.setObservacao(obs);
                ep.all(produto, quantidadeProduzida, precoVenda, especieId, empresaId);
                return ep;
            }

            EspecieProcessada ep = new EspecieProcessada();
              ep.setObservacao(obs);
            ep.all(produto, quantidadeProduzida, precoVenda, especieId, empresaId);
            return ep;
        } catch (Exception e) {
            Mensagens.showMessageErroPreencherDados();
        }
        return null;
    }

    private void SetValueComBoBoxProduto(EspecieProcessada ep) {
        if (ep.getProduto().equalsIgnoreCase("Filé Congelado") ||
                ep.getProduto().equalsIgnoreCase("Filé Resfriado") ||
                ep.getProduto().equalsIgnoreCase("Posta") ||
                ep.getProduto().equalsIgnoreCase("Inteiro")) {
            cbProduto.setSelectedItem(ep.getProduto());
        } else {
            cbProduto.setSelectedIndex(4);
            tfOutro.setText(ep.getProduto());
        }
    }

    private void setEspecieProcessadaForPanel(EspecieProcessada ep) {

        SetValueComBoBoxProduto(ep);
        tfQuantidade.setText(ep.getQuantidadeProduzida());
        tfVenda.setText(ep.getPrecoVenda());
        tfObs.setText(ep.getObservacao());

    }

    private EspecieProcessada getEspecieProcessadaOfTable() {

        EspecieProcessada ep = eps.get(tableEspecieProcessada.getSelectedRow());
        SetValueComBoBoxProduto(ep);
        tfQuantidade.setText(ep.getQuantidadeProduzida());
        tfVenda.setText(ep.getPrecoVenda());
        tfObs.setText(ep.getObservacao());
        return ep;
    }

    private void refresh() {
        if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
            empresasEBs = new DAOEmpresaEB().getListWithQuery("select * from" +
                    " EmpresaEB where empresaId = " +
                    WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
            MyUtil.refresComboBox(empresasEBs, cbEspecie);
            if (!empresasEBs.isEmpty()) {//Especie for nao nullo
                refreshEspecieProcessada();
            } else {
            }
        }
    }

    private void initAction() {


        cbEspecie.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbEspecie.getSelectedIndex() > 0) {
                        clearTable();
                        refreshEspecieProcessada();
                    }else
                    {
                         clearTable();
                          clearTab(tabEspecieProcessada);
                         ep = null;
                    }
                }
            }
        });
        cbProduto.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {

                    if (cbProduto.getSelectedIndex() == 4) {
                        tfOutro.setEnabled(true);
                    } else {
                        tfOutro.setEnabled(false);
                    }
                }
            }
        });
        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clearTab(tabEspecieProcessada);
                ep = null;
            }
        });
        btCadastrar.addActionListener(getActionListener());
//      btAtualizarEspecieProcessada.addActionListener(getActionListenerEspecieProcessada());
        btExcluir.addActionListener(getActionListener());
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
            if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0 &&
                    cbEspecie.getSelectedIndex() > 0) {
                eps = new DaoEspecieProcessada().getListWithQuery("select * from " +
                        "EspecieProcessada where empresaId = " +
                        WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId() +
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
                "R$ " + ToMoney.StringtoMoney(e.getPrecoVenda()),e.getObservacao()};

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
        btCadastrar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        cbEspecie = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEspecieProcessada = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tfOutro = new javax.swing.JTextField();
        tfVenda = new JMoneyField();
        cbProduto = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfObs = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 1300));

        panelCrudEmpresa2.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Salvar");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btExcluir.setText("Excluir");

        btNovo.setText("Novo");

        jLabel23.setText("Espécie");

        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel19.setText("Espécies Processadas Pela Empresa");

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
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addGap(160, 160, 160)
                                .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel19)))
                            .addComponent(jLabel48))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        panelCrudEmpresa2Layout.setVerticalGroup(
            panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel48)
                        .addComponent(jLabel18))
                    .addComponent(jLabel19))
                .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btNovo)
                            .addComponent(btExcluir))
                        .addContainerGap())
                    .addGroup(panelCrudEmpresa2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelCrudEmpresa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jLabel24.setText("Produto");

        tableEspecieProcessada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço de Venda (R$)", "Observacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableEspecieProcessada);

        jLabel26.setText("Preço de Venda");

        jLabel27.setText("Quantidade (%)");

        tfOutro.setEnabled(false);

        cbProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filé Congelado", "Filé Resfriado", "Posta", "Inteiro", "Outros" }));

        jLabel1.setText("Outros");

        jScrollPane3.setViewportView(tfObs);

        jLabel2.setText("Observação:");

        javax.swing.GroupLayout tabEspecieProcessadaLayout = new javax.swing.GroupLayout(tabEspecieProcessada);
        tabEspecieProcessada.setLayout(tabEspecieProcessadaLayout);
        tabEspecieProcessadaLayout.setHorizontalGroup(
            tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfQuantidade))
                            .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addComponent(panelCrudEmpresa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabEspecieProcessadaLayout.setVerticalGroup(
            tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel24)
                    .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tfVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabEspecieProcessadaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(tabEspecieProcessadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabEspecieProcessada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabEspecieProcessada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox cbEspecie;
    private javax.swing.JComboBox cbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelCrudEmpresa2;
    private javax.swing.JPanel tabEspecieProcessada;
    private javax.swing.JTable tableEspecieProcessada;
    private javax.swing.JTextPane tfObs;
    private javax.swing.JTextField tfOutro;
    private javax.swing.JTextField tfQuantidade;
    public static javax.swing.JTextField tfVenda;
    // End of variables declaration//GEN-END:variables

    private void init() {
        empresasEBs = new ArrayList<EmpresaEB>();
        MyUtil.refresComboBox(empresasEBs, cbEspecie);
    }

    private void clearTable() {
        model = (DefaultTableModel) tableEspecieProcessada.getModel();
        tableEspecieProcessada.clearSelection();
        clearTable(tableEspecieProcessada);
    }
}
