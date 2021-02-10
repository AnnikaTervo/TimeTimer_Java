/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OMISTAJA
 */
public class TimeTimerTest {
    
    public TimeTimerTest() {
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
     * Test of start method, of class TimeTimer.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        TimeTimer instance = new TimeTimer();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of <error> method, of class TimeTimer.
     */
    @Test
    public void test<error>() {
        System.out.println("<error>");
        TimeTimer instance = new TimeTimer();
        instance.<error>();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TimeTimer.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] command_line_parameters = null;
        TimeTimer.main(command_line_parameters);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
