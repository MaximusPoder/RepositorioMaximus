
package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaEB;
import br.com.pojo.EmpresaProblema;
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
public class DAOEmpresaProblema implements IOperationBean<EmpresaProblema> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaProblema bean) {
        String query = "insert    into        EmpresaProblema   " +
                "     (empresaId, obs, problema, tipo)  " +
                "      values        (" + bean.getEmpresaId() + ",'" + bean.getObs() + "'," +
                " '" + bean.getProblema() + "', '" + bean.getTipo() + "')";
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

    public boolean excluir(EmpresaProblema bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaProblema   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaProblema bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "  update        EmpresaProblema    set    " +
                    "     empresaId=" + bean.getEmpresaId() + ",       " +
                    "     obs='" + bean.getObs() + "',     " +
                    "    problema='" + bean.getProblema() + "',     " +
                    "    tipo='" + bean.getTipo() + "'   " +
                    "    where         id= " + bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaProblema> getListWithQuery(String query) {
        try {

            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new EmpresaProblema());

            List<EmpresaProblema> empresas = new ArrayList<EmpresaProblema>();
            while (set.next()) {
                int index = 0;
                EmpresaProblema e = new EmpresaProblema();
                e.setId(set.getInt(fields[index++]));
                e.setProblema(set.getString(fields[index++]));
                e.setTipo(set.getString(fields[index++]));
                e.setObs(set.getString(fields[index++]));
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

    public EmpresaProblema getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
