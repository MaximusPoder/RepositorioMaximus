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

import br.com.dao.DAOQuestionario1;
import br.com.pojo.EmpresaQuestionario1;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Elton
 */
public class WinQuestionario1 extends javax.swing.JPanel {

    private EmpresaQuestionario1 empresaQuestionario1;

    /** Creates new form WinQuestionario1 */
    public WinQuestionario1() {
        initComponents();
        initAction();
        refresh();

    }

    private void clearTab(JPanel jPanel) {
        MyUtil.FieldsClear(jPanel);
    }

    private void setQuestionario1ForPanel(EmpresaQuestionario1 eq) {

        tfQuestao8.setText(eq.getQuestao8());

        tfQuestao9_1.setText(eq.getQuestao9_1());
        tfQuestao9_2.setText(eq.getQuestao9_2());
        tfQuestao9_3.setText(eq.getQuestao9_3());
        tfQuestao9_4.setText(eq.getQuestao9_4());
        tfQuestao9_5.setText(eq.getQuestao9_5());
        tfQuestao9_6.setText(eq.getQuestao9_6());
        tfQuestao9_7.setText(eq.getQuestao9_7());
        tfQuestao9_8.setText(eq.getQuestao9_8());
        tfQuestao9_9.setText(eq.getQuestao9_9());
        tfQuestao9_10.setText(eq.getQuestao9_10());
        tfQuestao9_11.setText(eq.getQuestao9_11());
        tfQuestao9_12.setText(eq.getQuestao9_12());
        tfQuestao9_13.setText(eq.getQuestao9_13());
        tfQuestao9_14.setText(eq.getQuestao9_14());
        tfQuestao9_15.setText(eq.getQuestao9_15());

        tfQuestao10_1.setText(eq.getQuestao10_1());
        tfQuestao10_2.setText(eq.getQuestao10_2());
        tfQuestao10_3.setText(eq.getQuestao10_3());
        tfQuestao10_4.setText(eq.getQuestao10_4());

        tfQuestao11.setText(eq.getQuestao11());
        tfQuestao12.setText(eq.getQuestao12());
        tfQuestao13.setText(eq.getQuestao13());

    }

    private EmpresaQuestionario1 getQuestionario1OfPanel() {



        try {
            String questao8 = tfQuestao8.getText();

            String questao9_1 = tfQuestao9_1.getText();
            String questao9_2 = tfQuestao9_2.getText();
            String questao9_3 = tfQuestao9_3.getText();
            String questao9_4 = tfQuestao9_4.getText();
            String questao9_5 = tfQuestao9_5.getText();
            String questao9_6 = tfQuestao9_6.getText();
            String questao9_7 = tfQuestao9_7.getText();
            String questao9_8 = tfQuestao9_8.getText();
            String questao9_9 = tfQuestao9_9.getText();
            String questao9_10 = tfQuestao9_10.getText();
            String questao9_11 = tfQuestao9_11.getText();
            String questao9_12 = tfQuestao9_12.getText();
            String questao9_13 = tfQuestao9_13.getText();
            String questao9_14 = tfQuestao9_14.getText();
            String questao9_15 = tfQuestao9_15.getText();

            String questao10_1 = tfQuestao10_1.getText();
            String questao10_2 = tfQuestao10_2.getText();
            String questao10_3 = tfQuestao10_3.getText();
            String questao10_4 = tfQuestao10_4.getText();
            String questao11 = tfQuestao11.getText();
            String questao12 = tfQuestao12.getText();
            String questao13 = tfQuestao13.getText();

            if (empresaQuestionario1 != null) {

                empresaQuestionario1.all(questao8, questao9_1, questao9_2, questao9_3, questao9_4,
                        questao9_5, questao9_6, questao9_7, questao9_8, questao9_9,
                        questao9_10, questao9_11, questao9_12, questao9_13, questao9_14,
                        questao9_15, questao10_1, questao10_2, questao10_3,
                        questao10_4, questao11, questao12, questao13,
                        WinSelecionaEmpresa.empresas.
                        get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
                return empresaQuestionario1;
            }

            EmpresaQuestionario1 eq = new EmpresaQuestionario1();
            eq.all(questao8, questao9_1, questao9_2, questao9_3, questao9_4,
                        questao9_5, questao9_6, questao9_7, questao9_8, questao9_9,
                        questao9_10, questao9_11, questao9_12, questao9_13, questao9_14,
                        questao9_15, questao10_1, questao10_2, questao10_3,
                        questao10_4, questao11, questao12, questao13,
                        WinSelecionaEmpresa.empresas.
                        get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());

            return eq;
        } catch (Exception e) {
            Mensagens.showMessageErroPreencherDados();
        }
        return null;

    }

    private void actionEmpresaQuestionario1(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
            if (cmd.equalsIgnoreCase("Salvar")) {
                if (empresaQuestionario1 == null) {
                    empresaQuestionario1 = getQuestionario1OfPanel();
                    new DAOQuestionario1().cadastrar(empresaQuestionario1);
                } else {
                    empresaQuestionario1 = getQuestionario1OfPanel();
                    new DAOQuestionario1().atualizar(empresaQuestionario1);
                    //Mensagens.showMessageNaoCadastrar();
                }
            } else if (cmd.equalsIgnoreCase("Atualizar")) {
            }

            empresaQuestionario1 = null;
            refresh();
        }

    }

