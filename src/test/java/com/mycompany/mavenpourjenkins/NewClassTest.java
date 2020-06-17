/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenpourjenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 15145
 */
public class NewClassTest {
    
    public NewClassTest() {
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
     * Test of somme method, of class NewClass.
     */
    @Test
    public void testSomme() {
        System.out.println("somme");
        int valeur1 = 1;
        int valeur2 = 7;
        int expResult = 8;
        int result = NewClass.somme(valeur1, valeur2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
        @Test
    public void testSomme1() {
        System.out.println("somme");
        int valeur1 = 1;
        int valeur2 = 7;
        int expResult = 8;
        int result = NewClass.somme(valeur1, valeur2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of difference method, of class NewClass.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        int valeur1 = 9;
        int valeur2 = 3;
        int expResult = 6;
        int result = NewClass.difference(valeur1, valeur2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
        @Test
    public void testDifference2() {
        System.out.println("difference");
        int valeur1 = 9;
        int valeur2 = 3;
        int expResult = 6;
        int result = NewClass.difference(valeur1, valeur2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
