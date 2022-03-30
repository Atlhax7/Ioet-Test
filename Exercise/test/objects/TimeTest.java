/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

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
public class TimeTest {
    
    public TimeTest() {
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
     * Test of setTime method, of class Time.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "MO10:00-12:00";
        Time instance = new Time();
        instance.setTime(time);
        Time expected = new Time();
        expected.setDay("MO");
        expected.setHouri(10);
        expected.setMini(00);
        expected.setHourf(12);
        expected.setMinf(00);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(expected,instance );
    }

    /**
     * Test of comapreTime method, of class Time true case.
     */
    @Test
    public void testComapreTime() {
        System.out.println("comapreTime");
        Time time = null;
        Time instance = new Time();
        Time expected = new Time();
        expected.setDay("MO");
        expected.setHouri(10);
        expected.setMini(00);
        expected.setHourf(12);
        expected.setMinf(00);
        
        instance.setDay("MO");
        instance.setHouri(10);
        instance.setMini(00);
        instance.setHourf(12);
        instance.setMinf(00);
        boolean expResult = true;
        boolean result = instance.comapreTime(expected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testComapreTime1() {
        System.out.println("comapreTime");
        Time time = null;
        Time instance = new Time();
        Time expected = new Time();
        expected.setDay("MO");
        expected.setHouri(11);
        expected.setMini(00);
        expected.setHourf(12);
        expected.setMinf(00);
        
        instance.setDay("MO");
        instance.setHouri(10);
        instance.setMini(00);
        instance.setHourf(12);
        instance.setMinf(00);
        boolean expResult = true;
        boolean result = instance.comapreTime(expected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testComapreTime2() {
        System.out.println("comapreTime");
        Time time = null;
        Time instance = new Time();
        Time expected = new Time();
        expected.setDay("TH");
        expected.setHouri(11);
        expected.setMini(00);
        expected.setHourf(12);
        expected.setMinf(00);
        
        instance.setDay("MO");
        instance.setHouri(10);
        instance.setMini(00);
        instance.setHourf(12);
        instance.setMinf(00);
        boolean expResult = false;
        boolean result = instance.comapreTime(expected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

  
    

    
    public void testToString() {
        System.out.println("toString");
        Time instance = new Time();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
