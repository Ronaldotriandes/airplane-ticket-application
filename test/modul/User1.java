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
public class User1 {
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        User instance = new User ("Irul", "Budi", "Adi", "Siman");
        String expResult = "Irul";
        String result = instance.getNama();
        assertEquals(expResult, result);
        // TODO review the generated test code
    }

    /**
     * Test of getPassword method, of class Anggota1.
     */
    @Test
    public void testGetAlamat() {
        System.out.println("getAlamat");
        User instance = new User("Irul", "Budi", "Adi", "Siman");
        String expResult = "Budi";
        String result = instance.getAlamat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
