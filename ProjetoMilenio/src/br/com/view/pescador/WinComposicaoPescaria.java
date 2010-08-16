/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinComposicaoPescaria.java
 *
 * Created on 09/08/2010, 17:04:04
 */
package br.com.view.pescador;

import br.com.view.addMaterial;
import br.com.dao.DAOPescadorComposicao;
import br.com.dao.DAOPescadorMaterial;
import br.com.pojo.PescadorComposicao;
import br.com.pojo.PescadorMaterial;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinComposicaoPescaria extends javax.swing.JPanel {

    /** Creates new form WinComposicaoPescaria */
    private List<PescadorMaterial> pescadorMaterials;
    private PescadorComposicao pescadorComposicao;

    public WinComposicaoPescaria() {

        initComponents();
        initAction();
        MyUtil.initiActionCmd(panel);
        System.out.println("Nome.: "+WinSelecionaPescador.cbPescador.getSelectedItem().toString());
        refresh();
        refreshMaterial();
    }

    private void initAction() {

        btAdd.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (WinSelecionaPescador.cbPescador.getSelectedIndex() > 0) {
                    addMaterial m =
                            new addMaterial(WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId(),
                            PescadorMaterial.class);
                    m.addWindowListener(new WindowAdapter() {

                        @Override
                        public void windowClosed(WindowEvent e) {

                            super.windowClosed(e);
                            if (!pescadorMaterials.isEmpty()) {
                                Integer indice = pescadorMaterials.size();//Valor antigo
                                while (indice == pescadorMaterials.size()) {
                                    pescadorMaterials = new DAOPescadorMaterial().
                                            getListWithQuery("select * from " +
                                            "PescadorMaterial where pescadorId = " +
                                            WinSelecionaPescador.
                                            pescadors.get(WinSelecionaPescador.
                                            cbPescador.getSelectedIndex() - 1).getId());

                                }
                            }
                            refreshMaterial();

                        }
                    });

                }

            }
        });
        btRemove.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new DAOPescadorMaterial().excluir(getPescadorMaterialofTable());
                refreshMaterial();
            }
        });

        btExcluir.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new DAOPescadorComposicao().excluir(getpescadorComposicaoOfPanel());
                refresh();
            }
        });
       
        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        btCadastrar.addActionListener(getActionListener());
        //    btAtualizar.addActionListener(getActionListener());
        btExcluir.addActionListener(getActionListener());



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

        if (cmd.equalsIgnoreCase("Salvar")) {
            if (pescadorComposicao == null) {
                pescadorComposicao = getpescadorComposicaoOfPanel();
                new DAOPescadorComposicao().cadastrar(pescadorComposicao);
            } else {
                 pescadorComposicao = getpescadorComposicaoOfPanel();
            new DAOPescadorComposicao().atualizar(pescadorComposicao);
            }
        } else if (cmd.equalsIgnoreCase("Excluir")) {
            pescadorComposicao = getpescadorComposicaoOfPanel();
            new DAOPescadorComposicao().excluir(pescadorComposicao);
        } else if (cmd.equalsIgnoreCase("Atualizar")) {
          
        }
        clear();
        refresh();
         }

    private void setpescadorComposicaoForPanel(PescadorComposicao p) {

        tfQuestao1.setText(p.getQuestao1());
        tfQuestao2.setText(p.getQuestao2());
        tfQuestao3.setText(p.getQuestao3());
        tfQuestao4.setText(p.getQuestao4());
        tfQuestao5.setText(p.getQuestao5());
        tfQuestao6.setText(p.getQuestao6());
        tfQuestao7.setText(p.getQuestao7());
        tfQuestao8.setText(p.getQuestao8());
        tfQuestao9.setText(p.getQuestao9());
        tfQuestao10.setText(p.getQuestao10());
        tfQuestao11.setText(p.getQuestao11());
        tfQuestao12.setText(p.getQuestao12());
        tfQuestao13.setText(p.getQuestao13());
        tfQuestao14.setText(p.getQuestao14());
        tfQuestao15.setText(p.getQuestao15());
        tfQuestao16.setText(p.getQuestao16());
        tfQuestao17.setText(p.getQuestao17());
        MyUtil.setOpcaoWithResponse(bgQuestao18, p.getQuestao18(), tfQuestao18);
    }

    private PescadorComposicao getpescadorComposicaoOfPanel() {

        try {
            String questao1 = tfQuestao1.getText();
        String questao2 = tfQuestao2.getText();
        String questao3 = tfQuestao3.getText();
        String questao4 = tfQuestao4.getText();
        String questao5 = tfQuestao5.getText();
        String questao6 = tfQuestao6.getText();
        String questao7 = tfQuestao7.getText();
        String questao8 = tfQuestao8.getText();
        String questao9 = tfQuestao9.getText();
        String questao10 = tfQuestao10.getText();
        String questao11 = tfQuestao11.getText();
        String questao12 = tfQuestao12.getText();
        String questao13 = tfQuestao13.getText();
        String questao14 = tfQuestao14.getText();
        String questao15 = tfQuestao15.getText();
        String questao16 = tfQuestao16.getText();
        String questao17 = tfQuestao17.getText();
        String questao18 = bgQuestao18.getSelection().getActionCommand() + ";" + tfQuestao18.getText();

        if (this.pescadorComposicao != null) {
            pescadorComposicao.all(questao1, questao2, questao3, questao4,
                    questao5, questao6, questao7, questao8, questao9, questao10,
                    questao11, questao12, questao13, questao14, questao15, questao16,
                    questao17, questao18, pescadorComposicao.getPescadorId());
            return pescadorComposicao;
        }

        PescadorComposicao pescador = new PescadorComposicao();
        pescador.all(questao1, questao2, questao3, questao4, questao5, questao6,
                questao7, questao8, questao9, questao10, questao11, questao12,
                questao13, questao14, questao15, questao16, questao17, questao18,
                WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());

        return pescador;
        } catch (Exception e) {
            Mensagens.showMessageErroPreencherDados();
        }
        return null;
    }

    private void clear() {
       
        pescadorComposicao = null;
    }

    private void refresh() {
        pescadorComposicao = new DAOPescadorComposicao().getObjectWithQuery("select * from " +
                "PescadorComposicao where pescadorId = " +
                WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());
        if (pescadorComposicao != null) {
            setpescadorComposicaoForPanel(pescadorComposicao);
        }

    }

    private void refreshMaterial() {

        pescadorMaterials = new DAOPescadorMaterial().getListWithQuery("select * from " +
                "PescadorMaterial where pescadorId = " +
                WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());
        refreshTable(pescadorMaterials);

    }

    private void refreshTable(List<PescadorMaterial> list) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.clearSelection();
        MyUtil.clearTable(table);
        for (int i = 0; i < list.size(); i++) {
            PescadorMaterial e = list.get(i);
            Object[] objeto = {e.getMaterial(), e.getTipo(), e.getQuantidade(),
                e.getCusto(), e.getOutros(),
                e.getFrequencia()};
            model.addRow(objeto);
        }
    }

    private PescadorMaterial getPescadorMaterialofTable() {
        return pescadorMaterials.get(table.getSelectedRow());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgQuestao18 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        panelCrudEmpresa3 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfQuestao1 = new javax.swing.JTextField();
        tfQuestao3 = new javax.swing.JTextField();
        tfQuestao2 = new javax.swing.JTextField();
        tfQuestao4 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tfQuestao5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfQuestao6 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tfQuestao7 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfQuestao8 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tfQuestao9 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tfQuestao10 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tfQuestao11 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tfQuestao12 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tfQuestao13 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tfQuestao14 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        tfQuestao15 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tfQuestao16 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tfQuestao17 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        tfQuestao18 = new javax.swing.JTextField();
        panelCrudEmpresa7 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1035, 806));

        panelCrudEmpresa3.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Salvar");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btExcluir.setText("Excluir");

        btNovo.setText("Novo");

        jLabel40.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel40.setText("Composição da Pescaria");

        javax.swing.GroupLayout panelCrudEmpresa3Layout = new javax.swing.GroupLayout(panelCrudEmpresa3);
        panelCrudEmpresa3.setLayout(panelCrudEmpresa3Layout);
        panelCrudEmpresa3Layout.setHorizontalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel22)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel14))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrar)
                                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                        .addGap(245, 245, 245)
                                        .addComponent(jLabel40))
                                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btExcluir)))))))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        panelCrudEmpresa3Layout.setVerticalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel49)
                        .addComponent(jLabel14))
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btNovo)
                    .addComponent(btExcluir))
                .addContainerGap())
        );

        jLabel15.setText("Período");

        jLabel16.setText("PescariaPrincipal");

        jLabel23.setText("Arte de Pesca");

        jLabel24.setText("Quantidade");

        jLabel25.setText("Tamanho e Malha");

        tfQuestao6.setColumns(20);
        tfQuestao6.setRows(5);
        jScrollPane1.setViewportView(tfQuestao6);

        jLabel26.setText("Onde adquire as panagens ou Redes prontas (Local?Por que?)");

        jLabel27.setText("Custo com entralhamento ?");

        jLabel28.setText("Pesqueiro? ");

        jLabel29.setText("Dias de Mar");

        jLabel30.setText("Dias Efetivos de Pesca");

        jLabel31.setText("Quantas viagem por mês?");

        jLabel32.setText("Tempo da arte na água");

        jLabel33.setText("Produção por viagem");

        jLabel34.setText("Qual o valor pago pelo Pescado?");

        jLabel35.setText("Renda Média (Especificar Unidade: Pescaria?)");

        jLabel36.setText("Pescaria Secundária");

        jLabel37.setText("Período");

        jLabel38.setText("Os apetrechos de pesca são próprios?");

        bgQuestao18.add(jRadioButton1);
        jRadioButton1.setText("Sim");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        bgQuestao18.add(jRadioButton2);
        jRadioButton2.setText("Não");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel39.setText("Se não de quem?");

        panelCrudEmpresa7.setBackground(new java.awt.Color(255, 255, 255));

        btAdd.setText("Adcionar");
        btAdd.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btAdd.setFocusable(false);
        btAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btRemove.setText("Remove");
        btRemove.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

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
                        .addGap(27, 27, 27)
                        .addComponent(btAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btRemove)))
                .addContainerGap(825, Short.MAX_VALUE))
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
                    .addComponent(btAdd)
                    .addComponent(btRemove))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Quais são os gastos com material utilizado na atividade (Estimar frequencia dos gastos - 1x Por semana, por viagem, por mes)");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Tipo", "Quantidade", "Outros", "Frequencia"
            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfQuestao3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfQuestao4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao5, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuestao18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQuestao14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel30)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(18, 18, 18)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfQuestao9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfQuestao12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfQuestao10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel29)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(296, Short.MAX_VALUE))
            .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tfQuestao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQuestao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tfQuestao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(tfQuestao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tfQuestao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tfQuestao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(tfQuestao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(tfQuestao11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(tfQuestao13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(tfQuestao14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(tfQuestao15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(tfQuestao16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(tfQuestao17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(tfQuestao9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel39)
                    .addComponent(tfQuestao18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelCrudEmpresa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        MyUtil.setEnableFields(false, tfQuestao18);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        MyUtil.setEnableFields(Boolean.TRUE, tfQuestao18);
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgQuestao18;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCrudEmpresa3;
    private javax.swing.JPanel panelCrudEmpresa7;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfQuestao1;
    private javax.swing.JTextField tfQuestao10;
    private javax.swing.JTextField tfQuestao11;
    private javax.swing.JTextField tfQuestao12;
    private javax.swing.JTextField tfQuestao13;
    private javax.swing.JTextField tfQuestao14;
    private javax.swing.JTextField tfQuestao15;
    private javax.swing.JTextField tfQuestao16;
    private javax.swing.JTextField tfQuestao17;
    private javax.swing.JTextField tfQuestao18;
    private javax.swing.JTextField tfQuestao2;
    private javax.swing.JTextField tfQuestao3;
    private javax.swing.JTextField tfQuestao4;
    private javax.swing.JTextField tfQuestao5;
    private javax.swing.JTextArea tfQuestao6;
    private javax.swing.JTextField tfQuestao7;
    private javax.swing.JTextField tfQuestao8;
    private javax.swing.JTextField tfQuestao9;
    // End of variables declaration//GEN-END:variables
}
