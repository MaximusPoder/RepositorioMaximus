/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.PescadorDadosEmbarcacao;
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
public class DAOPescadorDadosEmbarcacao implements IOperationBean<PescadorDadosEmbarcacao> {


    private Conexao conexao;

    public boolean cadastrar(PescadorDadosEmbarcacao bean) {
        String query = "insert     into         PescadorDadosEmbarcacao    " +
                "     (questao1,questao2,questao3,questao4,questao5," +
                "      questao6,questao7,questao8,questao9,questao10," +
                "      questao11,questao12,questao13,questao14,questao15, " +
                "      questao16, questao17,observacao, " +
                "      pescadorId)" +
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
                " '" + bean.getObservacao() + "'," +
                "  " + bean.getPescadorId() + ")";
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

    public boolean excluir(PescadorDadosEmbarcacao bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        PescadorDadosEmbarcacao   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(PescadorDadosEmbarcacao bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         PescadorDadosEmbarcacao     set    " +
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
                    "    questao11='" + bean.getQuestao11() + "',     " +
                    "    questao12='" + bean.getQuestao12() + "',     " +
                    "    questao13='" + bean.getQuestao13() + "',     " +
                    "    questao14='" + bean.getQuestao14() + "',     " +
                    "    questao15='" + bean.getQuestao15() + "',     " +
                    "    questao16='" + bean.getQuestao16() + "',    " +
                    "    questao17='" + bean.getQuestao17() + "',    " +
                    "    observacao='" + bean.getObservacao() + "',    " +
                    "    pescadorId=" + bean.getPescadorId() + "    " +
                    "       where         id= " + bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<PescadorDadosEmbarcacao> getListWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new PescadorDadosEmbarcacao());

            List<PescadorDadosEmbarcacao> es = new ArrayList<PescadorDadosEmbarcacao>();
            while (set.next()) {
                int index = 0;
                PescadorDadosEmbarcacao e = new PescadorDadosEmbarcacao();
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
                e.setPescadorId(set.getInt(fields[index++]));
                e.setObservacao(set.getString(fields[index++]));
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

    public PescadorDadosEmbarcacao getObjectWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new PescadorDadosEmbarcacao());

            PescadorDadosEmbarcacao es = null;
            while (set.next()) {
                int index = 0;
                es = new PescadorDadosEmbarcacao();
                es.setId(set.getInt(fields[index++]));
                es.setQuestao1(set.getString(fields[index++]));
                es.setQuestao2(set.getString(fields[index++]));
                es.setQuestao3(set.getString(fields[index++]));
                es.setQuestao4(set.getString(fields[index++]));
                es.setQuestao5(set.getString(fields[index++]));
                es.setQuestao6(set.getString(fields[index++]));
                es.setQuestao7(set.getString(fields[index++]));
                es.setQuestao8(set.getString(fields[index++]));
                es.setQuestao9(set.getString(fields[index++]));
                es.setQuestao10(set.getString(fields[index++]));
                es.setQuestao11(set.getString(fields[index++]));
                es.setQuestao12(set.getString(fields[index++]));
                es.setQuestao13(set.getString(fields[index++]));
                es.setQuestao14(set.getString(fields[index++]));
                es.setQuestao15(set.getString(fields[index++]));
                es.setQuestao16(set.getString(fields[index++]));
                es.setQuestao17(set.getString(fields[index++]));

                es.setPescadorId(set.getInt(fields[index++]));
                 es.setObservacao(set.getString(fields[index++]));
            }

            return es;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.desconecta();
        }
        return null;
    }
}
