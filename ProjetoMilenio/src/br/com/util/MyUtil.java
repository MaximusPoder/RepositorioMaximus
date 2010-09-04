/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.util;

import java.awt.Component;
import java.awt.Container;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MyUtil {

    public static void disableButtom(JButton... buttons)
    {
        for (JButton jButton : buttons) {
            jButton.setEnabled(false);
        }
    }

    public static void enableButtom(JButton... buttons)
    {
         for (JButton jButton : buttons) {
            jButton.setEnabled(true);
        }
    }
    public static  void setEnableFields(Boolean b,JTextField...fields)
    {
        for (JTextField tf : fields) {
            tf.setEnabled(b);
            tf.setText("");
        }
    }
    public static  void setEnableFields(Boolean b,JTextArea...fields)
    {
        for (JTextArea tf : fields) {
            tf.setEnabled(b);
        }
    }
    public static String getStringOfFields(JTextField... fields)
    {
        String texto = "";
        for (JTextField jTextField : fields) {
            texto += jTextField.getText()+";";
        }
        return texto;
    }

    public static void setStringsToFields(String texto,JTextField... f)
    {
        String[] t =  texto.split(";");
        for (int i = 0; i < t.length; i++) {
            String string = t[i];
            f[i].setText(string);

        }

    }

     public static void setStringsToFields(ButtonGroup bg,String texto,JTextField... f)
    {

        String[] t =  texto.split(";");
        String opcao = t[0];
        setSelected(opcao, bg);
        for (int i = 1; i < t.length; i++) {
            String string = t[i];
            f[i-1].setText(string);

        }

    }

    public static void clearTable(JTable table) {
        /*Esvazia Campo*/
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public static void refresComboBox(List list, JComboBox cb) {

        cb.removeAllItems();
        cb.addItem("Selecione");
        for (Object object : list) {
            cb.addItem(object);
        }
    }

    public static String getStringTable(JTable table) {
        String texto = "";
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        for (int i = 0; i < tableModel.getRowCount(); i++) {

            for (int c = 0; c < tableModel.getColumnCount(); c++) {
                if(tableModel.getValueAt(i, c) !=null)
                texto += tableModel.getValueAt(i, c).toString() + ";";
                else texto+= " ;";
            }
            texto += "/";
        }
        return texto;
    }

    public static void initiActionCmd(JPanel obj) {

        for (int i = 0; i < obj.getComponentCount(); i++) {
            Component comps[] = obj.getComponents();
            if (comps[i] instanceof JRadioButton) {
                final JRadioButton radioButton = (JRadioButton) comps[i];
                radioButton.setActionCommand(radioButton.getText());
            }
        }
    }

    public static void setStringTable(JTable table, String o) {

        String[] linha = o.split("/");
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < linha.length; i++) {
            String string = linha[i];
            String[] opcs = string.split(";");
            model.addRow(opcs);
        }
    }

    /**
     * Limpa a tabela inteira
     */
    public static void limpaTabela(JTable table) {

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
    }

    public static String[] getField(Object e) {


        Field[] fields = e.getClass().getDeclaredFields();

        String[] strings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];

            strings[i] = field.getName();
        }

        return strings;
    }

    /**
     * Limpa todos os campos de um Container Jpanel
     * @param container
     */
    public static void FieldsClear(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setText("");
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setText("");
            } else if (component instanceof JEditorPane) {
                JEditorPane area = (JEditorPane) component;
                area.setText("");
            } else if (component instanceof Container) {
                FieldsClear((Container) component);
            }
        }
    }

    public static java.sql.Date dateUtilTodateSql(Date data) {
        String d1 = dateToString(data);
        return StringToDate(d1);

    }

    public static String dateToString(Date data) {

        if (data == null) {
            return "";
        }

        Date dataConvertidaEmUtil = new Date(data.getTime());

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        return df.format(dataConvertidaEmUtil);
    }

    public static java.sql.Date StringToDate(String data) {

        if (data == null || data.isEmpty()) {
            return null;
        }
        Date dataf = null;

        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            long timesstamp = dateFormat.parse(data).getTime();
            dataf = new Date(timesstamp);

        } catch (ParseException pe) {
        }
        return new java.sql.Date(dataf.getTime());
    }

    /**
     * Método que seleciona o JradioButton de acordo com a opcao
     * @param opcao
     * @param bg
     */
    public static void setSelected(String opcao, ButtonGroup bg) {

        //Enumeration<AbstractButton> e = bg.getElements();
        for (Enumeration e = bg.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (opcao.equalsIgnoreCase(b.getActionCommand())) {
                b.setSelected(true);
                return;
            }
        }

    }

    /**
     * Método que seleciona o JradioButton de acordo com a opcao
     * @param opcao
     * @param bg
     */
    public static String[] getSelected(ButtonGroup bg) {

        List<String> selecteds = new ArrayList<String>();
        //Enumeration<AbstractButton> e = bg.getElements();
        for (Enumeration e = bg.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.isSelected()) {
                selecteds.add(b.getActionCommand());
            }
        }

        return (String[]) selecteds.toArray();

    }

    /**
     * Método que retorna os selecionados separados pelo demilitador o JradioButton de acordo com a opcao
     * @param opcao
     * @param bg
     */
    public static String getSelected(JCheckBox... c) {


        String selecteds = "";
        //Enumeration<AbstractButton> e = bg.getElements();
        for (JCheckBox b : c) {
            if (b.isSelected()) {
                selecteds += (b.getActionCommand()) + ";";
            }
        }

        return selecteds;

    }

    /**
     * Método que seleciona o Checks de acordo com a opcao
     * @param opcao
     * @param bg
     */
    public static void setSelected(String o, JCheckBox... c) {


        String[] opcs = o.split(";");

        for (JCheckBox b : c) {
            JCheckBox jCheckBox = b;
            for (String string : opcs) {
                if (jCheckBox.getActionCommand().equalsIgnoreCase(string)) {
                    jCheckBox.setSelected(true);
                }            }
        }
    }

    public static void setStringsOfSelecteds(String o, JPanel panel) {

        String[] opcs = o.split(";");
        Component components[] = panel.getComponents();
        List<JCheckBox> checkBoxs = new ArrayList<JCheckBox>();

        for (Component component : components) {
            if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                checkBoxs.add(checkBox);

            }
        }
        for (int i = 0; i < checkBoxs.size(); i++) {
            JCheckBox jCheckBox = checkBoxs.get(i);
            for (String string : opcs) {
                if (jCheckBox.getActionCommand().equals(string)) {
                    System.out.println("Act.: " + string);
                    jCheckBox.setSelected(true);
                }
            }
        }

    }

    /**
     * Seta o buttom group e retorna a uma string na resposta, caso exista
     * @param bg
     * @param o
     * @return
     */
    public static void setOpcaoWithResponse(ButtonGroup bg, String o, JEditorPane component) {
        String[] opcs = o.split(";");
        if (opcs.length > 1) {
            String texto = opcs[1];
            component.setText("");
            component.setText(texto);
        }
        for (Enumeration e = bg.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getActionCommand().equalsIgnoreCase(opcs[0])) {
                b.setSelected(true);
            }
        }

    }


   

      /**
     * Seta o buttom group e retorna a uma string na resposta, caso exista
     * @param bg
     * @param o
     * @return
     */
    public static void setOpcaoWithResponse(ButtonGroup bg, String o, JTextField component) {
        String[] opcs = o.split(";");
        if (opcs.length > 1) {
            String texto = opcs[1];
            component.setText("");
            component.setText(texto);
        }
        for (Enumeration e = bg.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getActionCommand().equalsIgnoreCase(opcs[0])) {
                b.setSelected(true);
            }
        }

    }

    /**
     * Seta o buttom group e retorna a uma string na resposta, caso exista
     * @param bg
     * @param o
     * @return
     */
    public static void setOpcaoWithResponse(ButtonGroup bg, String o, JTextArea component) {
        String[] opcs = o.split(";");
        if (opcs.length > 1) {
            String texto = opcs[1];
            component.setText("");
            component.setText(texto);
        }
        for (Enumeration e = bg.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getActionCommand().equalsIgnoreCase(opcs[0])) {
                b.setSelected(true);
            }
        }

    }

    public static void clearCheckBox(JPanel panel) {
        for (Component component : panel.getComponents()) {
            if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                checkBox.setSelected(false);

            }
        }
    }
}
