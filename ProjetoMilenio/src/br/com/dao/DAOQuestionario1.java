package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaEB;
import br.com.pojo.EmpresaQuestionario1;
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
public class DAOQuestionario1 implements IOperationBean<EmpresaQuestionario1>{

    private Conexao conexao;
    
    public boolean cadastrar(EmpresaQuestionario1 bean) {

        String query = "insert     into         EmpresaQuestionario1    " +
               "     (empresaId, questao10, questao11, questao12, questao13, questao8, questao9)    " +
               " values  " +
               " ("+bean.getEmpresaId()+",'"+bean.getQuestao10()+"'," +
               " '"+bean.getQuestao11()+"', '"+bean.getQuestao12()+"'," +
               " '"+bean.getQuestao13()+"', '"+bean.getQuestao8()+"'," +
               " '"+bean.getQuestao9()+"')";
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

    public boolean excluir(EmpresaQuestionario1 bean) {
          try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaQuestionario1   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaQuestionario1 bean) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         EmpresaQuestionario1     set    " +
                    "     empresaId="+bean.getEmpresaId()+",    " +
                    "    questao10='"+bean.getQuestao10()+"',     " +
                    "    questao11='"+bean.getQuestao11()+"',    " +
                    "    questao12='"+bean.getQuestao12()+"',    " +
                    "     questao13='"+bean.getQuestao13()+"',    " +
                    "     questao8='"+bean.getQuestao8()+"',   " +
                    "      questao9='"+bean.getQuestao9()+"'    " +
                    "       where         id= "+bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario1> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario1 getObjectWithQuery(String query) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario1());

            EmpresaQuestionario1 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario1();
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setQuestao8(set.getString(fields[index++]));
                e.setQuestao9(set.getString(fields[index++]));
                e.setQuestao10(set.getString(fields[index++]));
                e.setQuestao11(set.getString(fields[index++]));
                e.setQuestao12(set.getString(fields[index++]));
                e.setQuestao13(set.getString(fields[index++]));
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
