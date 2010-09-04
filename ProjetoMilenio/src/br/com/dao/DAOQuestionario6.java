/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaQuestionario6;
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
public class DAOQuestionario6 implements IOperationBean<EmpresaQuestionario6> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaQuestionario6 bean) {

        String query = "insert     into         EmpresaQuestionario6    "
                + "     (empresaId, questao48, questao49, questao50, questao51,"
                + " questao52,observacao, questao53)"
                + " values  "
                + " (" + bean.getEmpresaId() + ","
                + " '" + bean.getQuestao48() + "',"
                + " '" + bean.getQuestao49() + "',"
                + " '" + bean.getQuestao50() + "',"
                + " '" + bean.getQuestao51() + "',"
                + " '" + bean.getQuestao52() + "',"
                + " '" + bean.getObservacao() + "',"
                + " '" + bean.getQuestao53() + "')";
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

    public boolean excluir(EmpresaQuestionario6 bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaQuestionario6   where  "
                    + "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaQuestionario6 bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         EmpresaQuestionario6     set    "
                    + "     empresaId=" + bean.getEmpresaId() + ",    "
                    + "    questao48='" + bean.getQuestao48() + "',     "
                    + "    questao49='" + bean.getQuestao49() + "',    "
                    + "    questao50='" + bean.getQuestao50() + "',    "
                    + "    questao51='" + bean.getQuestao51() + "',    "
                    + "    questao52='" + bean.getQuestao52() + "',   "
                    + "   observacao='" + bean.getObservacao() + "',   "
                    + "    questao53='" + bean.getQuestao53() + "'    "
                    + "       where         id= " + bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario6> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario6 getObjectWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario6());

            EmpresaQuestionario6 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario6();
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setQuestao48(set.getString(fields[index++]));
                e.setQuestao49(set.getString(fields[index++]));
                e.setQuestao50(set.getString(fields[index++]));
                e.setQuestao51(set.getString(fields[index++]));
                e.setQuestao52(set.getString(fields[index++]));
                e.setQuestao53(set.getString(fields[index++]));

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
