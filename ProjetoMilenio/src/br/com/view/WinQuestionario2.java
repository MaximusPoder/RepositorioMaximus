/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinQuestionario2.java
 *
 * Created on 08/08/2010, 21:44:48
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOQuestionario2;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaQuestionario2;
import br.com.util.JMoneyField;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinQuestionario2 extends javax.swing.JPanel {

    private EmpresaQuestionario2 empresaQuestionario2;
    private DefaultTableModel model;
    private List<Empresa> empresas;

    public WinQuestionario2() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresaQuestionario2);
        initAction();
        initiActionCmd(tabQuestionario2);
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

    private EmpresaQuestionario2 getQuestionario2OfPanel() {



         try {
            String questao15 = bgQuestao15.getSelection().getActionCommand();
        String questao16 = tfQuestao16.getText();
        String questao17 = tfQuestao17.getText();
        String questao18 = tfQuestao18.getText();
        String questao19 = tfQuestao19.getText();
        String questao20 = tfQuestao20.getText();
        String questao21 = bgQuestao21.getSelection().getActionCommand();
        String questao22 = tfQuestao22.getText();

        if (empresaQuestionario2 != null) {

            empresaQuestionario2.all(questao15, questao16, questao17, questao18,
                    questao19, questao20, questao21, questao22,
                    empresas.get(cbEmpresaQuestionario2.getSelectedIndex()-1).getId());
            return empresaQuestionario2;
        }

        EmpresaQuestionario2 eq = new EmpresaQuestionario2();
        eq.all(questao15, questao16, questao17, questao18,
                questao19, questao20, questao21, questao22,
                empresas.get(cbEmpresaQuestionario2.getSelectedIndex()-1).getId());

        return eq;
        } catch (Exception e) {

            Mensagens.showMessageErroPreencherDados();
        }
        return null;

    }

    private void setQuestionario2ForPanel(EmpresaQuestionario2 eq) {

        MyUtil.setSelected(eq.getQuestao15(), bgQuestao15);
        tfQuestao16.setText(eq.getQuestao16());
        tfQuestao17.setText(eq.getQuestao17());
        tfQuestao18.setText(eq.getQuestao18());
        tfQuestao19.setText(eq.getQuestao19());
        tfQuestao20.setText(eq.getQuestao20());
        MyUtil.setSelected(eq.getQuestao21(), bgQuestao21);
        tfQuestao22.setText(eq.getQuestao22());

    }

    private void actionEmpresaQuestionario2(ActionEvent e) {

        String cmd = e.getActionCommand();
        if(cbEmpresaQuestionario2.getSelectedIndex()>0){
        if (cmd.equalsIgnoreCase("Cadastrar")) {
            if(empresaQuestionario2==null){
            empresaQuestionario2 = getQuestionario2OfPanel();
            new DAOQuestionario2().cadastrar(empresaQuestionario2);}
            else Mensagens.showMessageNaoCadastrar();
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            empresaQuestionario2 = getQuestionario2OfPanel();
            new DAOQuestionario2().atualizar(empresaQuestionario2);
        }
        clearTab(tabQuestionario2);
        bgQuestao15.clearSelection();
        bgQuestao21.clearSelection();
        empresaQuestionario2 = null;
        cbEmpresaQuestionario2.setSelectedIndex(0);
        }



    }
    private void clearTab(JPanel jPanel) {
        MyUtil.FieldsClear(jPanel);
    }

    private void initAction() {

        /*6º TAB*/
        cbEmpresaQuestionario2.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbEmpresaQuestionario2.getSelectedIndex() > 0) {
                        empresaQuestionario2 =
                                new DAOQuestionario2().getObjectWithQuery("select * from EmpresaQuestionario2" +
                                " where empresaId = " +
                                empresas.get(cbEmpresaQuestionario2.getSelectedIndex()-1).getId());
                        if (empresaQuestionario2 != null) {
                            setQuestionario2ForPanel(empresaQuestionario2);
                        } else {
                            clearTab(tabQuestionario2);
                            bgQuestao15.clearSelection();
                            bgQuestao21.clearSelection();
                        }
                    }else
                     {
                         clearTab(tabQuestionario2);
                            bgQuestao15.clearSelection();
                            bgQuestao21.clearSelection();
                    }
                }
            }
        });
        btNovoQuestionario2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario2(e);
            }
        });
        btCadastrarQuestionario2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario2(e);
            }
        });
        btAtualizarQuestionario2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario2(e);
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

        bgQuestao15 = new javax.swing.ButtonGroup();
        bgQuestao21 = new javax.swing.ButtonGroup();
        ScrollQuestionario2 = new javax.swing.JScrollPane();
        tabQuestionario2 = new javax.swing.JPanel();
        panelCrudEmpresa5 = new javax.swing.JPanel();
        btCadastrarQuestionario2 = new javax.swing.JButton();
        btAtualizarQuestionario2 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btNovoQuestionario2 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        cbEmpresaQuestionario2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tfQuestao16 = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tfQuestao17 = new javax.swing.JTextArea();
        jLabel55 = new javax.swing.JLabel();
        tfQuestao18 = new JMoneyField();
        jScrollPane11 = new javax.swing.JScrollPane();
        tfQuestao19 = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tfQuestao20 = new javax.swing.JTextArea();
        jLabel58 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tfQuestao22 = new javax.swing.JTextArea();
        jLabel59 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 1300));

        ScrollQuestionario2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelCrudEmpresa5.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarQuestionario2.setText("Cadastrar");
        btCadastrarQuestionario2.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarQuestionario2.setFocusable(false);
        btCadastrarQuestionario2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarQuestionario2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizarQuestionario2.setText("Atualizar");
        btAtualizarQuestionario2.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btNovoQuestionario2.setText("Novo");

        jLabel45.setText("Empresa");

        cbEmpresaQuestionario2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel12.setText("Fabrica de Gelo");

        javax.swing.GroupLayout panelCrudEmpresa5Layout = new javax.swing.GroupLayout(panelCrudEmpresa5);
        panelCrudEmpresa5.setLayout(panelCrudEmpresa5Layout);
        panelCrudEmpresa5Layout.setHorizontalGroup(
            panelCrudEmpresa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa5Layout.createSequentialGroup()
                .addGroup(panelCrudEmpresa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrudEmpresa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa5Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel43)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel44))
                            .addGroup(panelCrudEmpresa5Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel51))
                            .addGroup(panelCrudEmpresa5Layout.createSequentialGroup()
                                .addComponent(btNovoQuestionario2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadastrarQuestionario2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizarQuestionario2)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEmpresaQuestionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCrudEmpresa5Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel12)))
                .addContainerGap(383, Short.MAX_VALUE))
        );
        panelCrudEmpresa5Layout.setVerticalGroup(
            panelCrudEmpresa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addGroup(panelCrudEmpresa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel51)
                        .addComponent(jLabel44))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCrudEmpresa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizarQuestionario2)
                    .addComponent(btCadastrarQuestionario2)
                    .addComponent(btNovoQuestionario2)
                    .addComponent(jLabel45)
                    .addComponent(cbEmpresaQuestionario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel52.setText("15 - Tem fábrica de Gelo");

        jLabel53.setText("16 - Qual a produção anual da fábrica de Gelo (Unidade)?");

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfQuestao16.setColumns(20);
        tfQuestao16.setRows(5);
        tfQuestao16.setAutoscrolls(false);
        jScrollPane9.setViewportView(tfQuestao16);

        jLabel54.setText("17 - Qual a percentagem do investimento que representa a fábrica de gelo?");

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfQuestao17.setColumns(20);
        tfQuestao17.setRows(5);
        tfQuestao17.setAutoscrolls(false);
        jScrollPane10.setViewportView(tfQuestao17);

        jLabel55.setText("18 - Qual o preço da saca de gelo (R$)?");

        tfQuestao19.setColumns(20);
        tfQuestao19.setRows(5);
        jScrollPane11.setViewportView(tfQuestao19);

        jLabel56.setText("19 - Quais os principais problemas que enfrenta com a fábrica de gelo?");

        jLabel57.setText("20 - Como remediar os problemas (gargalos) com:");

        tfQuestao20.setColumns(20);
        tfQuestao20.setRows(5);
        jScrollPane12.setViewportView(tfQuestao20);

        jLabel58.setText("21 -Empresa recebeu incentivos fiscais?");

        bgQuestao15.add(jRadioButton5);
        jRadioButton5.setText("Sim");

        bgQuestao15.add(jRadioButton6);
        jRadioButton6.setText("Não");

        bgQuestao21.add(jRadioButton7);
        jRadioButton7.setText("Sim");

        bgQuestao21.add(jRadioButton8);
        jRadioButton8.setText("Não");

        tfQuestao22.setColumns(20);
        tfQuestao22.setRows(5);
        jScrollPane13.setViewportView(tfQuestao22);

        jLabel59.setText("22 - Se não, porque? Quais os requisitos devem apresentar?");

        javax.swing.GroupLayout tabQuestionario2Layout = new javax.swing.GroupLayout(tabQuestionario2);
        tabQuestionario2.setLayout(tabQuestionario2Layout);
        tabQuestionario2Layout.setHorizontalGroup(
            tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addContainerGap(999, Short.MAX_VALUE))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(632, 632, 632))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addContainerGap(926, Short.MAX_VALUE))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addComponent(tfQuestao18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(1053, Short.MAX_VALUE))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(778, Short.MAX_VALUE))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(878, Short.MAX_VALUE))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6)
                        .addGap(1028, 1028, 1028))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(736, Short.MAX_VALUE))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario2Layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton8))
                            .addComponent(jLabel58))
                        .addContainerGap(926, Short.MAX_VALUE))
                    .addGroup(tabQuestionario2Layout.createSequentialGroup()
                        .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(826, Short.MAX_VALUE))))
            .addGroup(tabQuestionario2Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        tabQuestionario2Layout.setVerticalGroup(
            tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario2Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addGap(2, 2, 2)
                .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfQuestao18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1195, Short.MAX_VALUE))
        );

        ScrollQuestionario2.setViewportView(tabQuestionario2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollQuestionario2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ScrollQuestionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 1502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollQuestionario2;
    private javax.swing.ButtonGroup bgQuestao15;
    private javax.swing.ButtonGroup bgQuestao21;
    private javax.swing.JButton btAtualizarQuestionario2;
    private javax.swing.JButton btCadastrarQuestionario2;
    private javax.swing.JButton btNovoQuestionario2;
    private javax.swing.JComboBox cbEmpresaQuestionario2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel panelCrudEmpresa5;
    private javax.swing.JPanel tabQuestionario2;
    private javax.swing.JTextArea tfQuestao16;
    private javax.swing.JTextArea tfQuestao17;
    public static javax.swing.JTextField tfQuestao18;
    private javax.swing.JTextArea tfQuestao19;
    private javax.swing.JTextArea tfQuestao20;
    private javax.swing.JTextArea tfQuestao22;
    // End of variables declaration//GEN-END:variables
}
