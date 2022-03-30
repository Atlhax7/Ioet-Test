/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import objects.Employee;
import objects.Time;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author atlha
 */
public class MethodsTest {
    
    public MethodsTest() {
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
     * Test of setEmployee method, of class Methods.
     */
    @Test
    public void testSetEmployee() {
        System.out.println("setEmployee");
        String st = "RENE=MO10:00-12:00";
        Methods instance = new Methods();
        Employee expResult = new Employee("RENE");
        Time expected = new Time();
        expected.setDay("MO");
        expected.setHouri(10);
        expected.setMini(00);
        expected.setHourf(12);
        expected.setMinf(00);
        expResult.addTime(expected);
        
        Employee result = instance.setEmployee(st);
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of splitEmpl method, of class Methods.
     */
    @Test
    public void testSplitEmpl() {
        System.out.println("splitEmpl");
        Methods instance = new Methods();
        String[] expResult = null;
        String[] result = instance.splitEmpl();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of findRepeated method, of class Methods.
     */
    @Test
    public void testFindRepeated() {
        System.out.println("findRepeated");
        ArrayList<Time> timeA = null;
        ArrayList<Time> timeB = null;
        Time auxA=new Time();
        auxA.setDay("MO");
        auxA.setHouri(10);
        auxA.setMini(00);
        auxA.setHourf(12);
        auxA.setMinf(00);
        Time auxB=new Time();
        auxB.setDay("MO");
        auxB.setHouri(10);
        auxB.setMini(00);
        auxB.setHourf(12);
        auxB.setMinf(00);
        timeA.add(auxB);
        timeB.add(auxA);
        Methods instance = new Methods();
        int expResult = 1;
        int result = instance.findRepeated(timeA, timeB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
