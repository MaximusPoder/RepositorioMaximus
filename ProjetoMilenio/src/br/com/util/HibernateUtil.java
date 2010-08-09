package br.com.util;


import br.com.pojo.Empresa;
import br.com.pojo.EmpresaDetalhaFrota;
import br.com.pojo.EmpresaEB;
import br.com.pojo.EmpresaFuncionamento;
import br.com.pojo.EmpresaImposto;
import br.com.pojo.EmpresaMaterial;
import br.com.pojo.EmpresaMercado;
import br.com.pojo.EmpresaPescador;
import br.com.pojo.EmpresaProblema;
import br.com.pojo.EmpresaQuestionario;
import br.com.pojo.EmpresaQuestionario1;
import br.com.pojo.EmpresaQuestionario2;
import br.com.pojo.EmpresaTripulacao;
import br.com.pojo.EspecieProcessada;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elton
 */
public class HibernateUtil {

    private static HibernateUtil me;
    private SessionFactory sessionFactory;
    private static ThreadLocal<Session> sessions = new ThreadLocal<Session>();

    private HibernateUtil() {
        startContext();
        System.out.println();
    }

    public static HibernateUtil getInstance() {
        if (me == null) {
            me = new HibernateUtil();
        }
        return me;
    }

    public void clearSession() {

        Session session = sessionFactory.openSession();
        session.clear();
    }

    public Session getSession() {


        sessions.set(sessionFactory.openSession());
        sessions.get().beginTransaction();
        return sessions.get();
    }

    public void closeFactory() {
        sessionFactory.close();
    }

    private void startContext() {

        sessionFactory = new AnnotationConfiguration().setProperty("hibernate.dialect",
                "br.com.Persistencia.MSAccessDialect").
                setProperty("hibernate.connection.driver_class", "sun.jdbc.odbc.JdbcOdbcDriver").
                setProperty("hibernate.connection.url", "jdbc:odbc:mil_interface").
                setProperty("hibernate.connection.username", "").
                setProperty("hibernate.connection.password", "").
                setProperty("hibernate.show_sql", "true").
                setProperty("hibernate.format_sql", "false").
                setProperty("hibernate.hbm2ddl.auto", "update").//Realiza auto definiÃ§Ã£o da criaÃ§Ã£o da linguagem
                setProperty("hibernate.c3p0.acquire_increment", "1").
                setProperty("hibernate.c3p0.max_statements", "2").//
                //                setProperty("hibernate.c3p0.min_size", "2").
                setProperty("hibernate.jdbc.batch_size", "20").//isso serve para updates em batch
                setProperty("hibernate.cache.use_second_level_cache", "false").//isso serve para updates em batch
 /*Criadas*/
                addAnnotatedClass(Empresa.class).
                addAnnotatedClass(EmpresaEB.class).
                addAnnotatedClass(EspecieProcessada.class).
                addAnnotatedClass(EmpresaQuestionario1.class).
                 addAnnotatedClass(EmpresaProblema.class).
/**Nao criadas*/ addAnnotatedClass(EmpresaQuestionario2.class).
                
                buildSessionFactory();

    }
}



