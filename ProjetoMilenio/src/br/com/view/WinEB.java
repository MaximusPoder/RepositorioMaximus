package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOEmpresaEB;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaEB;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinEB extends javax.swing.JPanel {

    private EmpresaEB empresaEB;
    private DefaultTableModel model;
    private List<Empresa> empresas;
    private List<EmpresaEB> empresasEBs;

    public WinEB() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresa);
        initAction();
    }

    private void initAction() {
        btNovoEB.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                MyUtil.FieldsClear(tabEspecieBeneficiada);

                empresaEB = null;
            }
        });
        btCadastrarEB.addActionListener(getActionListener());
        btAtualizarEB.addActionListener(getActionListener());
        btExcluirEB.addActionListener(getActionListener());
        tableEB.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                empresaEB = getEmpresaEBOfTable();
            }
        });
        cbEmpresa.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    refreshEB();
                }
            }
        });
    }

    private ActionListener getActionListener() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        };
    }

    private EmpresaEB getEmpresaEBOfTable() {

        EmpresaEB b = empresasEBs.get(tableEB.getSelectedRow());
        tfEspecie.setText(b.getEspecie());
        tfApetrecho.setText(b.getApetrecho());
        tfEpocaAno.setText(b.getEpocaAno());
        tfTerceiro.setText(b.getTerceiro());
        return b;
    }

    private void action(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cbEmpresa.getSelectedIndex() > 0) {
            if (cmd.equalsIgnoreCase("Cadastrar")) {
                if (empresaEB == null) {
                    empresaEB = getEmpresaEBOfPanel();
                    new DAOEmpresaEB().cadastrar(empresaEB);
                } else {
                    Mensagens.showMessageNaoCadastrar();
                }
            } else if (cmd.equalsIgnoreCase("Excluir")) {
                empresaEB = getEmpresaEBOfPanel();
                new DAOEmpresaEB().excluir(empresaEB);
            } else if (cmd.equalsIgnoreCase("Atualizar")) {
                empresaEB = getEmpresaEBOfPanel();
                new DAOEmpresaEB().atualizar(empresaEB);
            }
            refreshEB();
            MyUtil.FieldsClear(tabEspecieBeneficiada);
            cbEmpresa.setSelectedIndex(0);
            empresaEB = null;
        }
    }

    private void clearTable(JTable table) {
        /*Esvazia Campo*/
        model = (DefaultTableModel) table.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    private EmpresaEB getEmpresaEBOfPanel() {


        try {
            String especie = tfEspecie.getText();
            String apetrecho = tfApetrecho.getText();
            String terceiro = tfTerceiro.getText();
            String epocaAno = tfEpocaAno.getText();

            if (empresaEB != null) {
                empresaEB.all(especie, terceiro, apetrecho, epocaAno, empresaEB.getEmpresaId());
                return empresaEB;
            }

            EmpresaEB b = new EmpresaEB();
            b.all(especie, terceiro, apetrecho, epocaAno,
                    empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
            return b;

        } catch (Exception e) {
            Mensagens.showMessageErroPreencherDados();
        }
        return null;
    }

    private void refreshTableEB(List<EmpresaEB> list) {

        model = (DefaultTableModel) tableEB.getModel();
        tableEB.clearSelection();
        clearTable(tableEB);
        for (int i = 0; i < list.size(); i++) {
            EmpresaEB e = list.get(i);
            Object[] objeto = {e.getEspecie(),
                e.getTerceiro(), e.getApetrecho(), e.getEpocaAno()};

            model.addRow(objeto);
        }
    }

    private void refreshEB() {
        empresasEBs = new ArrayList<EmpresaEB>();
        if (cbEmpresa.getSelectedIndex() > 0) {
            empresasEBs = new DAOEmpresaEB().getListWithQuery("select * from " +
                    "EmpresaEB where empresaId = " +
                    empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
        }
        refreshTableEB(empresasEBs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabEspecieBeneficiada = new javax.swing.JPanel();
        panelCrudEmpresa1 = new javax.swing.JPanel();
        btCadastrarEB = new javax.swing.JButton();
        btAtualizarEB = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btExcluirEB = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btNovoEB = new javax.swing.JButton();
        cbEmpresa = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEB = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfEspecie = new javax.swing.JTextField();
        tfApetrecho = new javax.swing.JTextField();
        tfTerceiro = new javax.swing.JTextField();
        tfEpocaAno = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(900, 1300));

        panelCrudEmpresa1.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarEB.setText("Cadastrar");
        btCadastrarEB.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarEB.setFocusable(false);
        btCadastrarEB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarEB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizarEB.setText("Atualizar");
        btAtualizarEB.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btExcluirEB.setText("Excluir");

        btNovoEB.setText("Novo");

        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setText("Empresa");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel18.setText(" Produtos e Custos");

        javax.swing.GroupLayout panelCrudEmpresa1Layout = new javax.swing.GroupLayout(panelCrudEmpresa1);
        panelCrudEmpresa1.setLayout(panelCrudEmpresa1Layout);
        panelCrudEmpresa1Layout.setHorizontalGroup(
            panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel20)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel12))
                            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel47))))
                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btNovoEB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCadastrarEB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizarEB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluirEB)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel17)
                        .addGap(26, 26, 26)
                        .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel18)))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        panelCrudEmpresa1Layout.setVerticalGroup(
            panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel47)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirEB)
                    .addComponent(btAtualizarEB)
                    .addComponent(btCadastrarEB)
                    .addComponent(btNovoEB)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        tableEB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Espécie", "Próprio/Terceiro", "Apetrecho", "Época do Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEB);

        jLabel13.setText("Próprio/Terceiro");

        jLabel14.setText("Especie");

        jLabel15.setText("Apetrecho");

        jLabel16.setText("Época do Ano");

        javax.swing.GroupLayout tabEspecieBeneficiadaLayout = new javax.swing.GroupLayout(tabEspecieBeneficiada);
        tabEspecieBeneficiada.setLayout(tabEspecieBeneficiadaLayout);
        tabEspecieBeneficiadaLayout.setHorizontalGroup(
            tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEspecieBeneficiadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
            .addGroup(tabEspecieBeneficiadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApetrecho, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addGroup(tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tabEspecieBeneficiadaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabEspecieBeneficiadaLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(tfEpocaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(620, Short.MAX_VALUE))
            .addComponent(panelCrudEmpresa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tabEspecieBeneficiadaLayout.setVerticalGroup(
            tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEspecieBeneficiadaLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEspecieBeneficiadaLayout.createSequentialGroup()
                        .addGroup(tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tfApetrecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabEspecieBeneficiadaLayout.createSequentialGroup()
                        .addGroup(tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabEspecieBeneficiadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tfEpocaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1136, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEspecieBeneficiada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEspecieBeneficiada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarEB;
    private javax.swing.JButton btCadastrarEB;
    private javax.swing.JButton btExcluirEB;
    private javax.swing.JButton btNovoEB;
    private javax.swing.JComboBox cbEmpresa;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCrudEmpresa1;
    private javax.swing.JPanel tabEspecieBeneficiada;
    private javax.swing.JTable tableEB;
    private javax.swing.JTextField tfApetrecho;
    private javax.swing.JTextField tfEpocaAno;
    private javax.swing.JTextField tfEspecie;
    private javax.swing.JTextField tfTerceiro;
    // End of variables declaration//GEN-END:variables
}
