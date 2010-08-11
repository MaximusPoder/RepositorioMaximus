/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.PescadorMaterial;
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
public class DAOPescadorMaterial implements IOperationBean<PescadorMaterial>{


    private Conexao conexao;

    public boolean cadastrar(PescadorMaterial bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean excluir(PescadorMaterial bean) {

        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from         PescadorMaterial     where     " +
                    "  id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(PescadorMaterial bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<PescadorMaterial> getListWithQuery(String query) {
         try {

            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new PescadorMaterial());

            List<PescadorMaterial> empresas = new ArrayList<PescadorMaterial>();
            while (set.next()) {
                int index = 0;
                PescadorMaterial e = new PescadorMaterial();
                e.setId(set.getInt(fields[index++]));
                e.setMaterial(set.getString(fields[index++]));
                e.setTipo(set.getString(fields[index++]));
                e.setQuantidade(set.getString(fields[index++]));
                e.setCusto(set.getString(fields[index++]));
                e.setOutros(set.getString(fields[index++]));
                e.setFrequencia(set.getString(fields[index++]));

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

    public PescadorMaterial getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
