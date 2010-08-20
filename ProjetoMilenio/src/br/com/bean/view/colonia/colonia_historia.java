/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * colonia_historia.java
 *
 * Created on 14/08/2010, 22:13:03
 */

package br.com.bean.view.colonia;

import br.com.Persistencia.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonathas
 */
public class colonia_historia extends javax.swing.JFrame {
    private Conexao conexao;
    int inicia_combo = 0;
    String id_atravessador;
    String ItemDoCb;
    /** Creates new form colonia_historia */
    public colonia_historia() {
        initComponents();
        conexao = new Conexao();
        conexao.conecta("mil_interface");

        //Insere nome no cbNomeAtravessador
                try {
                    cbComunidade.removeAllItems();
                    conexao.execute("select * from colonia_cadastro");

                    while (conexao.resultSet.next()){
                        cbComunidade.addItem(conexao.resultSet.getString("id_colonia")+
                                                       " # "+ conexao.resultSet.getString("colonia"));
                    }
                }catch (SQLException ex) {
                    System.out.println(ex);
                }

        conexao.execute("select * from colonia_historia");
        try {
            conexao.resultSet.first();
        } catch (SQLException ex) {
            System.out.println(ex+" linha 49");
        }
         mostra_dados();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbComunidade = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        questao1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        questao2 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        questao3 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        questao4 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        questao5 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        questao6 = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        questao7 = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        questao8 = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        questao9 = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        questao10 = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        questao11 = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        questao12 = new javax.swing.JTextPane();
        btAtualizar = new javax.swing.JButton();
        btSalver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Entrevista semi estruturada?");

        jLabel2.setText("Comunidade.:");

        cbComunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbComunidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("1. Qual a hist�ria da associa��o?");

        jScrollPane2.setViewportView(questao1);

        jLabel4.setText("2. Quando e por que voc� se associou � organiza��o?");

        jScrollPane3.setViewportView(questao2);

        jLabel5.setText("3. Como acontece o credenciamento para a obten��o do seguro desemprego?");

        jScrollPane4.setViewportView(questao3);

        jLabel6.setText("4. Quais foram as lideran�as mais importantes na hist�ria da col�nia?");

        jScrollPane5.setViewportView(questao4);

        jLabel7.setText("5. Qual o processo para um indiv�duo associar-se � sua organiza��o?");

        jScrollPane6.setViewportView(questao5);

        jLabel9.setText("6. Quais s�o as outras organiza��es (col�nia, resex, associa��o, secretarias, prefeituras, etc) ligadas � pesca do munic�pio?");

        jScrollPane7.setViewportView(questao6);

        jLabel10.setText("7. O Munic�pio possui f�bricas de gelo? Quais e quantas? Qual a rela��o delas com as col�nias?");

        jScrollPane8.setViewportView(questao7);

        jLabel11.setText("8. O munic�pio possui frigor�ficos? Quais e quantos? De que forma eles contribuem ou se relacionam com a col�nia de pescadores?");

        jScrollPane9.setViewportView(questao8);

        jLabel12.setText("9. O munic�pio possui barcos de pesca comercial? Quantos? Contru�dos por quem? Antes, por favor defina o que � barco de pesca");

        jScrollPane10.setViewportView(questao9);

        jLabel13.setText("comercial.");

        jLabel14.setText("10. O munic�pio possui estaleirosl? Quais, que tipos e quantos? Constru�dos por quem? Antes, por favor defina o que � estaleiro.");

        jScrollPane11.setViewportView(questao10);

        jLabel15.setText("11. O munic�pio possui portos naturais? Quantos e em que condi��es de desembarque?");

        jScrollPane12.setViewportView(questao11);

        jLabel16.setText("12. O munic�pio possui Portos constru�dos? Quantos? Quem os construiu? Quais as condi��es de desembarque?");

        jScrollPane13.setViewportView(questao12);

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btSalver.setText("Salvar");
        btSalver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addComponent(jScrollPane10)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbComunidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btSalver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalverActionPerformed
        try {
            String sqlinsert = "insert into colonia_historia "
                    + "(id_colonia,questao1,questao2,questao3,questao4,questao5,"
                    + "questao6,questao7,questao8,questao9,questao10,"
                    + "questao11,"
                    + "questao12) values ("+
                    pega_codigo_ou_nome(1,cbComunidade.getSelectedItem().toString())+",'"+
                    questao1.getText()+"','"+
                    questao2.getText()+"','"+
                    questao3.getText()+"','"+
                    questao4.getText()+"','"+
                    questao5.getText()+"','"+
                    questao6.getText()+"','"+
                    questao7.getText()+"','"+
                    questao8.getText()+"','"+
                    questao9.getText()+"','"+
                    questao10.getText()+"','"+
                    questao11.getText()+"','"+
                    questao12.getText()+"')";

                    System.out.println(sqlinsert);

            if (conexao.salvar(sqlinsert)){
            //agora � hora de atualizar o resultset
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
            conexao.execute("select * from colonia_historia");
            conexao.resultSet.first(); //1� registro
            mostra_dados();
            cbComunidade.setSelectedIndex(0);
            }

        }catch (SQLException erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_btSalverActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        try{
            String sql ="UPDATE colonia_historia SET "+
                          "questao1 = '"+questao1.getText()+"',"+
                          "questao2 = '"+questao2.getText()+"',"+
                          "questao3 = '"+questao3.getText()+"',"+
                          "questao4 = '"+questao4.getText()+"',"+
                          "questao5 = '"+questao5.getText()+"',"+
                          "questao6 = '"+questao6.getText()+"',"+
                          "questao7 = '"+questao7.getText()+"',"+
                          "questao8 = '"+questao8.getText()+"',"+
                          "questao9 = '"+questao9.getText()+"',"+
                          "questao10 = '"+questao10.getText()+"',"+
                          "questao11 = '"+questao11.getText()+"',"+
                          "questao12 = '"+questao12.getText()+"' "+
                          

                          "where id_colonia = "+pega_codigo_ou_nome(1,cbComunidade.getSelectedItem().toString());

            System.out.println(sql);
            if (conexao.update(sql)){
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            //Atualiza Resultset
            conexao.execute("select * from colonia_historia");
            conexao.resultSet.next();
            mostra_dados();
            cbComunidade.setSelectedIndex(0);
            }

        }catch (Exception e){
            System.out.println(e + "Erro no bot�o alterar");
        }

    }//GEN-LAST:event_btAtualizarActionPerformed

    private void cbComunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbComunidadeActionPerformed
          //Pesquisa autom�tica do Combo Box Nome do atravessador

        if (inicia_combo == 1){
         try {
            conexao.execute("select * from colonia_historia");
            conexao.resultSet.first();
            String igual = "n"; //inicia dizendo que n�o localizou
            while(igual == "n") //diz que enquanto n�o localizar � para ir executando
            {
                String id = pega_codigo_ou_nome(1,cbComunidade.getSelectedItem().toString());
                if (conexao.resultSet.getString("id_colonia").equals(id)) {
                    igual = "s"; //incica que achou
                } else
                    conexao.resultSet.next();
            }
            //nas linhas abaixo, mostra_conteudo_tabela();
             mostra_dados();



        } catch (SQLException ex) {
            limpar();
            System.out.println(ex+" Erro na troca do combobox");
            }
        }inicia_combo = 1;
    }//GEN-LAST:event_cbComunidadeActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colonia_historia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btSalver;
    private javax.swing.JComboBox cbComunidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane questao1;
    private javax.swing.JTextPane questao10;
    private javax.swing.JTextPane questao11;
    private javax.swing.JTextPane questao12;
    private javax.swing.JTextPane questao2;
    private javax.swing.JTextPane questao3;
    private javax.swing.JTextPane questao4;
    private javax.swing.JTextPane questao5;
    private javax.swing.JTextPane questao6;
    private javax.swing.JTextPane questao7;
    private javax.swing.JTextPane questao8;
    private javax.swing.JTextPane questao9;
    // End of variables declaration//GEN-END:variables

