/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinQuestionario7.java
 *
 * Created on 09/08/2010, 14:33:51
 */
package br.com.view;

import br.com.dao.DAOQuestionario7;

import br.com.pojo.EmpresaQuestionario7;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Elton
 */
public class WinQuestionario7 extends javax.swing.JPanel {

    /** Creates new form WinQuestionario7 */
    private EmpresaQuestionario7 empresaQuestionario7;
 

    public WinQuestionario7() {
        initComponents();

        initAction();
        initiActionCmd(tabQuestionario);
        refresh();

    }

    private EmpresaQuestionario7 getQuestionario7OfPanel() {



        try {
            String questao55 = MyUtil.getSelected(ckConsumidor, ckFeiras, ckOutro, ckRest, ckRevendedores, ckSuper);
            String questao56 = bgQuestao56.getSelection().getActionCommand();
            String questao57 = tfQuestao57.getText();
            String questao58 = bgQuestao58.getSelection().getActionCommand();
            String questao59 = tfQuestao59.getText();
            String questao60 = MyUtil.getStringOfFields(tfQuestao60_0, tfQuestao60_1, tfQuestao60_2, tfQuestao60_3);
            String questao61 = MyUtil.getStringOfFields(tfQuestao61_0, tfQuestao61_1);
            String questao62 = MyUtil.getStringOfFields(tfQuestao62_0, tfQuestao62_1, tfQuestao62_2);
            String questao63 = MyUtil.getStringOfFields(tfQuestao63_0, tfQuestao63_1, tfQuestao63_2);

            String questao64 = tfQuestao64.getText();
            String questao65 = tfQuestao65.getText();
            String questao66 = tfQuestao66.getText();


            if (empresaQuestionario7 != null) {
                empresaQuestionario7.all(questao55, questao56, questao57,
                        questao58, questao59, questao60, questao61, questao62, questao63,
                        questao64, questao65, questao66, WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());

                return empresaQuestionario7;
            }

            EmpresaQuestionario7 eq = new EmpresaQuestionario7();
            eq.all(questao55, questao56, questao57, questao58, questao59, questao60,
                    questao61, questao62, questao63, questao64, questao65, questao66,
                    WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
            return eq;
        } catch (Exception e) {

            Mensagens.showMessageErroPreencherDados();
        }
        return null;
    }

    private void setQuestionario7ForPanel(EmpresaQuestionario7 eq) {

        MyUtil.setSelected(eq.getQuestao55(),
                ckConsumidor, ckFeiras, ckOutro, ckRest, ckRevendedores, ckSuper);
        MyUtil.setSelected(eq.getQuestao56(), bgQuestao56);
        tfQuestao57.setText(eq.getQuestao57());
        MyUtil.setSelected(eq.getQuestao58(), bgQuestao58);
        tfQuestao59.setText(eq.getQuestao59());

        MyUtil.setStringsToFields(eq.getQuestao60(), tfQuestao60_0, tfQuestao60_1, tfQuestao60_2, tfQuestao60_3);
        MyUtil.setStringsToFields(eq.getQuestao61(), tfQuestao61_0, tfQuestao61_1);
        MyUtil.setStringsToFields(eq.getQuestao62(), tfQuestao62_0, tfQuestao62_1, tfQuestao62_2);
        MyUtil.setStringsToFields(eq.getQuestao63(), tfQuestao63_0, tfQuestao63_1, tfQuestao63_2);

        tfQuestao64.setText(eq.getQuestao64());
        tfQuestao65.setText(eq.getQuestao65());
        tfQuestao66.setText(eq.getQuestao66());
    }

    private void clearQuestionario7() {

        clearTab(tabQuestionario);
        MyUtil.clearCheckBox(tabQuestionario);
        bgQuestao56.clearSelection();
        bgQuestao58.clearSelection();
        empresaQuestionario7 = null;
    }

    /*Metodos Actions do 8° Tab = Questionario 3*/
    private void action(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cmd.equalsIgnoreCase("Salvar")) {
            if (empresaQuestionario7 == null) {
                empresaQuestionario7 = getQuestionario7OfPanel();
                new DAOQuestionario7().cadastrar(empresaQuestionario7);
            } else {
                 empresaQuestionario7 = getQuestionario7OfPanel();
            new DAOQuestionario7().atualizar(empresaQuestionario7);
            }
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
        }
       // clearQuestionario7();

    }

