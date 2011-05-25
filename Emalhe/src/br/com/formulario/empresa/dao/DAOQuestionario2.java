/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.formulario.empresa.dao;

import br.com.conexao.Conexao;
import br.com.formulario.empresa.pojo.EmpresaQuestionario2;
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
public class DAOQuestionario2 implements IOperationBean<EmpresaQuestionario2>{

    private Conexao conexao;

    public boolean cadastrar(EmpresaQuestionario2 bean) {

        String query = "insert     into         EmpresaQuestionario2    " +
               "     (empresaId, questao15, questao16, questao17, questao18," +
               " questao19, questao20,questao21,observacao,questao22)" +
               " values  " +
               " ("+bean.getEmpresaId()+"," +
               " '"+bean.getQuestao15()+"'," +
               " '"+bean.getQuestao16()+"'," +
               " '"+bean.getQuestao17()+"'," +
               " '"+bean.getQuestao18()+"'," +
               " '"+bean.getQuestao19()+"'," +
               " '"+bean.getQuestao20()+"'," +
               " '"+bean.getQuestao21()+"'," +
               " '"+bean.getObservacao()+"'," +
               " '"+bean.getQuestao22()+"')";
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

    public boolean excluir(EmpresaQuestionario2 bean) {
          try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = " delete     from        EmpresaQuestionario2   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaQuestionario2 bean) {
         try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = "update         EmpresaQuestionario2     set    " +
                    "     empresaId="+bean.getEmpresaId()+",    " +
                    "    questao15='"+bean.getQuestao15()+"',     " +
                    "    questao16='"+bean.getQuestao16()+"',    " +
                    "    questao17='"+bean.getQuestao17()+"',    " +
                    "    questao18='"+bean.getQuestao18()+"',    " +
                    "    questao19='"+bean.getQuestao19()+"',   " +
                    "    questao20='"+bean.getQuestao20()+"',    " +
                    "    questao21='"+bean.getQuestao21()+"',    " +
                    "    observacao='"+bean.getObservacao()+"',    " +
                    "    questao22='"+bean.getQuestao22()+"'    " +
                    "       where         id= "+bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario2> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario2 getObjectWithQuery(String query) {
         try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario2());

            EmpresaQuestionario2 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario2();
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setQuestao15(set.getString(fields[index++]));
                e.setQuestao16(set.getString(fields[index++]));
                e.setQuestao17(set.getString(fields[index++]));
                e.setQuestao18(set.getString(fields[index++]));
                e.setQuestao19(set.getString(fields[index++]));
                e.setQuestao20(set.getString(fields[index++]));
                e.setQuestao21(set.getString(fields[index++]));
                e.setQuestao22(set.getString(fields[index++]));
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
