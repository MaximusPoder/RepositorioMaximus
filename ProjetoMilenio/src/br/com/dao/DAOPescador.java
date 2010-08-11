/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.Empresa;
import br.com.pojo.Pescador;
import br.com.util.MyUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elton
 */
public class DAOPescador implements IOperationBean<Pescador> {

    private Conexao conexao;

    public boolean cadastrar(Pescador bean) {
        String query = "insert     into         Pescador    " +
                "     (questao1,questao2,questao3,questao4,questao5," +
                "      questao6,questao7,questao8,questao9,questao10," +
                "      questao11,questao12,questao13,questao14,questao15, questao16, questao17, " +
                "      questao18, questao19, " +
                "      questao20,questao21,questao22,questao23,questao24," +
                " questao25,questao26)" +
                " values  " +
                " (" +
                " '" + bean.getQuestao1() + "'," +
                " '" + bean.getQuestao2() + "'," +
                " '" + bean.getQuestao3() + "'," +
                " '" + bean.getQuestao4() + "'," +
                " '" + bean.getQuestao5() + "'," +
                " '" + bean.getQuestao6() + "'," +
                " '" + bean.getQuestao7() + "'," +
                " '" + bean.getQuestao8() + "'," +
                " '" + bean.getQuestao9() + "'," +
                " '" + bean.getQuestao10() + "'," +

                " '" + bean.getQuestao11() + "'," +
                " '" + bean.getQuestao12() + "'," +
                " '" + bean.getQuestao13() + "'," +
                " '" + bean.getQuestao14() + "'," +
                " '" + bean.getQuestao15() + "'," +
                " '" + bean.getQuestao16() + "'," +
                " '" + bean.getQuestao17() + "'," +
                " '" + bean.getQuestao18() + "'," +
                " '" + bean.getQuestao19() + "'," +
                " '" + bean.getQuestao20() + "'," +
                
                " '" + bean.getQuestao21() + "'," +
                " '" + bean.getQuestao22() + "'," +
                " '" + bean.getQuestao23() + "'," +
                " '" + bean.getQuestao24() + "'," +
                " '" + bean.getQuestao25() + "'," +
                " '" + bean.getQuestao26() + "')";
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            return conexao.salvar(query);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean excluir(Pescador bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        Pescador   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(Pescador bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         Pescador     set    " +
                    "    questao1='" + bean.getQuestao1() + "',     " +
                    "    questao2='" + bean.getQuestao2() + "',     " +
                    "    questao3='" + bean.getQuestao3() + "',     " +
                    "    questao4='" + bean.getQuestao4() + "',     " +
                    "    questao5='" + bean.getQuestao5() + "',     " +
                    "    questao6='" + bean.getQuestao6() + "',     " +
                    "    questao7='" + bean.getQuestao7() + "',     " +
                    "    questao8='" + bean.getQuestao8() + "',     " +
                    "    questao9='" + bean.getQuestao9() + "',     " +
                    "    questao10='" + bean.getQuestao10() + "',     " +
                    "    questao15='" + bean.getQuestao15() + "',     " +
                    "    questao16='" + bean.getQuestao16() + "',    " +
                    "    questao17='" + bean.getQuestao17() + "',    " +
                    "    questao18='" + bean.getQuestao18() + "',    " +
                    "    questao19='" + bean.getQuestao19() + "',   " +
                    "    questao20='" + bean.getQuestao20() + "',    " +
                    "    questao21='" + bean.getQuestao21() + "',    " +
                    "    questao22='" + bean.getQuestao22() + "',    " +
                    "    questao23='" + bean.getQuestao23() + "',    " +
                    "    questao24='" + bean.getQuestao24() + "',    " +
                    "    questao25='" + bean.getQuestao25() + "',    " +
                    "    questao26='" + bean.getQuestao26() + "'    " +
                    "       where         id= " + bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<Pescador> getListWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new Pescador());

            List<Pescador> es = new ArrayList<Pescador>();
            while (set.next()) {
                int index = 0;
                Pescador e = new Pescador();
                e.setId(set.getInt(fields[index++]));
                e.setQuestao1(set.getString(fields[index++]));
                e.setQuestao2(set.getString(fields[index++]));
                e.setQuestao3(set.getString(fields[index++]));
                e.setQuestao4(set.getString(fields[index++]));
                e.setQuestao5(set.getString(fields[index++]));
                e.setQuestao6(set.getString(fields[index++]));
                e.setQuestao7(set.getString(fields[index++]));
                e.setQuestao8(set.getString(fields[index++]));
                e.setQuestao9(set.getString(fields[index++]));
                e.setQuestao10(set.getString(fields[index++]));
                e.setQuestao11(set.getString(fields[index++]));
                e.setQuestao12(set.getString(fields[index++]));
                e.setQuestao13(set.getString(fields[index++]));
                e.setQuestao14(set.getString(fields[index++]));
                e.setQuestao15(set.getString(fields[index++]));
                e.setQuestao16(set.getString(fields[index++]));
                e.setQuestao17(set.getString(fields[index++]));
                e.setQuestao18(set.getString(fields[index++]));
                e.setQuestao19(set.getString(fields[index++]));
                e.setQuestao20(set.getString(fields[index++]));
                e.setQuestao21(set.getString(fields[index++]));
                e.setQuestao22(set.getString(fields[index++]));
                e.setQuestao23(set.getString(fields[index++]));
                e.setQuestao24(set.getString(fields[index++]));
                e.setQuestao25(set.getString(fields[index++]));
                e.setQuestao26(set.getString(fields[index++]));


                es.add(e);
            }

            return es;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.desconecta();
        }
        return null;
    }

    public Pescador getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
