/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.util;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.JTextField;

/**
 *
 * @author MADAM
 */
public class JIntField extends JTextField{


     private static final long serialVersionUID = -5712106034509737967L;
     private static final SimpleAttributeSet nullAttribute = new SimpleAttributeSet();

     /**
     * Creates a new instance of JMoneyField DecimalFormat()
      */
     public JIntField() {
         this.addKeyListener(null);
         this.setHorizontalAlignment( JTextField.RIGHT );
         this.setDocument(new MoneyFieldDocument());
         this.addFocusListener(new MoneyFieldFocusListener());
         this.setText("0");
         this.addCaretListener(new CaretListener(){
             public void caretUpdate(CaretEvent e) {
                 if (e.getDot() != getText().length() ) {
                     getCaret().setDot(getText().length());
                 }
             }
         });
     }

     private final class MoneyFieldFocusListener extends FocusAdapter{
         public void focusGained(FocusEvent e) {
             selectAll();
         }
     }

     private final class MoneyFieldDocument extends PlainDocument {

         /**
          *
          */
         private static final long serialVersionUID = -3802846632709128803L;

         public void insertString(int offs, String str, AttributeSet a)
             throws BadLocationException {String original = getText(0,getLength());
        // Permite apenas digitar até 16 caracteres (9.999.999.999,99)
             if (original.length()< 16) {
                 StringBuilder mascarado = new StringBuilder();
                 if (a != nullAttribute) {
                     //limpa o campo
                     remove(-1,getLength());
                     mascarado.append((original+str).replaceAll("[^0-9]",""));
                     for (int i = 0; i < mascarado.length(); i++){
                         if (!Character.isDigit(mascarado.charAt(i))){
                             mascarado.deleteCharAt(i);
                         }
                     }
                     Long number = new Long(mascarado.toString());

                     mascarado.replace(0, mascarado.length(), number.toString());
        
                     super.insertString(0, mascarado.toString(), a);
                 }else{
                     if (original.length() == 0){
                         super.insertString(0, "0", a);
                     }
                 }
             }
         }

         @Override
         public void remove(int offs, int len) throws BadLocationException {
             if ( len == getLength() ) {
                 super.remove(0, len);
                 if (offs != -1){
                     insertString(0, "",nullAttribute);
                 }
             }else{
                 String original = getText(0, getLength()).substring(0, offs) + getText(0, getLength()).substring(offs+len);
                 super.remove(0, getLength());
                 insertString(0,original,null);
             }
         }
     }

      public String virgula(int n,String palavra) { //Se entrar com -1 pega antes da virgula, se não pega depois da virgula

      //aqui ele pega a quantidade de carcteres que tem uma determinada variável
      //e armazena numa INT para usá-la de contador
      int contador = palavra.length();

      //cria um for( para fazer uma varredura letra por letra até encontrar
      for(int i = 0;i<contador;i++){
         //usamos substring pra pegar um caractere, passando como parâmetro,
         //o primeiro caractere a ser pega, até a ultima.
        //fiz um if para verificar se o caractere é igual a ","
        if (palavra.substring(i,i+1).equals(",")){
           int posicao = i+1;
            //System.out.println("Está na posição " + posicao);
            if (n == -1){
                return palavra.substring(0,posicao-2);
            }
            else
                return palavra.substring(posicao+1,palavra.length());
        }

      }
      return "nada";
     }

      public boolean tem(String letra,String palavra) {

      int contador = palavra.length();
      int achou = 0;

      for(int i = 0;i<contador;i++){
        if (palavra.substring(i,i+1).equals(letra)){
           //System.out.println("Achou a palavra");
           achou = 1;
        }
      }

      if (achou == 1)
          return true;
      else
          return false;

     }

//try{
//javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
//tfConservacaoPescado = new javax.swing.JFormattedTextField(cpf);
//}
//catch (Exception e){
//}
                          //v=v.replace(/\D/g,"")
                     //v=v.replace(/(\d)(\d{1,3}$)/,"$1.$2")  

}

