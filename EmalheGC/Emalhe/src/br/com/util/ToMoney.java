/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Administrador
 */
public class ToMoney {
   static  NumberFormat nf = NumberFormat.getInstance();

    public static String FloattoString(float valor)
    {
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(valor);
    }

    public static String StringtoMoney(String valor)
    {
        Float v = Float.parseFloat(valor.replace(',', '.'));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(v);
    }

    public static Object FloattoString(Object valor) {

        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(valor);
    }

    public String getTotal(String str1,String str2){
        NumberFormat nf =new DecimalFormat ("0.00", new DecimalFormatSymbols (Locale.US));
        nf.setMaximumFractionDigits(2);
        double val1 = Double.valueOf(str1).doubleValue();
        double val2 = Double.valueOf(str2).doubleValue();
        double total = val1 + val2;
        return nf.format(total);
    }

}
