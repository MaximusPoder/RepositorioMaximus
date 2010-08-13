/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinPanelPescador.java
 *
 * Created on 09/08/2010, 16:44:31
 */
package br.com.view.pescador;

import br.com.dao.DAOEmpresa;
import br.com.dao.DAOPescador;
import br.com.pojo.Pescador;
import br.com.util.Mensagens;
import br.com.util.MyUtil;
import br.com.view.WinConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Elton
 */
public class WinPanelPescador extends javax.swing.JPanel {

    /** Creates new form WinPanelPescador */
    private List municipios;
    private Pescador pescador;

    public WinPanelPescador() {
        initComponents();
        municipios = new DAOEmpresa().getMunicipiosWithQuery();
        MyUtil.refresComboBox(municipios, cbMunicipioQuestao1);
        initAction();
        MyUtil.initiActionCmd(panel);
    }

    private void initAction() {

        //Botoes do primeiro TAB
        btPesquisa.addActionListener(getActionListenerpescador());
        btNovo.addActionListener(getActionListenerpescador());
        btCadastrar.addActionListener(getActionListenerpescador());
        btAtualizar.addActionListener(getActionListenerpescador());
        btExcluir.addActionListener(getActionListenerpescador());
    }
    /*Metodos Actions do Primeiro Tab = pescador*/

