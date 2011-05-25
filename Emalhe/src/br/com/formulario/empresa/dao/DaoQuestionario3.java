/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.empresa.dao;

import br.com.conexao.Conexao;
import br.com.formulario.empresa.pojo.EmpresaQuestionario3;
import br.com.util.MyUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elton
 */
public class DaoQuestionario3 implements IOperationBean<EmpresaQuestionario3> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaQuestionario3 bean) {

        String query = "insert     into         EmpresaQuestionario3    "
                + "     (empresaId, questao24, questao25Qual,questao25Quando,"
                + "questao25Porque, questao26DesdeQuando,questao26QuantosBarcos,"
                + "questao26QuantosLitros,questao26Porque, questao27,"
                + " questao28, questao29,observacao,questao30)"
                + " values  "
                + " (" + bean.getEmpresaId() + ","
                + " '" + bean.getQuestao24() + "',"
                + " '" + bean.getQuestao25Qual() + "',"
                + " '" + bean.getQuestao25Quando() + "',"
                + " '" + bean.getQuestao25Porque() + "',"
                + " '" + bean.getQuestao26DesdeQuando() + "',"
                + " '" + bean.getQuestao26QuantosBarcos() + "',"
                + " '" + bean.getQuestao26QuantosBarcos() + "',"
                + " '" + bean.getQuestao26Porque() + "',"
                + " '" + bean.getQuestao27() + "',"
                + " '" + bean.getQuestao28() + "',"
                + " '" + bean.getQuestao29() + "',"
                + " '" + bean.getObservacao() + "',"
                + " '" + bean.getQuestao30() + "')";
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

    public boolean excluir(EmpresaQuestionario3 bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = " delete     from        EmpresaQuestionario3   where  "
                    + "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public boolean atualizar(EmpresaQuestionario3 bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            String query = "update         EmpresaQuestionario3     set    "
                    + "     empresaId=" + bean.getEmpresaId() + ",    "
                    + "    questao24='" + bean.getQuestao24() + "',     "
                    + "    questao25Porque='" + bean.getQuestao25Porque() + "',    "
                    + "    questao25Qual='" + bean.getQuestao25Qual() + "',    "
                    + "    questao25Quando='" + bean.getQuestao25Quando() + "',    "
                    + "    questao26DesdeQuando='" + bean.getQuestao26DesdeQuando() + "',    "
                    + "    questao26Porque='" + bean.getQuestao26Porque() + "',    "
                    + "    questao26QuantosBarcos='" + bean.getQuestao26QuantosBarcos() + "',    "
                    + "    questao26QuantosLitros='" + bean.getQuestao26QuantosLitros() + "',    "
                    + "    questao27='" + bean.getQuestao27() + "',    "
                    + "    questao28='" + bean.getQuestao28() + "',   "
                    + "    questao29='" + bean.getQuestao29() + "',    "
                    + "    observacao='" + bean.getObservacao() + "',    "
                    + "    questao30='" + bean.getQuestao30() + "'    "
                    + "       where         id= " + bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario3> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario3 getObjectWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("emalhe");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario3());

            EmpresaQuestionario3 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario3();
                int index = 0;
                e.setId(set.getInt(fields[index++]));
                e.setQuestao24(set.getString(fields[index++]));

                e.setQuestao25Qual(set.getString(fields[index++]));
                e.setQuestao25Quando(set.getString(fields[index++]));
                e.setQuestao25Porque(set.getString(fields[index++]));

                e.setQuestao26DesdeQuando(set.getString(fields[index++]));
                e.setQuestao26QuantosBarcos(set.getString(fields[index++]));
                e.setQuestao26QuantosLitros(set.getString(fields[index++]));
                e.setQuestao26Porque(set.getString(fields[index++]));

                e.setQuestao27(set.getString(fields[index++]));
                e.setQuestao28(set.getString(fields[index++]));
                e.setQuestao29(set.getString(fields[index++]));
                e.setQuestao30(set.getString(fields[index++]));
                e.setEmpresaId(set.getInt(fields[index++]));
                e.setObservacao(set.getString(fields[index++]));
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