    private void refresh() {
        if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
            isExist();
        } else {
            clearTab(tabQuestionario1);
            MyUtil.clearCheckBox(tabQuestionario1);
            empresaQuestionario1 = null;
        }
    }

    private void initAction() {


        /*quarto Tab*/

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

    }

    private void isExist() {
        empresaQuestionario1 =
                new DAOQuestionario1().getObjectWithQuery("select * from EmpresaQuestionario1 where empresaId = " +
                WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
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
        jLabel25 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btNovoQuestionario1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfQuestao8 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfQuestao11 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfQuestao12 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tfQuestao13 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        tfQuestao9_1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfQuestao9_2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfQuestao9_3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfQuestao9_4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfQuestao9_5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfQuestao9_6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfQuestao9_7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfQuestao9_8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfQuestao9_9 = new javax.swing.JTextField();
        tfQuestao9_10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfQuestao9_11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfQuestao9_12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfQuestao9_13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfQuestao9_14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfQuestao10_1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfQuestao10_2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfQuestao10_3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfQuestao10_4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfQuestao9_15 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(900, 1300));

        ScrollQuestionario1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tabQuestionario1.setAutoscrolls(true);

        panelCrudEmpresa3.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrarQuestionario1.setText("Salvar");
        btCadastrarQuestionario1.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarQuestionario1.setFocusable(false);
        btCadastrarQuestionario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarQuestionario1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btNovoQuestionario1.setText("Novo");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12));
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
                        .addComponent(btCadastrarQuestionario1))
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
                .addContainerGap(520, Short.MAX_VALUE))
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
                    .addComponent(btCadastrarQuestionario1)
                    .addComponent(btNovoQuestionario1))
                .addContainerGap())
        );

        jLabel29.setText("8 - Como é realizado o armazenamento, a lavagem e o resfriamento do pescado à bordo?");

        jLabel30.setText("<html> 9- Como funciona a infraestrtura do processo de beneficiamento desde o momento do desembarque na empresa,<p> passando pela embalagem até a expedição final (Agregar ou excluir etapas no esquema dependendo do produto)?</p> Caracterizar cada elo, especificando detalhes (temperatura, forma de estocagem e etc).</html>");

        jLabel31.setText("10 - Quais os equipamentos/utensilios utilizados por tipo de beneficiamento/Processamento");

        jLabel32.setText("11 - A empresa esta ampliando ou reduzindo a sua produção?");

        jLabel33.setText("12 - A empresa esta ampliando ou reduzindo a sua produção?");

        jLabel34.setText("13 - Qual é a quebra?(em %)?");

        jScrollPane1.setViewportView(tfQuestao8);

        jScrollPane3.setViewportView(tfQuestao11);

        jScrollPane4.setViewportView(tfQuestao12);

        jScrollPane5.setViewportView(tfQuestao13);

        jLabel2.setText("Recepção");

        jLabel3.setText("Inspeção");

        jLabel4.setText("Deposito com Gelo em Camara");

        jLabel5.setText("Lavagem e Classificação");

        jLabel6.setText("Pesagem");

        jLabel7.setText("Escamação");

        jLabel8.setText("Evisceração e Filetamento");

        jLabel9.setText("Lavagem");

        jLabel10.setText("Inspeção 2");

        jLabel11.setText("Empacotamento");

        jLabel12.setText("Acondicionamento");

        jLabel13.setText("Congelamento");

        jLabel14.setText("Embalagem");

        jLabel15.setText("Estocagem");

        jLabel16.setText("Filé");

        jLabel17.setText("Posta");

        jLabel18.setText("Inteiros");

        jLabel19.setText("Outros");

        jLabel20.setText("Expedição");

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
                                .addComponent(jLabel16)
                                .addGap(10, 10, 10)
                                .addComponent(tfQuestao10_1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao10_3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                        .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(7, 7, 7)))
                                        .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfQuestao9_2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfQuestao9_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
                                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabQuestionario1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfQuestao9_6))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabQuestionario1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfQuestao9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                        .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfQuestao9_8))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                        .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfQuestao9_10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfQuestao9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfQuestao9_11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfQuestao9_13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfQuestao9_14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfQuestao9_15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao9_12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                            .addGroup(tabQuestionario1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao10_4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tfQuestao9_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(tfQuestao9_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfQuestao9_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(tfQuestao9_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfQuestao9_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuestao9_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfQuestao9_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15)
                    .addComponent(tfQuestao9_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfQuestao9_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfQuestao9_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuestao9_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20)
                    .addComponent(tfQuestao9_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfQuestao9_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfQuestao9_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tfQuestao9_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(tfQuestao10_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuestao10_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(tfQuestao10_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tfQuestao10_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
    private javax.swing.JButton btCadastrarQuestionario1;
    private javax.swing.JButton btNovoQuestionario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panelCrudEmpresa3;
    private javax.swing.JPanel tabQuestionario1;
    private javax.swing.JTextField tfQuestao10_1;
    private javax.swing.JTextField tfQuestao10_2;
    private javax.swing.JTextField tfQuestao10_3;
    private javax.swing.JTextField tfQuestao10_4;
    private javax.swing.JTextPane tfQuestao11;
    private javax.swing.JTextPane tfQuestao12;
    private javax.swing.JTextPane tfQuestao13;
    private javax.swing.JTextPane tfQuestao8;
    private javax.swing.JTextField tfQuestao9_1;
    private javax.swing.JTextField tfQuestao9_10;
    private javax.swing.JTextField tfQuestao9_11;
    private javax.swing.JTextField tfQuestao9_12;
    private javax.swing.JTextField tfQuestao9_13;
    private javax.swing.JTextField tfQuestao9_14;
    private javax.swing.JTextField tfQuestao9_15;
    private javax.swing.JTextField tfQuestao9_2;
    private javax.swing.JTextField tfQuestao9_3;
    private javax.swing.JTextField tfQuestao9_4;
    private javax.swing.JTextField tfQuestao9_5;
    private javax.swing.JTextField tfQuestao9_6;
    private javax.swing.JTextField tfQuestao9_7;
    private javax.swing.JTextField tfQuestao9_8;
    private javax.swing.JTextField tfQuestao9_9;
    // End of variables declaration//GEN-END:variables
}
