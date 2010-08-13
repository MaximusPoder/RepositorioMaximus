/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinQuestionario1.java
 *
 * Created on 08/08/2010, 21:35:41
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOQuestionario1;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaQuestionario1;
import br.com.pojo.EspecieProcessada;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinQuestionario1 extends javax.swing.JPanel {

    private Empresa empresa;
    private EspecieProcessada ep;
    private EmpresaQuestionario1 empresaQuestionario1;
    private DefaultTableModel model;
    private List<Empresa> empresas;

    /** Creates new form WinQuestionario1 */
    public WinQuestionario1() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresaQuestionario1);

        initAction();
    }

    private void clearTab(JPanel jPanel) {
        MyUtil.FieldsClear(jPanel);
    }

    private void setQuestionario1ForPanel(EmpresaQuestionario1 eq) {

        tfQuestao8.setText(eq.getQuestao8());
        tfQuestao9.setText(eq.getQuestao9());

        MyUtil.setStringsOfSelecteds(eq.getQuestao10(), tabQuestionario1);

        tfQuestao11.setText(eq.getQuestao11());
        tfQuestao12.setText(eq.getQuestao12());
        tfQuestao13.setText(eq.getQuestao13());

    }

    private EmpresaQuestionario1 getQuestionario1OfPanel() {

        String questao8 = tfQuestao8.getText();
        String questao9 = tfQuestao9.getText();
        String questao10 = MyUtil.getSelected(ckFile, ckInteiros, ckOutros, ckPosta);
        String questao11 = tfQuestao11.getText();
        String questao12 = tfQuestao12.getText();
        String questao13 = tfQuestao13.getText();

        if (empresaQuestionario1 != null) {

            empresaQuestionario1.all(questao8, questao9,
                    questao10, questao11, questao12, questao13, empresaQuestionario1.getEmpresaId());
            return empresaQuestionario1;
        }

        EmpresaQuestionario1 eq = new EmpresaQuestionario1();
        eq.all(questao8, questao9, questao10, questao11,
                questao12, questao13,
                empresas.get(cbEmpresaQuestionario1.getSelectedIndex() - 1).getId());

        return eq;

    }

    private void actionEmpresaQuestionario1(ActionEvent e) {

        String cmd = e.getActionCommand();

        if(cbEmpresaQuestionario1.getSelectedIndex()>0)
        {
            if (cmd.equalsIgnoreCase("Cadastrar")) {
                if(empresaQuestionario1 == null){
            empresaQuestionario1 = getQuestionario1OfPanel();
            new DAOQuestionario1().cadastrar(empresaQuestionario1);}
                else Mensagens.showMessageNaoCadastrar();
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            empresaQuestionario1 = getQuestionario1OfPanel();
            new DAOQuestionario1().atualizar(empresaQuestionario1);
        }
        clearTab(tabQuestionario1);
        MyUtil.clearCheckBox(tabQuestionario1);
        empresaQuestionario1 = null;
        cbEmpresaQuestionario1.setSelectedIndex(0);
        }

    }

    private void initAction() {


        /*quarto Tab*/
        cbEmpresaQuestionario1.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbEmpresaQuestionario1.getSelectedIndex() > 0) {
                        isExist();
                    } else {
                        clearTab(tabQuestionario1);
                        MyUtil.clearCheckBox(tabQuestionario1);
                        empresaQuestionario1 = null;
                    }
                }
            }
        });
        btNovoQuestionario1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario1(e);
            }
        });
        btCadastrarQuestionario1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario1(e);
            }
        });
        btAtualizarQuestionario1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario1(e);
            }
        });
    }

    private void isExist() {
        empresaQuestionario1 =
                new DAOQuestionario1().getObjectWithQuery("select * from EmpresaQuestionario1 where empresaId = " +
                empresas.get(cbEmpresaQuestionario1.getSelectedIndex() - 1).getId());
        if (empresaQuestionario1 != null) {
            setQuestionario1ForPanel(empresaQuestionario1);
        } else {
            clearTab(tabQuestionario1);
            MyUtil.clearCheckBox(tabQuestionario1);
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

        ScrollQuestionario1 = new javax.swing.JScrollPane();
        tabQuestionario1 = new javax.swing.JPanel();
        panelCrudEmpresa3 = new javax.swing.JPanel();
        btCadastrarQuestionario1 = new javax.swing.JButton();
        btAtualizarQuestionario1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btNovoQuestionario1 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        cbEmpresaQuestionario1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ckFile = new javax.swing.JCheckBox();
        ckPosta = new javax.swing.JCheckBox();
        ckInteiros = new javax.swing.JCheckBox();
        ckOutros = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfQuestao8 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfQuestao9 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfQuestao11 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfQuestao12 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tfQuestao13 = new javax.swing.JTextPane();

        setPreferredSize(new java.awt.Dimension(900, 1300));

        ScrollQuestionario1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tabQuestionario1.setAutoscrolls(true);

        panelCrudEmpresa3.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarQuestionario1.setText("Cadastrar");
        btCadastrarQuestionario1.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarQuestionario1.setFocusable(false);
        btCadastrarQuestionario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarQuestionario1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizarQuestionario1.setText("Atualizar");
        btAtualizarQuestionario1.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btNovoQuestionario1.setText("Novo");

        jLabel35.setText("Empresa");

        cbEmpresaQuestionario1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Questionário");

        javax.swing.GroupLayout panelCrudEmpresa3Layout = new javax.swing.GroupLayout(panelCrudEmpresa3);
        panelCrudEmpresa3.setLayout(panelCrudEmpresa3Layout);
        panelCrudEmpresa3Layout.setHorizontalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addComponent(btNovoQuestionario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrarQuestionario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizarQuestionario1)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEmpresaQuestionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel25)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel28))
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel49)))
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        panelCrudEmpresa3Layout.setVerticalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel49)
                                .addComponent(jLabel28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizarQuestionario1)
                    .addComponent(btCadastrarQuestionario1)
                    .addComponent(btNovoQuestionario1)
                    .addComponent(jLabel35)
                    .addComponent(cbEmpresaQuestionario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel29.setText("8 - Como é realizado o armazenamento, a lavagem e o resfriamento do pescado à bordo?");

        jLabel30.setText("<html> 9- Como funciona a infraestrtura do processo de beneficiamento desde o momento do desembarque na empresa,<p> passando pela embalagem até a expedição final (Agregar ou excluir etapas no esquema dependendo do produto)?</p> Caracterizar cada elo, especificando detalhes (temperatura, forma de estocagem e etc).</html>");

        jLabel31.setText("10 - Quais os equipamentos/utensilios utilizados por tipo de beneficiamento/Processamento");

        ckFile.setText("Filé");

        ckPosta.setText("Posta");

        ckInteiros.setText("Inteiros");

        ckOutros.setText("Outros");

        jLabel32.setText("11 - A empresa esta ampliando ou reduzindo a sua produção?");

        jLabel33.setText("12 - A empresa esta ampliando ou reduzindo a sua produção?");

        jLabel34.setText("13 - Qual é a quebra?(em %)?");

        jScrollPane1.setViewportView(tfQuestao8);

        jScrollPane2.setViewportView(tfQuestao9);

        jScrollPane3.setViewportView(tfQuestao11);

        jScrollPane4.setViewportView(tfQuestao12);

        jScrollPane5.setViewportView(tfQuestao13);

        javax.swing.GroupLayout tabQuestionario1Layout = new javax.swing.GroupLayout(tabQuestionario1);
        tabQuestionario1.setLayout(tabQuestionario1Layout);
        tabQuestionario1Layout.setHorizontalGroup(
            tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel32)
                            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckInteiros)
                                    .addComponent(ckFile))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckPosta)
                                    .addComponent(ckOutros)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        tabQuestionario1Layout.setVerticalGroup(
            tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                        .addComponent(ckFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckInteiros))
                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                        .addComponent(ckPosta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckOutros)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1127, Short.MAX_VALUE))
        );

        ScrollQuestionario1.setViewportView(tabQuestionario1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ScrollQuestionario1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ScrollQuestionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 1502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollQuestionario1;
    private javax.swing.JButton btAtualizarQuestionario1;
    private javax.swing.JButton btCadastrarQuestionario1;
    private javax.swing.JButton btNovoQuestionario1;
    private javax.swing.JComboBox cbEmpresaQuestionario1;
    private javax.swing.JCheckBox ckFile;
    private javax.swing.JCheckBox ckInteiros;
    private javax.swing.JCheckBox ckOutros;
    private javax.swing.JCheckBox ckPosta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panelCrudEmpresa3;
    private javax.swing.JPanel tabQuestionario1;
    private javax.swing.JTextPane tfQuestao11;
    private javax.swing.JTextPane tfQuestao12;
    private javax.swing.JTextPane tfQuestao13;
    private javax.swing.JTextPane tfQuestao8;
    private javax.swing.JTextPane tfQuestao9;
    // End of variables declaration//GEN-END:variables
}
