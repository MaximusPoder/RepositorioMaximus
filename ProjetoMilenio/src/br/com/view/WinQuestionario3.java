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
import br.com.util.MyUtil;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
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
    private String textoHTMLQ25;
    private String textoHTMLQ26;
    private String textoHTMLQ30;

    public WinQuestionario3() {
        initComponents();
        empresas = new DAOEmpresa().getListWithQuery("select * from Empresa");
        MyUtil.refresComboBox(empresas, cbEmpresaQuestionario3);
        initAction();
        initiActionCmd(tabQuestionario3);
        initTextHtml();
        iniciaModeloTable27();
       
    }

    private void initTextHtml() {

        textoHTMLQ25 = tfQuestao25.getText();
        textoHTMLQ26 = tfQuestao26.getText();
        textoHTMLQ30 = tfQuestao30.getText();
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

        String questao24 = tfQuestao24.getText();
        String questao25 = bgQuestao25.getSelection().getActionCommand() + ";" + tfQuestao25.getText();
        String questao26 = bgQuestao26.getSelection().getActionCommand() + ";" + tfQuestao26.getText();
        String questao27 = bgQuestao27.getSelection().getActionCommand() + "/" +
                MyUtil.getStringTable(tableQuestao27);
        String questao28 = tfQuestao28.getText();
        String questao29 = tfQuestao29.getText();
        String questao30 = bgQuestao30.getSelection().getActionCommand() + ";" + tfQuestao30.getText();


        if (empresaQuestionario3 != null) {
            empresaQuestionario3.all(questao24, questao25, questao26, questao27,
                    questao28, questao29, questao30,
                    empresas.get(cbEmpresaQuestionario3.getSelectedIndex()-1).getId());

            return empresaQuestionario3;
        }

        EmpresaQuestionario3 eq = new EmpresaQuestionario3();
        eq.all(questao24, questao25, questao26, questao27,
                questao28, questao29, questao30,
                empresas.get(cbEmpresaQuestionario3.getSelectedIndex()-1).getId());
        return eq;
    }

    private void setQuestionario3ForPanel(EmpresaQuestionario3 eq) {

        tfQuestao24.setText(eq.getQuestao24());
        MyUtil.setOpcaoWithResponse(bgQuestao25, eq.getQuestao25(), tfQuestao25);
        MyUtil.setOpcaoWithResponse(bgQuestao26, eq.getQuestao26(), tfQuestao26);
        String[] strings = eq.getQuestao27().split("/");
        String table = "";
        for (int i = 1; i < strings.length; i++) {

            table += strings[i] + "/";
        }
        String opcao = strings[0];
        MyUtil.setSelected(opcao, bgQuestao27);
        MyUtil.setStringTable(tableQuestao27, table);
        tfQuestao28.setText(eq.getQuestao28());
        tfQuestao29.setText(eq.getQuestao29());
        MyUtil.setOpcaoWithResponse(bgQuestao30, eq.getQuestao30(), tfQuestao30);
    }

    private void clearQuestionario3() {

        clearTab(tabQuestionario3);
        MyUtil.limpaTabela(tableQuestao27);
        tfQuestao26.setText(textoHTMLQ26);
        tfQuestao25.setText(textoHTMLQ25);
        tfQuestao30.setText(textoHTMLQ30);
        bgQuestao25.clearSelection();
        bgQuestao26.clearSelection();
        bgQuestao27.clearSelection();
        bgQuestao30.clearSelection();
    }

    /*Metodos Actions do 8° Tab = Questionario 3*/
    private void actionEmpresaQuestionario3(ActionEvent e) {

        String cmd = e.getActionCommand();
        if(cbEmpresaQuestionario3.getSelectedIndex()>0){
        if (cmd.equalsIgnoreCase("Cadastrar")) {
            empresaQuestionario3 = getQuestionario3OfPanel();
            new DaoQuestionario3().cadastrar(empresaQuestionario3);
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
                    if(cbEmpresaQuestionario3.getSelectedIndex()>0)
                    isExist();
                    else  clearQuestionario3();
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
                empresas.get(cbEmpresaQuestionario3.getSelectedIndex()-1).getId());
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
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tfQuestao25 = new javax.swing.JTextArea();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tfQuestao24 = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        tfQuestao26 = new javax.swing.JTextArea();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tfQuestao28 = new javax.swing.JTextArea();
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

        setMaximumSize(new java.awt.Dimension(999, 999));
        setPreferredSize(new java.awt.Dimension(1099, 1300));

        ScrollQuestionario3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollQuestionario3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelCrudEmpresa7.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addComponent(cbEmpresaQuestionario3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13075, Short.MAX_VALUE))
        );
        panelCrudEmpresa7Layout.setVerticalGroup(
            panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel69)
                        .addComponent(jLabel70)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizarQuestionario3)
                    .addComponent(btCadastrarQuestionario3)
                    .addComponent(btNovoQuestionario3)
                    .addComponent(jLabel71)
                    .addComponent(cbEmpresaQuestionario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel73.setText("24 - Como você avalia os incentivos fisais para a melhoria do rendimento da indústria?");

        jLabel74.setText("25 - Alguma Inserção foi retirada?");

        tfQuestao25.setColumns(20);
        tfQuestao25.setRows(5);
        tfQuestao25.setText("Qual?\n\nQuando?\n\nPorque?\n");
        jScrollPane17.setViewportView(tfQuestao25);

        jLabel77.setText("26 -Faz uso da subvenção do óleo diesel? ");

        tfQuestao24.setColumns(20);
        tfQuestao24.setRows(5);
        jScrollPane18.setViewportView(tfQuestao24);

        jLabel78.setText("27 - Fez algum emprestimo?");

        bgQuestao27.add(jRadioButton11);
        jRadioButton11.setText("Sim");

        bgQuestao27.add(jRadioButton12);
        jRadioButton12.setText("Não");

        tfQuestao26.setColumns(20);
        tfQuestao26.setRows(5);
        tfQuestao26.setText("Se Sim, Desde Quando?\n\nQuantos Barcos?\n\nQuantos Litros?\n\nSe não, porque");
        jScrollPane20.setViewportView(tfQuestao26);

        bgQuestao25.add(jRadioButton9);
        jRadioButton9.setText("Sim");

        bgQuestao25.add(jRadioButton10);
        jRadioButton10.setText("Não");

        jLabel81.setText("Porque? ");

        bgQuestao26.add(jRadioButton13);
        jRadioButton13.setText("Sim");

        bgQuestao26.add(jRadioButton14);
        jRadioButton14.setText("Não");

        jLabel79.setText("28 - As universidades e outras intituições de pesquisa tem colaborado (voluntariamente ou através de demanda da empresa) com o desenvolvimento de: ");

        tfQuestao28.setColumns(20);
        tfQuestao28.setRows(5);
        tfQuestao28.setText("a)Novos Produtos?Quais?\n\nb)Tecnologia? Quais?\n\nc)Espécies?Quais?");
        jScrollPane21.setViewportView(tfQuestao28);

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

        javax.swing.GroupLayout tabQuestionario3Layout = new javax.swing.GroupLayout(tabQuestionario3);
        tabQuestionario3.setLayout(tabQuestionario3Layout);
        tabQuestionario3Layout.setHorizontalGroup(
            tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel86))
                    .addComponent(jLabel78))
                .addContainerGap(13417, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73)
                .addContainerGap(13154, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80)
                .addContainerGap(12885, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jRadioButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel90))
                    .addComponent(jLabel82))
                .addContainerGap(13153, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12967, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12967, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel79)
                .addContainerGap(12829, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12967, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAddLinhaQ3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRetiraQ3)
                .addContainerGap(13391, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
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
                .addContainerGap(13039, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12631, Short.MAX_VALUE))
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(tabQuestionario3Layout.createSequentialGroup()
                        .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11199, Short.MAX_VALUE)
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1395, 1395, 1395))))
        );
        tabQuestionario3Layout.setVerticalGroup(
            tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabQuestionario3Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel81)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jLabel104)
                    .addComponent(tfCarencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrestacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jLabel106)
                    .addComponent(tfPagou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFinalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel107)
                    .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabQuestionario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(779, Short.MAX_VALUE))
        );

        ScrollQuestionario3.setViewportView(tabQuestionario3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ScrollQuestionario3, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ScrollQuestionario3, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
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
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JTextField jTextField7;
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
    private javax.swing.JTextArea tfQuestao25;
    private javax.swing.JTextArea tfQuestao26;
    private javax.swing.JTextArea tfQuestao28;
    private javax.swing.JTextArea tfQuestao29;
    private javax.swing.JTextArea tfQuestao30;
    // End of variables declaration//GEN-END:variables
}
