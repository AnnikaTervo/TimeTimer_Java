/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author OMISTAJA
 */
public class TimeTimerNGTest {
    
    public TimeTimerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        scene = null;
        TimeTimer instance = new TimeTimer();
        instance.<error>(<error>);
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
