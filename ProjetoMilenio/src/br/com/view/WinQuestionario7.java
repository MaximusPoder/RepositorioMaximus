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

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOQuestionario7;

import br.com.pojo.Empresa;
import br.com.pojo.EmpresaQuestionario7;
import br.com.util.MyUtil;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinQuestionario7 extends javax.swing.JPanel {

    /** Creates new form WinQuestionario7 */
    private String textoHTMLQ60;
    private String textoHTMLQ61;
    private String textoHTMLQ62;
    private String textoHTMLQ63;
    private EmpresaQuestionario7 empresaQuestionario7;
    private DefaultTableModel model;
    private List<Empresa> empresas;

    public WinQuestionario7() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresa);
        initAction();
        initiActionCmd(tabQuestionario);
        initTextHtml();
    }

    private void initTextHtml() {

        textoHTMLQ60 = tfQuestao60.getText();
        textoHTMLQ61 = tfQuestao61.getText();
        textoHTMLQ62 = tfQuestao62.getText();
        textoHTMLQ63 = tfQuestao63.getText();
    }

    private EmpresaQuestionario7 getQuestionario7OfPanel() {

        String questao55 = MyUtil.getSelected(ckConsumidor, ckFeiras, ckOutro, ckRest, ckRevendedores, ckSuper);
        String questao56 = bgQuestao56.getSelection().getActionCommand();
        String questao57 = tfQuestao57.getText();
        String questao58 = bgQuestao58.getSelection().getActionCommand();
        String questao59 = tfQuestao59.getText();
        String questao60 = tfQuestao59.getText();
        String questao61 = tfQuestao61.getText();
        String questao62 = tfQuestao62.getText();
        String questao63 = tfQuestao63.getText();

        String questao64 = tfQuestao64.getText();
        String questao65 = tfQuestao65.getText();
        String questao66 = tfQuestao66.getText();


        if (empresaQuestionario7 != null) {
            empresaQuestionario7.all(questao55, questao56, questao57,
                    questao58, questao59, questao60, questao61, questao62, questao63,
                    questao64, questao65, questao66, empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());

            return empresaQuestionario7;
        }

        EmpresaQuestionario7 eq = new EmpresaQuestionario7();
        eq.all(questao55, questao56, questao57, questao58, questao59, questao60,
                questao61, questao62, questao63, questao64, questao65, questao66,
                empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
        return eq;
    }

    private void setQuestionario7ForPanel(EmpresaQuestionario7 eq) {

        MyUtil.setSelected(eq.getQuestao55(),
                ckConsumidor, ckFeiras, ckOutro, ckRest, ckRevendedores, ckSuper);
        MyUtil.setSelected(eq.getQuestao56(), bgQuestao56);
        tfQuestao57.setText(eq.getQuestao57());
        MyUtil.setSelected(eq.getQuestao58(), bgQuestao58);
        tfQuestao59.setText(eq.getQuestao59());
        tfQuestao60.setText(eq.getQuestao60());
        tfQuestao61.setText(eq.getQuestao61());
        tfQuestao62.setText(eq.getQuestao62());
        tfQuestao63.setText(eq.getQuestao63());
        tfQuestao64.setText(eq.getQuestao64());
        tfQuestao65.setText(eq.getQuestao65());
        tfQuestao66.setText(eq.getQuestao66());
    }

    private void clearQuestionario7() {

        clearTab(tabQuestionario);        
        tfQuestao60.setText(textoHTMLQ60);
        tfQuestao61.setText(textoHTMLQ61);
        tfQuestao62.setText(textoHTMLQ62);
        tfQuestao63.setText(textoHTMLQ63);
        MyUtil.clearCheckBox(tabQuestionario);
        bgQuestao56.clearSelection();
        bgQuestao58.clearSelection();
    }

    /*Metodos Actions do 8° Tab = Questionario 3*/
    private void actionEmpresaQuestionario7(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cmd.equalsIgnoreCase("Cadastrar")) {
            empresaQuestionario7 = getQuestionario7OfPanel();
            new DAOQuestionario7().cadastrar(empresaQuestionario7);
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
            empresaQuestionario7 = getQuestionario7OfPanel();
            new DAOQuestionario7().atualizar(empresaQuestionario7);
        }
        clearQuestionario7();
        cbEmpresa.setSelectedIndex(0);
    }

    private void initAction() {


        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario7(e);
            }
        });
        cbEmpresa.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbEmpresa.getSelectedIndex() > 0) {
                        isExist();
                        
                    } else {
                        clearQuestionario7();
                        
                    }
                }
            }
        });
        btCadastrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario7(e);
            }
        });
        btAtualizar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario7(e);
            }
        });


    }

    private void isExist() {
        empresaQuestionario7 =
                new DAOQuestionario7().getObjectWithQuery("select * from EmpresaQuestionario7" +
                " where empresaId = " +
                empresas.get(cbEmpresa.getSelectedIndex() - 1).getId());
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
        btAtualizar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        cbEmpresa = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        ckConsumidor = new javax.swing.JCheckBox();
        ckOutro = new javax.swing.JCheckBox();
        ckRest = new javax.swing.JCheckBox();
        ckFeiras = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tfQuestao59 = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tfQuestao60 = new javax.swing.JTextArea();
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
        jScrollPane9 = new javax.swing.JScrollPane();
        tfQuestao61 = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tfQuestao62 = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tfQuestao63 = new javax.swing.JTextArea();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tfQuestao64 = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tfQuestao65 = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tfQuestao66 = new javax.swing.JTextArea();

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabQuestionario.setAutoscrolls(true);
        tabQuestionario.setPreferredSize(new java.awt.Dimension(990, 2300));

        panelCrudEmpresa3.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Cadastrar");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizar.setText("Atualizar");
        btAtualizar.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btNovo.setText("Novo");

        jLabel35.setText("Empresa");

        cbEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelCrudEmpresa3Layout = new javax.swing.GroupLayout(panelCrudEmpresa3);
        panelCrudEmpresa3.setLayout(panelCrudEmpresa3Layout);
        panelCrudEmpresa3Layout.setHorizontalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel25)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel28))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel49))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1046, Short.MAX_VALUE))
        );
        panelCrudEmpresa3Layout.setVerticalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel49)
                        .addComponent(jLabel28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btCadastrar)
                    .addComponent(btNovo)
                    .addComponent(jLabel35)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tfQuestao60.setColumns(20);
        tfQuestao60.setRows(5);
        tfQuestao60.setText("Administração:\n\nBeneficiamento:\n\nApoio:\n\nPescadores:");
        jScrollPane8.setViewportView(tfQuestao60);

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

        tfQuestao61.setColumns(20);
        tfQuestao61.setRows(5);
        tfQuestao61.setText("Verão:\n\nInverno:");
        jScrollPane9.setViewportView(tfQuestao61);

        jLabel37.setText("62 - Média de tempo de permanência dos funcionarios na empresa (em anos) ?");

        tfQuestao62.setColumns(20);
        tfQuestao62.setRows(5);
        tfQuestao62.setText("Administração:\n\nBeneficiamento:\n\nApoio:");
        jScrollPane10.setViewportView(tfQuestao62);

        jLabel38.setText("63  - Salário médio do funcionario ?");

        tfQuestao63.setColumns(20);
        tfQuestao63.setRows(5);
        tfQuestao63.setText("Administração:R$\n\nBeneficiamento:R$\n\nApoio:R$");
        jScrollPane11.setViewportView(tfQuestao63);

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

        javax.swing.GroupLayout tabQuestionarioLayout = new javax.swing.GroupLayout(tabQuestionario);
        tabQuestionario.setLayout(tabQuestionarioLayout);
        tabQuestionarioLayout.setHorizontalGroup(
            tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel38)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                    .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel37)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())
                                    .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addGap(1376, 1376, 1376))
                                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addContainerGap())
                                            .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                    .addComponent(jRadioButton41)
                                                    .addContainerGap())
                                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                                .addComponent(jRadioButton37)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                                .addComponent(jRadioButton38)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel101)
                                                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jRadioButton39)
                                                                    .addComponent(jRadioButton40))
                                                                .addGap(137, 137, 137)))
                                                        .addContainerGap())
                                                    .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                            .addComponent(jLabel1)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(tfQuestao57, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addContainerGap())
                                                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                                .addComponent(jRadioButton36)
                                                                .addContainerGap())
                                                            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                                .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jRadioButton34)
                                                                    .addComponent(jLabel100)
                                                                    .addGroup(tabQuestionarioLayout.createSequentialGroup()
                                                                        .addGroup(tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jRadioButton33)
                                                                            .addComponent(jRadioButton35))
                                                                        .addGap(137, 137, 137))
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
                                                                            .addComponent(ckFeiras, javax.swing.GroupLayout.Alignment.LEADING))))
                                                                .addContainerGap(1098, Short.MAX_VALUE))))))))))))))
        );
        tabQuestionarioLayout.setVerticalGroup(
            tabQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionarioLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(701, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(tabQuestionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgQuestao56;
    private javax.swing.ButtonGroup bgQuestao58;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btNovo;
    private javax.swing.JComboBox cbEmpresa;
    private javax.swing.JCheckBox ckConsumidor;
    private javax.swing.JCheckBox ckFeiras;
    private javax.swing.JCheckBox ckOutro;
    private javax.swing.JCheckBox ckRest;
    private javax.swing.JCheckBox ckRevendedores;
    private javax.swing.JCheckBox ckSuper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel panelCrudEmpresa3;
    private javax.swing.JPanel tabQuestionario;
    private javax.swing.JTextField tfQuestao57;
    private javax.swing.JTextArea tfQuestao59;
    private javax.swing.JTextArea tfQuestao60;
    private javax.swing.JTextArea tfQuestao61;
    private javax.swing.JTextArea tfQuestao62;
    private javax.swing.JTextArea tfQuestao63;
    private javax.swing.JTextArea tfQuestao64;
    private javax.swing.JTextArea tfQuestao65;
    private javax.swing.JTextArea tfQuestao66;
    // End of variables declaration//GEN-END:variables
}
