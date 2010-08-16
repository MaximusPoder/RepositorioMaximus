/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinEmpresaMercado.java
 *
 * Created on 09/08/2010, 14:05:32
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOEmpresaMercado;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaMercado;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinEmpresaMercado extends javax.swing.JPanel {

    /** Creates new form WinEmpresaMercado */
    private DefaultTableModel model;
    
    private List<EmpresaMercado> edfs;
    private EmpresaMercado edf;

    public WinEmpresaMercado() {
        initComponents();
        
        initAction();
        refresh();
    }

    private void initAction() {

        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clear();
                edf = null;
                
            }
        });
        btCadastrar.addActionListener(getActionListener());
        // btAtualizar.addActionListener(getActionListener());
        btExcluir.addActionListener(getActionListener());
        table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                edf = getEDFofTable();

            }
        });
        WinSelecionaEmpresa.cbEmpresa.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
                        refresh();
                    } else {
                        clear();
                        edf = null;
                    }
                }
            }
        });


    }

    private void refresh() {
        if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
            edfs = new ArrayList<EmpresaMercado>();
            edfs = new DAOEmpresaMercado().getListWithQuery("select * from " +
                    "EmpresaMercado where empresaId = " +
                    WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());

            refreshTable(edfs);
        } else {
            clear();
        }
    }

    private void refreshTable(List<EmpresaMercado> list) {

        model = (DefaultTableModel) table.getModel();
        table.clearSelection();
        MyUtil.clearTable(table);
        for (int i = 0; i < list.size(); i++) {
            EmpresaMercado e = list.get(i);
            Object[] objeto = {e.getMercado(), e.getEspecie(),
                e.getProduto(), e.getDestino(), e.getVolume(), "R$ " + ToMoney.StringtoMoney(e.getValor())};
            model.addRow(objeto);
        }
    }

    private EmpresaMercado getEDFofPanel() {

        if (edf != null) {
            edf.setMercado(cbMercado.getSelectedItem().toString());
            edf.setEspecie(tfEspecie.getText());
            edf.setProduto(tfProduto.getText());
            edf.setDestino(tfDestino.getText());
            edf.setVolume(tfVolume.getText());
            edf.setValor(tfValor.getText());
            return edf;
        }
        EmpresaMercado edf = new EmpresaMercado();

        edf.setMercado(cbMercado.getSelectedItem().toString());
        edf.setEspecie(tfEspecie.getText());
        edf.setProduto(tfProduto.getText());
        edf.setDestino(tfDestino.getText());
        edf.setVolume(tfVolume.getText());
        edf.setValor(tfValor.getText());
        edf.setEmpresaId(WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
        return edf;
    }

    private EmpresaMercado getEDFofTable() {

        EmpresaMercado e = edfs.get(table.getSelectedRow());
        cbMercado.setSelectedItem(e.getMercado());
        tfEspecie.setText(e.getEspecie());
        tfProduto.setText(e.getProduto());
        tfDestino.setText(e.getDestino());
        tfVolume.setText(e.getVolume());
        tfValor.setText(e.getVolume());

        return e;
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

        if (cmd.equalsIgnoreCase("Cadastrar")) {
            edf = getEDFofPanel();
            new DAOEmpresaMercado().cadastrar(edf);
        } else if (cmd.equalsIgnoreCase("Excluir")) {
            edf = getEDFofPanel();
            new DAOEmpresaMercado().excluir(edf);
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            edf = getEDFofPanel();
            new DAOEmpresaMercado().atualizar(edf);
        }
        refresh();
        clear();
        edf = null;
    }

    private void clear() {
        MyUtil.FieldsClear(this);
       
     //   MyUtil.limpaTabela(table);

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
        panelCrudEmpresa1 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tfEspecie = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tfDestino = new javax.swing.JTextField();
        tfProduto = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        cbMercado = new javax.swing.JComboBox();
        jLabel68 = new javax.swing.JLabel();
        tfVolume = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        tfValor = new JMoneyField();

        setPreferredSize(new java.awt.Dimension(900, 1700));

        panelCrudEmpresa1.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Cadastrar");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btExcluir.setText("Excluir");

        btNovo.setText("Novo");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel13.setText("Mercado");

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
                                .addGap(61, 61, 61)
                                .addComponent(jLabel47))))
                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir))
                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel13)))
                .addContainerGap(484, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btCadastrar)
                    .addComponent(btExcluir))
                .addGap(21, 21, 21))
        );

        jLabel64.setText("Mercado");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mercado", "Espécie", "Produto", "Destino", "Volume", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(table);

        jLabel65.setText("Espécie");

        jLabel67.setText("Destino");

        jLabel66.setText("Produto");

        cbMercado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mercado Local", "Mercado Estadual", "Mercado Nacional", "Mercado Internacional" }));

        jLabel68.setText("Valor");

        jLabel69.setText("Volume");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel64))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMercado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel69)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(panelCrudEmpresa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(cbMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(tfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67)))
                            .addComponent(jLabel66)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68)))
                            .addComponent(jLabel69))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
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
                .addContainerGap(1170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox cbMercado;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JPanel panelCrudEmpresa1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextField tfEspecie;
    private javax.swing.JTextField tfProduto;
    public static javax.swing.JTextField tfValor;
    private javax.swing.JTextField tfVolume;
    // End of variables declaration//GEN-END:variables
}