    private void mostra_dados() {
        try {
            questao1.setText(conexao.resultSet.getString("questao1"));
            questao2.setText(conexao.resultSet.getString("questao2"));
            questao3.setText(conexao.resultSet.getString("questao3"));
            questao4.setText(conexao.resultSet.getString("questao4"));
            questao5.setText(conexao.resultSet.getString("questao5"));
            questao6.setText(conexao.resultSet.getString("questao6"));
            questao7.setText(conexao.resultSet.getString("questao7"));
            questao8.setText(conexao.resultSet.getString("questao8"));
            questao9.setText(conexao.resultSet.getString("questao9"));
            questao10.setText(conexao.resultSet.getString("questao10"));
            questao11.setText(conexao.resultSet.getString("questao11"));
            questao12.setText(conexao.resultSet.getString("questao12"));
            
        } catch (Exception e) {
            limpar();
        }
    }

    private void limpar() {
            questao1.setText("");
            questao2.setText("");
            questao3.setText("");
            questao4.setText("");
            questao5.setText("");
            questao6.setText("");
            questao7.setText("");
            questao8.setText("");
            questao9.setText("");
            questao10.setText("");
            questao11.setText("");
            questao12.setText("");
            
    }

               public String pega_codigo_ou_nome(int n,String teste) { //Se entrar com 1 pega o C�digo, se n�o pega o Nome
              //pegar a Id do atravessador

              //aqui ele pega a quantidade de carcteres que tem uma determinada vari�vel
              //e armazena numa INT para us�-la de contador
              int contador = teste.length();

              //cria um for( para fazer uma varredura letra por letra at� encontrar
              for(int i = 0;i<contador;i++){
                 //usamos substring pra pegar um caractere, passando como par�metro,
                 //o primeiro caractere a ser pega, at� a ultima.
                //fiz um if para verificar se o caractere � igual a "#"
                if (teste.substring(i,i+1).equals("#")){
                   int posicao = i+1;
                    System.out.println("Est� na posi��o " + posicao);
                    if (n == 1){
                        return teste.substring(0,posicao-2);
                    }
                    else
                        return teste.substring(posicao+1,teste.length());
                }

              }
              return "nada";
        }
}
