/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.dsigned.springcrudutils.strategies;

import org.junit.Test;

import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 *
 * @author nk
 */
public class XMLStrategyTest {

    /**
     * Test of render method, of class XMLStrategy.
     */
    @Test
    public void testRender() {
        System.out.println("render");
        Object data = new TestDTO("test", Long.MAX_VALUE);
        XMLStrategy instance = new XMLStrategy();
        String result = instance.render(data);
        System.out.println("Result: " + result);
        assertNotNull(result);
    }

    /**
     * Test of setup method, of class XMLStrategy.
     */
    @Test
    public void testSetup() {
        System.out.println("setup");
        HttpServletResponse response = mock(HttpServletResponse.class);
        XMLStrategy instance = new XMLStrategy();
        instance.setup(response);
        verify(response).setContentType("application/xml");
    }
}
