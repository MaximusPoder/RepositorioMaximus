/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaQuestionario3;
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
public class DaoQuestionario3 implements IOperationBean<EmpresaQuestionario3>{

    private Conexao conexao;

    public boolean cadastrar(EmpresaQuestionario3 bean) {

        String query = "insert     into         EmpresaQuestionario3    " +
               "     (empresaId, questao24, questao25, questao26, questao27," +
               " questao28, questao29,observacao,questao30)" +
               " values  " +
               " ("+bean.getEmpresaId()+"," +
               " '"+bean.getQuestao24()+"'," +
               " '"+bean.getQuestao25()+"'," +
               " '"+bean.getQuestao26()+"'," +
               " '"+bean.getQuestao27()+"'," +
               " '"+bean.getQuestao28()+"'," +
               " '"+bean.getQuestao29()+"'," +
               " '"+bean.getObservacao()+"'," +
               " '"+bean.getQuestao30()+"')";
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

    public boolean excluir(EmpresaQuestionario3 bean) {
          try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaQuestionario3   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaQuestionario3 bean) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         EmpresaQuestionario3     set    " +
                    "     empresaId="+bean.getEmpresaId()+",    " +
                    "    questao24='"+bean.getQuestao24()+"',     " +
                    "    questao25='"+bean.getQuestao25()+"',    " +
                    "    questao26='"+bean.getQuestao26()+"',    " +
                    "    questao27='"+bean.getQuestao27()+"',    " +
                    "    questao28='"+bean.getQuestao28()+"',   " +
                    "    questao29='"+bean.getQuestao29()+"',    " +
                    "    observacao='"+bean.getObservacao()+"',    " +
                    "    questao30='"+bean.getQuestao30()+"'    " +
                    "       where         id= "+bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario3> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario3 getObjectWithQuery(String query) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario3());

            EmpresaQuestionario3 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario3();
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setQuestao24(set.getString(fields[index++]));
                e.setQuestao25(set.getString(fields[index++]));
                e.setQuestao26(set.getString(fields[index++]));
                e.setQuestao27(set.getString(fields[index++]));
                e.setQuestao28(set.getString(fields[index++]));
                e.setQuestao29(set.getString(fields[index++]));
                e.setQuestao30(set.getString(fields[index++]));
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

