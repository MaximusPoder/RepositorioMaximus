/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.Empresa;
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
public class DAOEmpresa implements IOperationBean<Empresa> {

    private Conexao conexao;

    public DAOEmpresa() {
    }

    public boolean cadastrar(Empresa bean) {

        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " insert     into         Empresa    " +
                    "     (Municipio, coletor, data, endereco, foneFax,nomeEmpresa," +
                    "pessoaEntrevistada, status, tempoEmpresa,funcao)" +
                    "   values " +
                    "('" + bean.getMunicipio() + "','" + bean.getColetor() + "','" +
                    MyUtil.dateUtilTodateSql(bean.getData()) + "','" + bean.getEndereco() + "','" +
                    bean.getFoneFax() + "','" + bean.getNomeEmpresa() + "','" +
                    bean.getPessoaEntrevistada() + "','" + bean.getStatus() + "','" +
                    bean.getTempoEmpresa() + "','" + bean.getFuncao() + "')";

            return conexao.salvar(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean excluir(Empresa bean) {

        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from         Empresa     where     " +
                    "  id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(Empresa bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " update         Empresa     set     " +
                    " Municipio='" + bean.getMunicipio() + "'," +
                    " coletor='" + bean.getColetor() + "'," +
                    " data='" + MyUtil.dateUtilTodateSql(bean.getData()) + "'," +
                    " endereco='" + bean.getEndereco() + "'," +
                    " foneFax='" + bean.getFoneFax() + "'," +
                    " nomeEmpresa='" + bean.getNomeEmpresa() + "', " +
                    " pessoaEntrevistada='" + bean.getPessoaEntrevistada() + "', " +
                    " status='" + bean.getStatus() + "',   " +
                    " tempoEmpresa='" + bean.getTempoEmpresa() + "'," +
                    " funcao='" + bean.getFuncao() + "'" +
                    "  where         id=" + bean.getId() + "";

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;

    }

    public List<Empresa> getListWithQuery(String query) {

        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new Empresa());

            List<Empresa> empresas = new ArrayList<Empresa>();
            while (set.next()) {
                int index = 0;
                Empresa e = new Empresa();
                e.setId(set.getInt(fields[index++]));
                e.setColetor(set.getString(fields[index++]));
                e.setData(set.getDate(fields[index++]));
                e.setMunicipio(set.getString(fields[index++]));
                e.setNomeEmpresa(set.getString(fields[index++]));
                e.setEndereco(set.getString(fields[index++]));
                e.setFoneFax(set.getString(fields[index++]));
                e.setPessoaEntrevistada(set.getString(fields[index++]));
                e.setTempoEmpresa(set.getString(fields[index++]));
                e.setStatus(set.getString(fields[index++]));
                e.setFuncao(set.getString(fields[index++]));

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

    public List getMunicipiosWithQuery() {

        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute("select distinct * from tab_local");

            ResultSet set = conexao.getResultSet();
            List empresas = new ArrayList();
           
            while (set.next()) {
                String estado = set.getString("pai");
               
                if(estado.equalsIgnoreCase("Par?") || estado.equalsIgnoreCase("Pará")
                   || estado.equalsIgnoreCase("Amapá") || estado.equalsIgnoreCase("Amap?")
                   || estado.equalsIgnoreCase("Maranhão") || estado.equalsIgnoreCase("Maranh?")){
                String nome = set.getString("nome");
                empresas.add(nome);
                }
            }

            return empresas;
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.desconecta();
        }
        return null;
    }

    public Empresa getObjectWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new Empresa());
            System.out.println("" + set.getRow());
            Empresa e = new Empresa();
            while (set.next()) {
                int index = 0;

                e.setId(set.getInt(fields[index++]));
                e.setColetor(set.getString(fields[index++]));
                e.setData(set.getDate(fields[index++]));
                e.setMunicipio(set.getString(fields[index++]));
                e.setNomeEmpresa(set.getString(fields[index++]));
                e.setEndereco(set.getString(fields[index++]));
                e.setFoneFax(set.getString(fields[index++]));
                e.setPessoaEntrevistada(set.getString(fields[index++]));
                e.setTempoEmpresa(set.getString(fields[index++]));
                e.setStatus(set.getString(fields[index++]));
                e.setFuncao(set.getString(fields[index++]));
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
