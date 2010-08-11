/*

 * insert



 */

package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaDetalhaFrota;
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
public class DAODetalhaFrota implements IOperationBean<EmpresaDetalhaFrota> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaDetalhaFrota bean) {
        String query = "Insert into         EmpresaDetalheFrota    " +
                "     (capEstocagem, compMedio, duracao, ecos, empresaId, " +
                "freq, frotaEspecie, gps, guincho, potenciaMotor, powerBlock," +
                " producao, radar, sonar)     values     " +
                " ('"+bean.getCapEstocagem()+"'," +
                "'"+bean.getCompMedio()+"'," +
                "'"+bean.getDuracao()+"'," +
                "'"+bean.getEcos()+"'," +
                ""+bean.getEmpresaId()+"," +
                " '"+bean.getFreq()+"'," +
                " '"+bean.getFrotaEspecie()+"'," +
                " '"+bean.getGps()+"', " +
                " '"+bean.getGuincho()+"'," +
                " '"+bean.getPotenciaMotor()+"'," +
                " '"+bean.getPowerBlock()+"'," +
                " '"+bean.getProducao()+"'," +
                " '"+bean.getRadar()+"'," +
                " '"+bean.getSonar()+"')";
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

    public boolean excluir(EmpresaDetalhaFrota bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaDetalheFrota      where  " +
                    "       id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaDetalhaFrota bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface"); 

            String query = " update  EmpresaDetalheFrota   " +
                    " set  capEstocagem='"+bean.getCapEstocagem()+"'," +
                    " compMedio=" + "'"+bean.getCompMedio()+"'," +
                    " duracao=" +  "'"+bean.getDuracao()+"'," +
                    " ecos=" + "'"+bean.getEcos()+"'," +
                    " empresaId=" +""+bean.getEmpresaId()+"," +
                    " freq= " + " '"+bean.getFreq()+"'," +
                    " frotaEspecie =" +   " '"+bean.getFrotaEspecie()+"'," +
                    " gps=" +  " '"+bean.getGps()+"', " +
                    " guincho=" +" '"+bean.getGuincho()+"'," +
                    "potenciaMotor= " + " '"+bean.getPotenciaMotor()+"'," +
                    " powerBlock=  " +  " '"+bean.getPowerBlock()+"'," +
                    " producao=" +   " '"+bean.getProducao()+"'," +
                    " radar= " +  " '"+bean.getRadar()+"'," +
                    " sonar=" + " '"+bean.getSonar()+"'"+
                    "  where id = "+bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaDetalhaFrota> getListWithQuery(String query) {
        try {

            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new EmpresaDetalhaFrota());

            List<EmpresaDetalhaFrota> empresas = new ArrayList<EmpresaDetalhaFrota>();
            while (set.next()) {
                int index = 0;
                EmpresaDetalhaFrota e = new EmpresaDetalhaFrota();
                e.setId(set.getInt(fields[index++]));
                e.setFrotaEspecie(set.getString(fields[index++]));
                e.setCompMedio(set.getString(fields[index++]));
                e.setCapEstocagem(set.getString(fields[index++]));
                e.setPotenciaMotor(set.getString(fields[index++]));
                e.setGps(set.getString(fields[index++]));
                e.setEcos(set.getString(fields[index++]));
                e.setRadar(set.getString(fields[index++]));
                e.setSonar(set.getString(fields[index++]));
                e.setGuincho(set.getString(fields[index++]));
                e.setPowerBlock(set.getString(fields[index++]));
                e.setDuracao(set.getString(fields[index++]));
                e.setFreq(set.getString(fields[index++]));
                e.setProducao(set.getString(fields[index++]));
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

    public EmpresaDetalhaFrota getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
