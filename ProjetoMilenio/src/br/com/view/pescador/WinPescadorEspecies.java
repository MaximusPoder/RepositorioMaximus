
/*
 * WinPescadorEspecies.java
 *
 * Created on 09/08/2010, 17:28:12
 */
package br.com.view.pescador;

import br.com.dao.DAOPescadorEspecieCapturada;
import br.com.dao.DAOPescadorEspecies;
import br.com.pojo.PescadorEspecieCapturada;
import br.com.pojo.PescadorEspecies;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinPescadorEspecies extends javax.swing.JPanel {

    /** Creates new form WinPescadorEspecies */
    private List<PescadorEspecies> especieses;
    private List<PescadorEspecieCapturada> especieCapturadas;

    public WinPescadorEspecies() {
        initComponents();
        initAction();
        refresh();
        refreshEspecies();
    }

    private void initAction() {

        btCadastrar.addActionListener(getActionListener());
        btExcluir.addActionListener(getActionListener());
        btNovo.addActionListener(getActionListener());
        btRemove.addActionListener(getActionListenerEspecies());
        // btAtualizar.addActionListener(getActionListener());
        btAdd.addActionListener(getActionListenerEspecies());

     
    }

    private void refreshEspecies() {
        if (WinSelecionaPescador.cbPescador.getSelectedIndex() > 0) {
            especieses = new ArrayList<PescadorEspecies>();
            especieses = new DAOPescadorEspecies().getListWithQuery("select * from " +
                    "PescadorEspecies where pescadorId = " +
                    WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());
            refreshTable(especieses);
        } else {
            clear();
        }
    }

    private void refresh() {
        if (WinSelecionaPescador.cbPescador.getSelectedIndex() > 0) {
            especieCapturadas = new ArrayList<PescadorEspecieCapturada>();
            especieCapturadas = new DAOPescadorEspecieCapturada().getListWithQuery("select * from " +
                    "PescadorEspecieCapturada where pescadorId = " +
                    WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());

            refreshTablePEC(especieCapturadas);
        } else {
            clear();
        }

    }

    private void refreshTablePEC(List<PescadorEspecieCapturada> list) {

        DefaultTableModel model = (DefaultTableModel) tablePec.getModel();
        tablePec.clearSelection();
        MyUtil.clearTable(tablePec);
        for (int i = 0; i < list.size(); i++) {
            PescadorEspecieCapturada e = list.get(i);
            Object[] objeto = {e.getSsp(), e.getInicioSafra(),
                e.getFimSafra()};
            model.addRow(objeto);
        }
    }

    private void refreshTable(List<PescadorEspecies> list) {

        DefaultTableModel model = (DefaultTableModel) tableEspecies.getModel();
        tableEspecies.clearSelection();
        MyUtil.clearTable(tableEspecies);
        for (int i = 0; i < list.size(); i++) {
            PescadorEspecies e = list.get(i);
            Object[] objeto = {e.getEspecie(), e.getCausaPerda(),
                e.getEstimativaPerda(), e.getDestinoPeixePerdido()};
            model.addRow(objeto);
        }
    }

    private ActionListener getActionListenerEspecies() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                actionEspecies(e);
            }
        };
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
        if (WinSelecionaPescador.cbPescador.getSelectedIndex() > 0) {
            if (cmd.equalsIgnoreCase("Adicionar")) {
                new DAOPescadorEspecieCapturada().cadastrar(getPECofPanel());
            } else if (cmd.equalsIgnoreCase("Remover")) {
                new DAOPescadorEspecieCapturada().excluir(getPECofTable());
            }
            refresh();
            MyUtil.FieldsClear(this);

        }

    }
     private void actionEspecies(ActionEvent e) {

         String cmd = e.getActionCommand();

        if (WinSelecionaPescador.cbPescador.getSelectedIndex() > 0) {
            if (cmd.equalsIgnoreCase("Adicionar")) {
                new DAOPescadorEspecies().cadastrar(getEspeciesofPanel());
            } else if (cmd.equalsIgnoreCase("Remover")) {
                new DAOPescadorEspecies().excluir(getEspeciesofTable());
            }
            refreshEspecies();
            MyUtil.FieldsClear(this);
        }
    }

    private PescadorEspecieCapturada getPECofTable() {
        return especieCapturadas.get(tablePec.getSelectedRow());
    }

    private PescadorEspecieCapturada getPECofPanel() {
        PescadorEspecieCapturada pec = new PescadorEspecieCapturada();
        pec.setFimSafra(tfFimSafra.getText());
        pec.setInicioSafra(tfinicioSafra.getText());
        pec.setSsp(tfSsp.getText());
        pec.setPescadorId(WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());
        return pec;
    }

    private PescadorEspecies getEspeciesofTable() {
        return especieses.get(tableEspecies.getSelectedRow());
    }

    private PescadorEspecies getEspeciesofPanel() {
        PescadorEspecies edf = new PescadorEspecies();
        edf.setEspecie(tfEspecie.getText());
        edf.setCausaPerda(tfCausa.getText());
        edf.setEstimativaPerda(tfEstimativa.getText());
        edf.setDestinoPeixePerdido(tfDestino.getText());
        edf.setPescadorId(WinSelecionaPescador.pescadors.get(WinSelecionaPescador.cbPescador.getSelectedIndex() - 1).getId());
        return edf;
    }

   

    private void clear() {

        MyUtil.clearTable(tableEspecies);
        MyUtil.clearTable(tablePec);
     
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        panelCrudEmpresa3 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tfCausa = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        tfEstimativa = new javax.swing.JTextField();
        tfDestino = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableEspecies = new javax.swing.JTable();
        tfEspecie = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        tablePec = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        tfinicioSafra = new javax.swing.JTextField();
        tfSsp = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        tfFimSafra = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1035, 806));

        panelCrudEmpresa3.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Adicionar");
        btCadastrar.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btExcluir.setText("Remover");

        btNovo.setText("Novo");

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel36.setText("Questões de Espécies");

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
                            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(jLabel36)
                                .addGap(193, 193, 193))
                            .addComponent(jLabel49))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelCrudEmpresa3Layout.setVerticalGroup(
            panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(panelCrudEmpresa3Layout.createSequentialGroup()
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel49)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(panelCrudEmpresa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btNovo)
                            .addComponent(btExcluir))))
                .addContainerGap())
        );

        jLabel65.setText("Causa da Perda");

        jLabel64.setText("Espécie");

        jLabel67.setText("Destino do Peixe perdido");

        jLabel66.setText("Estimativa da Perda (%)");

        tableEspecies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Espécie", "Causa da Perda", "Estimativa da Perda (%)", "Destino do Peixe perdido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(tableEspecies);

        tablePec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Spp", "Inicio de Safra", "Fim de Safra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(tablePec);

        jLabel68.setText("Spp");

        jLabel69.setText("Inicio de Safra");

        jLabel70.setText("Fim de Safra");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btAdd.setText("Adicionar");
        btAdd.setToolTipText("Realiza a Confirmação do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btAdd.setFocusable(false);
        btAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btRemove.setText("Remover");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRemove)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btRemove))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel65)
                                .addComponent(jLabel64))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(96, 96, 96)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel66)
                                .addComponent(jLabel67))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(tfEstimativa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel69)
                                .addComponent(jLabel68))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfinicioSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfSsp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(96, 96, 96)
                            .addComponent(jLabel70)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfFimSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                        .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(305, 305, 305)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66)
                            .addComponent(tfEstimativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67)
                            .addComponent(tfCausa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel65)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelCrudEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel70)
                                .addComponent(tfFimSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfSsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfinicioSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel68)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel69)))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(566, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel2);

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRemove;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JPanel panelCrudEmpresa3;
    private javax.swing.JTable tableEspecies;
    private javax.swing.JTable tablePec;
    private javax.swing.JTextField tfCausa;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextField tfEspecie;
    private javax.swing.JTextField tfEstimativa;
    private javax.swing.JTextField tfFimSafra;
    private javax.swing.JTextField tfSsp;
    private javax.swing.JTextField tfinicioSafra;
    // End of variables declaration//GEN-END:variables
}
