/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.empresa.dao;

import br.com.conexao.Conexao;
import br.com.formulario.empresa.pojo.EmpresaEB;
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
public class DAOEmpresaEB implements IOperationBean<EmpresaEB> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaEB bean) {
        String query = " insert     into         EmpresaEB        " +
                " (apetrecho, empresaId, epocaAno, especie,observacao, terceiro)    " +
                " values" +
                "('" + bean.getApetrecho() +
                "'," + bean.getEmpresaId() +
                ",'" + bean.getEpocaAno() +
                "','" + bean.getEspecie() +
                "','" + bean.getObservacao() +
                "','" + bean.getTerceiro() + "')";
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

    public boolean excluir(EmpresaEB bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = " delete     from        EmpresaEB      where  " +
                    "       id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaEB bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = "update         EmpresaEB     set apetrecho='" + bean.getApetrecho() + "'," +
                    "   empresaId=" + bean.getEmpresaId() + ", epocaAno='" + bean.getEpocaAno() + "'," +
                    "   especie='" + bean.getEspecie() + "',  " +
                    "   observacao='" + bean.getObservacao() + "',  " +
                    "   terceiro='" + bean.getTerceiro() + "'     where  id=" + bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaEB> getListWithQuery(String query) {
        try {

            conexao = new Conexao();
            conexao.conecta("emalhe");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new EmpresaEB());

            List<EmpresaEB> empresas = new ArrayList<EmpresaEB>();
            while (set.next()) {
                int index = 0;
                EmpresaEB e = new EmpresaEB();
                e.setId(set.getInt(fields[index++]));
                e.setEspecie(set.getString(fields[index++]));
                e.setTerceiro(set.getString(fields[index++]));
                e.setApetrecho(set.getString(fields[index++]));
                e.setEpocaAno(set.getString(fields[index++]));
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

    public EmpresaEB getObjectWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaEB());
            System.out.println("" + set.getRow());
            EmpresaEB e = new EmpresaEB();
            while (set.next()) {
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setEspecie(set.getString(fields[index++]));
                e.setTerceiro(set.getString(fields[index++]));
                e.setApetrecho(set.getString(fields[index++]));
                e.setEpocaAno(set.getString(fields[index++]));
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
