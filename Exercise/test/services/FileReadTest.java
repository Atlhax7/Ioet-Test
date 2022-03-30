/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

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
public class FileReadTest {
    
    public FileReadTest() {
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
     * Test of readFile method, of class FileRead.
     */
    @Test
    public void testReadFile() {
        System.out.println("readFile");
        FileRead instance = new FileRead();
        String expResult = "RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00- 21:00\n" +
"ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00\n" +
"ANDRES=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00";
        String result = instance.readFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
}
