/*
Hibernate:
insert
into
PescadorEspecieCapturada
(empresaId, fimSafra, inicioSafra, ssp, id)
values
(?, ?, ?, ?, ?)
Hibernate:
select
pescadores0_.id as id23_,
pescadores0_.empresaId as empresaId23_,
pescadores0_.fimSafra as fimSafra23_,
pescadores0_.inicioSafra as inicioSa4_23_,
pescadores0_.ssp as ssp23_
from
PescadorEspecieCapturada pescadores0_

Hibernate:
update
PescadorEspecieCapturada
set
empresaId=?,
fimSafra=?,
inicioSafra=?,
ssp=?
where
id=?

 */
package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.PescadorEspecieCapturada;
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
public class DAOPescadorEspecieCapturada implements IOperationBean<PescadorEspecieCapturada> {

    private Conexao conexao;

    public boolean cadastrar(PescadorEspecieCapturada bean) {
        String query = "insert     into         PescadorEspecieCapturada      " +
                "   (pescadorId, fimSafra, inicioSafra, ssp)  " +
                "   values" +
                "   (" + bean.getPescadorId() + "," +
                " '" + bean.getFimSafra() + "'," +
                " '" + bean.getInicioSafra() + "'," +
                "'" + bean.getSsp() + "')";
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

    public boolean excluir(PescadorEspecieCapturada bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from       " +
                    " PescadorEspecieCapturada      where  " +
                    "       id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(PescadorEspecieCapturada bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<PescadorEspecieCapturada> getListWithQuery(String query) {
        try {

            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new PescadorEspecieCapturada());

            List<PescadorEspecieCapturada> empresas = new ArrayList<PescadorEspecieCapturada>();
            while (set.next()) {
                int index = 0;
                PescadorEspecieCapturada e = new PescadorEspecieCapturada();
                e.setId(set.getInt(fields[index++]));
                e.setSsp(set.getString(fields[index++]));
                e.setInicioSafra(set.getString(fields[index++]));
                e.setFimSafra(set.getString(fields[index++]));
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

    public PescadorEspecieCapturada getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
