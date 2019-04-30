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
public class Pesawat1 {
    @Test
    public void testGetPesawat() {
        System.out.println("getNamaPesawat");
        Pesawat instance = new Pesawat ("Lion", "Garuda", "Sriwijaya", "Airasia");
        String expResult = "Lion";
        String result = instance.getNmas();
        assertEquals(expResult, result);
        // TODO review the generated test code
    }

    /**
     * Test of getPassword method, of class Anggota1.
     */
    @Test
    public void testGetKodePenerbangan() {
        System.out.println("getKodePenerbangan");
        Pesawat instance = new Pesawat ("Lion", "Garuda", "Sriwijaya", "Airasia");
        String expResult = "Garuda";
        String result = instance.getKp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
