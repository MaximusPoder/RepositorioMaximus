/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.pojo.*;
import br.com.util.MyUtil;
import org.junit.Test;

/**
 *
 * @author Elton
 */
public class HibernateUtilTest {
    @Test
    public void testGetInstanceCadastra() {
      
          String[] fields =   MyUtil.getField(new EmpresaEB());
          for (String string : fields) {
              System.out.println(string);
        }

    }
}
