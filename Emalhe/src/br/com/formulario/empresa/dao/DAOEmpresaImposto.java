/*
Hibernate:
insert
into
EmpresaImposto
(ano, anterior, atual, empresaId, imposto)
values
(?, ?, ?, ?, ?)




 */
package br.com.formulario.empresa.dao;

import br.com.conexao.Conexao;
import br.com.formulario.empresa.pojo.EmpresaImposto;
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
public class DAOEmpresaImposto implements IOperationBean<EmpresaImposto> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaImposto bean) {
        String query = "insert     into         EmpresaImposto      " +
                "   (ano, anterior, atual, empresaId,observacao, imposto)  " +
                "   values  " +
                "('" + bean.getAno() + "', '" +
                bean.getAnterior() + "','" +
                bean.getAtual() + "', " +
                bean.getEmpresaId() +", '" + 
                bean.getObservacao() + "', '" +
                bean.getImposto() + "')";
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

    public boolean excluir(EmpresaImposto bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = " delete     from        EmpresaImposto      where  " +
                    "       id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaImposto bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = " update         EmpresaImposto     set     " +
                    "    ano='" + bean.getAno() + "',  " +
                    "    anterior='" + bean.getAnterior() + "',    " +
                    "    atual='" + bean.getAtual() + "',  " +
                    "    empresaId=" + bean.getEmpresaId() + "," +
                    "    observacao='" + bean.getObservacao() + "',   " +
                    "    imposto='" + bean.getImposto() + "'   " +
                    "    where  id= "+bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaImposto> getListWithQuery(String query) {
        try {

            conexao = new Conexao();
            conexao.conecta("emalhe");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new EmpresaImposto());

            List<EmpresaImposto> empresas = new ArrayList<EmpresaImposto>();
            while (set.next()) {
                int index = 0;
                EmpresaImposto e = new EmpresaImposto();
                e.setId(set.getInt(fields[index++]));
                e.setImposto(set.getString(fields[index++]));
                e.setAnterior(set.getString(fields[index++]));
                e.setAtual(set.getString(fields[index++]));
                e.setAno(set.getString(fields[index++]));
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

    public EmpresaImposto getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
