/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinQuestionario6.java
 *
 * Created on 09/08/2010, 13:33:48
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOQuestionario6;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaQuestionario6;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinQuestionario6 extends javax.swing.JPanel {

    /** Creates new form WinQuestionario6 */
    private EmpresaQuestionario6 q;
    private DefaultTableModel model;
    private List<Empresa> empresas;

    public WinQuestionario6() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresa);
        initAction();
        MyUtil.initiActionCmd(tabQuestionario);
    }

    private void isExist() {

        if (cbEmpresa.getSelectedIndex() > 0) {
            q = new DAOQuestionario6().getObjectWithQuery("select * from EmpresaQuestionario6" +
                    " where empresaId = " +
                    empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
            if (q != null) {
                setQuestionarioForPanel(q);
            } else {
                clearQuestionario();
            }
        } else {
            clearQuestionario();
        }
    }

    private EmpresaQuestionario6 getQuestionarioOfPanel() {

        String questao48 = bgQuestao48.getSelection().getActionCommand() +
                ";" + tfQuestao48.getText();
        String questao49 = bgQuestao49.getSelection().getActionCommand() +
                ";" + tfQuestao49.getText();
        String questao50 = bgQuestao50.getSelection().getActionCommand() +
                ";" + tfQuestao50.getText();
        String questao51 = tfQuestao51.getText();
        String questao52 = tfQuestao52.getText();
        String questao53 = bgQuestao53.getSelection().getActionCommand() +
                ";" + tfQuestao53.getText();


        if (q != null) {
            q.all(questao48, questao49, questao50, questao51, questao52,
                    questao53,empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
            return q;
        }

        EmpresaQuestionario6 eq = new EmpresaQuestionario6();
        eq.all(questao48, questao49, questao50, questao51, questao52,
                questao53,empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
        return eq;
    }

    private void setQuestionarioForPanel(EmpresaQuestionario6 eq) {

        MyUtil.setOpcaoWithResponse(bgQuestao48, eq.getQuestao48(), tfQuestao48);
        MyUtil.setOpcaoWithResponse(bgQuestao49, eq.getQuestao49(), tfQuestao49);
        MyUtil.setOpcaoWithResponse(bgQuestao50, eq.getQuestao50(), tfQuestao50);
        tfQuestao51.setText(eq.getQuestao51());
        tfQuestao52.setText(eq.getQuestao52());
        MyUtil.setOpcaoWithResponse(bgQuestao53, eq.getQuestao53(), tfQuestao53);
    }

    private void clearQuestionario() {

        MyUtil.FieldsClear(this);
        q = null;
        bgQuestao48.clearSelection();
        bgQuestao49.clearSelection();
        bgQuestao50.clearSelection();
        bgQuestao53.clearSelection();
    }

    /*Metodos Actions do 8° Tab = Questionario 3*/
    private void actionEmpresaQuestionario(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cmd.equalsIgnoreCase("Cadastrar")) {
            if(q == null){
            q = getQuestionarioOfPanel();
            new DAOQuestionario6().cadastrar(q);}
            else Mensagens.showMessageNaoCadastrar();
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            q = getQuestionarioOfPanel();
            new DAOQuestionario6().atualizar(q);
        }
        clearQuestionario();
        cbEmpresa.setSelectedIndex(0);
    }

    private void initAction() {


        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario(e);
            }
        });
        cbEmpresa.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                     if(cbEmpresa.getSelectedIndex()>0)
                    isExist();
                    else clearQuestionario();
                }
            }
        });
        btCadastrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario(e);
            }
        });
        btAtualizar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario(e);
            }
        });


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgQuestao48 = new javax.swing.ButtonGroup();
        bgQuestao49 = new javax.swing.ButtonGroup();
        bgQuestao50 = new javax.swing.ButtonGroup();
        bgQuestao53 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabQuestionario = new javax.swing.JPanel();
        panelCrudEmpresa7 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        cbEmpresa = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        tfQuestao48 = new javax.swing.JTextArea();
        jScrollPane33 = new javax.swing.JScrollPane();
        tfQuestao49 = new javax.swing.JTextArea();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jLabel101 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        tfQuestao50 = new javax.swing.JTextArea();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        tfQuestao51 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        tfQuestao52 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jScrollPane35 = new javax.swing.JScrollPane();
        tfQuestao53 = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(900, 1700));

        panelCrudEmpresa7.setBackground(new java.awt.Color(255, 255, 255));
        panelCrudEmpresa7.setPreferredSize(new java.awt.Dimension(600, 51));

        btCadastrar.setText("Cadastrar");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizar.setText("Atualizar");
        btAtualizar.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btNovo.setText("Novo");

        jLabel71.setText("Empresa");

        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel13.setText("Problemas do pescado");

        javax.swing.GroupLayout panelCrudEmpresa7Layout = new javax.swing.GroupLayout(panelCrudEmpresa7);
        panelCrudEmpresa7.setLayout(panelCrudEmpresa7Layout);
        panelCrudEmpresa7Layout.setHorizontalGroup(
            panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jLabel69))
                    .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13)
                        .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                            .addComponent(btNovo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btAtualizar)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel71)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        panelCrudEmpresa7Layout.setVerticalGroup(
            panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel69)
                        .addComponent(jLabel70))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btCadastrar)
                    .addComponent(btNovo)
                    .addComponent(jLabel71)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel100.setText("48 - A quantidade de pescado ofertado tem:.");

        bgQuestao48.add(jRadioButton35);
        jRadioButton35.setText("Diminuído");

        bgQuestao48.add(jRadioButton33);
        jRadioButton33.setText("Aumentado");

        bgQuestao48.add(jRadioButton34);
        jRadioButton34.setText("Estável");

        tfQuestao48.setColumns(20);
        tfQuestao48.setRows(5);
        jScrollPane32.setViewportView(tfQuestao48);

        tfQuestao49.setColumns(20);
        tfQuestao49.setRows(5);
        jScrollPane33.setViewportView(tfQuestao49);

        bgQuestao49.add(jRadioButton36);
        jRadioButton36.setText("Estável");

        bgQuestao49.add(jRadioButton37);
        jRadioButton37.setText("Aumentado");

        bgQuestao49.add(jRadioButton38);
        jRadioButton38.setText("Diminuído");

        jLabel101.setText("49 - O tamanho do Peixe tem:");

        tfQuestao50.setColumns(20);
        tfQuestao50.setRows(5);
        jScrollPane34.setViewportView(tfQuestao50);

        bgQuestao50.add(jRadioButton39);
        jRadioButton39.setText("Estável");

        bgQuestao50.add(jRadioButton40);
        jRadioButton40.setText("Aumentado");

        bgQuestao50.add(jRadioButton41);
        jRadioButton41.setText("Diminuído");

        jLabel102.setText("50 - O preço do peixe pago ao pescador tem:");

        jLabel103.setText("51 - Em que ano era mais ofertado?");

        jLabel104.setText("52 -Quando foi o pior ano?");

        jLabel105.setText("53 - A frota de pescadores está:");

        bgQuestao53.add(jRadioButton42);
        jRadioButton42.setText("Diminuído");

        bgQuestao53.add(jRadioButton43);
        jRadioButton43.setText("Aumentado");

        bgQuestao53.add(jRadioButton44);
        jRadioButton44.setText("Estável");

        tfQuestao53.setColumns(20);
        tfQuestao53.setRows(5);
        jScrollPane35.setViewportView(tfQuestao53);

        javax.swing.GroupLayout tabQuestionarioLayout = new javax.swing.GroupLayout(tabQuestionario);
        tabQuestionario.setLayout(tabQuestionarioLayout);
        tabQuestionarioLayout.setHorizontalGroup(
            tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel103)
                        .addGap(27, 27, 27)
                        .addComponent(tfQuestao51, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton44)
                                    .addComponent(jRadioButton43)
                                    .addComponent(jRadioButton42))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addGap(27, 27, 27)
                                .addComponent(tfQuestao52, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabQuestionarioLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel100)
                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton34)
                                .addComponent(jRadioButton33)
                                .addComponent(jRadioButton35))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel101)
                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton36)
                                .addComponent(jRadioButton37)
                                .addComponent(jRadioButton38))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel102)
                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton39)
                                .addComponent(jRadioButton40)
                                .addComponent(jRadioButton41))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        tabQuestionarioLayout.setVerticalGroup(
            tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(397, 397, 397)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                        .addComponent(jRadioButton42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton43)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButton44)
                        .addGap(23, 23, 23))
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1033, Short.MAX_VALUE))
            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabQuestionarioLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel100)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                            .addComponent(jRadioButton35)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton33)
                            .addGap(3, 3, 3)
                            .addComponent(jRadioButton34)
                            .addGap(23, 23, 23))
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel101)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                            .addComponent(jRadioButton38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton37)
                            .addGap(3, 3, 3)
                            .addComponent(jRadioButton36)
                            .addGap(23, 23, 23))
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel102)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                            .addComponent(jRadioButton41)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton40)
                            .addGap(3, 3, 3)
                            .addComponent(jRadioButton39)
                            .addGap(23, 23, 23))
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(1230, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(tabQuestionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgQuestao48;
    private javax.swing.ButtonGroup bgQuestao49;
    private javax.swing.ButtonGroup bgQuestao50;
    private javax.swing.ButtonGroup bgQuestao53;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox cbEmpresa;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JPanel panelCrudEmpresa7;
    private javax.swing.JPanel tabQuestionario;
    private javax.swing.JTextArea tfQuestao48;
    private javax.swing.JTextArea tfQuestao49;
    private javax.swing.JTextArea tfQuestao50;
    private javax.swing.JTextField tfQuestao51;
    private javax.swing.JTextField tfQuestao52;
    private javax.swing.JTextArea tfQuestao53;
    // End of variables declaration//GEN-END:variables
}
