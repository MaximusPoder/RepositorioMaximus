/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaQuestionario4;
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
public class DAOQuestionario4 implements IOperationBean<EmpresaQuestionario4>{

    private Conexao conexao;

    public boolean cadastrar(EmpresaQuestionario4 bean) {

        String query = "insert     into         EmpresaQuestionario4    " +
               "     (empresaId, questao31, questao32, questao33, questao34," +
               " questao35, questao36,questao37,questao38,observacao,relacaoTrabalho)" +
               " values  " +
               " ("+bean.getEmpresaId()+"," +
               " '"+bean.getQuestao31()+"'," +
               " '"+bean.getQuestao32()+"'," +
               " '"+bean.getQuestao33()+"'," +
               " '"+bean.getQuestao34()+"'," +
               " '"+bean.getQuestao35()+"'," +
               " '"+bean.getQuestao36()+"'," +
               " '"+bean.getQuestao37()+"'," +
               " '"+bean.getQuestao38()+"'," +
               " '"+bean.getObservacao()+"'," +
               " '"+bean.getRelacaoTrabalho()+"')";
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

    public boolean excluir(EmpresaQuestionario4 bean) {
          try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaQuestionario4   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaQuestionario4 bean) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         EmpresaQuestionario4     set    " +
                    "     empresaId="+bean.getEmpresaId()+",    " +
                    "    questao31='"+bean.getQuestao31()+"',     " +
                    "    questao32='"+bean.getQuestao32()+"',    " +
                    "    questao33='"+bean.getQuestao33()+"',    " +
                    "    questao34='"+bean.getQuestao34()+"',    " +
                    "    questao35='"+bean.getQuestao35()+"',   " +
                    "    questao36='"+bean.getQuestao36()+"',    " +
                    "    questao37='"+bean.getQuestao37()+"',    " +
                    "    questao38='"+bean.getQuestao38()+"',    " +
                     "   observacao='"+bean.getObservacao()+"',    " +
                    "    relacaoTrabalho='"+bean.getRelacaoTrabalho()+"'    " +
                    "       where         id= "+bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario4> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario4 getObjectWithQuery(String query) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario4());

            EmpresaQuestionario4 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario4();
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setQuestao31(set.getString(fields[index++]));
                e.setQuestao32(set.getString(fields[index++]));
                e.setQuestao33(set.getString(fields[index++]));
                e.setQuestao34(set.getString(fields[index++]));
                e.setQuestao35(set.getString(fields[index++]));
                e.setQuestao36(set.getString(fields[index++]));
                e.setQuestao37(set.getString(fields[index++]));
                e.setQuestao38(set.getString(fields[index++]));
                e.setRelacaoTrabalho(set.getString(fields[index++]));
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