    private ActionListener getActionListenerpescador() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        };
    }

    private void action(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equalsIgnoreCase("Pesquisar")) {
            final WinConsulta consulta = new WinConsulta(Pescador.class,
                    new DAOPescador());
            consulta.setVisible(true);
            consulta.addWindowListener(new WindowAdapter() {

                @Override
                public void windowClosed(WindowEvent e) {
                    super.windowClosed(e);
                    pescador = (Pescador) consulta.getCurrentElement();
                    if (pescador != null) {
                        setpescadorForPanel(pescador);
                    }
                }
            });
        } else {
            if (cmd.equalsIgnoreCase("Cadastrar")) {
                if(pescador == null){
                pescador = getpescadorOfPanel();
                new DAOPescador().cadastrar(pescador);}else Mensagens.showMessageNaoCadastrar();
            } else if (cmd.equalsIgnoreCase("Excluir")) {
                pescador = getpescadorOfPanel();
                new DAOPescador().excluir(pescador);
            } else if (cmd.equalsIgnoreCase("Atualizar")) {
                pescador = getpescadorOfPanel();
                 new DAOPescador().atualizar(pescador);
            }
            clear();
        }

    }

    private void setpescadorForPanel(Pescador p) {
        cbMunicipioQuestao1.setSelectedItem(p.getQuestao1());
        tfQuestao2.setText(p.getQuestao2());
        tfQuestao3.setText(p.getQuestao3());
        tfQuestao4.setText(p.getQuestao4());
        MyUtil.setSelected(p.getQuestao5(), bgQuestao5);
        tfQuestao6.setText(p.getQuestao6());
        tfQuestao7.setText(p.getQuestao7());
        tfQuestao8.setText(p.getQuestao8());
        tfQuestao9.setText(p.getQuestao9());
        tfQuestao10.setText(p.getQuestao10());
        tfQuestao11.setText(p.getQuestao11());
        tfQuestao12.setText(p.getQuestao12());
        MyUtil.setSelected(p.getQuestao13(), bgQuestao13);
        MyUtil.setSelected(p.getQuestao14(), bgQuestao14);
        tfQuestao15.setText(p.getQuestao15());
        MyUtil.setSelected(p.getQuestao16(), bgQuestao16);
        MyUtil.setOpcaoWithResponse(bgQuestao17, p.getQuestao17(), tfQuestao2);
        MyUtil.setOpcaoWithResponse(bgQuestao18, p.getQuestao18(), tfQuestao18);
        MyUtil.setOpcaoWithResponse(bgQuestao19, p.getQuestao19(), tfQuestao19);
        MyUtil.setSelected(p.getQuestao20(), bgQuestao20);
        tfQuestao21.setText(p.getQuestao21());
        tfQuestao22.setText(p.getQuestao22());
        MyUtil.setStringsToFields(p.getQuestao23(), tfQuestao23_0,tfQuestao23_1,
                tfQuestao23_2,tfQuestao23_3);
        tfQuestao24.setText(p.getQuestao24());
        tfQuestao25.setText(p.getQuestao25());
        tfQuestao26.setText(p.getQuestao26());

    }

    private Pescador getpescadorOfPanel() {



        try {
             String questao1 = cbMunicipioQuestao1.getSelectedItem().toString();
        String questao2 = tfQuestao2.getText();
        String questao3 = tfQuestao3.getText();
        String questao4 = tfQuestao4.getText();
        String questao5 = bgQuestao5.getSelection().getActionCommand();
        String questao6 = tfQuestao6.getText();
        String questao7 = tfQuestao7.getText();
        String questao8 = tfQuestao8.getText();
        String questao9 = tfQuestao9.getText();
        String questao10 = tfQuestao10.getText();
        String questao11 = tfQuestao11.getText();
        String questao12 = tfQuestao12.getText();
        String questao13 = bgQuestao13.getSelection().getActionCommand();
        String questao14 = bgQuestao14.getSelection().getActionCommand();
        String questao15 = tfQuestao15.getText();
        String questao16 = bgQuestao16.getSelection().getActionCommand();
        String questao17 = bgQuestao17.getSelection().getActionCommand() + ";" + tfQuestao17.getText();
        String questao18 = bgQuestao18.getSelection().getActionCommand() + ";" + tfQuestao18.getText();
        String questao19 = bgQuestao19.getSelection().getActionCommand() + ";" + tfQuestao19.getText();
        String questao20 = bgQuestao20.getSelection().getActionCommand();
        String questao21 = tfQuestao21.getText();
        String questao22 = tfQuestao22.getText();

        String questao23 = MyUtil.getStringOfFields(tfQuestao23_0,tfQuestao23_1,
                tfQuestao23_2,tfQuestao23_3);
        String questao24 = tfQuestao24.getText();
        String questao25 = tfQuestao25.getText();
        String questao26 = tfQuestao26.getText();
        if (this.pescador != null) {
            pescador.all(questao1, questao2, questao3, questao4,
                    questao5, questao6, questao7, questao8, questao9,
                    questao10, questao11, questao12, questao13,
                    questao14, questao15, questao16, questao17, questao18,
                    questao19, questao20, questao21, questao22, questao23,
                    questao24, questao25, questao26);
            return this.pescador;
        }

        Pescador pescador = new Pescador();
        pescador.all(questao1, questao2, questao3, questao4,
                questao5, questao6, questao7, questao8, questao9,
                questao10, questao11, questao12, questao13, questao14,
                questao15, questao16, questao17, questao18, questao19,
                questao20, questao21, questao22, questao23, questao24,
                questao25, questao26);

        return pescador;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique os campos estão preenchidos e marcados corretamente",
                    "erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    private void clear() {
        MyUtil.FieldsClear(panel);
        pescador = null;
        cbMunicipioQuestao1.setSelectedIndex(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgQuestao5 = new javax.swing.ButtonGroup();
        bgQuestao13 = new javax.swing.ButtonGroup();
        bgQuestao14 = new javax.swing.ButtonGroup();
        bgQuestao16 = new javax.swing.ButtonGroup();
        bgQuestao17 = new javax.swing.ButtonGroup();
        bgQuestao18 = new javax.swing.ButtonGroup();
        bgQuestao19 = new javax.swing.ButtonGroup();
        bgQuestao20 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        panelCrudEmpresa = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btPesquisa = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbMunicipioQuestao1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        tfQuestao2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfQuestao3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfQuestao4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        tfQuestao6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfQuestao7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfQuestao8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfQuestao17 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfQuestao10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfQuestao11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfQuestao12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        tfQuestao15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        tfQuestao9 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        tfQuestao18 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        tfQuestao19 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        tfQuestao21 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfQuestao22 = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tfQuestao24 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tfQuestao25 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tfQuestao26 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfQuestao23_0 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfQuestao23_1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tfQuestao23_2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        tfQuestao23_3 = new javax.swing.JTextField();

        panelCrudEmpresa.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Cadastrar");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btAtualizar.setText("Atualizar");
        btAtualizar.setToolTipText("Atualiza Valor e Data de pagamento da mensalidade");

        btExcluir.setText("Excluir");

        btPesquisa.setText("Pesquisar");

        btNovo.setText("Novo");

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel36.setText("Dados do Pescador");

        javax.swing.GroupLayout panelCrudEmpresaLayout = new javax.swing.GroupLayout(panelCrudEmpresa);
        panelCrudEmpresa.setLayout(panelCrudEmpresaLayout);
        panelCrudEmpresaLayout.setHorizontalGroup(
            panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresaLayout.createSequentialGroup()
                .addGroup(panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresaLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel19)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1))
                            .addGroup(panelCrudEmpresaLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel46))))
                    .addGroup(panelCrudEmpresaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addGap(6, 6, 6)
                        .addComponent(btPesquisa))
                    .addGroup(panelCrudEmpresaLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel36)))
                .addContainerGap(928, Short.MAX_VALUE))
        );
        panelCrudEmpresaLayout.setVerticalGroup(
            panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel46)
                        .addComponent(jLabel1))
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btCadastrar)
                    .addComponent(btAtualizar)
                    .addComponent(btExcluir)
                    .addComponent(btPesquisa))
                .addContainerGap())
        );

        jLabel3.setText("Municipio");

        cbMunicipioQuestao1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Nome");

        jLabel6.setText("Apelido");

        jLabel7.setText("Naturalidade");

        bgQuestao5.add(jRadioButton1);
        jRadioButton1.setText("Masculino");

        jLabel8.setText("Sexo");

        bgQuestao5.add(jRadioButton2);
        jRadioButton2.setText("Feminino");

        jLabel9.setText("Idade");

        jLabel10.setText("Atividade principal de Renda");

        jLabel11.setText("Atividadeprincipal Secundaria");

        jLabel12.setText("Estado civil");

        jLabel13.setText("Composição Familiar");

        jLabel14.setText("Escolaridade");

        jLabel15.setText("Por que Parou?");

        jLabel16.setText("Local de Moradia");

        bgQuestao13.add(jRadioButton3);
        jRadioButton3.setText("Sede Municipal");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        bgQuestao13.add(jRadioButton4);
        jRadioButton4.setText("Comunidade/Vila Local");

        bgQuestao13.add(jRadioButton5);
        jRadioButton5.setText("Outro Municipio");

        bgQuestao13.add(jRadioButton6);
        jRadioButton6.setText("Capital");

        jLabel17.setText("Qualidade da Moradia");

        bgQuestao14.add(jRadioButton7);
        jRadioButton7.setText("Péssima");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        bgQuestao14.add(jRadioButton8);
        jRadioButton8.setText("Ruim");

        bgQuestao14.add(jRadioButton9);
        jRadioButton9.setText("Regular");

        bgQuestao14.add(jRadioButton10);
        jRadioButton10.setText("Boa");

        bgQuestao14.add(jRadioButton11);
        jRadioButton11.setText("Ótima");

        jLabel18.setText("Tipo de Construção");

        jLabel20.setText("Possui Registro no INSS");

        bgQuestao16.add(jRadioButton12);
        jRadioButton12.setText("Sim");

        bgQuestao16.add(jRadioButton13);
        jRadioButton13.setText("Não");

        jLabel21.setText("Na côlonia");

        bgQuestao17.add(jRadioButton14);
        jRadioButton14.setText("Sim");

        bgQuestao17.add(jRadioButton15);
        jRadioButton15.setText("Não");

        jLabel22.setText("Qual Côlonia?");

        jLabel23.setText("Em alguma associação?");

        bgQuestao18.add(jRadioButton16);
        jRadioButton16.setText("Sim");

        bgQuestao18.add(jRadioButton17);
        jRadioButton17.setText("Não");

        jLabel24.setText("Qual?");

        jLabel25.setText("Possui a Carteira do Pescador");

        bgQuestao19.add(jRadioButton18);
        jRadioButton18.setText("Sim");

        bgQuestao19.add(jRadioButton19);
        jRadioButton19.setText("Não");

        jLabel26.setText("Qual Orgão?");

        jLabel27.setText("Relações de Trabalho");

        bgQuestao20.add(jRadioButton20);
        jRadioButton20.setText("Familiar");

        bgQuestao20.add(jRadioButton21);
        jRadioButton21.setText("Artesanal com amigos");

        bgQuestao20.add(jRadioButton22);
        jRadioButton22.setText("Armador ou embarcador");

        bgQuestao20.add(jRadioButton23);
        jRadioButton23.setText("Assalariado (Carteira Assinada)");

        jLabel28.setText("Possui Assistência ou plano de saúde?.Especificar");

        jLabel29.setText("Quais as atividades geram renda para sua família?");

        tfQuestao22.setColumns(20);
        tfQuestao22.setRows(5);
        jScrollPane2.setViewportView(tfQuestao22);

        jLabel30.setText("Quem na sua familília trabalha? e com qual atividade?");

        jLabel31.setText("Qual o tempo diário que passaram trabalhando?");

        jLabel32.setText("Quanto tempo está na atividade?");

        jLabel33.setText("Qual a Renda por mês ou pro viagem?");

        jLabel2.setText("Entrevistado");

        jLabel4.setText("Esposa");

        jLabel34.setText("Filhos");

        jLabel35.setText("Netos");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfQuestao24, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1013, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfQuestao25, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1082, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfQuestao26, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1060, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(989, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfQuestao6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfQuestao7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfQuestao8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfQuestao9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfQuestao10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfQuestao11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfQuestao12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton11))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton3)
                                    .addGap(21, 21, 21)
                                    .addComponent(jRadioButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton5))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfQuestao15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton6))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton17))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton13)))
                            .addGap(18, 18, 18)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfQuestao17, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfQuestao19, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfQuestao18, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton23))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton19))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfQuestao21)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)))
                .addGap(771, 771, 771))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfQuestao23_0, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(tfQuestao23_1)
                    .addComponent(tfQuestao23_2)
                    .addComponent(tfQuestao23_3))
                .addContainerGap(1128, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbMunicipioQuestao1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfQuestao2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfQuestao3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfQuestao4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfQuestao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfQuestao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfQuestao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfQuestao9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfQuestao10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfQuestao11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tfQuestao12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tfQuestao15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13)
                    .addComponent(jLabel21)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15)
                    .addComponent(jLabel22)
                    .addComponent(tfQuestao17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jLabel24)
                    .addComponent(tfQuestao18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton19)
                    .addComponent(jLabel26)
                    .addComponent(tfQuestao19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22)
                    .addComponent(jRadioButton23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tfQuestao21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfQuestao23_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfQuestao23_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tfQuestao23_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(tfQuestao23_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tfQuestao24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tfQuestao25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tfQuestao26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbMunicipioQuestao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(tfQuestao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(tfQuestao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(tfQuestao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(662, Short.MAX_VALUE)))
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

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgQuestao13;
    private javax.swing.ButtonGroup bgQuestao14;
    private javax.swing.ButtonGroup bgQuestao16;
    private javax.swing.ButtonGroup bgQuestao17;
    private javax.swing.ButtonGroup bgQuestao18;
    private javax.swing.ButtonGroup bgQuestao19;
    private javax.swing.ButtonGroup bgQuestao20;
    private javax.swing.ButtonGroup bgQuestao5;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JComboBox cbMunicipioQuestao1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCrudEmpresa;
    private javax.swing.JTextField tfQuestao10;
    private javax.swing.JTextField tfQuestao11;
    private javax.swing.JTextField tfQuestao12;
    private javax.swing.JTextField tfQuestao15;
    private javax.swing.JTextField tfQuestao17;
    private javax.swing.JTextField tfQuestao18;
    private javax.swing.JTextField tfQuestao19;
    private javax.swing.JTextField tfQuestao2;
    private javax.swing.JTextField tfQuestao21;
    private javax.swing.JTextArea tfQuestao22;
    private javax.swing.JTextField tfQuestao23_0;
    private javax.swing.JTextField tfQuestao23_1;
    private javax.swing.JTextField tfQuestao23_2;
    private javax.swing.JTextField tfQuestao23_3;
    private javax.swing.JTextField tfQuestao24;
    private javax.swing.JTextField tfQuestao25;
    private javax.swing.JTextField tfQuestao26;
    private javax.swing.JTextField tfQuestao3;
    private javax.swing.JTextField tfQuestao4;
    private javax.swing.JTextField tfQuestao6;
    private javax.swing.JTextField tfQuestao7;
    private javax.swing.JTextField tfQuestao8;
    private javax.swing.JTextField tfQuestao9;
    // End of variables declaration//GEN-END:variables


}
