/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.util;

import javax.swing.JOptionPane;

/**
 *
 * @author Elton
 */
public class Mensagens {

    public static void showMessageNaoCadastrar()
    {
        JOptionPane.showMessageDialog(null, "Objeto nao pode ser cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
        
    }

}
