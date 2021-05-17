/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Alex
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of sumarPar method, of class Operaciones.
     */
     @Test
    public void testSumarPar() {
        System.out.println("sumarPar");
        Operaciones instance = new Operaciones();
        int a = 5;
        int b = 5;
        int expResult = 10;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
    }
    
    @Ignore
    @Test
    public void testSumarIMPAR() {
        System.out.println("sumarImpar");
        Operaciones instance = new Operaciones();
        int a = 5;
        int b = 5;
        int expResult = 10;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);

    }


    /**
     * Test of mayor method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testMayor() {
        System.out.println("mayor");
        Operaciones instance = new Operaciones();
        int a = 6;
        int b = 5;
        int expResult = 6;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testMayorB() {
        System.out.println("mayor");
        Operaciones instance = new Operaciones();
        int a = 5;
        int b = 6;
        int expResult = 6;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
    }
    @Ignore
    @Test
    public void testMayorIGUALES() {
        System.out.println("si fuesen iguales");
        Operaciones instance = new Operaciones();
        int a = 5;
        int b = 5;
        int expResult = 5;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testSumarVector() {
        System.out.println("sumarVector");
        Operaciones instance = new Operaciones();
        int[] numeros = {1, 2, 3};
        int expResult = 6;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
    }
    
}
