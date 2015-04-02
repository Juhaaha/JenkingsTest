/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import java.awt.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juha
 */
public class LocPointTest {
    
    public LocPointTest() {
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
     * Test of setPoint method, of class LocPoint.
     */
    @Test
    public void testSetPoint() {
        System.out.println("setPoint");
        Point ln = new Point(30, 40);
        LocPoint instance = new LocPoint();
        //instance.setTitle("Title");
        instance.setPoint(ln);
        assertEquals(ln, instance.getPoint());
        // TODO review the generated test code and remove the default call to fail.
        //fail("Point is not set");
    }

    /**
     * Test of setTitle method, of class LocPoint.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String t = "Le title";
        LocPoint instance = new LocPoint();
        instance.setTitle(t);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(t, instance.getTitle());
        //fail("Title is not set");
    }

    /**
     * Test of setDescription method, of class LocPoint.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String desc = "Hii-ö-hoi";
        LocPoint instance = new LocPoint();
        instance.setDescription(desc);
        assertEquals(desc, instance.getDesc());
        // TODO review the generated test code and remove the default call to fail.
       // fail("Description is not set");
    }

    /**
     * Test of setNumber method, of class LocPoint.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int nmb = 0;
        LocPoint instance = new LocPoint();
        instance.setNumber(nmb);
        assertEquals(nmb, instance.getNumber());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPoint method, of class LocPoint.
     */
    @Test
    public void testGetPoint() {
        System.out.println("getPoint");
        LocPoint instance = new LocPoint();
        Point expResult = new Point(44, 30);
        instance.setPoint((expResult));
        Point result = instance.getPoint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDesc method, of class LocPoint.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        LocPoint instance = new LocPoint();
        String expResult = "This is description";
        instance.setDescription(expResult);
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class LocPoint.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        LocPoint instance = new LocPoint();
        instance.setTitle("Title");
        String expResult = "Title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class LocPoint.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        LocPoint instance = new LocPoint();
        int expResult = 22;
        instance.setNumber(22);
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LocPoint.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LocPoint instance = new LocPoint();
        instance.setTitle("Title");
        instance.setDescription("This is description");
        String expResult = "Title: This is description";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
