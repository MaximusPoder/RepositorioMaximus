/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinQuestionario3.java
 *
 * Created on 08/08/2010, 21:53:03
 */
package br.com.view;

import br.com.dao.DAOEmpresa;
import br.com.dao.DaoQuestionario3;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaImposto;
import br.com.pojo.EmpresaQuestionario3;
import br.com.util.JTableRenderer;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Elton
 */
public class WinQuestionario3 extends javax.swing.JPanel {

    /** Creates new form WinQuestionario3 */
    private EmpresaQuestionario3 empresaQuestionario3;
    private DefaultTableModel model;
    private List<Empresa> empresas;

    public WinQuestionario3() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresaQuestionario3);
        initAction();

        iniciaModeloTable27();
        initiActionCmd(tabQuestionario3);

    }

    private void iniciaModeloTable27() {
        // usa modelo(tabela) para definir um ObjetoGrade Padrao,
        model = (DefaultTableModel) tableQuestao27.getModel();
        model.setRowCount(0); //Defini o numero de linhas zero

        TableColumnModel columnModel = tableQuestao27.getColumnModel();
        tableQuestao27.setRowHeight(tableQuestao27.getRowHeight() + 5);

        columnModel.getColumn(2).setCellRenderer(new JTableRenderer());
        columnModel.getColumn(1).setCellRenderer(new JTableRenderer());
        columnModel.getColumn(0).setCellRenderer(new JTableRenderer());
    }

    private EmpresaQuestionario3 getQuestionario3OfPanel() {

        try {
            String questao24 = tfQuestao24.getText();
            String questao25 = bgQuestao25.getSelection().getActionCommand() + ";" +
                    MyUtil.getStringOfFields(tfQuestao25_0, tfQuestao25_1, tfQuestao25_2);
            String questao26 = bgQuestao26.getSelection().getActionCommand() + ";" +
                    MyUtil.getStringOfFields(tfQuestao26_0, tfQuestao26_1, tfQuestao26_2, tfQuestao26_3);
            String questao27 = bgQuestao27.getSelection().getActionCommand() + "/" +
                    MyUtil.getStringTable(tableQuestao27);
            String questao28 = MyUtil.getStringOfFields(tfQuestao28_0, tfQuestao28_1, tfQuestao28_2);
            String questao29 = tfQuestao29.getText();
            String questao30 = bgQuestao30.getSelection().getActionCommand() + ";" + tfQuestao30.getText();


            if (empresaQuestionario3 != null) {
                empresaQuestionario3.all(questao24, questao25, questao26, questao27,
                        questao28, questao29, questao30,
                        empresas.get(cbEmpresaQuestionario3.getSelectedIndex() - 1).getId());

                return empresaQuestionario3;
            }

            EmpresaQuestionario3 eq = new EmpresaQuestionario3();
            eq.all(questao24, questao25, questao26, questao27,
                    questao28, questao29, questao30,
                    empresas.get(cbEmpresaQuestionario3.getSelectedIndex() - 1).getId());
            return eq;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no cacastro, verifique todos os campos",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;

    }

    private void setQuestionario3ForPanel(EmpresaQuestionario3 eq) {

        tfQuestao24.setText(eq.getQuestao24());
        MyUtil.setStringsToFields(bgQuestao25, eq.getQuestao25(), tfQuestao25_0, tfQuestao25_1, tfQuestao25_2);
        MyUtil.setStringsToFields(bgQuestao26, eq.getQuestao26(), tfQuestao26_0, tfQuestao26_1, tfQuestao26_2, tfQuestao26_3);
        String[] strings = eq.getQuestao27().split("/");
        String table = "";
        for (int i = 1; i < strings.length; i++) {

            table += strings[i] + "/";
        }
        String opcao = strings[0];
        MyUtil.setSelected(opcao, bgQuestao27);
        MyUtil.setStringTable(tableQuestao27, table);
        MyUtil.setStringsToFields(eq.getQuestao28(), tfQuestao28_0, tfQuestao28_1, tfQuestao28_2);
        tfQuestao29.setText(eq.getQuestao29());
        MyUtil.setOpcaoWithResponse(bgQuestao30, eq.getQuestao30(), tfQuestao30);
    }

    private void clearQuestionario3() {

        clearTab(tabQuestionario3);
        MyUtil.limpaTabela(tableQuestao27);


        bgQuestao25.clearSelection();
        bgQuestao26.clearSelection();
        bgQuestao27.clearSelection();
        bgQuestao30.clearSelection();
    }

    /*Metodos Actions do 8° Tab = Questionario 3*/
    private void actionEmpresaQuestionario3(ActionEvent e) {

        String cmd = e.getActionCommand();
        if (cbEmpresaQuestionario3.getSelectedIndex() > 0) {


            if (cmd.equalsIgnoreCase("Cadastrar")) {
                if (empresaQuestionario3 == null) {
                    empresaQuestionario3 = getQuestionario3OfPanel();
                    new DaoQuestionario3().cadastrar(empresaQuestionario3);
                } else {
                    Mensagens.showMessageNaoCadastrar();
                }
            } else if (cmd.equalsIgnoreCase("Atualizar")) {
                empresaQuestionario3 = getQuestionario3OfPanel();
                new DaoQuestionario3().atualizar(empresaQuestionario3);
            }
            clearQuestionario3();
            cbEmpresaQuestionario3.setSelectedIndex(0);
        }
    }

    private void initAction() {

        btAddLinhaQ3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Object[] objeto = {tfBanco.getText(), tfCredito.getText(), tfFinalidade.getText(),
                    tfDataEmprestimo.getText(), tfCarencia.getText(), tfPrestacao.getText(),
                    tfPagou.getText(), tfDia.getText()};
                model.addRow(objeto);

            }
        });
        btRetiraQ3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                model.removeRow(tableQuestao27.getSelectedRow());
            }
        });
        btNovoQuestionario3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario3(e);
            }
        });
        cbEmpresaQuestionario3.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbEmpresaQuestionario3.getSelectedIndex() > 0) {
                        isExist();
                    } else {
                        clearQuestionario3();
                    }
                }
            }
        });
        btCadastrarQuestionario3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario3(e);
            }
        });
        btAtualizarQuestionario3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresaQuestionario3(e);
            }
        });


    }

    private void isExist() {
        empresaQuestionario3 =
                new DaoQuestionario3().getObjectWithQuery("select * from EmpresaQuestionario3" +
                " where empresaId = " +
                empresas.get(cbEmpresaQuestionario3.getSelectedIndex() - 1).getId());
        if (empresaQuestionario3 != null) {
            setQuestionario3ForPanel(empresaQuestionario3);
        } else {
            clearQuestionario3();
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

        bgQuestao25 = new javax.swing.ButtonGroup();
        bgQuestao26 = new javax.swing.ButtonGroup();
        bgQuestao27 = new javax.swing.ButtonGroup();
        bgQuestao30 = new javax.swing.ButtonGroup();
        ScrollQuestionario3 = new javax.swing.JScrollPane();
        tabQuestionario3 = new javax.swing.JPanel();
        panelCrudEmpresa7 = new javax.swing.JPanel();
        btCadastrarQuestionario3 = new javax.swing.JButton();
        btAtualizarQuestionario3 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        btNovoQuestionario3 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        cbEmpresaQuestionario3 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tfQuestao24 = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tfQuestao29 = new javax.swing.JTextArea();
        jLabel82 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tfQuestao30 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        tableQuestao27 = new javax.swing.JTable();
        btAddLinhaQ3 = new javax.swing.JButton();
        btRetiraQ3 = new javax.swing.JButton();
        tfBanco = new javax.swing.JTextField();
        tfCredito = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        tfDataEmprestimo = new javax.swing.JTextField();
        tfFinalidade = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        tfPrestacao = new javax.swing.JTextField();
        tfCarencia = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        tfDia = new javax.swing.JTextField();
        tfPagou = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfQuestao25_2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfQuestao25_0 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfQuestao25_1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfQuestao26_2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfQuestao26_1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfQuestao26_0 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfQuestao26_3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfQuestao28_0 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfQuestao28_1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfQuestao28_2 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(900, 1300));
        setPreferredSize(new java.awt.Dimension(900, 1700));

        ScrollQuestionario3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollQuestionario3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabQuestionario3.setPreferredSize(new java.awt.Dimension(1000, 1500));

        panelCrudEmpresa7.setBackground(new java.awt.Color(255, 255, 255));
        panelCrudEmpresa7.setPreferredSize(new java.awt.Dimension(900, 67));

        btCadastrarQuestionario3.setText("Cadastrar");
        btCadastrarQuestionario3.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrarQuestionario3.setFocusable(false);
        btCadastrarQuestionario3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarQuestionario3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizarQuestionario3.setText("Atualizar");
        btAtualizarQuestionario3.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btNovoQuestionario3.setText("Novo");

        jLabel71.setText("Empresa");

        cbEmpresaQuestionario3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel12.setText("Impostos -Parte 2");

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
                    .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                        .addComponent(btNovoQuestionario3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrarQuestionario3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizarQuestionario3)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(cbEmpresaQuestionario3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(381, Short.MAX_VALUE))
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
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizarQuestionario3)
                    .addComponent(btCadastrarQuestionario3)
                    .addComponent(btNovoQuestionario3)
                    .addComponent(jLabel71)
                    .addComponent(cbEmpresaQuestionario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel73.setText("24 - Como você avalia os incentivos fisais para a melhoria do rendimento da indústria?");

        jLabel74.setText("25 - Alguma Inserção foi retirada?");

        jLabel77.setText("26 -Faz uso da subvenção do óleo diesel? ");

        tfQuestao24.setColumns(20);
        tfQuestao24.setRows(5);
        jScrollPane18.setViewportView(tfQuestao24);

        jLabel78.setText("27 - Fez algum emprestimo?");

        bgQuestao27.add(jRadioButton11);
        jRadioButton11.setText("Sim");

        bgQuestao27.add(jRadioButton12);
        jRadioButton12.setText("Não");

        bgQuestao25.add(jRadioButton9);
        jRadioButton9.setText("Sim");

        bgQuestao25.add(jRadioButton10);
        jRadioButton10.setText("Não");

        bgQuestao26.add(jRadioButton13);
        jRadioButton13.setText("Sim");

        bgQuestao26.add(jRadioButton14);
        jRadioButton14.setText("Não");

        jLabel79.setText("28 - As universidades e outras intituições de pesquisa tem colaborado (voluntariamente ou através de demanda da empresa) com o desenvolvimento de: ");

        jLabel80.setText("29 -Como Você observa a atuação das instituições IBAMA; SEPAQ; MINISTÉRIO DA PESCA; UNIVERSIDADES e qual a sua relação com estas? ");

        tfQuestao29.setColumns(20);
        tfQuestao29.setRows(5);
        jScrollPane22.setViewportView(tfQuestao29);

        jLabel82.setText("30 - Atualmente, existem pesquisa na empresa para a introdução de novas espécies? ");

        bgQuestao30.add(jRadioButton15);
        jRadioButton15.setText("Sim");

        bgQuestao30.add(jRadioButton16);
        jRadioButton16.setText("Não");

        jLabel86.setText("Relacionar:");

        jLabel90.setText("Se Sim, Quais?");

        tfQuestao30.setColumns(20);
        tfQuestao30.setRows(5);
        jScrollPane24.setViewportView(tfQuestao30);

        tableQuestao27.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Banco", "Linha de Crédito", "Finalidade (Giro)", "Data de emprestimo", "Carência", "Prestações", "Qtas Pagou", "Em dia/Atrasado/Inadimplente"
            }
        ));
        jScrollPane15.setViewportView(tableQuestao27);

        btAddLinhaQ3.setText("Add Linha");

        btRetiraQ3.setText("Retira Linha");

        jLabel91.setText("Banco");

        jLabel101.setText("Linha de credito");

        jLabel102.setText("Finalidade");

        jLabel103.setText("Data de Emprestimo");

        jLabel104.setText("Carência");

        jLabel105.setText("Prestações");

        jLabel106.setText("Qtas Pagou");

        jLabel107.setText("Em dia/Atrasado/Inadimplente");

        jLabel1.setText("Por que?");

        jLabel2.setText("Qual?");

        jLabel3.setText("Quando?");

        jLabel4.setText("Quantos Litros?");

        jLabel5.setText("Quantos Barcos?");

        jLabel6.setText("Se sim, desde Quando?");

        jLabel7.setText("Se não, por que?");

        jLabel8.setText("Qual?");

        jLabel9.setText("Quando?");

        jLabel10.setText("Por que?");

        javax.swing.GroupLayout tabQuestionario3Layout = new javax.swing.GroupLayout(tabQuestionario3);
        tabQuestionario3.setLayout(tabQuestionario3Layout);
        tabQuestionario3Layout.setHorizontalGroup(
            tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addComponent(jRadioButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel86))
                            .addComponent(jLabel78))
                        .addContainerGap(842, Short.MAX_VALUE))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addContainerGap(579, Short.MAX_VALUE))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addContainerGap(254, Short.MAX_VALUE))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(btAddLinhaQ3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRetiraQ3)
                        .addContainerGap(816, Short.MAX_VALUE))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel102)
                            .addComponent(jLabel103)
                            .addComponent(jLabel101)
                            .addComponent(jLabel91))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfCredito)
                                .addComponent(tfFinalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(tfDataEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107)
                            .addComponent(jLabel106)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCarencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrestacao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPagou, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(503, Short.MAX_VALUE))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton10))
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton14))
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13164, 13164, 13164))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao25_0, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addGap(13947, 13947, 13947))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao25_2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addGap(13845, 13845, 13845))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(tfQuestao25_1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addContainerGap(851, Short.MAX_VALUE))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao26_2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfQuestao26_1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfQuestao26_0, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)))
                        .addGap(13845, 13845, 13845))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao26_3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addGap(13845, 13845, 13845))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao28_0, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addGap(102, 102, 102))
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao28_2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(tfQuestao28_1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13845, 13845, 13845))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(310, Short.MAX_VALUE))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                                .addComponent(jRadioButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel90))
                            .addComponent(jLabel82)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(392, Short.MAX_VALUE))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(269, Short.MAX_VALUE))))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13247, Short.MAX_VALUE))
        );
        tabQuestionario3Layout.setVerticalGroup(
            tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao25_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfQuestao25_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfQuestao25_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao26_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfQuestao26_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfQuestao26_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfQuestao26_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton12)
                            .addComponent(jLabel86))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAddLinhaQ3)
                            .addComponent(btRetiraQ3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91)
                            .addComponent(tfBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101)
                            .addComponent(tfCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel102)
                            .addComponent(tfFinalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(tfDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel104)
                            .addComponent(tfCarencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrestacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(tfPagou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel107)
                            .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel79)
                .addGap(18, 18, 18)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuestao28_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfQuestao28_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfQuestao28_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(870, 870, 870))
        );

        ScrollQuestionario3.setViewportView(tabQuestionario3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ScrollQuestionario3, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ScrollQuestionario3, javax.swing.GroupLayout.DEFAULT_SIZE, 1700, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollQuestionario3;
    private javax.swing.ButtonGroup bgQuestao25;
    private javax.swing.ButtonGroup bgQuestao26;
    private javax.swing.ButtonGroup bgQuestao27;
    private javax.swing.ButtonGroup bgQuestao30;
    private javax.swing.JButton btAddLinhaQ3;
    private javax.swing.JButton btAtualizarQuestionario3;
    private javax.swing.JButton btCadastrarQuestionario3;
    private javax.swing.JButton btNovoQuestionario3;
    private javax.swing.JButton btRetiraQ3;
    private javax.swing.JComboBox cbEmpresaQuestionario3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JPanel panelCrudEmpresa7;
    private javax.swing.JPanel tabQuestionario3;
    private javax.swing.JTable tableQuestao27;
    private javax.swing.JTextField tfBanco;
    private javax.swing.JTextField tfCarencia;
    private javax.swing.JTextField tfCredito;
    private javax.swing.JTextField tfDataEmprestimo;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfFinalidade;
    private javax.swing.JTextField tfPagou;
    private javax.swing.JTextField tfPrestacao;
    private javax.swing.JTextArea tfQuestao24;
    private javax.swing.JTextField tfQuestao25_0;
    private javax.swing.JTextField tfQuestao25_1;
    private javax.swing.JTextField tfQuestao25_2;
    private javax.swing.JTextField tfQuestao26_0;
    private javax.swing.JTextField tfQuestao26_1;
    private javax.swing.JTextField tfQuestao26_2;
    private javax.swing.JTextField tfQuestao26_3;
    private javax.swing.JTextField tfQuestao28_0;
    private javax.swing.JTextField tfQuestao28_1;
    private javax.swing.JTextField tfQuestao28_2;
    private javax.swing.JTextArea tfQuestao29;
    private javax.swing.JTextArea tfQuestao30;
    // End of variables declaration//GEN-END:variables
}
