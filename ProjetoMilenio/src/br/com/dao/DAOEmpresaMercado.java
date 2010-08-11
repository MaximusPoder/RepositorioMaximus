/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaMercado;
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
public class DAOEmpresaMercado implements IOperationBean<EmpresaMercado> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaMercado bean) {

        String query = " insert     into         EmpresaMercado     " +
                "    (destino, empresaId, especie, mercado, produto, valor, volume)  " +
                "   values   " +
                "('" + bean.getDestino() + "'," +
                "  " + bean.getEmpresaId() + "," +
                " '" + bean.getEspecie() + "'," +
                " '" + bean.getMercado() + "'," +
                " '" + bean.getProduto() + "'," +
                " '" + bean.getValor() + "'," +
                " '" + bean.getVolume() + "')";
                
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

    public boolean excluir(EmpresaMercado bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from       " +
                    " EmpresaMercado      where  " +
                    "       id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaMercado bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<EmpresaMercado> getListWithQuery(String query) {
        try {

            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new EmpresaMercado());

            List<EmpresaMercado> empresas = new ArrayList<EmpresaMercado>();
            while (set.next()) {
                int index = 0;
                EmpresaMercado e = new EmpresaMercado();
                e.setId(set.getInt(fields[index++]));
                e.setMercado(set.getString(fields[index++]));
                e.setEspecie(set.getString(fields[index++]));
                e.setProduto(set.getString(fields[index++]));
                e.setDestino(set.getString(fields[index++]));
                e.setVolume(set.getString(fields[index++]));
                e.setValor(set.getString(fields[index++]));
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

    public EmpresaMercado getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
