/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predator.prey.ecosystems;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JoséM
 */
public class PredatorPreyEcosystemsTest {
    
    public PredatorPreyEcosystemsTest() {
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
     * Test of main method, of class PredatorPreyEcosystems.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PredatorPreyEcosystems.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preyPredLV method, of class PredatorPreyEcosystems.
     */
    @Test
    public void testPreyPredLV() {
        System.out.println("preyPredLV");
        double[] preyPred = null;
        double[] a = null;
        double[] b = null;
        int n = 0;
        double[] expResult = null;
        double[] result = PredatorPreyEcosystems.preyPredLV(preyPred, a, b, n);
        //assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printResult method, of class PredatorPreyEcosystems.
     */
    @Test
    public void testPrintResult() {
        System.out.println("printResult");
        double[] preyPred = null;
        int n = 0;
        PredatorPreyEcosystems.printResult(preyPred, n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
