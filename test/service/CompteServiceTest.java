/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YOUNES
 */
public class CompteServiceTest {
    
    public CompteServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initDB method, of class CompteService.
     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        CompteService instance = new CompteService();
//        instance.initDB();
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of ouvrir method, of class CompteService.
     */
//    @Test
//    public void testOuvrir() {
//        System.out.println("ouvrir");
//        String rib = "EE11";
//        double solde = 450.0;
//        CompteService instance = new CompteService();
//        int expResult = -1;
//        int result = instance.ouvrir(rib, solde);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of debiter method, of class CompteService.
     */
//    @Test
//    public void testDebiter() {
//        System.out.println("debiter");
//        String rib = "EE11";
//        double montant = 1.0;
//        CompteService instance = new CompteService();
//        int expResult = 1;
//        int result = instance.debiter(rib, montant);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of initDB method, of class CompteService.
     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        CompteService instance = new CompteService();
//        instance.initDB();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findBySolde method, of class CompteService.
     */
    
    @Test
    public void testRemove() {
         CompteService instance = new CompteService();
         instance.removeFermer();
         
     }


    
    
}
