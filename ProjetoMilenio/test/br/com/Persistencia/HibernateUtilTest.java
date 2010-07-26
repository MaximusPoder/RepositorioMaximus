/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.Persistencia;

import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elton
 */
public class HibernateUtilTest {

    public HibernateUtilTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class HibernateUtil.
     */
    @Test
    public void testGetInstance() {
        Conexao c = new Conexao();
        c.conecta("estoque");
        c.desconecta();
    }

   

}