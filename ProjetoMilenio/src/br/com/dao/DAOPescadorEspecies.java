/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.PescadorEspecies;
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
public class DAOPescadorEspecies implements IOperationBean<PescadorEspecies>{

     private Conexao conexao;


    public boolean cadastrar(PescadorEspecies bean) {
         String query = " insert     into         PescadorEspecies " +
                 "        (EstimativaPerda, causaPerda, destinoPeixePerdido, " +
                 " pescadorId, especie) " +
                 "    values    " +
                 "     ('"+bean.getEstimativaPerda()+"'," +
                 " '"+bean.getCausaPerda()+"'," +
                 " '"+bean.getDestinoPeixePerdido()+"',"+bean.getPescadorId()+"," +
                 "'"+bean.getEspecie()+"')";
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

    public boolean excluir(PescadorEspecies bean) {
          try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from       " +
                    " PescadorEspecies      where  " +
                    "       id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(PescadorEspecies bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<PescadorEspecies> getListWithQuery(String query) {
           try {

            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new PescadorEspecies());

            List<PescadorEspecies> empresas = new ArrayList<PescadorEspecies>();
            while (set.next()) {
                int index = 0;
                PescadorEspecies e = new PescadorEspecies();
                e.setId(set.getInt(fields[index++]));
                e.setEspecie(set.getString(fields[index++]));
                e.setCausaPerda(set.getString(fields[index++]));
                e.setEstimativaPerda(set.getString(fields[index++]));
                e.setDestinoPeixePerdido(set.getString(fields[index++]));

                e.setPescadorId(set.getInt(fields[index++]));

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

    public PescadorEspecies getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
