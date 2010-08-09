/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinQuestionario4.java
 *
 * Created on 08/08/2010, 22:00:10
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOQuestionario4;
import br.com.dao.DaoQuestionario3;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaQuestionario4;
import br.com.pojo.EmpresaQuestionario4;
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
public class WinQuestionario4 extends javax.swing.JPanel {

    /** Creates new form WinQuestionario4 */
    private EmpresaQuestionario4 empresaQuestionario4;
    private DefaultTableModel model;
    private List<Empresa> empresas;

    public WinQuestionario4() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresa);
        initAction();
        MyUtil.initiActionCmd(tabQuestionario4);


    }

    private void isExist() {
        if (cbEmpresa.getSelectedIndex() > 0) {
            empresaQuestionario4 =
                    new DAOQuestionario4().getObjectWithQuery("select * from EmpresaQuestionario4" +
                    " where empresaId = " +
                    empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
            if (empresaQuestionario4 != null) {
                setQuestionario4ForPanel(empresaQuestionario4);
            } else {
                clearQuestionario3();
            }
        } else {
            clearQuestionario3();
        }
    }

    private EmpresaQuestionario4 getQuestionario3OfPanel() {

        String questao31 = tfQuestao31.getText();
        String questao32 = bgQuestao32.getSelection().getActionCommand() + ";" + tfQuestao32.getText();
        String questao33 = bgQuestao33.getSelection().getActionCommand();
        String questao34 = tf34.getText();
        String questao35 = tf35.getText();
        String questao36 = tfQuestao36.getText();
        String questao37 = tfQuestao37.getText();
        String questao38 = tfQuestao38.getText();
        String relacoesTrabalho = bgRelacaoTrabalho.getSelection().getActionCommand();

        if (empresaQuestionario4 != null) {
            empresaQuestionario4.all(questao31, questao32, questao33, questao34, questao35,
                    questao36, questao37, questao38, relacoesTrabalho,
                    empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
            return empresaQuestionario4;
        }

        EmpresaQuestionario4 eq = new EmpresaQuestionario4();
        eq.all(questao31, questao32, questao33, questao34, questao35,
                questao36, questao37, questao38, relacoesTrabalho,
                empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
        return eq;
    }

    private void setQuestionario4ForPanel(EmpresaQuestionario4 eq) {

        tfQuestao31.setText(eq.getQuestao31());
        MyUtil.setOpcaoWithResponse(bgQuestao32, eq.getQuestao32(), tfQuestao32);
        MyUtil.setSelected(eq.getQuestao33(), bgQuestao33);

        tf34.setText(eq.getQuestao34());
        tf35.setText(eq.getQuestao35());
        tfQuestao36.setText(eq.getQuestao36());
        tfQuestao37.setText(eq.getQuestao37());
        tfQuestao38.setText(eq.getQuestao38());
        MyUtil.setSelected(eq.getRelacaoTrabalho(), bgRelacaoTrabalho);

    }

    private void clearQuestionario3() {

        MyUtil.FieldsClear(this);
        bgQuestao32.clearSelection();
        bgQuestao33.clearSelection();
        bgRelacaoTrabalho.clearSelection();
    }

    /*Metodos Actions do 8° Tab = Questionario 3*/
    private void actionEmpresaQuestionario4(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cmd.equalsIgnoreCase("Cadastrar")) {
            empresaQuestionario4 = getQuestionario3OfPanel();
            new DAOQuestionario4().cadastrar(empresaQuestionario4);
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            empresaQuestionario4 = getQuestionario3OfPanel();
            new DAOQuestionario4().atualizar(empresaQuestionario4);
        }
        clearQuestionario3();
    }

    private void initAction() {


        btNovoQuestionario4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario4(e);
            }
        });
        cbEmpresa.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if(cbEmpresa.getSelectedIndex()>0)
                    isExist();
                    else clearQuestionario3();
                }
            }
        });
        btCadastrarQuestionario4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario4(e);
            }
        });
        btAtualizarQuestionario4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario4(e);
            }
        });


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgQuestao32 = new javax.swing.ButtonGroup();
        bgQuestao33 = new javax.swing.ButtonGroup();
        bgRelacaoTrabalho = new javax.swing.ButtonGroup();
        ScrollQuestionario4 = new javax.swing.JScrollPane();
        tabQuestionario4 = new javax.swing.JPanel();
        panelCrudEmpresa8 = new javax.swing.JPanel();
        btCadastrarQuestionario4 = new javax.swing.JButton();
        btAtualizarQuestionario4 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        btNovoQuestionario4 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        cbEmpresa = new javax.swing.JComboBox();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        tfQuestao31 = new javax.swing.JTextArea();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel88 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jLabel94 = new javax.swing.JLabel();
        tf34 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        tf35 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tfQuestao36 = new javax.swing.JTextArea();
        jLabel97 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        tfQuestao37 = new javax.swing.JTextArea();
        jLabel98 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        tfQuestao38 = new javax.swing.JTextArea();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        tfQuestao32 = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(999, 999));

        ScrollQuestionario4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollQuestionario4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabQuestionario4.setPreferredSize(new java.awt.Dimension(990, 1200));

        panelCrudEmpresa8.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarQuestionario4.setText("Cadastrar");
        btCadastrarQuestionario4.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarQuestionario4.setFocusable(false);
        btCadastrarQuestionario4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarQuestionario4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizarQuestionario4.setText("Atualizar");
        btAtualizarQuestionario4.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btNovoQuestionario4.setText("Novo");

        jLabel83.setText("Empresa");

        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelCrudEmpresa8Layout = new javax.swing.GroupLayout(panelCrudEmpresa8);
        panelCrudEmpresa8.setLayout(panelCrudEmpresa8Layout);
        panelCrudEmpresa8Layout.setHorizontalGroup(
            panelCrudEmpresa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa8Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel72)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel76))
                    .addGroup(panelCrudEmpresa8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel75))
                    .addGroup(panelCrudEmpresa8Layout.createSequentialGroup()
                        .addComponent(btNovoQuestionario4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrarQuestionario4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizarQuestionario4)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        panelCrudEmpresa8Layout.setVerticalGroup(
            panelCrudEmpresa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addGroup(panelCrudEmpresa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel75)
                        .addComponent(jLabel76)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizarQuestionario4)
                    .addComponent(btCadastrarQuestionario4)
                    .addComponent(jLabel83)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovoQuestionario4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel84.setText("31 - Como e onde a empresa tem conhecimento e adquire equipamentos tecnológicos (processamento, insumos, embalagem, etc)? a serem comprados? Por que?");

        jLabel85.setText("32 - A empresa possui frota própria?");

        tfQuestao31.setColumns(20);
        tfQuestao31.setRows(5);
        jScrollPane23.setViewportView(tfQuestao31);

        bgQuestao32.add(jRadioButton19);
        jRadioButton19.setText("Sim");

        bgQuestao32.add(jRadioButton20);
        jRadioButton20.setText("Não");

        jLabel88.setText("Porque? ");

        jLabel92.setText("Quantos?");

        jLabel93.setText("33 - A Possuía no passado?");

        bgQuestao33.add(jRadioButton25);
        jRadioButton25.setText("Sim");

        bgQuestao33.add(jRadioButton26);
        jRadioButton26.setText("Não");

        jLabel94.setText("34 -Quantos Barcos possuía?");

        jLabel95.setText("35 - Quando parou de ter a frota?");

        jLabel96.setText("36 - Por que parou?");

        tfQuestao36.setColumns(20);
        tfQuestao36.setRows(5);
        jScrollPane29.setViewportView(tfQuestao36);

        jLabel97.setText("37 - De que forma funcionava?");

        tfQuestao37.setColumns(20);
        tfQuestao37.setRows(5);
        jScrollPane30.setViewportView(tfQuestao37);

        jLabel98.setText("38 - Tem conhecimento do Pro-frota ou Preps?");

        tfQuestao38.setColumns(20);
        tfQuestao38.setRows(5);
        jScrollPane31.setViewportView(tfQuestao38);

        jLabel100.setText("Relaçoes de Trabalho");

        bgRelacaoTrabalho.add(jRadioButton27);
        jRadioButton27.setText("Sistemas de partes");

        bgRelacaoTrabalho.add(jRadioButton28);
        jRadioButton28.setText("Assalariado (Empresarial)");

        jScrollPane32.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfQuestao32.setColumns(20);
        tfQuestao32.setRows(5);
        jScrollPane32.setViewportView(tfQuestao32);

        javax.swing.GroupLayout tabQuestionario4Layout = new javax.swing.GroupLayout(tabQuestionario4);
        tabQuestionario4.setLayout(tabQuestionario4Layout);
        tabQuestionario4Layout.setHorizontalGroup(
            tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabQuestionario4Layout.createSequentialGroup()
                        .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton26))
                            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel92)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1705, Short.MAX_VALUE)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1395, 1395, 1395))
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96)
                .addContainerGap(885, Short.MAX_VALUE))
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(627, Short.MAX_VALUE))
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(627, Short.MAX_VALUE))
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(627, Short.MAX_VALUE))
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99)
                .addContainerGap(980, Short.MAX_VALUE))
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabQuestionario4Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf35, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabQuestionario4Layout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf34, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                .addGap(3581, 3581, 3581))
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton28)
                .addContainerGap(613, Short.MAX_VALUE))
        );
        tabQuestionario4Layout.setVerticalGroup(
            tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario4Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionario4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(jRadioButton19)
                            .addComponent(jRadioButton20)
                            .addComponent(jLabel92))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel88)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel93)
                                .addComponent(jRadioButton25)
                                .addComponent(jRadioButton26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94)
                            .addComponent(tf34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(tf35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel96))
                    .addGroup(tabQuestionario4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabQuestionario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton28))
                .addGap(442, 442, 442)
                .addComponent(jLabel99)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        ScrollQuestionario4.setViewportView(tabQuestionario4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollQuestionario4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ScrollQuestionario4, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollQuestionario4;
    private javax.swing.ButtonGroup bgQuestao32;
    private javax.swing.ButtonGroup bgQuestao33;
    private javax.swing.ButtonGroup bgRelacaoTrabalho;
    private javax.swing.JButton btAtualizarQuestionario4;
    private javax.swing.JButton btCadastrarQuestionario4;
    private javax.swing.JButton btNovoQuestionario4;
    private javax.swing.JComboBox cbEmpresa;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel panelCrudEmpresa8;
    private javax.swing.JPanel tabQuestionario4;
    private javax.swing.JTextField tf34;
    private javax.swing.JTextField tf35;
    private javax.swing.JTextArea tfQuestao31;
    private javax.swing.JTextArea tfQuestao32;
    private javax.swing.JTextArea tfQuestao36;
    private javax.swing.JTextArea tfQuestao37;
    private javax.swing.JTextArea tfQuestao38;
    // End of variables declaration//GEN-END:variables
}
