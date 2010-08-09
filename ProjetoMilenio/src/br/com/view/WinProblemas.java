/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinProblemas.java
 *
 * Created on 08/08/2010, 21:39:40
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOEmpresaProblema;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaEB;
import br.com.pojo.EmpresaProblema;
import br.com.pojo.EspecieProcessada;
import br.com.util.MyUtil;
import java.awt.Component;
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
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinProblemas extends javax.swing.JPanel {

    
    private EmpresaProblema empresaProblema;
    private DefaultTableModel model;
    private List<Empresa> empresas;   
    private List<EmpresaProblema> empresaProblemas;
  

    public WinProblemas() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresaProblema);
        initiActionCmd(tabEmpresaProblema);
        initAction();

    }

    private void initiActionCmd(JPanel obj) {

        for (int i = 0; i < obj.getComponentCount(); i++) {
            Component comps[] = obj.getComponents();
            if (comps[i] instanceof JRadioButton) {
                final JRadioButton radioButton = (JRadioButton) comps[i];
                radioButton.setActionCommand(radioButton.getText());
            }
        }
    }

    private void initAction() {

        btNovoEmpresaProblema.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clearTab(tabEmpresaProblema);
                bgEmpresaProblemas.clearSelection();
                empresaProblema = null;
            }
        });
        btCadastrarEmpresaProblema.addActionListener(getActionListenerEmpresaProblema());
        btAtualizarEmpresaProblema.addActionListener(getActionListenerEmpresaProblema());
        btExcluirEmpresaProblema.addActionListener(getActionListenerEmpresaProblema());
        tableProblemas.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clearTab(tabEmpresaProblema);
                bgEmpresaProblemas.clearSelection();
                empresaProblema = null;
                setEmpresaProblemaOfTable();
            }
        });
        cbEmpresaProblema.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if(cbEmpresaProblema.getSelectedIndex()>0)
                    {
                        refreshEmpresaProblema();
                    }else
                    {
                         clearTab(tabEmpresaProblema);
                          clearTable(tableProblemas);
                bgEmpresaProblemas.clearSelection();
                empresaProblema = null;
                    }
                }
            }
        });
    }

    private void refresComboBox(List list, JComboBox cb) {

        cb.removeAllItems();
        for (Object object : list) {
            cb.addItem(object);
        }
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


    /*Metodos Actions do 5° Tab = Empresas problemas*/
    private ActionListener getActionListenerEmpresaProblema() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaProblema(e);
            }
        };
    }

    private void actionEmpresaProblema(ActionEvent e) {

        String cmd = e.getActionCommand();
        if (cmd.equalsIgnoreCase("Cadastrar")) {
            empresaProblema = getEmpresaProblemaOfTable();
            new DAOEmpresaProblema().cadastrar(empresaProblema);
        } else if (cmd.equalsIgnoreCase("Excluir")) {
            empresaProblema = getEmpresaProblemaOfTable();
            new DAOEmpresaProblema().excluir(empresaProblema);
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            empresaProblema = getEmpresaProblemaOfTable();
            new DAOEmpresaProblema().atualizar(empresaProblema);
        }
        refreshEmpresaProblema();
        bgEmpresaProblemas.clearSelection();
        clearTab(tabEmpresaProblema);
        empresaProblema = null;

    }

    private EmpresaProblema getEmpresaProblemaOfTable() {


        EmpresaProblema ep = new EmpresaProblema();
        String problema = bgEmpresaProblemas.getSelection().getActionCommand();
        String tipo;
        String obs;
        if (problema.equals("Transporte")) {
            tipo = cbTransporte.getSelectedItem().toString();
            obs = tfTransporte.getText();
        } else if (problema.equals("Financiamento")) {
            tipo = cbFinanciamento.getSelectedItem().toString();
            obs = tfFinanciamento.getText();
        } else if (problema.equals("Produção")) {
            tipo = cbProducao.getSelectedItem().toString();
            obs = tfProducao.getText();
        } else {
            tipo = cbQualificacao.getSelectedItem().toString();
            obs = tfQualificacao.getText();
        }

        if (this.empresaProblema != null) {
            empresaProblema.all(problema, tipo, obs,
                    empresas.get(cbEmpresaProblema.getSelectedIndex()).getId());
            return empresaProblema;
        }
        ep.all(problema, tipo, obs,
                empresas.get(cbEmpresaProblema.getSelectedIndex()).getId());
        return ep;
    }

    private void setEmpresaProblemaOfTable() {
        empresaProblema = empresaProblemas.get(tableProblemas.getSelectedRow());

        MyUtil.setSelected(empresaProblema.getProblema(), bgEmpresaProblemas);
        if (empresaProblema.getProblema().equals("Transporte")) {
            cbTransporte.setSelectedItem(empresaProblema.getTipo());
            tfTransporte.setText(empresaProblema.getObs());
        } else if (empresaProblema.getProblema().equals("Financiamento")) {
            cbFinanciamento.setSelectedItem(empresaProblema.getTipo());
            tfFinanciamento.setText(empresaProblema.getObs());
        } else if (empresaProblema.getProblema().equals("Produção")) {
            cbProducao.setSelectedItem(empresaProblema.getTipo());
            tfProducao.setText(empresaProblema.getObs());
        } else {
            cbQualificacao.setSelectedItem(empresaProblema.getTipo());
            tfQualificacao.setText(empresaProblema.getObs());
        }

    }

    private void refreshEmpresaProblema() {
        empresaProblemas = new ArrayList<EmpresaProblema>();
        if (cbEmpresaProblema.getSelectedIndex() > 0) {
            empresaProblemas = new DAOEmpresaProblema().getListWithQuery("select * from " +
                    "EmpresaProblema where empresaId = " +
                    empresas.get(cbEmpresaProblema.getSelectedIndex()-1).getId());
        }
        refreshTableEmpresaProblema(empresaProblemas);

    }

    private void refreshTableEmpresaProblema(List<EmpresaProblema> list) {
        model = (DefaultTableModel) tableProblemas.getModel();
        tableProblemas.clearSelection();
        clearTable(tableProblemas);
        for (int i = 0; i < list.size(); i++) {
            EmpresaProblema e = list.get(i);
            Object[] objeto = {e.getProblema(),
                e.getTipo(), e.getObs()};

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

        bgEmpresaProblemas = new javax.swing.ButtonGroup();
        tabEmpresaProblema = new javax.swing.JPanel();
        panelCrudEmpresa4 = new javax.swing.JPanel();
        btCadastrarEmpresaProblema = new javax.swing.JButton();
        btAtualizarEmpresaProblema = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        btExcluirEmpresaProblema = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        btNovoEmpresaProblema = new javax.swing.JButton();
        cbEmpresaProblema = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        cbTransporte = new javax.swing.JComboBox();
        cbQualificacao = new javax.swing.JComboBox();
        cbProducao = new javax.swing.JComboBox();
        cbFinanciamento = new javax.swing.JComboBox();
        tfTransporte = new javax.swing.JTextField();
        rbTransporte = new javax.swing.JRadioButton();
        rbFinanciamento = new javax.swing.JRadioButton();
        rbQualificacao = new javax.swing.JRadioButton();
        rbProducao = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tfFinanciamento = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        tfQualificacao = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        tfProducao = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableProblemas = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(999, 999));

        panelCrudEmpresa4.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarEmpresaProblema.setText("Cadastrar");
        btCadastrarEmpresaProblema.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarEmpresaProblema.setFocusable(false);
        btCadastrarEmpresaProblema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarEmpresaProblema.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizarEmpresaProblema.setText("Atualizar");
        btAtualizarEmpresaProblema.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btExcluirEmpresaProblema.setText("Excluir");

        btNovoEmpresaProblema.setText("Novo");

        cbEmpresaProblema.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel38.setText("Empresa");

        javax.swing.GroupLayout panelCrudEmpresa4Layout = new javax.swing.GroupLayout(panelCrudEmpresa4);
        panelCrudEmpresa4.setLayout(panelCrudEmpresa4Layout);
        panelCrudEmpresa4Layout.setHorizontalGroup(
            panelCrudEmpresa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel36)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel37))
                    .addGroup(panelCrudEmpresa4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelCrudEmpresa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNovoEmpresaProblema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrarEmpresaProblema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizarEmpresaProblema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluirEmpresaProblema)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel38)
                                .addGap(26, 26, 26)
                                .addComponent(cbEmpresaProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel50))))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        panelCrudEmpresa4Layout.setVerticalGroup(
            panelCrudEmpresa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(panelCrudEmpresa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel50)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirEmpresaProblema)
                    .addComponent(btAtualizarEmpresaProblema)
                    .addComponent(btCadastrarEmpresaProblema)
                    .addComponent(btNovoEmpresaProblema)
                    .addComponent(cbEmpresaProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbTransporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Transporte Estadual", "Transporte Federal", "Transporte Aéreo", "Outros" }));

        cbQualificacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Produção", "Administração", "Outro" }));

        cbProducao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regulamentação", "Problemas Climáticos", "Problemas bacteriológicos", "Outros" }));

        cbFinanciamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Captital de Giro", "Capital Fixo", "Nos Critérios Adequados (excesso de exigências)", "Burocrácia", "Outros" }));

        bgEmpresaProblemas.add(rbTransporte);
        rbTransporte.setText("Transporte");

        bgEmpresaProblemas.add(rbFinanciamento);
        rbFinanciamento.setText("Financiamento");

        bgEmpresaProblemas.add(rbQualificacao);
        rbQualificacao.setText("Qualificação da Mão de Obra");

        bgEmpresaProblemas.add(rbProducao);
        rbProducao.setText("Produção");

        jLabel39.setText("Quais os Custos ?");

        jLabel40.setText("Quais os Custos ?");

        jLabel41.setText("Quais os Custos ?");

        jLabel42.setText("Quais os Custos ?");

        tableProblemas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Problema", "Tipo", "Quais os Custos ?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tableProblemas);

        javax.swing.GroupLayout tabEmpresaProblemaLayout = new javax.swing.GroupLayout(tabEmpresaProblema);
        tabEmpresaProblema.setLayout(tabEmpresaProblemaLayout);
        tabEmpresaProblemaLayout.setHorizontalGroup(
            tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrudEmpresa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                        .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTransporte)
                            .addComponent(rbProducao)
                            .addComponent(rbQualificacao)
                            .addComponent(rbFinanciamento))
                        .addGap(28, 28, 28)
                        .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbQualificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbProducao, 0, 152, Short.MAX_VALUE)
                            .addComponent(cbFinanciamento, 0, 141, Short.MAX_VALUE)
                            .addComponent(cbTransporte, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfQualificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfFinanciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(104, 104, 104))
        );
        tabEmpresaProblemaLayout.setVerticalGroup(
            tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbFinanciamento)
                            .addComponent(cbFinanciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbQualificacao)
                            .addComponent(cbQualificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabEmpresaProblemaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbTransporte)
                            .addComponent(cbTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(tfTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(tfFinanciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addComponent(tfQualificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(tabEmpresaProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbProducao)
                    .addComponent(cbProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(tfProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1164, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1128, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEmpresaProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEmpresaProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEmpresaProblemas;
    private javax.swing.JButton btAtualizarEmpresaProblema;
    private javax.swing.JButton btCadastrarEmpresaProblema;
    private javax.swing.JButton btExcluirEmpresaProblema;
    private javax.swing.JButton btNovoEmpresaProblema;
    private javax.swing.JComboBox cbEmpresaProblema;
    private javax.swing.JComboBox cbFinanciamento;
    private javax.swing.JComboBox cbProducao;
    private javax.swing.JComboBox cbQualificacao;
    private javax.swing.JComboBox cbTransporte;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panelCrudEmpresa4;
    private javax.swing.JRadioButton rbFinanciamento;
    private javax.swing.JRadioButton rbProducao;
    private javax.swing.JRadioButton rbQualificacao;
    private javax.swing.JRadioButton rbTransporte;
    private javax.swing.JPanel tabEmpresaProblema;
    private javax.swing.JTable tableProblemas;
    private javax.swing.JTextField tfFinanciamento;
    private javax.swing.JTextField tfProducao;
    private javax.swing.JTextField tfQualificacao;
    private javax.swing.JTextField tfTransporte;
    // End of variables declaration//GEN-END:variables
}
