
package br.com.formulario.empresa.dao;

import br.com.conexao.Conexao;
import br.com.formulario.empresa.pojo.EmpresaPescador;
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
public class DAOEmpresaPescador implements IOperationBean<EmpresaPescador>{

     private Conexao conexao;

    public boolean cadastrar(EmpresaPescador bean) {
         String query = " insert     into         EmpresaPescador " +
                 "        (EstimativaPerda, causaPerda, destinoPeixePerdido, " +
                 " empresaId,observacao, especie) " +
                 "    values    " +
                 "('"+bean.getEstimativaPerda()+"','"+
                     bean.getCausaPerda()+"','" +
                     bean.getDestinoPeixePerdido()+"',"+
                     bean.getEmpresaId()+",'" +
                     bean.getObservacao()+"','"+
                     bean.getEspecie()+"')";
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

    public boolean excluir(EmpresaPescador bean) {
          try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = " delete     from       " +
                    " EmpresaPescador      where  " +
                    "       id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaPescador bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<EmpresaPescador> getListWithQuery(String query) {
           try {

            conexao = new Conexao();
            conexao.conecta("emalhe");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new EmpresaPescador());

            List<EmpresaPescador> empresas = new ArrayList<EmpresaPescador>();
            while (set.next()) {
                int index = 0;
                EmpresaPescador e = new EmpresaPescador();
                e.setId(set.getInt(fields[index++]));
                e.setEspecie(set.getString(fields[index++]));
                e.setCausaPerda(set.getString(fields[index++]));
                e.setEstimativaPerda(set.getString(fields[index++]));
                e.setDestinoPeixePerdido(set.getString(fields[index++]));                
                e.setEmpresaId(set.getInt(fields[index++]));
                e.setObservacao(set.getString(fields[index++]));

                empresas.add(e);
            }

            return empresas;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.desconecta();
        }
        return null;
    }

    public EmpresaPescador getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
