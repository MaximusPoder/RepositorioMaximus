
package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EspecieProcessada;
import br.com.util.MyUtil;
import java.lang.reflect.Field;
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
public class DaoEspecieProcessada implements IOperationBean<EspecieProcessada>{

    private Conexao conexao;

    public boolean cadastrar(EspecieProcessada bean) {

         String query = "insert     into         EspecieProcessada       " +
                 "  (empresaId, especieId, precoVenda, produto,observacao, quantidadeProduzida)" +
                 "     values "
                 + "  ("+bean.getEmpresaId()+", "+
                 bean.getEspecieId()+",'" +
                 bean.getPrecoVenda()+"','"+
                 bean.getProduto()+"','"+
                 bean.getObservacao()+"','"+
                 bean.getQuantidadeProduzida()+"')";
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

    public boolean excluir(EspecieProcessada bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EspecieProcessada      where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EspecieProcessada bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         EspecieProcessada     set      " +
                    "   empresaId="+bean.getEmpresaId()+",         especieId="+bean.getEspecieId()+",   " +
                    "      precoVenda='"+bean.getPrecoVenda()+"',     " +
                    "    produto='"+bean.getProduto()+"',       " +
                    "    observacao='"+bean.getObservacao()+"',       " +
                    "  quantidadeProduzida='"+bean.getQuantidadeProduzida()+"'  " +
                    "   where         id="+bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EspecieProcessada> getListWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields =  MyUtil.getField(new EspecieProcessada());

            List<EspecieProcessada> list = new ArrayList<EspecieProcessada>();
            while (set.next()) {
                int index = 0;
                EspecieProcessada e = new EspecieProcessada();
                e.setId(set.getInt(fields[index++]));
                e.setProduto(set.getString(fields[index++]));
                e.setQuantidadeProduzida(set.getString(fields[index++]));
                e.setPrecoVenda(set.getString(fields[index++]));
                e.setEspecieId(set.getInt(fields[index++]));
                e.setEmpresaId(set.getInt(fields[index++]));
                e.setObservacao(set.getString(fields[index++]));

                list.add(e);
            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.desconecta();
        }
        return null;
    }

    public EspecieProcessada getObjectWithQuery(String query) {
          try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
           String[] fields =  MyUtil.getField(new EspecieProcessada());

            EspecieProcessada e = new EspecieProcessada();
            while (set.next()) {
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setProduto(set.getString(fields[index++]));
                e.setQuantidadeProduzida(set.getString(fields[index++]));
                e.setPrecoVenda(set.getString(fields[index++]));
                e.setEspecieId(set.getInt(fields[index++]));
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
