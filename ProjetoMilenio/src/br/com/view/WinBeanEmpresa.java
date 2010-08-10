/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinBeanEmpresa.java
 *
 * Created on 08/08/2010, 21:14:07
 */
package br.com.view;

import br.com.dao.DAOEmpresa;

import br.com.pojo.Empresa;
import br.com.util.MyUtil;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Elton
 */
public class WinBeanEmpresa extends javax.swing.JPanel {

    private final DAOEmpresa dAOEmpresa;
    private final List municipios;
    private Empresa empresa;

    /** Creates new form WinBeanEmpresa */
    public WinBeanEmpresa() {
        initComponents();

        
        dAOEmpresa = new DAOEmpresa();
        initiActionCmd(tabEmpresa);
        municipios = dAOEmpresa.getMunicipiosWithQuery();
        MyUtil.refresComboBox(municipios, cbMunicipio);
        initAction();
    }

    private void initAction() {

        //Botoes do primeiro TAB
        btPesquisa.addActionListener(getActionListenerEmpresa());
        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clearTabEmpresa();
            }
        });
        btCadastrar.addActionListener(getActionListenerEmpresa());
        btAtualizar.addActionListener(getActionListenerEmpresa());
        btExcluir.addActionListener(getActionListenerEmpresa());
    }
    /*Metodos Actions do Primeiro Tab = Empresa*/

    private ActionListener getActionListenerEmpresa() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEmpresa(e);
            }
        };
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


    private void actionEmpresa(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equalsIgnoreCase("Pesquisar")) {
            final WinConsulta consulta = new WinConsulta(Empresa.class);
            consulta.setVisible(true);
            consulta.addWindowListener(new WindowAdapter() {

                @Override
                public void windowClosed(WindowEvent e) {
                    super.windowClosed(e);
                    empresa = (Empresa) consulta.getCurrentElement();
                    if (empresa != null) {
                        setEmpresaForPanel(empresa);
                    }
                }
            });
        } else {
            if(cbMunicipio.getSelectedIndex()>0){
            if (cmd.equalsIgnoreCase("Cadastrar")) {
                empresa = getEmpresaOfPanel();
                dAOEmpresa.cadastrar(empresa);
            } else if (cmd.equalsIgnoreCase("Excluir")) {
                empresa = getEmpresaOfPanel();
                dAOEmpresa.excluir(empresa);
            } else if (cmd.equalsIgnoreCase("Atualizar")) {
                empresa = getEmpresaOfPanel();
                dAOEmpresa.atualizar(empresa);
            }
            clearTabEmpresa();
            }
        }

    }

    private void setEmpresaForPanel(Empresa e) {
        tfColetor.setText(e.getColetor());

        tfNomeEmpresa.setText(e.getNomeEmpresa());
        tfData.setText(MyUtil.dateToString(e.getData()));
        tfEndereco.setText(e.getEndereco());
        tfFone.setText(e.getFoneFax());
        cbMunicipio.setSelectedItem(e.getMunicipio());//Lista de municipios
        tfPessoaEntrevistada.setText(e.getPessoaEntrevistada());
        setSelectedEmpresa(e.getStatus());
        tfFuncao.setText(e.getFuncao());
        tfTempoEmpresa.setText(e.getTempoEmpresa());
    }

    private Empresa getEmpresaOfPanel() {

        if (this.empresa != null) {
            this.empresa.setNomeEmpresa(tfNomeEmpresa.getText());
            this.empresa.setColetor(tfColetor.getText());
            this.empresa.setData(MyUtil.StringToDate(tfData.getText()));
            this.empresa.setEndereco(tfEndereco.getText());
            this.empresa.setFoneFax(tfFone.getText());
            this.empresa.setMunicipio(cbMunicipio.getSelectedItem().toString());
            this.empresa.setPessoaEntrevistada(tfPessoaEntrevistada.getText());
            this.empresa.setStatus(bgStatus.getSelection().getActionCommand());
            this.empresa.setTempoEmpresa(tfTempoEmpresa.getText());
            this.empresa.setFuncao(tfFuncao.getText());
            return this.empresa;
        }

        Empresa empresa = new Empresa();
        empresa.setNomeEmpresa(tfNomeEmpresa.getText());
        empresa.setColetor(tfColetor.getText());
        empresa.setData(MyUtil.StringToDate(tfData.getText()));
        empresa.setEndereco(tfEndereco.getText());
        empresa.setFoneFax(tfFone.getText());
        empresa.setMunicipio(cbMunicipio.getSelectedItem().toString());
        empresa.setPessoaEntrevistada(tfPessoaEntrevistada.getText());
        empresa.setStatus(bgStatus.getSelection().getActionCommand());
        empresa.setTempoEmpresa(tfTempoEmpresa.getText());
        empresa.setFuncao(tfFuncao.getText());
        return empresa;
    }

     private void setSelectedEmpresa(String selected) {

        for (int i = 0; i < tabEmpresa.getComponentCount(); i++) {
            Component comps[] = tabEmpresa.getComponents();
            if (comps[i] instanceof JRadioButton) {
                final JRadioButton radioButton = (JRadioButton) comps[i];
                if (radioButton.getActionCommand().equalsIgnoreCase(selected)) {
                    radioButton.setSelected(true);
                }
            }
        }
    }

    private void clearTabEmpresa() {
        MyUtil.FieldsClear(tabEmpresa);
        bgStatus.clearSelection();
        empresa = null;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgStatus = new javax.swing.ButtonGroup();
        tabEmpresa = new javax.swing.JPanel();
        panelCrudEmpresa = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btPesquisa = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbConstruido = new javax.swing.JRadioButton();
        rbModificado = new javax.swing.JRadioButton();
        rbComprado = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfColetor = new javax.swing.JTextField();
        tfData = new javax.swing.JFormattedTextField();
        cbMunicipio = new javax.swing.JComboBox();
        tfNomeEmpresa = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfPessoaEntrevistada = new javax.swing.JTextField();
        tfFuncao = new javax.swing.JTextField();
        tfFone = new javax.swing.JFormattedTextField();
        tfTempoEmpresa = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1099, 1300));

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
                        .addComponent(btPesquisa)))
                .addContainerGap(728, Short.MAX_VALUE))
        );
        panelCrudEmpresaLayout.setVerticalGroup(
            panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel46)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCrudEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btCadastrar)
                    .addComponent(btAtualizar)
                    .addComponent(btExcluir)
                    .addComponent(btPesquisa))
                .addContainerGap())
        );

        jLabel2.setText("Coletor");

        jLabel3.setText("Municipio");

        jLabel4.setText("Data");

        jLabel5.setText("Nome da Empresa");

        jLabel6.setText("Endereco");

        jLabel7.setText("A quanto tempo a empresa existe?");

        jLabel8.setText("Pessoa entrevistada");

        jLabel9.setText("Foi.:");

        bgStatus.add(rbConstruido);
        rbConstruido.setText("Construído");

        bgStatus.add(rbModificado);
        rbModificado.setText("Modificada");

        bgStatus.add(rbComprado);
        rbComprado.setText("Comprado");

        jLabel10.setText("Fone/Fax");

        jLabel11.setText("Função");

        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            tfFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout tabEmpresaLayout = new javax.swing.GroupLayout(tabEmpresa);
        tabEmpresa.setLayout(tabEmpresaLayout);
        tabEmpresaLayout.setHorizontalGroup(
            tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrudEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(859, Short.MAX_VALUE))
            .addGroup(tabEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(tfTempoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(814, Short.MAX_VALUE))
            .addGroup(tabEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(rbComprado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbConstruido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbModificado)
                .addContainerGap(845, Short.MAX_VALUE))
            .addGroup(tabEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabEmpresaLayout.createSequentialGroup()
                        .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabEmpresaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabEmpresaLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPessoaEntrevistada)))
                        .addGap(10, 10, 10)
                        .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabEmpresaLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabEmpresaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabEmpresaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfColetor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(528, Short.MAX_VALUE))
        );
        tabEmpresaLayout.setVerticalGroup(
            tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEmpresaLayout.createSequentialGroup()
                .addComponent(panelCrudEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfColetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tfNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPessoaEntrevistada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfTempoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbComprado)
                    .addComponent(rbConstruido)
                    .addComponent(rbModificado))
                .addContainerGap(1221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1128, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgStatus;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JComboBox cbMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelCrudEmpresa;
    private javax.swing.JRadioButton rbComprado;
    private javax.swing.JRadioButton rbConstruido;
    private javax.swing.JRadioButton rbModificado;
    private javax.swing.JPanel tabEmpresa;
    private javax.swing.JTextField tfColetor;
    private javax.swing.JFormattedTextField tfData;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JFormattedTextField tfFone;
    private javax.swing.JTextField tfFuncao;
    private javax.swing.JTextField tfNomeEmpresa;
    private javax.swing.JTextField tfPessoaEntrevistada;
    private javax.swing.JTextField tfTempoEmpresa;
    // End of variables declaration//GEN-END:variables
}