    private void initAction() {


        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });
       
        btCadastrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });


    }

    private void refresh() {
        empresaQuestionario7 =
                new DAOQuestionario7().getObjectWithQuery("select * from EmpresaQuestionario7" +
                " where empresaId = " +
                WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
        if (empresaQuestionario7 != null) {
            setQuestionario7ForPanel(empresaQuestionario7);
        } else {
            clearQuestionario7();
        }
    }

    private void clearTab(JPanel jPanel) {
        MyUtil.FieldsClear(jPanel);
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgQuestao56 = new javax.swing.ButtonGroup();
        bgQuestao58 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabQuestionario = new javax.swing.JPanel();
        panelCrudEmpresa3 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ckConsumidor = new javax.swing.JCheckBox();
        ckOutro = new javax.swing.JCheckBox();
        ckRest = new javax.swing.JCheckBox();
        ckFeiras = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tfQuestao59 = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        ckSuper = new javax.swing.JCheckBox();
        ckRevendedores = new javax.swing.JCheckBox();
        jLabel100 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        tfQuestao57 = new javax.swing.JTextField();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jLabel101 = new javax.swing.JLabel();
        jRadioButton41 = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tfQuestao64 = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tfQuestao65 = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tfQuestao66 = new javax.swing.JTextArea();
        tfQuestao60_0 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tfQuestao60_1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        tfQuestao60_2 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        tfQuestao60_3 = new javax.swing.JTextField();
        tfQuestao61_0 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        tfQuestao61_1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        tfQuestao62_2 = new javax.swing.JTextField();
        tfQuestao62_1 = new javax.swing.JTextField();
        tfQuestao62_0 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        tfQuestao63_0 = new javax.swing.JTextField();
        tfQuestao63_1 = new javax.swing.JTextField();
        tfQuestao63_2 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(900, 1300));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabQuestionario.setAutoscrolls(true);
        tabQuestionario.setPreferredSize(new java.awt.Dimension(990, 2300));

        panelCrudEmpresa3.setBackground(new java.awt.Color(255, 255, 255));
        panelCrudEmpresa3.setPreferredSize(new java.awt.Dimension(500, 51));

        btCadastrar.setText("Salvar");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btNovo.setText("Novo");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel13.setText("Outras questões");

        javax.swing.GroupLayout panelCrudEmpresa3Layout = new javax.swing.GroupLayout(panelCrudEmpresa3);
        panelCrudEmpresa3.setLayout(panelCrudEmpresa3Layout);
        panelCrudEmpresa3Layout.setHorizontalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadastrar))
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel25)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel28))
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel49))))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel13)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        panelCrudEmpresa3Layout.setVerticalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel49)
                                .addComponent(jLabel28)))
                        .addGap(18, 18, 18)
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btNovo))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel31.setText("55 - Quais os Principais clientes");

        ckConsumidor.setText("Consumidor");

        ckOutro.setText("Outros");

        ckRest.setText("Restaurante");

        ckFeiras.setText("Feiras");

        jLabel33.setText("<html>59 - Quais as dificuldades (gargalos) encontradas para manter a atividade da venda?<p> Quais as possíveis soluções (demandas) para melhor o seu trabalho?</html>");

        tfQuestao59.setColumns(20);
        tfQuestao59.setRows(5);
        jScrollPane7.setViewportView(tfQuestao59);

        jLabel34.setText("60 - O numero de funcionarios");

        ckSuper.setText("Supermercados");

        ckRevendedores.setText("Revendedores");

        jLabel100.setText("56 - Qual tem sido a principal expansao de sua empresa ao longo do tempo de mercado?");

        bgQuestao56.add(jRadioButton35);
        jRadioButton35.setText("Mais para local");

        bgQuestao56.add(jRadioButton33);
        jRadioButton33.setText("Mais para estadual");

        bgQuestao56.add(jRadioButton34);
        jRadioButton34.setText("Mais para Mercado Nacional");

        bgQuestao56.add(jRadioButton36);
        jRadioButton36.setText("Mais para Internacional");

        jLabel1.setText("57 - Em que ano se deu sua expansão?");

        bgQuestao58.add(jRadioButton37);
        jRadioButton37.setText("Mão de Obra");

        bgQuestao58.add(jRadioButton38);
        jRadioButton38.setText("Oferta de pescado");

        bgQuestao58.add(jRadioButton39);
        jRadioButton39.setText("Mercado");

        bgQuestao58.add(jRadioButton40);
        jRadioButton40.setText("Financeiro");

        jLabel101.setText("58 - Qual o principal fator limitante para expansão da empresa?");

        bgQuestao58.add(jRadioButton41);
        jRadioButton41.setText("Qualidade");

        jLabel36.setText("61 - Em média, quantos no verão? Quantos no Inverno?");

        jLabel37.setText("62 - Média de tempo de permanência dos funcionarios na empresa (em anos) ?");

        jLabel38.setText("63  - Salário médio do funcionario ?");

        jLabel39.setText("<html>64 - Existe alguma interação entre as empresas pesqueiras em relação à troca, cooperação<p>ou à complementaridade de tecnologias, produtos e etc?</html>");

        tfQuestao64.setColumns(20);
        tfQuestao64.setRows(5);
        jScrollPane12.setViewportView(tfQuestao64);

        jLabel40.setText("<html>65 - Qual o grau de competitividade/ rivalidade entre as empresas?</html>");

        tfQuestao65.setColumns(20);
        tfQuestao65.setRows(5);
        jScrollPane13.setViewportView(tfQuestao65);

        jLabel41.setText("<html>66 - Em quanto você estima a receita bruta (ano) da empresa?</html>");

        tfQuestao66.setColumns(20);
        tfQuestao66.setRows(5);
        jScrollPane14.setViewportView(tfQuestao66);

        jLabel42.setText("Administração");

        jLabel43.setText("Beneficiamento");

        jLabel44.setText("Apoio");

        jLabel45.setText("Pescadores");

        jLabel46.setText("Verão");

        jLabel47.setText("Inverno");

        jLabel48.setText("Administração");

        jLabel50.setText("Beneficiamento");

        jLabel51.setText("Apoio");

        jLabel52.setText("Apoio");

        jLabel53.setText("Beneficiamento");

        jLabel54.setText("Administração");

        javax.swing.GroupLayout tabQuestionarioLayout = new javax.swing.GroupLayout(tabQuestionario);
        tabQuestionario.setLayout(tabQuestionarioLayout);
        tabQuestionarioLayout.setHorizontalGroup(
            tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                    .addComponent(jLabel54)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfQuestao63_0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionarioLayout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfQuestao63_2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionarioLayout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao63_1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                    .addComponent(jLabel48)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfQuestao62_0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionarioLayout.createSequentialGroup()
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfQuestao62_2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionarioLayout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao62_1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao61_1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36)
                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao61_0, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel34)
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jRadioButton41)
                            .addComponent(jRadioButton37)
                            .addComponent(jRadioButton38)
                            .addComponent(jLabel101)
                            .addComponent(jRadioButton39)
                            .addComponent(jRadioButton40)
                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfQuestao57, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButton36)
                            .addComponent(jRadioButton34)
                            .addComponent(jLabel100)
                            .addComponent(jRadioButton33)
                            .addComponent(jRadioButton35)
                            .addComponent(jLabel31)
                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckRest)
                                            .addComponent(ckConsumidor))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionarioLayout.createSequentialGroup()
                                        .addComponent(ckSuper)
                                        .addGap(4, 4, 4)))
                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ckRevendedores, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckOutro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckFeiras, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfQuestao60_0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionarioLayout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfQuestao60_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionarioLayout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfQuestao60_2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabQuestionarioLayout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao60_1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        tabQuestionarioLayout.setVerticalGroup(
            tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                        .addComponent(ckConsumidor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckRest))
                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                        .addComponent(ckOutro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckFeiras)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckSuper)
                    .addComponent(ckRevendedores))
                .addGap(45, 45, 45)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton36)
                .addGap(18, 18, 18)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfQuestao57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton41)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao60_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao60_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao60_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao60_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(56, 56, 56)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(tfQuestao61_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(tfQuestao61_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao62_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao62_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao62_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(35, 35, 35)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao63_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao63_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao63_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGap(25, 25, 25)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(679, Short.MAX_VALUE))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgQuestao56;
    private javax.swing.ButtonGroup bgQuestao58;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btNovo;
    private javax.swing.JCheckBox ckConsumidor;
    private javax.swing.JCheckBox ckFeiras;
    private javax.swing.JCheckBox ckOutro;
    private javax.swing.JCheckBox ckRest;
    private javax.swing.JCheckBox ckRevendedores;
    private javax.swing.JCheckBox ckSuper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panelCrudEmpresa3;
    private javax.swing.JPanel tabQuestionario;
    private javax.swing.JTextField tfQuestao57;
    private javax.swing.JTextArea tfQuestao59;
    private javax.swing.JTextField tfQuestao60_0;
    private javax.swing.JTextField tfQuestao60_1;
    private javax.swing.JTextField tfQuestao60_2;
    private javax.swing.JTextField tfQuestao60_3;
    private javax.swing.JTextField tfQuestao61_0;
    private javax.swing.JTextField tfQuestao61_1;
    private javax.swing.JTextField tfQuestao62_0;
    private javax.swing.JTextField tfQuestao62_1;
    private javax.swing.JTextField tfQuestao62_2;
    private javax.swing.JTextField tfQuestao63_0;
    private javax.swing.JTextField tfQuestao63_1;
    private javax.swing.JTextField tfQuestao63_2;
    private javax.swing.JTextArea tfQuestao64;
    private javax.swing.JTextArea tfQuestao65;
    private javax.swing.JTextArea tfQuestao66;
    // End of variables declaration//GEN-END:variables
}
