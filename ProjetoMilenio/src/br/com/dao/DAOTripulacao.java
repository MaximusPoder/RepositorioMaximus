package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaTripulacao;
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
public class DAOTripulacao implements IOperationBean<EmpresaTripulacao>{

    private Conexao conexao;

    public boolean cadastrar(EmpresaTripulacao bean) {
        String query = "insert     into         EmpresaTripulacao  " +
                "       (custo, empresaId, frotaEspecie, funcao, " +
                "lucro, numero, relacaoTrabalho,observacao, salario)   " +
                "  values" +
                "('"+bean.getCusto()+"',"+
                bean.getEmpresaId()+",'" +
                bean.getFrotaEspecie()+"','"+
                bean.getFuncao()+"','"+
                bean.getLucro()+"','" +
                bean.getNumero()+"','"+
                bean.getRelacaoTrabalho()+"','"+
                bean.getObservacao()+"','"+
                bean.getSalario()+"')";
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

    public boolean excluir(EmpresaTripulacao bean) {
         try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaTripulacao      where  " +
                    "       id=" + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaTripulacao bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<EmpresaTripulacao> getListWithQuery(String query) {
        try {

            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);

            ResultSet set = conexao.getResultSet();
            String[] fields = MyUtil.getField(new EmpresaTripulacao());

            List<EmpresaTripulacao> empresas = new ArrayList<EmpresaTripulacao>();
            while (set.next()) {
                int index = 0;
                EmpresaTripulacao e = new EmpresaTripulacao();
                e.setId(set.getInt(fields[index++]));
                e.setRelacaoTrabalho(set.getString(fields[index++]));
                e.setFrotaEspecie(set.getString(fields[index++]));
                e.setFuncao(set.getString(fields[index++]));
                e.setNumero(set.getString(fields[index++]));
                e.setSalario(set.getString(fields[index++]));
                e.setCusto(set.getString(fields[index++]));
                e.setLucro(set.getString(fields[index++]));
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

    public EmpresaTripulacao getObjectWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
