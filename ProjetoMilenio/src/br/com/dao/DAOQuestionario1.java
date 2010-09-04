package br.com.dao;

import br.com.Persistencia.Conexao;
import br.com.pojo.EmpresaQuestionario1;
import br.com.util.MyUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
10file,
10posta,
10inteiro,
10outros,
 */
public class DAOQuestionario1 implements IOperationBean<EmpresaQuestionario1> {

    private Conexao conexao;

    public boolean cadastrar(EmpresaQuestionario1 bean) {

        String query = "insert     into         EmpresaQuestionario1    " +
                "     (empresaId, 10file,10posta,10inteiro,10outros," +
                " questao11, questao12, questao13, questao8, " +
                "9recepcao," +
                "9inspecao," +
                "9deposito_com_gelo_em_camara," +
                "9lavagem_e_classificacao," +
                "9passagem," +
                "9escamacao," +
                "9evisceracao_e_filamento," +
                "9lavagem," +
                "9inspecao2," +
                "9empacotamento_e_pesagem," +
                "9acondicionamento," +
                "9congelamento," +
                "9embalagem," +
                "9estocagem,"+ 
                "observacao," +
                "9expedicao)    " +
                " values  " +
                "(" + bean.getEmpresaId() + "," +
                "'" + bean.getQuestao10_1() + "'," +
                "'" + bean.getQuestao10_2() + "'," +
                "'" + bean.getQuestao10_3() + "'," +
                "'" + bean.getQuestao10_4() + "'," +
                "'" + bean.getQuestao11() + "'," +
                "'" + bean.getQuestao12() + "'," +
                "'" + bean.getQuestao13() + "'," +
                "'" + bean.getQuestao8() + "'," +
                "'" + bean.getQuestao9_1() + "'," +
                "'" + bean.getQuestao9_2() + "'," +
                "'" + bean.getQuestao9_3() + "'," +
                "'" + bean.getQuestao9_4() + "'," +
                "'" + bean.getQuestao9_5() + "'," +
                "'" + bean.getQuestao9_6() + "'," +
                "'" + bean.getQuestao9_7() + "'," +
                "'" + bean.getQuestao9_8() + "'," +
                "'" + bean.getQuestao9_9() + "'," +
                "'" + bean.getQuestao9_10() + "'," +
                "'" + bean.getQuestao9_11() + "'," +
                "'" + bean.getQuestao9_12() + "'," +
                "'" + bean.getQuestao9_13() + "'," +
                "'" + bean.getQuestao9_14() + "'," +
                "'" + bean.getObservacao() + "'," +
                "'" + bean.getQuestao9_15() + "')";
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

    public boolean excluir(EmpresaQuestionario1 bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = " delete     from        EmpresaQuestionario1   where  " +
                    "       id = " + bean.getId();
            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    /**
    9estocagem

     * @param bean
     * @return
     */
    public boolean atualizar(EmpresaQuestionario1 bean) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            String query = "update         EmpresaQuestionario1     set    " +
                    "     empresaId=" + bean.getEmpresaId() + ",    " +
                    "     10file='" + bean.getQuestao10_1() + "',     " +
                    "     10posta='" + bean.getQuestao10_2() + "',     " +
                    "     10inteiro='" + bean.getQuestao10_3() + "',     " +
                    "     10outros='" + bean.getQuestao10_4() + "',     " +
                    "     questao11='" + bean.getQuestao11() + "',    " +
                    "     questao12='" + bean.getQuestao12() + "',    " +
                    "     questao13='" + bean.getQuestao13() + "',    " +
                    "     questao8='" + bean.getQuestao8() + "',   " +
                
                    "     9recepcao='" + bean.getQuestao9_1() + "',   " +
                    "     9inspecao='" + bean.getQuestao9_2() + "',   " +
                    "     9deposito_com_gelo_em_camara='" + bean.getQuestao9_3() + "',   " +
                    "     9lavagem_e_classificacao='" + bean.getQuestao9_4() + "',   " +
                    "     9passagem='" + bean.getQuestao9_5() + "',   " +
                    "     9escamacao='" + bean.getQuestao9_6() + "',   " +
                    "     9evisceracao_e_filamento='" + bean.getQuestao9_7() + "',   " +
                    "     9lavagem='" + bean.getQuestao9_8() + "',   " +
                    "     9inspecao2='" + bean.getQuestao9_9() + "',   " +
                    "     9empacotamento_e_pesagem='" + bean.getQuestao9_10() + "',   " +
                    "     9acondicionamento='" + bean.getQuestao9_11() + "',   " +
                    "     9congelamento='" + bean.getQuestao9_12() + "',   " +
                    "     9embalagem='" + bean.getQuestao9_13() + "',   " +
                    "     9estocagem='" + bean.getQuestao9_14() + "',   " +
                    "     observacao='" + bean.getObservacao() + "',   " +
                    "    9expedicao='" + bean.getQuestao9_15() + "'    " +
                    "       where         id= " + bean.getId();

            return conexao.update(query);
        } catch (Exception e) {
        } finally {
            conexao.desconecta();
        }
        return false;
    }

    public List<EmpresaQuestionario1> getListWithQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EmpresaQuestionario1 getObjectWithQuery(String query) {
        try {
            conexao = new Conexao();
            conexao.conecta("mil_interface");
            conexao.execute(query);
            ResultSet set = conexao.getResultSet();

            String[] fields = MyUtil.getField(new EmpresaQuestionario1());

            EmpresaQuestionario1 e = null;
            while (set.next()) {
                e = new EmpresaQuestionario1();
                int index = 0;
                e.setId(set.getInt("id"));
                e.setQuestao8(set.getString("questao8"));
                e.setQuestao9_1(set.getString("9recepcao"));
                e.setQuestao9_2(set.getString("9Inspecao"));
                e.setQuestao9_3(set.getString("9deposito_com_gelo_em_camara"));
                e.setQuestao9_4(set.getString("9lavagem_e_classificacao"));
                e.setQuestao9_5(set.getString("9passagem"));
                e.setQuestao9_6(set.getString("9escamacao"));
                e.setQuestao9_7(set.getString("9evisceracao_e_filamento"));
                e.setQuestao9_8(set.getString("9lavagem"));
                e.setQuestao9_9(set.getString("9inspecao2"));
                e.setQuestao9_10(set.getString("9empacotamento_e_pesagem"));
                e.setQuestao9_11(set.getString("9acondicionamento"));
                e.setQuestao9_12(set.getString("9congelamento"));
                e.setQuestao9_13(set.getString("9embalagem"));
                e.setQuestao9_14(set.getString("9estocagem"));
                e.setQuestao9_15(set.getString("9expedicao"));

                e.setObservacao(set.getString("observacao"));
                e.setQuestao10_1(set.getString("10file"));
                e.setQuestao10_2(set.getString("10posta"));
                e.setQuestao10_3(set.getString("10inteiro"));
                e.setQuestao10_4(set.getString("10outros"));
                e.setQuestao11(set.getString("questao11"));
                e.setQuestao12(set.getString("questao11"));
                e.setQuestao13(set.getString("questao11"));
                e.setEmpresaId(set.getInt("empresaId"));
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
