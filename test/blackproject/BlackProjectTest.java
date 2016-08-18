
package blackproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class BlackProjectTest {
    
    @Test
    public void testRetornarHelloNomeSePassarNome() {
        BlackProject black = new BlackProject("Vincent");
        assertEquals("Hello Vincent", black.getMessage());
    }
    
    @Test
    public void testRetornarHelloSemNome() {
        BlackProject black = new BlackProject();
        assertEquals("Hello", black.getMessage());
    }
    
}
