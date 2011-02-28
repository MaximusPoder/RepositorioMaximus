package br.com.util;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elton
 */
public class JTableRenderer extends DefaultTableCellRenderer {

    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        this.setHorizontalAlignment(CENTER);

        return super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column);
    }
}

