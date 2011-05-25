/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.formulario.empresa.dao;

import br.com.conexao.Conexao;
import br.com.formulario.empresa.pojo.EmpresaMaterial;
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
public class DAOEmpresaMaterial implements IOperationBean<EmpresaMaterial>{

      private Conexao conexao;
      
    public boolean cadastrar(EmpresaMaterial bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean excluir(EmpresaMaterial bean) {

        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = " delete     from         EmpresaMaterial     where     " +
                    "  id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaMaterial bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<EmpresaMaterial> getListWithQuery(String query) {
         try {

            conexao = new Conexao();
            conexao.conecta("emalhe");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new EmpresaMaterial());

            List<EmpresaMaterial> empresas = new ArrayList<EmpresaMaterial>();
            while (set.next()) {
                int index = 0;
                EmpresaMaterial e = new EmpresaMaterial();
                e.setId(set.getInt(fields[index++]));
                e.setMaterial(set.getString(fields[index++]));
                e.setTipo(set.getString(fields[index++]));
                e.setQuantidade(set.getString(fields[index++]));
                e.setCusto(set.getString(fields[index++]));
                e.setOutros(set.getString(fields[index++]));
                e.setFrequencia(set.getString(fields[index++]));

                e.setEmpresaId(set.getInt(fields[index++]));

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

    public EmpresaMaterial getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
