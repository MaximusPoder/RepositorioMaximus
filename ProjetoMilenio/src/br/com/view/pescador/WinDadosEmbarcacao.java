/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinDadosEmbarcacao.java
 *
 * Created on 09/08/2010, 17:19:30
 */
package br.com.view.pescador;

import br.com.dao.DAOPescadorDadosEmbarcacao;
import br.com.pojo.PescadorDadosEmbarcacao;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Elton
 */
public class WinDadosEmbarcacao extends javax.swing.JPanel {

    private PescadorDadosEmbarcacao pde;

    /** Creates new form WinDadosEmbarcacao */
    public WinDadosEmbarcacao() {
        initComponents();
        initAction();
        MyUtil.initiActionCmd(panel);
        refresh();

    }

    private void initAction() {


        btExcluir.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new DAOPescadorDadosEmbarcacao().excluir(getpescadorOfPanel());
                refresh();
            }
        });
        WinSelecionaPescador.cbPescador.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (WinSelecionaPescador.cbPescador.getSelectedIndex() > 0) {
                        refresh();

                    } else {
                        clear();
                        pde = null;
                    }
                }
            }
        });


        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        btCadastrar.addActionListener(getActionListener());

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
            if (pde == null) {
                pde = getpescadorOfPanel();
                new DAOPescadorDadosEmbarcacao().cadastrar(pde);
            } else {
                pde = getpescadorOfPanel();
                new DAOPescadorDadosEmbarcacao().atualizar(pde);
            }
        } else if (cmd.equalsIgnoreCase("Excluir")) {
            pde = getpescadorOfPanel();
            new DAOPescadorDadosEmbarcacao().excluir(pde);
        } 
        clear();

    }

    private void setpescadorComposicaoForPanel(PescadorDadosEmbarcacao p) {


        MyUtil.setOpcaoWithResponse(bgQuestao1, p.getQuestao1(), tfQuestao1);
        tfQuestao2.setText(p.getQuestao2());
        MyUtil.setOpcaoWithResponse(bgQuestao3, p.getQuestao3(), tfQuestao3);
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
        tfObs.setText(p.getObservacao());

    }

    private PescadorDadosEmbarcacao getpescadorOfPanel() {

        String questao1 = bgQuestao1.getSelection().getActionCommand() + ";" + tfQuestao1.getText();
        String questao2 = tfQuestao2.getText();
        String questao3 = bgQuestao3.getSelection().getActionCommand() + ";" + tfQuestao3.getText();
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
        String observacao = tfObs.getText();


        if (this.pde != null) {
            pde.all(questao1, questao2, questao3, questao4, questao5,
                    questao6, questao7, questao8, questao9, questao10,
                    questao11, questao12, questao13, questao14, questao15,
                    questao16, questao17, pde.getPescadorId());
            pde.setObservacao(observacao);
            return pde;
        }

        PescadorDadosEmbarcacao pescador = new PescadorDadosEmbarcacao();
        pescador.setObservacao(observacao);
        pescador.all(questao1, questao2, questao3, questao4,
                questao5, questao6, questao7, questao8, questao9,
                questao10, questao11, questao12, questao13, questao14,
                questao15, questao16, questao17,
                WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());

        return pescador;
    }

    private void clear() {

        pde = null;
        refresh();
    }

    private void refresh() {
        if((WinSelecionaPescador.cbPescador.getSelectedIndex() - 1)!=-1){
        pde = new DAOPescadorDadosEmbarcacao().getObjectWithQuery("select * from " +
                "PescadorDadosEmbarcacao where pescadorId = " +
                WinSelecionaPescador.pescadors.
                get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());
        if (pde != null) {
            setpescadorComposicaoForPanel(pde);
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

        bgQuestao1 = new javax.swing.ButtonGroup();
        bgQuestao3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        panelCrudEmpresa3 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        tfQuestao2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        tfQuestao3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfQuestao4 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tfQuestao5 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tfQuestao6 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tfQuestao7 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tfQuestao8 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tfQuestao9 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfQuestao10 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tfQuestao11 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tfQuestao12 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tfQuestao13 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tfQuestao14 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tfQuestao15 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tfQuestao16 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        tfQuestao17 = new javax.swing.JTextField();
        jRadioButton8 = new javax.swing.JRadioButton();
        tfQuestao1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfObs = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1035, 806));

        panelCrudEmpresa3.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Salvar");
        btCadastrar.setToolTipText("Realiza a Confirma��o do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btExcluir.setText("Excluir");

        btNovo.setText("Novo");

        jLabel40.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel40.setText("Dados da Embarca��o");

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
                                .addGap(83, 83, 83)
                                .addComponent(jLabel22)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel14))
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                        .addComponent(btNovo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btExcluir))
                                    .addComponent(jLabel49)))))
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel40)))
                .addContainerGap(574, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btNovo)
                    .addComponent(btExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setText("Possui Embarca��o? ");

        jLabel17.setText("Nivel");

        bgQuestao1.add(jRadioButton1);
        jRadioButton1.setText("CAN");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionQ1(evt);
            }
        });

        bgQuestao1.add(jRadioButton2);
        jRadioButton2.setText("Nenhuma");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionQ1(evt);
            }
        });

        bgQuestao1.add(jRadioButton3);
        jRadioButton3.setText("BMP");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionQ1(evt);
            }
        });

        bgQuestao1.add(jRadioButton4);
        jRadioButton4.setText("CAM");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionQ1(evt);
            }
        });

        bgQuestao1.add(jRadioButton5);
        jRadioButton5.setText("BPP");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionQ1(evt);
            }
        });

        jLabel18.setText("Porto de Origem");

        jLabel20.setText("Tipo:");

        bgQuestao3.add(jRadioButton6);
        jRadioButton6.setText("Pr�pria");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        bgQuestao3.add(jRadioButton7);
        jRadioButton7.setText("Financiada (Quem ?)");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel21.setText("Forma de Financimaneto");

        jLabel23.setText("Nome da Embarca��o");

        jLabel24.setText("Comprimento");

        jLabel25.setText("Ton.Bruta");

        jLabel26.setText("Ton. L�quida");

        jLabel27.setText("Material do Casco");

        jLabel28.setText("Propuls�o");

        jLabel29.setText("Cilindros/Hp");

        jLabel30.setText("Marca");

        jLabel31.setText("Tripula��o");

        jLabel32.setText("Ano de Cosntru��o");

        jLabel33.setText("Situa��o Atual");

        jLabel34.setText("Como se Faz a conserva��o do pescado");

        jLabel35.setText("Possui Inscri��o (IBAMA/Capitania-citar registro)");

        bgQuestao1.add(jRadioButton8);
        jRadioButton8.setText("Outros");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(tfObs);

        jLabel2.setText("Observa��o.:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(703, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addGap(16, 16, 16)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfQuestao1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao16, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuestao17, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tfQuestao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tfQuestao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(tfQuestao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tfQuestao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(tfQuestao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tfQuestao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(tfQuestao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(tfQuestao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfQuestao9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(tfQuestao10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tfQuestao11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(tfQuestao12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(tfQuestao13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tfQuestao14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(tfQuestao15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tfQuestao16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(tfQuestao17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
        MyUtil.setEnableFields(true, tfQuestao1);
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void actionQ1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionQ1
        // TODO add your handling code here:
        MyUtil.setEnableFields(false, tfQuestao1);
    }//GEN-LAST:event_actionQ1

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
        MyUtil.setEnableFields(true, tfQuestao3);
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        MyUtil.setEnableFields(Boolean.FALSE, tfQuestao3);
    }//GEN-LAST:event_jRadioButton6ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgQuestao1;
    private javax.swing.ButtonGroup bgQuestao3;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCrudEmpresa3;
    private javax.swing.JTextPane tfObs;
    private javax.swing.JTextField tfQuestao1;
    private javax.swing.JTextField tfQuestao10;
    private javax.swing.JTextField tfQuestao11;
    private javax.swing.JTextField tfQuestao12;
    private javax.swing.JTextField tfQuestao13;
    private javax.swing.JTextField tfQuestao14;
    private javax.swing.JTextField tfQuestao15;
    private javax.swing.JTextField tfQuestao16;
    private javax.swing.JTextField tfQuestao17;
    private javax.swing.JTextField tfQuestao2;
    private javax.swing.JTextField tfQuestao3;
    private javax.swing.JTextField tfQuestao4;
    private javax.swing.JTextField tfQuestao5;
    private javax.swing.JTextField tfQuestao6;
    private javax.swing.JTextField tfQuestao7;
    private javax.swing.JTextField tfQuestao8;
    private javax.swing.JTextField tfQuestao9;
    // End of variables declaration//GEN-END:variables
}
