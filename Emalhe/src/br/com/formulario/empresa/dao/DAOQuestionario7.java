/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.empresa.dao;

import br.com.conexao.Conexao;
import br.com.formulario.empresa.pojo.EmpresaQuestionario7;
import br.com.util.MyUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elton
 */
public class DAOQuestionario7 implements IOperationBean<EmpresaQuestionario7> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaQuestionario7 bean) {

        String query = "insert     into         EmpresaQuestionario7    " +
                "(empresaId,"
                + "questao55,"
                + "questao56,"
                + "questao57,"
                + "questao58,"
                + "questao59,"
                + "questao60,"
                +" questao61,"
                + "questao62,"
                + "questao63,"
                + "questao64,"
                + "questao65,"
                + "observacao,"
                + "questao66)" +
                " values  " +
                " (" + bean.getEmpresaId() + "," +
                " '" + bean.getQuestao55() + "'," +
                " '" + bean.getQuestao56() + "'," +
                " '" + bean.getQuestao57() + "'," +
                " '" + bean.getQuestao58() + "'," +
                " '" + bean.getQuestao59() + "'," +
                " '" + bean.getQuestao60() + "'," +
                " '" + bean.getQuestao61() + "'," +
                " '" + bean.getQuestao62() + "'," +
                " '" + bean.getQuestao63() + "'," +
                " '" + bean.getQuestao64() + "'," +
                " '" + bean.getQuestao65() + "'," +
                " '" + bean.getObservacao() + "'," +
                " '" + bean.getQuestao66() + "')";
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            return conexao.salvar(query);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean excluir(EmpresaQuestionario7 bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = " delete     from        EmpresaQuestionario7   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaQuestionario7 bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = "update         EmpresaQuestionario7     set    " +
                    "     empresaId=" + bean.getEmpresaId() + ",    " +
                    "    questao55='" + bean.getQuestao55() + "',     " +
                    "    questao56='" + bean.getQuestao56() + "',    " +
                    "    questao57='" + bean.getQuestao57() + "',    " +
                    "    questao58='" + bean.getQuestao58() + "',    " +
                    "    questao59='" + bean.getQuestao59() + "',   " +
                    "    questao60='" + bean.getQuestao60() + "',   " +
                    "    questao61='" + bean.getQuestao61() + "',   " +
                    "    questao62='" + bean.getQuestao62() + "',   " +
                    "    questao63='" + bean.getQuestao63() + "',   " +
                    "    questao64='" + bean.getQuestao64() + "',   " +
                    "    questao65='" + bean.getQuestao65() + "',   " +
                    "    observacao='" + bean.getObservacao() + "',   " +
                    "    questao66='" + bean.getQuestao66() + "'    " +
                    "       where         id= " + bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario7> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario7 getObjectWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario7());

            EmpresaQuestionario7 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario7();
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setQuestao55(set.getString(fields[index++]));
                e.setQuestao56(set.getString(fields[index++]));
                e.setQuestao57(set.getString(fields[index++]));
                e.setQuestao58(set.getString(fields[index++]));
                e.setQuestao59(set.getString(fields[index++]));
                e.setQuestao60(set.getString(fields[index++]));
                e.setQuestao61(set.getString(fields[index++]));
                e.setQuestao62(set.getString(fields[index++]));
                e.setQuestao63(set.getString(fields[index++]));
                e.setQuestao64(set.getString(fields[index++]));
                e.setQuestao65(set.getString(fields[index++]));
                e.setQuestao66(set.getString(fields[index++]));

                e.setEmpresaId(set.getInt(fields[index++]));
                e.setObservacao(set.getString(fields[index++]));
            }

            return e;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.desconecta();
        }
        return null;
    }
}
