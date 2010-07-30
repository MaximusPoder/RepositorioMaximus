package br.com.Persistencia;

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
                "org.hibernate.dialect.PostgreSQLDialect").
                setProperty("hibernate.connection.driver_class", "org.postgresql.Driver").
                setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/Madam").
                setProperty("hibernate.connection.username", "postgres").
                setProperty("hibernate.connection.password", "admin").
                setProperty("hibernate.show_sql", "true").
                setProperty("hibernate.format_sql", "true").
                setProperty("hibernate.hbm2ddl.auto", "update").//Realiza auto definiÃ§Ã£o da criaÃ§Ã£o da linguagem
                setProperty("hibernate.c3p0.acquire_increment", "1").
                setProperty("hibernate.c3p0.idle_test_period", "100").
                setProperty("hibernate.c3p0.max_size", "10").
                setProperty("hibernate.c3p0.max_statements", "0").//
                setProperty("hibernate.c3p0.min_size", "2").
                setProperty("hibernate.jdbc.batch_size", "20").//isso serve para updates em batch
                setProperty("hibernate.cache.use_second_level_cache", "false").//isso serve para updates em batch
                setProperty("hibernate.c3p0.timeout", "100").
                buildSessionFactory();

    }
}



