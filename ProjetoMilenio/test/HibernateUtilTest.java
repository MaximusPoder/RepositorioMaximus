/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.Persistencia.Conexao;

import br.com.pojo.EmpresaMercado;
import br.com.pojo.EmpresaQuestionario7;
import br.com.pojo.Pescador;
import br.com.pojo.PescadorEspecieCapturada;
import br.com.pojo.PescadorEspecies;
import java.lang.reflect.Field;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author Elton
 */
public class HibernateUtilTest {

    private Session session;
    private boolean SucessOperation;

    public HibernateUtilTest() {
    }

    /**
     * Test of getInstance method, of class HibernateUtil.
     */
    //@Test
    public void testGetInstance() {
        Conexao c = new Conexao();
        c.conecta("Pessoa");
        c.desconecta();
    }

    @Test
    public void testGetInstanceCadastra() {

      
        exibeCampos(new PescadorEspecies());

    }

    private void exibeCampos(Object o) {

        Field[] fields = o.getClass().getDeclaredFields();
        String x = "(";
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            x += field.getName()+ ",";
            System.out.println(field.getName());
            field.setAccessible(true);

        }
        x = x.substring(1, x.length());
        x+= ")";
        System.out.println(x);
    }

}
