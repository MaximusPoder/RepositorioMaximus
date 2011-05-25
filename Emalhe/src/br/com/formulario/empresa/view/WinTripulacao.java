/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinTripulacao.java
 *
 * Created on 09/08/2010, 10:02:26
 */
package br.com.formulario.empresa.view;

import br.com.formulario.empresa.dao.DAOTripulacao;
import br.com.formulario.empresa.pojo.EmpresaTripulacao;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinTripulacao extends javax.swing.JPanel {

    /** Creates new form WinTripulacao */
    private DefaultTableModel model;
    private List<EmpresaTripulacao> edfs;
    private EmpresaTripulacao edf;

    public WinTripulacao() {
        initComponents();

        initAction();
        MyUtil.initiActionCmd(this);
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
            edfs = new ArrayList<EmpresaTripulacao>();
            edfs = new DAOTripulacao().getListWithQuery("select * from " +
                    "EmpresaTripulacao where empresaId = " +
                    WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());

            refreshTable(edfs);
          
        } else {
            clear();
        }
    }

    private void refreshTable(List<EmpresaTripulacao> list) {

        model = (DefaultTableModel) table.getModel();
        table.clearSelection();
        MyUtil.clearTable(table);
        for (int i = 0; i < list.size(); i++) {
            EmpresaTripulacao e = list.get(i);
            Object[] objeto = {e.getRelacaoTrabalho(),e.getFrotaEspecie(), e.getFuncao(),
                e.getNumero(), "R$ " + ToMoney.StringtoMoney(e.getSalario()), "R$ " + ToMoney.StringtoMoney(e.getCusto()),
                "R$ " + ToMoney.StringtoMoney(e.getLucro())};
            model.addRow(objeto);
        }
    }

    private EmpresaTripulacao getEDFofPanel() {


        try {

            if (edf != null) {
       //         edf.setObservacao(tfObs.getText());
                edf.setRelacaoTrabalho(bgRelacaoTrabalho.getSelection().getActionCommand());
                edf.setFrotaEspecie(tfFrota.getText());
                edf.setFuncao(tfFuncao.getText());
                edf.setNumero(tfNumero.getText());
                edf.setCusto(tfCusto.getText());
                edf.setLucro(tfLucro.getText());
                edf.setSalario(tfSalario.getText());
                return edf;
            }
            EmpresaTripulacao edf = new EmpresaTripulacao();
//            edf.setObservacao(tfObs.getText());
            edf.setRelacaoTrabalho(bgRelacaoTrabalho.getSelection().getActionCommand());
            edf.setFrotaEspecie(tfFrota.getText());
            edf.setFuncao(tfFuncao.getText());
            edf.setNumero(tfNumero.getText());
            edf.setCusto(tfCusto.getText());
            edf.setLucro(tfLucro.getText());
            edf.setSalario(tfSalario.getText());
            edf.setEmpresaId(WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
            return edf;
        } catch (Exception e) {

            Mensagens.showMessageErroPreencherDados();
        }
        return null;
    }

    private EmpresaTripulacao getEDFofTable() {

        EmpresaTripulacao e = edfs.get(table.getSelectedRow());
//        tfObs.setText(e.getObservacao());
        MyUtil.setSelected(e.getRelacaoTrabalho(), bgRelacaoTrabalho);
        tfFrota.setText(e.getFrotaEspecie());
        tfFuncao.setText(e.getFuncao());
        tfNumero.setText(e.getNumero());
        tfCusto.setText(e.getCusto());
        tfLucro.setText(e.getLucro());
        tfSalario.setText(e.getLucro());

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
        if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
            if (cmd.equalsIgnoreCase("Adiciona")) {
                if (edf == null) {
                    edf = getEDFofPanel();
                    new DAOTripulacao().cadastrar(edf);
                } else Mensagens.showMessageNaoAtualizar();
            } else if (cmd.equalsIgnoreCase("Retira")) {
                edf = getEDFofPanel();
                new DAOTripulacao().excluir(edf);
            } 
            refresh();
            clear();
            edf = null;
        }
    }

    private void clear() {
        MyUtil.FieldsClear(this);
        bgRelacaoTrabalho.clearSelection();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRelacaoTrabalho = new javax.swing.ButtonGroup();
        panelCrudEmpresa1 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfFrota = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfFuncao = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        tfCusto = new JMoneyField();
        tfLucro = new JMoneyField();
        tfSalario = new JMoneyField();

        setPreferredSize(new java.awt.Dimension(900, 1700));

        panelCrudEmpresa1.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Adiciona");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btExcluir.setText("Retira");

        btNovo.setText("Novo");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel13.setText("Tripulação");

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
                                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                                        .addComponent(btNovo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btExcluir))
                                    .addComponent(jLabel47)))))
                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel13)))
                .addContainerGap(495, Short.MAX_VALUE))
        );
        panelCrudEmpresa1Layout.setVerticalGroup(
            panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel47)
                        .addComponent(jLabel12))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btNovo)
                    .addComponent(btExcluir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel14.setText("Frota Especie");

        jLabel27.setText("Custo R$/Kg");

        jLabel22.setText("Numero");

        jLabel15.setText("Funcao");

        jLabel21.setText("Sálario");

        jLabel23.setText("Lucro R$/Kg");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Relacao de Trabalho", "Frota / Especie", "Funcao", "Numero", "Sálario", "Custo R$/Kg", "Lucro R$/Kg"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel52.setText("Relações de Trabalho");

        bgRelacaoTrabalho.add(jRadioButton5);
        jRadioButton5.setText("Sistema de Partes");

        bgRelacaoTrabalho.add(jRadioButton6);
        jRadioButton6.setText("Assalariado (Empresarial)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(tfFrota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(375, Short.MAX_VALUE))
            .addComponent(panelCrudEmpresa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(tfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(tfLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1313, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgRelacaoTrabalho;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCrudEmpresa1;
    private javax.swing.JTable table;
    public static javax.swing.JTextField tfCusto;
    private javax.swing.JTextField tfFrota;
    private javax.swing.JTextField tfFuncao;
    public static javax.swing.JTextField tfLucro;
    private javax.swing.JTextField tfNumero;
    public static javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables
}
