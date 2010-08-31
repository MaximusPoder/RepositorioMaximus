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

    public static void showMessageErroPreencherDados()
    {
        JOptionPane.showMessageDialog(null, "Preenchimento no Formulário Incorreto\nVerifique se existe opcão não selecionada", "Erro", JOptionPane.ERROR_MESSAGE);

    }

    public static void showMessageNaoAtualizar() {
       JOptionPane.showMessageDialog(null, "Objeto nao pode ser atualizado", "Erro", JOptionPane.ERROR_MESSAGE);
    }

}
