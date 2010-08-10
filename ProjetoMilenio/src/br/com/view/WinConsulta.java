package br.com.view;

import br.com.dao.DAOEmpresa;

import br.com.dao.IOperationBean;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elton
 */
public class WinConsulta extends javax.swing.JFrame {

    private Object currentElement;
    private List list;

    public WinConsulta() {
        initComponents();
        initAction();
    }

    public WinConsulta(Class bean) {
        initComponents();
        initAction();
        DAOEmpresa daoe = new DAOEmpresa();
        list = daoe.getListWithQuery("select * from "+bean.getSimpleName());

        addLinhaTabela();
    }
    public WinConsulta(Class bean,IOperationBean operationBean) {
        initComponents();
        initAction();

        list = operationBean.
                getListWithQuery("select * from "+bean.getSimpleName());

        addLinhaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsulta = new javax.swing.JTable();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta");
        setResizable(false);

        tbConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbConsulta);

        btOk.setText("OK");

        btCancel.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btOk))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-436)/2, (screenSize.height-389)/2, 436, 389);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbConsulta;
    // End of variables declaration//GEN-END:variables

    private void initAction() {
        btOk.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                currentElement = list.get(tbConsulta.getSelectedRow());
                WinConsulta.this.dispose();
            }
        });
        btCancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                WinConsulta.this.dispose();
            }
        });

    }

    /**
     * Método que retorna o elemento corrente selecionado
     * @return
     */
    public Object getCurrentElement() {
        return currentElement;
    }

    /**
     * Add elementos da lista na tabela
     */
    private void addLinhaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tbConsulta.getModel();
        modelo.setRowCount(0);

        for (Object object : list) {
            modelo.addRow(new Object[]{object.toString()});
        }
    }
}
