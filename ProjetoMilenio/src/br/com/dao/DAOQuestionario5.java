/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaQuestionario5;
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
public class DAOQuestionario5 implements IOperationBean<EmpresaQuestionario5>{

    private Conexao conexao;

    public boolean cadastrar(EmpresaQuestionario5 bean) {

        String query = "insert     into         EmpresaQuestionario5    " +
               "     (empresaId, questao39, questao40, questao41, questao42," +
               " questao43, questao44,questao45,questao46)" +
               " values  " +
               " ("+bean.getEmpresaId()+"," +
               " '"+bean.getQuestao39()+"'," +
               " '"+bean.getQuestao40()+"'," +
               " '"+bean.getQuestao41()+"'," +
               " '"+bean.getQuestao42()+"'," +
               " '"+bean.getQuestao43()+"'," +
               " '"+bean.getQuestao44()+"'," +
               " '"+bean.getQuestao45()+"'," +
               " '"+bean.getQuestao46()+"')";
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

    public boolean excluir(EmpresaQuestionario5 bean) {
          try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaQuestionario5   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaQuestionario5 bean) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         EmpresaQuestionario5     set    " +
                    "     empresaId="+bean.getEmpresaId()+",    " +
                    "    questao39='"+bean.getQuestao39()+"',     " +
                    "    questao40='"+bean.getQuestao40()+"',    " +
                    "    questao41='"+bean.getQuestao41()+"',    " +
                    "    questao42='"+bean.getQuestao42()+"',    " +
                    "    questao43='"+bean.getQuestao43()+"',   " +
                    "    questao44='"+bean.getQuestao44()+"',    " +
                    "    questao45='"+bean.getQuestao45()+"',    " +
                    "    questao46='"+bean.getQuestao46()+"'    " +
                    "       where         id= "+bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario5> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario5 getObjectWithQuery(String query) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario5());

            EmpresaQuestionario5 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario5();
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setQuestao39(set.getString(fields[index++]));
                e.setQuestao40(set.getString(fields[index++]));
                e.setQuestao41(set.getString(fields[index++]));
                e.setQuestao42(set.getString(fields[index++]));
                e.setQuestao43(set.getString(fields[index++]));
                e.setQuestao44(set.getString(fields[index++]));
                e.setQuestao45(set.getString(fields[index++]));
                e.setQuestao46(set.getString(fields[index++]));
              
                e.setEmpresaId(set.getInt(fields[index++]));
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
