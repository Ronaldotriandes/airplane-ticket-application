/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Ajo Samuik
 */
public class Login1 {
    @Test
    public void testGetUsername() {
        System.out.println("Username");
        Login instance = new Login("username", "password");
        String expResult = "username";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassword method, of class Login1.
     */
    @Test
    public void testGetPassword() {
        System.out.println("Password");
        Login instance = new Login("username", "password");
        String expResult = "password";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
