/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.util;

import br.com.pojo.Empresa;
import java.awt.Component;
import java.awt.Container;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Elton
 */
public class Util {

    public static  String[] getField(Object e) {
       

        Field[] fields = e.getClass().getDeclaredFields();

        String[] strings = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println(field.getName());
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
         }
         else if (component instanceof Container) {
            FieldsClear((Container) component);
         }
      }
   }

    public static  java.sql.Date dateUtilTodateSql(Date data) {
        String d1 = dateToString(data);
        return StringToDate(d1);

    }

    public  static  String dateToString(Date data) {

        if (data == null) {
            return "";
        }

        Date dataConvertidaEmUtil = new Date(data.getTime());

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        return df.format(dataConvertidaEmUtil);
    }

    public  static java.sql.Date StringToDate(String data) {

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

}
